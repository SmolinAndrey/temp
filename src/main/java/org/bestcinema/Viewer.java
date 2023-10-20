package org.bestcinema;

public class Viewer {
    private String nickName; // никнейм
    private int age; // возраст
    private int cnt; // количество просмотренных фильмов

    public Viewer(String nickName, int age, int cnt){
        this.nickName = nickName;
        this.age = age;
        this.cnt = cnt;
    }

    public int getCnt() {
        return cnt;
    }
}
