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
public class NowaFigura {
    
    public static void main(String[] args)
    {
        Kolo kolo = new Kolo(3.3);
        Kula kula = new Kula(4.6);
        Prostokat prostokat = new Prostokat(4.1,2);
        Prostopadloscian prostopadloscian = new Prostopadloscian(4.9,2.2,5);
        Stozek stozek = new Stozek(4.2,3,4.5);
        Szescian szescian = new Szescian(5.5);
        
        kolo.wypisz_kolo();
        kula.wypisz_kule();
        prostokat.wypisz_prostokat();
        prostopadloscian.wypisz_prostopadloscian();
        stozek.wypisz_stozek();
        szescian.wypisz_szescian();
    }
    
}
