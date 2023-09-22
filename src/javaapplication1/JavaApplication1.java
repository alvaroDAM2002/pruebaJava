/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.Scanner;

/**
 *
 * @author alvarobs
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public int bucle(int n1, int n2){
        int total=n1+n2;
        return total;
    }
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        // TODO code application logic here
        JavaApplication1 miObjeto = new JavaApplication1();
        System.out.println("Hola, Mundo!");
        System.out.println("Dime un número");
        int n1=scanner.nextInt();
        System.out.println("Dime un número");
        int n2=scanner.nextInt();
        int total=miObjeto.bucle(n1,n2);
        System.out.println(total);
        
    }
    
    
}
