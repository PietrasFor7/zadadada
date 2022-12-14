package com.example.myapplication1099;

import java.util.ArrayList;

public class Pytanie {
    private String tresc;
    private ArrayList<String> odpowiedzi;
    private int odpPoprawna;


    public Pytanie(String tresc,
                   String odp_a,
                   String odp_b,
                   String odp_c,
                   int odpPoprawna
                   ) {
        this.tresc = tresc;
        this.odpowiedzi = new ArrayList<>();
        this.odpowiedzi.add(odp_a);
        this.odpowiedzi.add(odp_b);
        this.odpowiedzi.add(odp_c);
        this.odpPoprawna = odpPoprawna;


    }

    public String getTresc() {
        return tresc;
    }

    public void setTresc(String tresc) {
        this.tresc = tresc;
    }

    public ArrayList<String> getOdpowiedzi() {
        return odpowiedzi;
    }

    public void setOdpowiedzi(ArrayList<String> odpowiedzi) {
        this.odpowiedzi = odpowiedzi;
    }

    public int getOdpPoprawna() {
        return odpPoprawna;
    }

    public void setOdpPoprawna(int odpPoprawna) {
        this.odpPoprawna = odpPoprawna;
    }


    public void udziel_odp(){

    }
    public void sprawdz_odp(){

    }
}
