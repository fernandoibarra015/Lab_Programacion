/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_programacion;
import java.util.Scanner;
/**
 *
 * @author ferna
 */
public class Lab_Programacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        System.out.println("~~~ P R O G R A M A  D E  C O N V E R S I O N ~~~");
        System.out.println("    D E C I M A L   A  B I N A R I O  ");
        
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Ingrese un numero (base 10):  ");
        int numero_b10 = leer.nextInt();
        
        if(numero_b10 > 0)//Validar solo numeros mayores a 0
        {
            int dividendo = numero_b10;
            int divisor = 2;
            int cociente = dividendo/divisor;
        int residuo = dividendo % divisor;
        String numero_b2 = "";
        
            while(cociente >= 1){
                numero_b2 = residuo + numero_b2;
                dividendo = cociente;
                residuo = dividendo % divisor;
                cociente = dividendo/divisor;
                
        }
            
            numero_b2 = "1" + numero_b2;
            System.out.println("El numero binario equivalente de "+ numero_b10+ " es: "+ numero_b2);
        }else{
            System.out.println("Numero debe ser mayor cero!! ");
        }
          
    }
    
}
