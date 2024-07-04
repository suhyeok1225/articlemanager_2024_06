package org.koreait.articleManager;

import org.koreait.dao.ArticleDao;
import org.koreait.dao.MemberDao;

public class Container {
    public static ArticleDao articleDao;
    public static MemberDao memberDao;

    static {
        articleDao = new ArticleDao();
        memberDao = new MemberDao();
    }
}
