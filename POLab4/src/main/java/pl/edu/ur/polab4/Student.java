/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.polab4;

/**
 *
 * @author student
 */
public class Student {
    
    public String imie;
    public String nazwisko;
    public int nr_index = 1;
    public String nazwaspecjalnosci;
    public int rok_studiow;
    
    public Student(String imie, String nazwisko)
    {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }
    
    public Student(String imie, String nazwisko, int nr_index)
    {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.nr_index=nr_index;
    }
    
    public Student(String imie, String nazwisko, String nazwaspecjalnosci)
    {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.nazwaspecjalnosci = nazwaspecjalnosci;
    }
    
    public Student(String imie, String nazwisko, int nr_index, String nazwaspecjalnosci, int rok_studiow)
    {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.nr_index = nr_index;
        this.nazwaspecjalnosci = nazwaspecjalnosci;
        this.rok_studiow = rok_studiow;
    }
    
    public void pokaz()
    {
        System.out.println("imię: " + this.imie);
        System.out.println("nazwisko: " + this.nazwisko);
        System.out.println("numer indeksu: " + this.nr_index);
        System.out.println("nazwa specjalnosci: " + this.nazwaspecjalnosci);
        System.out.println("rok studiów: " + this.rok_studiow);
    }
    
    
    
}
