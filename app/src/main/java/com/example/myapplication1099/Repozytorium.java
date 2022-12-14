package com.example.myapplication1099;

import java.util.ArrayList;

public class Repozytorium {
    public static ArrayList<Pytanie> pytania = new ArrayList<>();
    public void wypelnijPytaniami(){
        pytania.add(new Pytanie("Jakie schronisko na obrazku?",
                "Nad MorskimOkiem",
                "Na Wielkiej Raczy",
                "Na Rysiance",
                1));

    }

}
