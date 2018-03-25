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
public class Prostokat {
    
    public double bok1;
    public double bok2; 
    
    public Prostokat(double bok1, double bok2)
    {
        this.bok1=bok1;
        this.bok2=bok2;
    }
    
    public double pole_prostokata(double a, double b)
    {
        double wynik;
        wynik = a*b;
        
        return wynik; 
    }
    
    public double obwod_prostokata(double a, double b)
    {
        double wynik;
        wynik = 2*a+2*b;
        
        return wynik; 
    }
    
    public void wypisz_prostokat()
    {
        System.out.println("Prostokat");
        System.out.println("Boki wynosza "+bok1+" "+bok2);
        double pole, obwod;
        pole = pole_prostokata(bok1,bok2);
        obwod = obwod_prostokata(bok1,bok2);
        System.out.println("Pole prostokata wynosi "+pole+" Obwod prostokata wynosi "+obwod);
        System.out.println("");
    }
    
}
