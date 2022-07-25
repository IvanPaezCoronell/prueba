/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reto2;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Supergiros
 */
public class Reto2 {

    /**
     * @param args the command line arguments
     */
    
    public static void clasificar (double num){
        
        if (num >= 0 && num <= 5){
            System.out.println("SIN RIESGO");
            return;
        }
        
        if (num > 5 && num >= 14){
            System.out.println("BAJO");
            return;
        }
        
        if (num > 35 && num <= 80){
            System.out.println("ALTO");
            return;
        }
        
        if (num > 80 && num <= 100){
            System.out.println("INVIABLE SANITARIAMENTE");
            return;
        }
        
        
        
    }
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        
        int n;
        double prom, sum=0;
        
        n = leer.nextInt();
        
        double list[] = new double [n];
        
        for (int i = 0; i < n; i++) {
            list[i] = leer.nextDouble();
            sum += list[i];
            
           
        }
        
        prom = (sum/n);
        clasificar(prom);        
        Arrays.sort(list);
        clasificar(list[n-1]);
        clasificar(list[0]);
        
    }
    
}
