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
public class Ejercicio_2 {
  public static void main(String args[]) {
 Scanner leer = new Scanner(System.in);
 System.out.print("Ingrese su nombre:  ");
 String NombreEmpleado= leer.next();
System.out.print("Ingrese su salario anual:  ");
double salarioAnual = leer.nextDouble();
 double isr=0;
 if (salarioAnual >= 0.01 && salarioAnual <=152557.15){
  isr=0;
  }
 if(salarioAnual>=152557.15 && salarioAnual <= 232622.61 ){
 isr=salarioAnual*0.15;
 }
 if(salarioAnual>=232622.61 && salarioAnual <=  540982.82  ){
 isr=salarioAnual*0.2;
 }
 if(salarioAnual >=  540982.82  ){
 isr=salarioAnual*0.25;
 }
      System.out.println("La deduccion del ISR sera de: " +isr);
  }
}
