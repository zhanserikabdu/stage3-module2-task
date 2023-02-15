package com.mjc.school.command.author;

import com.mjc.school.MessageHelper;
import com.mjc.school.command.Command;
import com.mjc.school.controller.implementation.AuthorController;
import com.mjc.school.service.dto.AuthorDto;

public class ExitCommand implements Command<AuthorController> {
    @Override
    public void execute(AuthorController controller) {
        MessageHelper.printMessage("Input author id:");
        long Id = MessageHelper.readId();
        MessageHelper.printMessage("Input author name:");
        String name = MessageHelper.readString();

        AuthorDto AuthorDTO = new AuthorDto(Id, name);
        MessageHelper.printMessage(controller.update(AuthorDTO).toString());
    }
}
