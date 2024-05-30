public class Trener extends Sportsman {

    public Trener(String who,String name, String surName) {
        super(who,name, surName);
    }

    @Override
    public void WhatIsDoing() {
        System.out.println("Chto delaet?   treniruet igrokov");
    }
}
