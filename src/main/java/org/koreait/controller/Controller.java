package org.koreait.controller;

import org.koreait.dto.Member;

public abstract class Controller {
    protected static Member loginedMember = null;

    public abstract void doAction(String cmd, String actionMethodName);
    public boolean isLogined(){
        return loginedMember != null;
    }
    public void makeTestData(){

    }
}
