package com.company;

//Agaç nesnemiz
public class Agac {
    String türAdi;
    int age;
    String hayvanAdi;

    //Ana Constructor yapımız
    Agac() {
        this.türAdi = "Değer girilmedi.";
        this.age = 0;
        this.hayvanAdi = "Değer girilmedi.";
    }

    //Parametrik constructor yapımız
    Agac(String türAdi, int age, String hayvanAdi) {
        this.türAdi = türAdi;
        this.age = age;
        this.hayvanAdi = hayvanAdi;
    }

    public String agacTurleri() {
        return türAdi;
    }
    public String agacTurleriVeHayvanlar() {
        return türAdi+ " - "+hayvanAdi;
    }
    public String turYasHayvan() {
        return türAdi+ " - " +age+ " - " +hayvanAdi;
    }
}





