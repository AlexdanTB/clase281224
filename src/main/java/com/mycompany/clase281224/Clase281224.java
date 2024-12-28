/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.clase281224;

import javax.swing.JOptionPane;

/**
 *
 * @author ItsqmetEstudiantes
 */
public class Clase281224 {

    public static void main(String[] args) {
        String nombre = "";
        int edad = 0;
        double [] notas = {9, 5, 6, 8, 10, 4, 7};
        double [] notas2 = {5, 6, 10, 0};
        
        nombre = JOptionPane.showInputDialog("Ingresar nombre");
        edad = Integer.parseInt(JOptionPane.showInputDialog("Ingresar el número"));
        mensaje(nombre, edad);
        JOptionPane.showMessageDialog(null, promedio(notas2));
    }
    public static void mensaje(String n, int x){
        JOptionPane.showMessageDialog(null, n+" tiene "+x+" años");
    }
    
    public static double promedio(double[] calificaciones){
        double suma = 0;
        for (int i=0; i<calificaciones.length ; i++){
            suma = suma+calificaciones[i];
        }
        return suma/calificaciones.length;
    }
}
