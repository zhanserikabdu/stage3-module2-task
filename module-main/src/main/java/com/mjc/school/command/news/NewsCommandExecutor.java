package com.mjc.school.command.news;

import com.mjc.school.MessageHelper;
import com.mjc.school.command.Command;
import com.mjc.school.command.Operation;
import com.mjc.school.controller.implementation.NewsController;
import com.mjc.school.service.exceptions.InvalidDataException;
import com.mjc.school.service.exceptions.NoSuchEntityException;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class NewsCommandExecutor {
    private static Map<Operation, Command<NewsController>> listCommands;

    static {
        init();
    }

    private NewsCommandExecutor(){}

    public static void executeCommand(Operation operation, NewsController controller) {
        try {
            listCommands.get(operation).execute(controller);
        }
        catch (NoSuchEntityException e) {
            MessageHelper.printMessage(e.getMessage());
        }
        catch (InvalidDataException e) {
            MessageHelper.printMessage(e.getMessage());
        }
    }


    private static void init() {
        listCommands = new ConcurrentHashMap<>();
        for (Operation operation : Operation.values()) {
            switch (operation) {
                case GET -> listCommands.put(operation, new GetCommand());
                case GET_ALL -> listCommands.put(operation, new GetAllCommand());
                case CREATE -> listCommands.put(operation, new CreateCommand());
                case UPDATE -> listCommands.put(operation, new UpdateCommand());
                case DELETE -> listCommands.put(operation, new DeleteCommand());
                case EXIT -> listCommands.put(operation, new ExitCommand());
            }
        }

    }
}
