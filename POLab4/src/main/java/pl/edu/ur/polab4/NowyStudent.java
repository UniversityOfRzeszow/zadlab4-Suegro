/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.polab4;

import java.util.Scanner;

/**
 *
 * @author student
 */
public class NowyStudent {
    
    public static void main(String[] args)
    {
          makeStudent();
        
    }
    
    public static void makeStudent()
    {
        
        Scanner odczyt = new Scanner(System.in); 
        System.out.println("Prosze podac imie");
        String imie;
        
        imie = odczyt.next();
        
        System.out.println("Prosze podac nazwisko");
        String nazwisko;
        
        nazwisko = odczyt.next();
        
        System.out.println("Prosze podac specjalnosc");
        String nazwaspecjalnosci;
        
        nazwaspecjalnosci = odczyt.next();
        
        System.out.println("Prosze podac rok studiow");
        int rok_studiow;

        rok_studiow = odczyt.nextInt();
    
        Student student = new Student(imie,nazwisko,1,nazwaspecjalnosci,rok_studiow);
        student.pokaz();
    }
    
}
