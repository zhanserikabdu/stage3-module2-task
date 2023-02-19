package com.mjc.school.command.author;

import com.mjc.school.MessageHelper;
import com.mjc.school.command.Command;
import com.mjc.school.controller.implementation.AuthorController;

public class DeleteCommand implements Command<AuthorController> {
    @Override
    public void execute(AuthorController controller) {
        MessageHelper.printMessage("Input news id for remove:");
        long id = MessageHelper.readId();
        MessageHelper.printMessage(controller.delete(id).toString());
    }
}
