package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Agac agac1 = new Agac("Ladin", 3, "Kertenkele");
        Agac agac2 = new Agac("Meşe", 4, "Karınca");
        Agac agac3 = new Agac("Köknar", 2, "Solucan");
        Agac agac4 = new Agac();

        ArrayList<Agac> liste = new ArrayList<Agac>();
        liste.add(agac1);
        liste.add(agac2);
        liste.add(agac3);
        liste.add(agac4);

        for (Agac agac:liste){
            System.out.println(agac.turYasHayvan());
            }
        }

    }

