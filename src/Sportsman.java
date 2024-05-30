public abstract class Sportsman implements WhatIsHeDoing{
    private String who;
    private String name;
    private String surName;
    private int age;
    private int height;
    private  int weight;


    public Sportsman(String who, String name, String surName) {
        this.who=who;
       this.name = name;
        this.surName = surName;
   }

    public Sportsman(java.lang.String who,java.lang.String name, java.lang.String surName, int age, int height, int weight) {
        this.who=who;
        this.name = name;
        this.surName = surName;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return
                "who: " + who  +
                ", name: " + name  +
                ", surName: " + surName +
                ", age: " + age +
                ", height: " + height +
                ", weight: " + weight +
                '}';
    }
}
