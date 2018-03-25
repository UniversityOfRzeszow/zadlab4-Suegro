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
public class Szescian {
    
    public double bok;
    
    public Szescian(double bok)
    {
        this.bok=bok;
    }
    
    public double pole_szescianu(double a)
    {
        double wynik;
        wynik = 6*a*a;
        
        return wynik;
    }
    
    public double obwod_szescianu(double a)
    {
        double wynik;
        wynik = a*a*a;
        
        return wynik;
    }
    
    public void wypisz_szescian()
    {
        System.out.println("Szescian");
        System.out.println("Bok wynosi "+bok);
        double pole, obwod;
        pole = pole_szescianu(bok);
        obwod = obwod_szescianu(bok);
        System.out.println("Pole szescianu wynosi "+pole+" Obwod szescianu wynosi "+obwod);
        System.out.println("");
    }
}
