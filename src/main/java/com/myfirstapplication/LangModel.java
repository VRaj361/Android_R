package com.myfirstapplication;

public class LangModel {
    String str;
    int strLangImg;
    public  LangModel(String str,int strLangImg){
        this.str=str;
        this.strLangImg=strLangImg;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public int getStrLangImg() {
        return strLangImg;
    }

    public void setStrLangImg(int strLangImg) {
        this.strLangImg = strLangImg;
    }
}
