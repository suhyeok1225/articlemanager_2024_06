package org.koreait.service;

import org.koreait.articleManager.Container;
import org.koreait.dao.MemberDao;
import org.koreait.dto.Member;

import java.util.List;

public class MemberService {
    private MemberDao memberDao;

    public MemberService() {
        memberDao = Container.memberDao;
    }

    public List<Member> getMembers() {
        return memberDao.getMembers();
    }
}
