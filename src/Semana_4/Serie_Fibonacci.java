/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana_4;
import java.util.Scanner;
/**
 *
 * @author ferna
 */
public class Serie_Fibonacci {
  public static void main(String[]args){
  Scanner leer = new Scanner(System.in);
   int numero,fib1,fib2,i;
        do{
            System.out.print("Introduce numero mayor que 1: ");
            numero = leer.nextInt();
            fib1=1;
        fib2=1;
        System.out.println("Los " + numero + " primeros términos de la serie de Fibonacci son:");
        System.out.print(fib1 + " ");
        for(i=2;i<=numero;i++){
             System.out.print(fib2+ " ");
             fib2 = fib1 + fib2;
             fib1 = fib2 - fib1;
             
        }
        }while(numero<=1);
        
       

        
        System.out.println();
  }
  
}
