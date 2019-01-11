/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalez04;

/**
 *
 * @author tss
 */
public class Array {
    public static void main(String[] args) {
        //dichiarazione di array di interi
       int[]numeri; 
       // creazione di un array di 100 numeri
       numeri = new int[100];
       // forma abbreviata 1
       int[]numeri1 = new int[100];
       
       stampa(numeri);
        
        
        //carica array
        int valore = 1;
        for (int i = 0; i < 100; i++) {
           int elemento = numeri[i];
           numeri[i] = valore;
           valore = valore + 1;
            
        }
        System.out.println("--------");
        
        // stampa array
        for (int i = 0; i < 100; i++) {
           int elemento = numeri[i];
            System.out.println(String.format("Numeri%s=%s", i, elemento));
        
    }
  }

    //function java
    public static void stampa (int [] array){
        for (int i = 0; i <array.length; i++) {
           int elemento = array [i]; 
            System.out.println(String.format("array[%s] = %s", i, elemento));
        }
    }
        
   }
        
    



