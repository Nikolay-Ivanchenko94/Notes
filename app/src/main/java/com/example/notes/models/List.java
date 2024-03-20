package com.example.notes.models;

public class List {

    private Plan plans;

    private Cooking cooking;
    private Day day;


    private HomeWork homework;


    public List(Plan plans, Cooking cooking, Day day, HomeWork homework) {
        this.cooking = cooking;
        this.day = day;
        this.plans = plans;
        this.homework = homework;
    }
    public Cooking getCooking() {
        return cooking;
    }
    public void setCooking() {
        this.cooking = cooking;
    }
    public Day getDay() {
        return day;
    }
    public void setDay() {
        this.day = day;
    }
    public Plan getPlans() {
        return plans;
    }
    public void setPlans(){
        this.plans = plans;
    }
    public HomeWork getHomework(){
        return homework;
    }
    public void setHomework() {
        this.homework = homework;
    }
}
