package com.archer.example.service;

import com.archer.example.domain.Article;
import org.springframework.stereotype.Service;

/**
 * Created by archerlj on 2017/4/11.
 */

public interface ArticleService {
    Article findArticleTitleLike(String title);
}
