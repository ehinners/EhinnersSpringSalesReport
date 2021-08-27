package edu.wctc.sales.impl;

import edu.wctc.sales.iface.UserOutput;

public class UserConsoleOutput implements UserOutput
{
    /*
    Allows the user to see context as to what they should input to console.
    See the related interface for more information.
     */

    @Override
    public void output(String text)
    {
        System.out.println(text);
    }
}
