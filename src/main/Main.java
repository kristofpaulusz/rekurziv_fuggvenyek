package main;

public class Main {
    public static void main(String[] args) {
        // Iterativ osszegzes
        long kezdet = System.nanoTime();
        RekurzivFuggvenyek.osszeg(3);
        long vege = System.nanoTime();
        System.out.println("Iterativ osszesito: "+ (vege-kezdet) + " nSec");

        // Rekurziv osszegzes
        kezdet = System.nanoTime();
        System.out.println(RekurzivFuggvenyek.osszegRek(3));
        vege = System.nanoTime();
        System.out.println("Rekurziv Osszesito: "+ (vege-kezdet) + " nSec");
    
        // Iterativ szovegosszefuzes
//        kezdet = System.nanoTime();
//        System.out.println(RekurzivFuggvenyek.szoveg(5));
//        vege = System.nanoTime();
//        System.out.println("Rekurziv Osszesito: "+ (vege-kezdet) + " nSec");
        
        // Rek. szovegosszefuzes
//        kezdet = System.nanoTime();
//        System.out.println(RekurzivFuggvenyek.szovegRek("", 5));
//        vege = System.nanoTime();
//        System.out.println("Rekurziv Osszesito: "+ (vege-kezdet) + " nSec");
        
        // Iterativ 
        kezdet = System.nanoTime();
        System.out.println(RekurzivFuggvenyek.faktorial(6));
        vege = System.nanoTime();
        System.out.println("Iterativ Faktorial: "+ (vege-kezdet) + " nSec");
        
        // Rek. 
        kezdet = System.nanoTime();
        System.out.println(RekurzivFuggvenyek.faktorialRek(6));
        vege = System.nanoTime();
        System.out.println("Rekurziv Faktorial: "+ (vege-kezdet) + " nSec");
        
        // Iterativ 
        kezdet = System.nanoTime();
        System.out.println(RekurzivFuggvenyek.hatvany(6, 3));
        vege = System.nanoTime();
        System.out.println("Iterativ hatvany: "+ (vege-kezdet) + " nSec");
        
        // Rek. 
        kezdet = System.nanoTime();
        System.out.println(RekurzivFuggvenyek.hatvanyRek(6, 3));
        vege = System.nanoTime();
        System.out.println("Rekurziv hatvany: "+ (vege-kezdet) + " nSec");
        
        // Iterativ 
        kezdet = System.nanoTime();
        System.out.println(RekurzivFuggvenyek.fibonacci(15));
        vege = System.nanoTime();
        System.out.println("Iterativ fibonacci: "+ (vege-kezdet) + " nSec");
        
        // Rek. 
        kezdet = System.nanoTime();
        System.out.println(RekurzivFuggvenyek.fibonacciRek(15));
        vege = System.nanoTime();
        System.out.println("Rekurziv fibonacci: "+ (vege-kezdet) + " nSec");
    
    }
}
