package com.archer.example.service.impl;

import com.archer.example.dao.ArticleDao;
import com.archer.example.domain.Article;
import com.archer.example.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by archerlj on 2017/4/11.
 */
@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    ArticleDao articleDao;

    @Override
    public Article findArticleTitleLike(String title) {
        return articleDao.findArticleTitleLike(title);
    }
}
