package com.mjc.school;

import com.mjc.school.command.Operation;
import com.mjc.school.command.news.NewsCommandExecutor;
import com.mjc.school.controller.implementation.NewsController;
import com.mjc.school.service.factory.NewsService;

import java.io.IOException;

public class NewsManager {
    private static NewsManager manager;
    private final NewsController controller;
    private final Menu menu;

    private NewsManager() {
        controller = new NewsController(new NewsService());
        menu = Menu.getInstance();
    }

    public static NewsManager getInstance() {
        if (manager == null) {
            manager = new NewsManager();
        }
        return manager;
    }


    public void init() {
        int input = -1;
        while (input != 0) {
            menu.print();
            try {
                input = MessageHelper.readOperation();
                Operation operation = Operation.values()[input];
                NewsCommandExecutor.executeCommand(operation, controller);
            }
            catch (IOException e) {
                MessageHelper.printMessage("Invalid command.");
            }
        }
    }
}
