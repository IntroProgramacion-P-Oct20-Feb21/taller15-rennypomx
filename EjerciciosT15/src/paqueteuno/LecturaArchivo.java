/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueteuno;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class LecturaArchivo {
   
    // lee registro del archivo
    public static void leerRegistros() {

      // 1. Se abre el archivo
        try // lee registros del archivo, usando el objeto Scanner
        {
            Scanner entrada = new Scanner(new File("data/datos1.csv"));

            while (entrada.hasNext()) {
                String linea = entrada.nextLine();  // ["ARENILLAS, 62"]
                List<String> lista = Arrays.asList(linea.split(","));  // ["ARENILLAS", "62"]
                ArrayList<String> linea_partes = new ArrayList<>(lista);  // ["ARENILLAS", "62"]
                for (int i = 0; i < linea_partes.size(); i++) {
                    System.out.println(linea_partes.get(i));
                }
                // System.out.printf("%s\n", linea_partes.get(1));
                System.out.println("-----------------------------------");

            } // fin de while
            entrada.close();
        } // fin de try
        catch (Exception e) {
            System.err.println("Error al leer del archivo.");
            System.exit(1); 
        } // fin de catch
    } // fin del m�todo leerRegistros
    // cierra el archivo y termina la aplicaci�n

    
} // fin de la clase LeerArchivoTexto