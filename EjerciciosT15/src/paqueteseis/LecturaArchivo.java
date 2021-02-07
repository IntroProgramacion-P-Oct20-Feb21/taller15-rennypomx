/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueteseis;

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
    public static double leerRegistros() {
        
        double suma = 0;
        double promedio;
        double sueldo;
        int edad;
        int contador = 0;
        
        // 1. Se abre el archivo
        try // lee registros del archivo, usando el objeto Scanner
        {
            Scanner entrada = new Scanner(new File("data/datos2.csv"));

            while (entrada.hasNext()) {
                String linea = entrada.nextLine();
                List<String> lista = Arrays.asList(linea.split("\\|"));
                ArrayList<String> linea_partes = new ArrayList<>(lista);
                
                // agregar código aquí
                edad = Integer.parseInt(linea_partes.get(1));
                if ((edad > 30) && (edad < 35)) {
                    sueldo = Double.parseDouble(linea_partes.get(2));
                    suma = suma + sueldo;
                    contador = contador + 1;
                }
                
            } // fin de while
            entrada.close();
        } // fin de try
        catch (Exception e) {
            System.err.printf("Error, revise: %s\n", e);
            System.exit(1); 
        } // fin de catch
        
        promedio = suma / contador;
        return promedio;
        
    } // fin del m�todo leerRegistros
    // cierra el archivo y termina la aplicaci�n

    
} 