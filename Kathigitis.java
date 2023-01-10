/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.school;

/**
 *
 * @author chris
 */
public class Kathigitis {
    
    private char Onoma;

    /**
     * Get the value of Onoma
     *
     * @return the value of Onoma
     */
    public char getOnoma() {
        return Onoma;
    }

    /**
     * Set the value of Onoma
     *
     * @param Onoma new value of Onoma
     */
    public void setOnoma(char Onoma) {
        this.Onoma = Onoma;
    }

    private char Epitheto;

    /**
     * Get the value of Epitheto
     *
     * @return the value of Epitheto
     */
    public char getEpitheto() {
        return Epitheto;
    }

    /**
     * Set the value of Epitheto
     *
     * @param Epitheto new value of Epitheto
     */
    public void setEpitheto(char Epitheto) {
        this.Epitheto = Epitheto;
    }

    private String AMKA;

    /**
     * Get the value of AMKA
     *
     * @return the value of AMKA
     */
    public String getAMKA() {
        return AMKA;
    }

    /**
     * Set the value of AMKA
     *
     * @param AMKA new value of AMKA
     */
    public void setAMKA(String AMKA) {
        this.AMKA = AMKA;
    }

    private String TupouMathima;

    /**
     * Get the value of TupouMathima
     *
     * @return the value of TupouMathima
     */
    public String getTupouMathima() {
        return TupouMathima;
    }

    /**
     * Set the value of TupouMathima
     *
     * @param TupouMathima new value of TupouMathima
     */
    public void setTupouMathima(String TupouMathima) {
        this.TupouMathima = TupouMathima;
    }
    public void printInfo(){
            System.out.println("To onoma tou kathigiti einai "+this.getOnoma());
            System.out.println("to epitheto tou kathigiti einai "+this.getEpitheto());
            System.out.println("to AMKA tou kathigiti einai "+this.getAMKA());
            System.out.println("O Kathigitis didaskei "+this.getTupouMathima());
}
   
    
}

