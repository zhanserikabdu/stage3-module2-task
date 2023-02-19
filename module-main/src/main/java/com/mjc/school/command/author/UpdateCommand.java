package com.mjc.school.command.author;

import com.mjc.school.MessageHelper;
import com.mjc.school.command.Command;
import com.mjc.school.controller.implementation.AuthorController;
import com.mjc.school.service.dto.AuthorDto;

public class UpdateCommand implements Command<AuthorController> {
    @Override
    public void execute(AuthorController controller) {
        //MessageHelper.printMessage("Input news id:");
        //long newsId = MessageHelper.readId();
        MessageHelper.printMessage("Input new name:");
        String name = MessageHelper.readString();
        //MessageHelper.printMessage("Input new content:");
        //String content = MessageHelper.readString();
        //MessageHelper.printMessage("Input new author ID:");
        //long authorId = MessageHelper.readId();

        AuthorDto authorDTO = new AuthorDto(name);

        MessageHelper.printMessage(controller.update(authorDTO).toString());
    }
}

