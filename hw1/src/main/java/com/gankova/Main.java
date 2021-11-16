package com.gankova;

import com.gankova.service.ArticleService;

public class Main {
    public static void main(String[] args) {
        System.out.println(args[0]);
        System.out.println(args[1]);
        validate(args);
        String method = args[0];
        Long id = Long.parseLong(args[1]);
        ArticleService articleService = new ArticleService();

        if (method.equals("GET")) {
            System.out.println(articleService.getArticle(method, id));

        }
        if (method.equals("POST")) {
            System.out.println(articleService.postArticle(method, id));

        }

    }

    public static void validate(String[] args) {
        if (args.length != 2){
            throw new IllegalArgumentException("Icorrect params");
        }
        if (args[0].equals("GET") || args[0].equals("POST")) {
            if (Long.parseLong(args[1]) < 1) {
                throw new IllegalArgumentException("Icorrect params");
            }
        } else {
            throw new IllegalArgumentException("Icorrect params");
        }
    }
}
