package com.codeclan.code.example.listview;

/**
 * Created by user on 24/05/2017.
 */

public class CloudTechnology {
    private String name;
    private String category;
    private int year;
    private int ranking;

    public CloudTechnology(String name){
        this.name = name;
    }

    public CloudTechnology(String name, String category, int year){
        this.name = name;
        this.category = category;
        this.year = year;
    }

    public CloudTechnology(String name, String category, int year, int ranking){
        this.name = name;
        this.category = category;
        this.year = year;
        this.ranking = ranking;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCategory() {
        return this.category;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return this.year;
    }

    public int getRanking(){
        return this.ranking;
    }

    public void setRanking(int ranking){
        this.ranking = ranking;
    }
}
