package com.example.tnwls.my_application;

/**
 * Created by LG on 2016-11-25.
 */

class Festival_In_INFO { // 자바빈
    String title = ""; // 곡 title
    int img; // 앨범 이미지
    String artist = ""; // artist

    public Festival_In_INFO(String title, int img, String artist) {
        super();
        this.title = title;
        this.img = img;
        this.artist = artist;

    }

    public Festival_In_INFO() {}
}

