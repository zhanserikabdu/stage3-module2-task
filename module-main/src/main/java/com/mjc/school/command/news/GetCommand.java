package com.mjc.school.command.news;

import com.mjc.school.MessageHelper;
import com.mjc.school.command.Command;
import com.mjc.school.controller.implementation.NewsController;

public class GetCommand implements Command<NewsController> {
    @Override
    public void execute(NewsController controller) {
        MessageHelper.printMessage("Input entity id:");
        long input = MessageHelper.readId();

        MessageHelper.printMessage(controller.readById(input).toString());
    }
}
