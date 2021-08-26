package edu.wctc.sales.impl;

import edu.wctc.sales.iface.UserOutput;

public class UserConsoleOutput implements UserOutput
{

    @Override
    public void output(String text)
    {
        System.out.println(text);
    }
}
