package com.mjc.school;

import com.mjc.school.command.Operation;
import com.mjc.school.command.author.AuthorCommandExecutor;
import com.mjc.school.controller.implementation.AuthorController;
import com.mjc.school.service.factory.AuthorService;

import java.io.IOException;

public class AuthorManager {
    private static AuthorManager managers;
    private final AuthorController controller;
    private final Menu menu;

    private AuthorManager() {
        controller = new AuthorController(new AuthorService());
        menu = Menu.getInstance();
    }

    public static AuthorManager getInstance() {
        if (managers == null) {
            managers = new AuthorManager();
        }
        return managers;
    }


    public void init() {
        int input = -1;
        while (input != 0) {
            menu.print();
            try {
                input = MessageHelper.readOperation();
                Operation operation = Operation.values()[input];
                AuthorCommandExecutor.executeCommand(operation, controller);
            }
            catch (IOException e) {
                MessageHelper.printMessage("Invalid command.");
            }
        }
    }
}
