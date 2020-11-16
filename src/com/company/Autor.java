package com.company;

public class Autor {
    private String name;
    private Obra [] llistaObres;


    public Autor(String name, Obra [] llistaObres) {
        this.name = name;
        this.llistaObres = llistaObres;
    }
    public Obra obraMesLlarga() {
        this.llistaObres[0].getNumPagines();
        int maxPagines = 0;
        Obra obra = new Obra();

        for(int i=0; i < this.llistaObres.length; i++) {
            if(this.llistaObres[i].getNumPagines() > maxPagines) {
                maxPagines = this.llistaObres[i].getNumPagines();
                obra = this.llistaObres[i];
            }
        }
        return obra;
    }




}



