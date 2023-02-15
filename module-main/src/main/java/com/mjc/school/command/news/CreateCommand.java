package com.mjc.school.command.news;

import com.mjc.school.MessageHelper;
import com.mjc.school.command.Command;
import com.mjc.school.controller.implementation.NewsController;
import com.mjc.school.service.dto.NewsDto;

public class CreateCommand implements Command<NewsController> {
    @Override
    public void execute(NewsController controller) {
        MessageHelper.printMessage("Input new title:");
        String title = MessageHelper.readString();

        MessageHelper.printMessage("Input new content:");
        String content = MessageHelper.readString();

        MessageHelper.printMessage("Input author ID:");
        long authorId = MessageHelper.readId();

        NewsDto newsDTO = new NewsDto(title,content,authorId);
        MessageHelper.printMessage(controller.create(newsDTO).toString());
    }
}
