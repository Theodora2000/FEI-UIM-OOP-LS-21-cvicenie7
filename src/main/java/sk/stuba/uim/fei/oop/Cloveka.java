package sk.stuba.uim.fei.oop;

import jdk.dynalink.linker.LinkerServices;
import lombok.Data;

import java.util.List;
@Data
public class Cloveka {

    private String name;
    private String adresa;
    private double vyska;
    private double vaha;
    private int vek;
    private List<Cloveka> kamarati;


}
