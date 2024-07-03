package org.koreait;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public void run() {
        Scanner sc = new Scanner(System.in);
        System.out.println("==프로그램 시작==");

        MemberController memberController = new MemberController(sc);
        ArticleController articleController = new ArticleController(sc);
        articleController.makeTestData();
        memberController.makeTestData();
        Controller controller = null;

        while (true) {
            System.out.print("명령어) ");
            String cmd = sc.nextLine().trim();

            if (cmd.length() == 0) {
                System.out.println("명령어를 입력하세요");
                continue;
            }
            if (cmd.equals("exit")) {
                break;
            }
            String[] cmdBits = cmd.split(" ");

            String controllerName = cmdBits[0];
            if (cmdBits.length == 1) {
                System.out.println("명령어 확인해");
                continue;
            }

            String actionMethodName = cmdBits[1];

            if (controllerName.equals("article")) {
                controller = articleController;
            } else if (controllerName.equals("member")) {
                controller = memberController;
            }else {
                System.out.println("사용불가 명령어");
                continue;
            }
            controller.doAction(cmd, actionMethodName);
        }
        System.out.println("==프로그램 종료==");
        sc.close();
    }
}



