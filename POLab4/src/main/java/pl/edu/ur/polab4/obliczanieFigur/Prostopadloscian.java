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
public class Prostopadloscian {
    
    public double bok1;
    public double bok2;
    public double wysokosc;
    
    public Prostopadloscian(double bok1, double bok2, double wysokosc)
    {
        this.bok1=bok1;
        this.bok2=bok2;
        this.wysokosc=wysokosc;
    }
    
    public double pole_prostopadloscianu(double a, double b, double h)
    {
        double wynik;
        wynik = 2*a*b+2*a*h+2*b*h;
        
        return wynik;
    }
    
    public double objetosc_prostopadloscianu(double a, double b, double h)
    {
        double wynik;
        wynik = a*b*h;
        
        return wynik;
    }
    
    public void wypisz_prostopadloscian()
    {
        System.out.println("Prostopadloscian");
        System.out.println("Boki wynosza "+bok1+" "+bok2+ " "+wysokosc);
        double pole, objetosc;
        pole = pole_prostopadloscianu(bok1,bok2,wysokosc);
        objetosc = objetosc_prostopadloscianu(bok1,bok2,wysokosc);
        System.out.println("Pole prostopadloscianu wynosi "+pole+" Obwod prostopadloscianu wynosi "+objetosc);
        System.out.println("");
    }
}
