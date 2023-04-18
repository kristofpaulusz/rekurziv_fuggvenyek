/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.util.Scanner;

/**
 *
 * @author PauluszKristófCsanád
 */
public class RekurzivFuggvenyek {

    static int osszeg(int n) {
        int osszeg = 0;
        for (int i = 1; i < n+1; i++) {
            osszeg += i;
        }
        return osszeg;
    }

    static int osszegRek(int n) {
        if (n != 0) {
            return n+ osszegRek(n-1);
        }
        else 
            return n ;
    }

    static String szoveg(int szovegDb) {
            Scanner szv = new Scanner(System.in);
            String ossz = "";
            for (int i = 0; i < szovegDb; i++) {
            ossz += szv.nextLine();
            }
        return ossz;
    }

    static String szovegRek(String mondat, int i) {
        Scanner szv = new Scanner(System.in);
        if (i != 0) {
            
            return mondat + szovegRek(szv.nextLine(), i-1);
        }
        else return mondat;
        
    }

    static int faktorialRek(int n) {
        if (n >= 1) {
            return n * faktorialRek(n-1);
        }
        else 
            return 1;
    }

    static int faktorial(int n) {
       int szorzat = 1;
        for (int i = 1; i <= n; i++) {
            szorzat *= i;
        }
        return szorzat;
    }

    static int hatvany(int i, int n) {
        int vegosszeg = 1;
        for (int j = 0; j < n; j++) {
            vegosszeg *= i;
        }
        return vegosszeg;
    
    }

    static int hatvanyRek(int alap, int kitevo) {
        if (kitevo == 0) {
            return 1;
        } else {
            return hatvanyRek(alap, kitevo-1) * alap;
        }
    }
    
    static int hatvanyRekTovabb(int alap, int kitevo) {
        if (kitevo == 0) {
            return 1;
        } else if (kitevo % 2 == 0) {
            return hatvanyRekTovabb(alap, kitevo*kitevo) * alap;
        } else  {
            return hatvanyRek(alap, kitevo-1) * alap;
        }
    }
            

    static int fibonacci(int i) {
        int[] eredmeny = new int[i];
        eredmeny[0] = 1;
        eredmeny[1] = 1;
        for (int j = 2; j < eredmeny.length; j++) {
            eredmeny[j] = eredmeny[j-1] + eredmeny[j-2];
        }
        return eredmeny[i-1];
        
    }

    static int fibonacciRek(int i) {
        if (i == 1 || i == 2) {
            return 1;
        }
        
        return fibonacciRek(i - 1) + fibonacciRek(i - 2);
    }
    
    
}
