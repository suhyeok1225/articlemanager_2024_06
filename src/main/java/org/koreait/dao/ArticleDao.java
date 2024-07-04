package org.koreait.dao;

import org.koreait.dto.Article;

import java.util.ArrayList;
import java.util.List;

public class ArticleDao {
    public List<Article> articles;

    public ArticleDao() {
        articles = new ArrayList<>();
    }
}
