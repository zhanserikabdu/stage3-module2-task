package com.mjc.school.command.author;

import com.mjc.school.MessageHelper;
import com.mjc.school.command.Command;
import com.mjc.school.controller.implementation.AuthorController;
import com.mjc.school.service.dto.AuthorDto;


public class CreateCommand implements Command<AuthorController> {
    @Override
    public void execute(AuthorController controller) {
        MessageHelper.printMessage("Input new name:");
        String name = MessageHelper.readString();

        AuthorDto AuthorDTO = new AuthorDto(name);
        MessageHelper.printMessage(controller.create(AuthorDTO).toString());
    }
}
