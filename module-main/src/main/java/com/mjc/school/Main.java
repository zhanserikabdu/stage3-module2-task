package com.mjc.school;

public class Main {

    public static void main(String[] args) {
        NewsManager manager = NewsManager.getInstance();
        manager.init();
        AuthorManager managers = AuthorManager.getInstance();
        managers.init();
    }
}
