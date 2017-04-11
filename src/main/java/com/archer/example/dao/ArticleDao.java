package com.archer.example.dao;

import com.archer.example.domain.Article;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * Created by archerlj on 2017/4/11.
 */
@Repository
public interface ArticleDao {
    Article findArticleTitleLike(@Param("title") String title);
}
