package com.company;

public class Obra {

    private String name;
    private String tematica;
    private int numPagines;

    public Obra() {}

    public Obra (String name, String tematica, int numPagines) {

        this.name = name;
        this.tematica = tematica;
        this.numPagines = numPagines;
    }
        //Getters

        public String getName() {
            return name;
        }
        public String getTematica() {
            return tematica;
        }
        public int getNumPagines() {
            return numPagines;
        }

        //Setters

        public void setName(String name) {
            this.name = name;
        }

        public void setTematica(String tematica) {
            this.tematica = name;
        }
        public void setNumPagines(int numPagines) {
            this.numPagines = numPagines;
        }

    }


