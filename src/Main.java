public class Main {
    public static void main(String[] args) {
    Trener trener=new Trener("Trener","Uluk", "Alyev");
    Sportsman zashitniki=new Zashitniki("Zashitnik","Kuban", "Akylov", 25, 198,89);
 Sportsman napadaiyshii=new Napadaiyshii(" Napadaiyshii","Adyl", "Urmatov", 29, 190,90);
    Sportsman vratar= new Vratar("Vratar","Asan", "Muratov", 29, 186, 88);

    Sportsman[]sportsmens={trener,zashitniki,napadaiyshii,vratar};
    for (Sportsman s:sportsmens){
        System.out.println(s);
        s.WhatIsDoing();
    }
    }
}