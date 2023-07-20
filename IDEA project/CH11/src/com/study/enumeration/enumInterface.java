package com.study.enumeration;

public class enumInterface {
    public static void main(String[] args) {

        Album cd1 = Album.FEARLESS;
        Album cd2 = Album.DAVIDTAO;
        cd2.play();
        cd1.play();

    }
}

interface LP {
    void play();
}

enum Album implements LP {

    FEARLESS("Taylor Swift","English"),DAVIDTAO("David Tao","Chinese");
    private String singer;
    private String language;

    private Album(String singer, String language) {
        this.singer = singer;
        this.language = language;
    }

    public String getSinger() {
        return singer;
    }

    public String getLanguage() {
        return language;
    }

    @Override
    public void play() {
        System.out.println(getSinger()+"'s new Album " + name() + " is in " + getLanguage());

    }
}