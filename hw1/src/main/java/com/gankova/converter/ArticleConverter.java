package com.gankova.converter;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.gankova.model.Article;

public class ArticleConverter {

    public Article fromJson(String json) {
        Article article = new Article();
        if (!json.isEmpty()) {
            ObjectMapper mapper = new ObjectMapper();
            try {
                return mapper.readValue(json, Article.class);
            } catch (JsonProcessingException e) {
                e.printStackTrace();
            }
        }
        return article;
    }
}
