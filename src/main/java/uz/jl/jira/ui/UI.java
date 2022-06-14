package uz.jl.jira.ui;

import uz.jl.jira.services.auth.UserCreateVO;

import java.util.Scanner;

/**
 * @author "Elmurodov Javohir"
 * @since 14/06/22/15:44 (Tuesday)
 * jira/IntelliJ IDEA
 */
public class UI {
    public static void main(String[] args) {
//        Writer.println("User Create -> 1");
//        Writer.println("User List -> 2");
        String choice = new Scanner(System.in).next();
        if (choice.equals("1")) userCreate();
        else if (choice.equals("2")) userList();
        main(args);
    }

    private static void userList() {
        UserCreateVO.builder().build();
    }

    private static void userCreate() {

    }
}
