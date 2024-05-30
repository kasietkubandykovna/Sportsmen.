public class Vratar extends Sportsman{
    public Vratar(String who,java.lang.String name, java.lang.String surName, int age, int height, int weight) {
        super(who,name, surName, age, height, weight);
    }

    @Override
    public void WhatIsDoing() {
        System.out.println("Chto delaet?   zashishat vorota");
    }
}
