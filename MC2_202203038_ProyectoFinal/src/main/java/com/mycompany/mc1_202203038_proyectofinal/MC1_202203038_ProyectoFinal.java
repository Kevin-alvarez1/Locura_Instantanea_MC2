/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mc1_202203038_proyectofinal;

import java.util.Date;

/**
 *
 * @author Player
 */
public class MC1_202203038_ProyectoFinal {
    public static Date horaInicio; // Variable para registrar la hora de inicio

    public static void main(String[] args) {
        registrarInicio();
        Menu_Opciones Aparece = new Menu_Opciones();
        Aparece.setVisible(true);
    }
        // Método para registrar el inicio
    public static void registrarInicio() {
        horaInicio = new Date(); // Registra la hora de inicio
    }

}
