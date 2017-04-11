package com.archer.example.controller;

import com.archer.example.domain.Article;
import com.archer.example.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


/**
 * Created by archerlj on 2017/4/11.
 */
@RestController
public class ArticleController {

    @Autowired
    ArticleService articleService;

    @RequestMapping(value = "/api/getArticle", method = RequestMethod.GET)
    public Article findArticleLike(@RequestParam(value = "articleTitle", required = true) String articleTitle) {
        return articleService.findArticleTitleLike(articleTitle);
    }

}
