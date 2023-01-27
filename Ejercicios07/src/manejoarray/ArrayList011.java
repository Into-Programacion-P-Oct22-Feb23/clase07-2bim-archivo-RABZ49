/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoarray;

// import java.util.ArrayList;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class ArrayList011 {

    public static void main(String[] args) {
        ArrayList<String> arreglo2 = obtenerDatos();
        String cadenaFinal = obtenerCadenaFinal(arreglo2);
        System.out.println("paises ingresados:");
        System.out.printf("%s\n", cadenaFinal.toUpperCase());

    }

    public static ArrayList<String> obtenerDatos() {
        ArrayList<String> arreglo2 = new ArrayList<>();
        Scanner entrada = new Scanner(System.in);
        String pais;
        int op = 2;
        boolean bandera = true;
        while (bandera) {
            System.out.println("ingrese el nombre de un pais:");
            pais = entrada.nextLine();
            arreglo2.add(pais);
            System.out.println("ingrese 1 para salir:");
            op = entrada.nextInt();
            entrada.nextLine();
            if (op == 1) {
                bandera = false;

            }

        }
        return arreglo2;
    }

    public static String obtenerCadenaFinal(ArrayList<String> a) {
        String cadenaFinal = "";
        for (int i = 0; i < a.size(); i++) {
            cadenaFinal = String.format("%s%s\n", cadenaFinal, a.get(i));
            
        }
        return cadenaFinal;
    }}

    /*
        ArrayList <String> arreglo2 = new ArrayList<>();
        
        ArrayList <Boolean> arreglo4 = new ArrayList<>();
     */
