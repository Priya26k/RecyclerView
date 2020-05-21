package com.example.recyclerview;

public class ModelClass {
    private String text;
    private int drawable;

    public ModelClass(String text, int drawable) {
        this.text = text;
        this.drawable = drawable;
    }

    public String getText() {
        return text;
    }

    public int getDrawable() {
        return drawable;
    }
}
