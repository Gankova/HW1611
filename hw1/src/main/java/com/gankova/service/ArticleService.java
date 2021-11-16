package com.gankova.service;

import com.gankova.converter.ArticleConverter;
import com.gankova.model.Article;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;

public class ArticleService {

    public Article getArticle(String method, Long id) {
        String url = "http://jsonplaceholder.typicode.com/posts/1";

        URL urlObj = null;
        try {
            urlObj = new URL(url);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        URLConnection urlCon = null;
        try {
            urlCon = urlObj.openConnection();
        } catch (IOException e) {
            e.printStackTrace();
        }


        BufferedReader in = null;
        try {
            in = new BufferedReader(new InputStreamReader(
                    urlCon.getInputStream()));
        } catch (IOException e) {
            e.printStackTrace();
        }
        String inputLine = "";
        StringBuffer response = new StringBuffer();

        while (true) {
            try {
                if (!((inputLine = in.readLine()) != null)) break;
            } catch (IOException e) {
                e.printStackTrace();
            }
            response.append(inputLine);
        }
        try {
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // print result
        //System.out.println(response.toString());
        ArticleConverter articleConverter = new ArticleConverter();
        Article article = articleConverter.fromJson(response.toString());
        //System.out.println(article.toString());


        return article;
    }
    public Article postArticle(String method, Long id) {
        String url = "http://jsonplaceholder.typicode.com/posts";

        URL urlObj = null;
        try {
            urlObj = new URL(url);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        URLConnection urlCon = null;
        try {
            urlCon = urlObj.openConnection();
        } catch (IOException e) {
            e.printStackTrace();
        }


        BufferedReader in = null;
        try {
            in = new BufferedReader(new InputStreamReader(
                    urlCon.getInputStream()));
        } catch (IOException e) {
            e.printStackTrace();
        }
        String inputLine = "";
        StringBuffer response = new StringBuffer();



        while (true) {
            try {
                if (!((inputLine = in.readLine()) != null)) break;
            } catch (IOException e) {
                e.printStackTrace();
            }
            response.append(inputLine);
        }
        try {
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        final Map<String,String> parametr = new HashMap<>();



        // print result
        //System.out.println(response.toString());
        //ArticleConverter articleConverter = new ArticleConverter();
        //Article article = articleConverter.fromJson(response.toString());
        //System.out.println(article.toString());


        return null;
    }
}
