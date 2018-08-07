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
public class Ejercicio_3 {
public static void main(String args[]) {
Scanner leer = new Scanner(System.in);
    System.out.println("Ingrese un numero: ");
    int NumeroIngresado = leer.nextInt();
    int factorial=1;
       
       while(NumeroIngresado>0){
           while(NumeroIngresado>0){
       factorial=factorial * NumeroIngresado;
       NumeroIngresado--;
       
            } 
       
    System.out.println("El factorial del numero Ingresado es:" +factorial);
 NumeroIngresado = 0;
        factorial = 1;
        NumeroIngresado=leer.nextInt();
       }
       }
}
