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
public class Stozek {
    
    public double promien;
    public double tworzaca;
    public double wysokosc;
    
    public Stozek(double promien, double tworzaca, double wysokosc)
    {
        this.promien=promien;
        this.tworzaca=tworzaca;
        this.wysokosc=wysokosc;
    }
    
    public double pole_stozka(double r, double l)
    {
        double wynik;
        wynik = 3.14*r*(r+l);
        
        return wynik;
    }
    
    public double objetosc_stozka(double r, double l, double h)
    {
        double wynik;
        wynik = (3.14*r*r*h)/3;
        
        return wynik;
    }
    
    public void wypisz_stozek()
    {
        System.out.println("Stozek");
        System.out.println("Promien wynosi "+promien+" Tworzaca stozka wynosi "+tworzaca+" Wysokosc stozka wynosi "+wysokosc);
        double pole, objetosc;
        pole = pole_stozka(promien,tworzaca);
        objetosc = objetosc_stozka(promien,tworzaca,wysokosc);
        System.out.println("Pole stozka wynosi "+pole+" Objetosc stozka wynosi "+objetosc);
        System.out.println("");
    }
}
