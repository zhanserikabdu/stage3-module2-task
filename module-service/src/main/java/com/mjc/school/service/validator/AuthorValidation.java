package com.mjc.school.service.validator;

import com.mjc.school.service.dto.AuthorDto;
import com.mjc.school.service.exceptions.ErrorNotification;

public class AuthorValidation {
    private final String VALIDATION_NAME = "Author name field should have length from 3 to 15.";
    //private final String VALIDATION_CONTENT = "News content field should have length of value from 5 to 255.";
    //private final String VALIDATION_AUTHOR = "Author with id does not exist.";
    // private final AuthorRepository authorRepository;

    //public NewsValidation() {
    //  this.authorRepository = new AuthorRepository();
    //}

    public ErrorNotification validate (AuthorDto author) {
        ErrorNotification errorNotification = new ErrorNotification();

        String name = author.getName();
        //String content = news.getContent();
        //Long authorId = news.getAuthorId();

        if (name.length() < 3 || name.length() > 15)
            errorNotification.addError(VALIDATION_NAME + " Title length is " + name.length() + ".");

       // if (content.length() < 5 || content.length() > 255)
            //errorNotification.addError(VALIDATION_CONTENT + " Content length is " + content.length() + ".");

        //if (authorRepository.readById(authorId) == null) {
        //  errorNotification.addError(String.format(VALIDATION_AUTHOR, authorId));
        //}

        return errorNotification;
    }
}
