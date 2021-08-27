package edu.wctc.sales.impl;

import edu.wctc.sales.iface.UserInput;

import java.util.Scanner;

public class UserConsoleInput implements UserInput
{
    /*
    Allows the user to input from the console.
    See the related interface for more information.
    */
    Scanner sc = new Scanner(System.in);

    @Override
    public String getInput(String prompt)
    {
        System.out.println(prompt);
        return sc.nextLine();
    }
}
