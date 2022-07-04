package com.exercicio.numeros.controler;

import java.util.HashMap;

public class NumerosRomanos {
    public HashMap<Integer, String> unidades = new HashMap<>();
    public HashMap<Integer, String> dezenas = new HashMap<>();
    public HashMap<Integer, String> centenas = new HashMap<>();
    public HashMap<Integer, String> unidadesMilhar = new HashMap<>();

    public NumerosRomanos() {
        unidades.put(0, "");
        unidades.put(1, "I");
        unidades.put(2, "II");
        unidades.put(3, "III");
        unidades.put(4, "IV");
        unidades.put(5, "V");
        unidades.put(6, "VI");
        unidades.put(7, "VII");
        unidades.put(8, "VIII");
        unidades.put(9, "IX");
        dezenas.put(0,"");
        dezenas.put(1,"X");
        dezenas.put(2,"XX");
        dezenas.put(3,"XXX");
        dezenas.put(4,"XL");
        dezenas.put(5,"L");
        dezenas.put(6,"LX");
        dezenas.put(7,"LXX");
        dezenas.put(8,"LXXX");
        dezenas.put(9,"XC");
        centenas.put(0,"");
        centenas.put(1,"C");
        centenas.put(2,"CC");
        centenas.put(3,"CCC");
        centenas.put(4,"CD");
        centenas.put(5,"D");
        centenas.put(6,"DC");
        centenas.put(7,"DCC");
        centenas.put(8,"DCCC");
        centenas.put(9,"CM");
        unidadesMilhar.put(0, "");
        unidadesMilhar.put(1, "M");
        unidadesMilhar.put(2, "MM");
        unidadesMilhar.put(3, "MMM");
    }

    public HashMap<Integer, String> getUnidades() {
        return unidades;
    }

    public HashMap<Integer, String> getDezenas() {
        return dezenas;
    }

    public HashMap<Integer, String> getCentenas() {
        return centenas;
    }

    public HashMap<Integer, String> getUnidadesMilhar() {
        return unidadesMilhar;
    }
}
