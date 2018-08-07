/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;
import java.util.Scanner;
/**
 *
 * @author ferna
 */
public class Ejercicio_1 {
    public static void main(String args[]) {
    int NumerosPares=0;
    int Multiplosde3=0;
    int NumerosPrimos=0;
    int numeroIngresado;
        System.out.println("~~~ E J E R C I C I O  1 ~~~");
        Scanner leer = new Scanner(System.in);
        int contador=0;
    while(contador <=19){
        System.out.println("Ingrese un numero: ");
        numeroIngresado=leer.nextInt();
        contador++;
        if(numeroIngresado % 2 == 0){
        NumerosPares++; 
        }if(numeroIngresado%3==0){
             if(numeroIngresado==3){
        NumerosPrimos ++;
        }
        Multiplosde3++;
        }  if(numeroIngresado/numeroIngresado== 1 && numeroIngresado/1 == numeroIngresado && numeroIngresado%3 != 0){
            NumerosPrimos ++;
        }
            
    }
        System.out.println("La cantidad de numeros pares es: " + NumerosPares);
        System.out.println("La cantidad de multiplos de 3 es: " + Multiplosde3);
        System.out.println("La cantidad de numeros primos es: " + NumerosPrimos);
    }
}
