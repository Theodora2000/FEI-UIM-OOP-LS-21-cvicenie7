package sk.stuba.uim.fei.oop;

import java.util.List;

public class Main {
    public static void main(String []args){
        Cloveka c = new Cloveka();
        c.getName();
        c.setAdresa("adresa");
        c.setName("meno");
        c.setVaha(80.0);
        c.setVek(20);
        c.setKamarati(List.of(new Cloveka()));

        System.out.println(c.toString());
    }

}
