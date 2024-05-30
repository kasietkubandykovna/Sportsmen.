public class Napadaiyshii extends Sportsman  {

    public Napadaiyshii(String who,String name, String surName, int age, int height,int weight) {
        super(who,name, surName, age, height, weight);
    }

    @Override
    public void WhatIsDoing() {
        System.out.println("Chto delaet?  zabivat goly");
    }

}
