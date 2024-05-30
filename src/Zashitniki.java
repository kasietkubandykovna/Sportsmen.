public class Zashitniki extends Sportsman{

    public Zashitniki(String who,String name, String surName, int age, int height,int weight) {
        super(who,name, surName, age, height, weight);
    }

    @Override
    public void WhatIsDoing() {
        System.out.println("Chto delaet?   ne dat soperniku zabit gol");
    }
}
