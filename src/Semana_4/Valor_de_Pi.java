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
public class Valor_de_Pi {
    public static void main(String[]args){
    Scanner leer = new Scanner(System.in);
    int numeroIngresado=0;
    double pi=0;
        System.out.println("~~~ P R O G R A M A  D E  P I ~~~");
        
        System.out.print("Ingrese un numero: ");
        numeroIngresado = leer.nextInt();
        if (numeroIngresado>0){
        for(double Pi1=0;Pi1<=numeroIngresado-1; Pi1++){
        pi+= (4/((4*Pi1)+1));
        pi-=(4/((4*Pi1)+3));
            System.out.println("Numero " + (Pi1 + 1) + ": pi =" + pi);
        }
        }else{
            System.out.println("Los numeros menores a \"0\" no son validos");
        }
  }
}
