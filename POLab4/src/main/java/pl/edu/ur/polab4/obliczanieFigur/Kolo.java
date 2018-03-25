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
public class Kolo {
    
    public double promien;
    
    public Kolo(double promien)
    {
        this.promien=promien;
    }
    
    public double pole_kola(double r)
    {
        double wynik;
        wynik = r*r*3.14;
        
        return wynik; 
    }
    
    public double obwod_kola(double r)
    {
        double wynik;
        wynik = 2*3.14*r;
        
        return wynik; 
    }
    
    public void wypisz_kolo()
    {
        System.out.println("Kolo");
        System.out.println("Promien wynosi "+promien);
        double pole, obwod;
        pole = pole_kola(promien);
        obwod = obwod_kola(promien);
        System.out.println("Pole kola wynosi "+pole+" Obwod kola wynosi "+obwod);
        System.out.println("");
    }
}

