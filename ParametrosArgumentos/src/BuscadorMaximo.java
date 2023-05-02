/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author omara
 */
import java.util.Scanner;

public class BuscadorMaximo {
    

    static void determinarMaximo() {
        
        Scanner entrada = new Scanner(System.in);

        // pide y recibe como entrada tres valores de punto flotante
        System.out.print("Escriba tres valores de punto flotante, separados por espacios: ");
        double numero1 = entrada.nextDouble(); // lee el primer valor double
        double numero2 = entrada.nextDouble(); // lee el segundo valor double
        double numero3 = entrada.nextDouble(); // lee el tercer valor double

        // determina el valor máximo
        double resultado = maximo(numero1, numero2, numero3);

        
        System.out.println("El maximo es: " + resultado);
    } 

    // devuelve el máximo de sus tres parámetros double
    static public double maximo(double x, double y, double z) {
        double valorMaximo = x; // asume que x es el mayor para empezar

        
        if (y > valorMaximo) {
            valorMaximo = y;
        }

        
        if (z > valorMaximo) {
            valorMaximo = z;
        }

        return valorMaximo;
    } 
    
    public static void main(String[] args) {
        determinarMaximo();
    }
} 
