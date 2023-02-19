package com.mjc.school.command.author;

import com.mjc.school.MessageHelper;
import com.mjc.school.command.Command;
import com.mjc.school.command.Operation;
import com.mjc.school.command.author.CreateCommand;
import com.mjc.school.command.author.DeleteCommand;
import com.mjc.school.command.author.ExitCommand;
import com.mjc.school.command.author.GetAllCommand;
import com.mjc.school.command.author.GetCommand;
import com.mjc.school.command.author.UpdateCommand;
import com.mjc.school.controller.implementation.AuthorController;
import com.mjc.school.controller.implementation.NewsController;
import com.mjc.school.service.exceptions.InvalidDataException;
import com.mjc.school.service.exceptions.NoSuchEntityException;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class AuthorCommandExecutor {
    private static Map<Operation, Command<AuthorController>> listCommands;

    static {
        init();
    }

    private AuthorCommandExecutor(){}

    public static void executeCommand(Operation operation, AuthorController controller) {
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
