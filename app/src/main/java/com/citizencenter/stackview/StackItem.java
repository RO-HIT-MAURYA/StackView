package com.citizencenter.stackview;

import android.graphics.drawable.Drawable;

public class StackItem
{
    public String txt;
    public Drawable img;

    public StackItem(String text,Drawable image)
    {
        this.img = image;
        this.txt = text;
    }


}
