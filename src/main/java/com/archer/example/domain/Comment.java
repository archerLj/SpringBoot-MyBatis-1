package com.archer.example.domain;

import java.sql.Timestamp;

/**
 * Created by archerlj on 2017/4/11.
 */
public class Comment {
    private int id;
    private Author author;
    private Article article;
    private String content;
    private Timestamp createTime;

    public Comment() {
        super();
    }

    public Comment(Author author, Article article, String content, Timestamp createTime) {
        this.author = author;
        this.article = article;
        this.content = content;
        this.createTime = createTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }
}
