/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.polab4.obliczanieFigur;

/**
 *
 * @author Dominik
 */
public class Kula {
    
    public double promien;
    
    public Kula(double promien)
    {
        this.promien=promien;
    }
    
    public double pole_kuli(double r)
    {
        double wynik;
        wynik = 4*3.14*r*r;
        
        return wynik;
    }
    
    public double objetosc_kuli(double r)
    {
        double wynik;
        wynik = (4*3.14*r*r*r)/3;
        
        return wynik;
    }
    
    public void wypisz_kule()
    {
        System.out.println("Kula");
        System.out.println("Promien wynosi "+promien);
        double pole, objetosc;
        pole = pole_kuli(promien);
        objetosc = objetosc_kuli(promien);
        System.out.println("Pole kuli wynosi "+pole+" Objetosc kuli wynosi "+objetosc);
        System.out.println("");
    }
    
}
