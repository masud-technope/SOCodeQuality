package com.example;

public class Constants
{
    // attribute, visible to the scriptlet
    public static final String ATTR_CURRENT_USER = "current.user";

    // getter function;
    // name modified to make it clear, later on, 
    // that I am calling this function
    // and not accessing the constant
    public String getATTR_CURRENT_USER_FUNC()
    {
        return ATTR_CURRENT_USER;
    }


}