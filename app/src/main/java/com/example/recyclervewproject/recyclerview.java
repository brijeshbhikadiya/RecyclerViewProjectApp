package com.example.recyclervewproject;

public class recyclerview {

    private int image_view_profile_pictures;
    private String textview1;
    private String textview2;
    private  String textview3;

    recyclerview(int image_view_profile_pictures,String textview1,String textview2,String textview3)
    {
        this.image_view_profile_pictures=image_view_profile_pictures;
        this.textview1=textview1;
        this.textview2=textview2;              //step1 make a constructor.
        this.textview3=textview3;
    }

    public int getImage_view_profile_pictures() {  //step2 : tep alt + insert and cilck the getter method.
        return image_view_profile_pictures;
    }

    public String getTextview1() {
        return textview1;
    }

    public String getTextview2() {
        return textview2;
    }

    public String getTextview3() {
        return textview3;
    }
}
