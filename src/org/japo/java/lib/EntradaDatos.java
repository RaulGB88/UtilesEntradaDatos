/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.japo.java.lib;

//Importación de la clase Scanner.
import java.util.Scanner;
//Importación de la clase Locale.
import java.util.Locale;

/**
 *
 * @author - Raúl Granel Blasco - raul.granel@gmail.com
 */
public class EntradaDatos {

    //Instanciciación de la clase Scanner.
    public static final Scanner SCN = new Scanner(System.in, "ISO-8859-1");
    public static final Locale LCL = new Locale("EN", "uk");

    //Introduce un número ENTERO.
    public static int introduceEntero() {

        //Uso de la clase Locale.
        SCN.useLocale(LCL);

        boolean testOK = true;
        int numero = 0;

        do {
            try {
                System.out.printf("Introduce un número entero.....: ");
                numero = SCN.nextInt();
                System.out.printf("Número introducido.............: %d\n", numero);
                testOK = false;
            } catch (Exception e) {
                System.out.println("Error de entrada, introduce un número.");
            } finally {
                SCN.nextLine();
            }
        } while (testOK);

        return numero;
    }

    //Introduce un número REAL.
    public static double introduceReal() {

        //Uso de la clase Locale.
        SCN.useLocale(LCL);

        boolean testOK = true;
        double numero = 0;

        do {
            try {
                System.out.printf("Introduce un número real.....: ");
                numero = SCN.nextDouble();
                System.out.printf("Número introducido...........: %f\n", numero);
                testOK = false;
            } catch (Exception e) {
                System.out.println("Error de entrada, introduce un número.");
            } finally {
                SCN.nextLine();
            }
        } while (testOK);

        return numero;
    }

    //Introduce un valor BOOLEANO.
    public static boolean introduceValor() {

        boolean testOK = true;
        boolean b = true;

        do {
            try {
                System.out.printf("Introduce un valor.....: ");
                b = SCN.nextBoolean();
                System.out.printf("Valor introducido......: %b\n", b);
                testOK = false;
            } catch (Exception e) {
                System.out.println("Error de entrada, introduce un valor.");
            } finally {
                SCN.nextLine();
            }
        } while (testOK);

        return b;
    }

    //Introduce una CADENA.
    public static String introduceCadena() {

        boolean testOK = true;
        String cadena = "";

        do {
            try {
                System.out.printf("Introduce una cadena.....: ");
                cadena = SCN.nextLine();
                System.out.printf("Cadena introducida.......: %s\n", cadena);
                testOK = false;
            } catch (Exception e) {
                System.out.println("Error de entrada, introduce una cadena.");
            }
        } while (testOK);

        return cadena;
    }

    //Introduce un CARÁCTER.
    public static char introduceCaracter() {

        boolean testOK = true;
        char caracter = 0;

        do {
            try {
                System.out.printf("Introduce un carácter.....: ");
                caracter = SCN.nextLine().charAt(0);
                System.out.printf("Carácter introducido......: %c\n", caracter);
                testOK = false;
            } catch (Exception e) {
                System.out.println("Error de entrada, introduce un carácter.");
            }
        } while (testOK);

        return caracter;
    }
}
