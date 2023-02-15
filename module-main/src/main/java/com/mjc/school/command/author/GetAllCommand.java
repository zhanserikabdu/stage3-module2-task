package com.mjc.school.command.author;

import com.mjc.school.MessageHelper;
import com.mjc.school.command.Command;
import com.mjc.school.controller.implementation.AuthorController;

public class GetAllCommand implements Command<AuthorController> {
    @Override
    public void execute(AuthorController controller) {
        MessageHelper.printMessage(controller.readAll().toString());
    }
}
