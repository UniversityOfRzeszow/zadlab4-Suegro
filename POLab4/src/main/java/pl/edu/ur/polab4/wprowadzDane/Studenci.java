package pl.edu.ur.polab4.wprowadzDane;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dominik
 */

public class Studenci {
    
     public pl.edu.ur.polab4.Student[] studenci = new  pl.edu.ur.polab4.Student[100]; 
     
     Scanner odczyt = new Scanner(System.in);
     
     public Studenci(pl.edu.ur.polab4.Student[] studenci)
     {
         this.studenci=studenci;
     }
    
    public void utworz()
    {    
        for(int i = 0;i<100;i++)
        {
              studenci[i] = new  pl.edu.ur.polab4.Student("","",0,"",0);
        }
    }
    
    public void wprowadz(int index)
    {
        
        System.out.println("Prosze podac imie, nazwisko, nazwe specjalnosci oraz rok studiów w podanej kolejnosci");
        studenci[index].imie=odczyt.next();
        studenci[index].nazwisko=odczyt.next();
        studenci[index].nr_index=index;
        studenci[index].nazwaspecjalnosci=odczyt.next();
        studenci[index].rok_studiow=odczyt.nextInt();
    }
    
    public void edytuj(int index)
    {
        System.out.println("Prosze podac imie, nazwisko, nazwe specjalnosci oraz rok studiów w podanej kolejnosci");
        studenci[index].imie=odczyt.next();
        studenci[index].nazwisko=odczyt.next();
        studenci[index].nr_index=index;
        studenci[index].nazwaspecjalnosci=odczyt.next();
        studenci[index].rok_studiow=odczyt.nextInt();
    }
    
    public void usun(int index)
    {
        studenci[index].imie="";
        studenci[index].nazwisko="";
        studenci[index].nr_index=0;
        studenci[index].nazwaspecjalnosci="";
        studenci[index].rok_studiow=0;
    }
    
    public void wyswietl(int index)
    {
        System.out.println("Imie "+studenci[index].imie);
        System.out.println("Nazwisko "+studenci[index].nazwisko);
        System.out.println("Index "+studenci[index].nr_index);
        System.out.println("Specjalnosc "+studenci[index].nazwaspecjalnosci);
        System.out.println("Rok studiow "+studenci[index].rok_studiow);
    }
    
    public void wyswietl_wszystko()
    {
        for(int i = 0;i<100;i++)
        {
        System.out.println("Imie "+studenci[i].imie);
        System.out.println("Nazwisko "+studenci[i].nazwisko);
        System.out.println("Index "+studenci[i].nr_index);
        System.out.println("Specjalnosc "+studenci[i].nazwaspecjalnosci);
        System.out.println("Rok studiow "+studenci[i].rok_studiow);  
        }
    }
    
    public void wyswietl_zakres(int a, int b)
    {
        for(int i=a;i<=b;i++)
        {
        System.out.println("Imie "+studenci[i].imie);
        System.out.println("Nazwisko "+studenci[i].nazwisko);
        System.out.println("Index "+studenci[i].nr_index);
        System.out.println("Specjalnosc "+studenci[i].nazwaspecjalnosci);
        System.out.println("Rok studiow "+studenci[i].rok_studiow);   
        }
    }
    
    }
    

