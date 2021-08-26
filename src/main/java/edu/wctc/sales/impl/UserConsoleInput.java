package edu.wctc.sales.impl;

import edu.wctc.sales.iface.UserInput;

import java.util.Scanner;

public class UserConsoleInput implements UserInput
{

    Scanner sc = new Scanner(System.in);

    @Override
    public String getInput(String prompt)
    {
        System.out.println(prompt);
        return sc.nextLine();
    }
}
