package org.koreait.articleManager;

import org.koreait.dao.ArticleDao;
import org.koreait.dao.MemberDao;
import org.koreait.service.ArticleService;
import org.koreait.service.MemberService;

public class Container {
    public static ArticleDao articleDao;
    public static MemberDao memberDao;

    public static ArticleService articleService;
    public static MemberService memberService;

    public static void init(){
        articleDao = new ArticleDao();
        memberDao = new MemberDao();

        memberService = new MemberService();
        articleService = new ArticleService();
    }
}
