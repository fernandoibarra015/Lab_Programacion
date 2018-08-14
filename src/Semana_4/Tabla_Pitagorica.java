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
public class Tabla_Pitagorica {
    public static void main(String[]args){
    Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese el limite de la tabla pitagorica: ");
        int numIngresado=leer.nextInt();
        for (int i = 1; i <= numIngresado; i++) {
            for (int x = 1; x <= numIngresado; x++) {
                System.out.print(i*x);
        System.out.print("\t");
            }
            System.out.println("\n");
        }
        
    }
}
