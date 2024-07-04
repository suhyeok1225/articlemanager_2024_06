package org.koreait.service;
import org.koreait.articleManager.Container;
import org.koreait.dao.ArticleDao;
import org.koreait.dto.Article;

import java.util.ArrayList;
import java.util.List;

public class ArticleService {
    private ArticleDao articleDao;

    public ArticleService() {
        articleDao = Container.articleDao;
    }

    public void add(Article article) {
        articleDao.add(article);

    }

    public int getSize() {
        return articleDao.getSize();
    }

    public List<Article> getForPrintArticles(String searchKeyword) {
        List<Article> forPrintArticles = new ArrayList<>();

        if (searchKeyword.length() > 0 || searchKeyword != null) {
            System.out.println("검색어 : " + searchKeyword);

            for (Article article : articleDao.getArticles()) {
                if (article.getTitle().contains(searchKeyword)) {
                    forPrintArticles.add(article);
                }
            }
            if (forPrintArticles.size() == 0) {
                System.out.println("  번호   /    날짜     /    작성자   /   제목   /   내용   ");
                System.out.println("검색 결과 없음");
                return forPrintArticles;
            }
        }
        return forPrintArticles;
    }

    public Article getArticleById(int id) {
        return articleDao.getArticleById(id);
    }

    public void remove(Article article) {
        articleDao.remove(article);
    }
}
