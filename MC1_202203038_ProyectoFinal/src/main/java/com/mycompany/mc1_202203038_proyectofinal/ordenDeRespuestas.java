/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.mc1_202203038_proyectofinal;

import static com.mycompany.mc1_202203038_proyectofinal.AppDataListas.aristasCubo1;
import static com.mycompany.mc1_202203038_proyectofinal.AppDataListas.aristasCubo2;
import static com.mycompany.mc1_202203038_proyectofinal.AppDataListas.aristasCubo3;
import static com.mycompany.mc1_202203038_proyectofinal.AppDataListas.aristasCubo4;
import static com.mycompany.mc1_202203038_proyectofinal.AppDataListas.cuboSolucion1;
import static com.mycompany.mc1_202203038_proyectofinal.AppDataListas.cuboSolucion2;
import static com.mycompany.mc1_202203038_proyectofinal.AppDataListas.cuboSolucion3;
import static com.mycompany.mc1_202203038_proyectofinal.AppDataListas.cuboSolucion4;
import static com.mycompany.mc1_202203038_proyectofinal.AppDataListas.subgrafoHorizontal;
import static com.mycompany.mc1_202203038_proyectofinal.AppDataListas.subgrafoVertical;
import static com.mycompany.mc1_202203038_proyectofinal.OrdenarCubos.getColorIndex;
import static com.mycompany.mc1_202203038_proyectofinal.OrdenarCubos.seleccionarAristaExcepto;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

/**
 *
 * @author Player
 */
public class ordenDeRespuestas extends javax.swing.JFrame {

    public ordenDeRespuestas() {
        initComponents();
                    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            setVisible(true);
            setLocationRelativeTo(null);
            setResizable(false);
            setTitle("Menu de respuestas");
        aristasCubo1.clear();
        aristasCubo2.clear();
        aristasCubo3.clear();
        aristasCubo4.clear();
    }

public void llenarLabels() {
    // Crear una lista temporal para ordenar los datos
    List<String> ordenarLabels = new ArrayList<>(subgrafoVertical);

    // Ordenar la lista de acuerdo al número de arista
    Collections.sort(ordenarLabels, (arista1, arista2) -> {
        int numeroArista1 = Integer.parseInt(arista1.substring(arista1.indexOf("(") + 7, arista1.indexOf(")")));
        int numeroArista2 = Integer.parseInt(arista2.substring(arista2.indexOf("(") + 7, arista2.indexOf(")")));
        return Integer.compare(numeroArista1, numeroArista2);
    });

    // Asignar valores a los labels en el orden deseado
    JLabel[] labelsDerechoCubo = {labelDerechoCubo, labelDerechoCubo1, labelDerechoCubo2, labelDerechoCubo3};
    JLabel[] labelsIzqCubo = {labelIzqCubo, labelIzqCubo1, labelIzqCubo2, labelIzqCubo3};
    JLabel[] labelsCuboParaTexto = {cuboParaTexto, cuboParaTexto1, cuboParaTexto2, cuboParaTexto3};

    for (int i = 0; i < ordenarLabels.size(); i++) {
        String arista = ordenarLabels.get(i);

        // Dividir la arista en tres partes
        String[] partes = arista.split("-");
        String derecho = partes[0].trim(); // Parte antes del "-"
        String[] etiquetaPartes = partes[1].split(" "); // Dividir por espacios
        String izquierda = etiquetaPartes[0].trim(); // Parte antes del primer espacio
        String cuboTexto = "cubo " + (i + 1); // Agregar "cubo" antes del número

        // Asignar a los labels
        labelsDerechoCubo[i].setText(derecho);
        labelsIzqCubo[i].setText(izquierda);
        labelsCuboParaTexto[i].setText(cuboTexto);
    }
}
    public static void cambiarColorLabels(JLabel... paresDeLabels) {
        // Verifica que el número de argumentos sea par
        if (paresDeLabels.length % 2 != 0) {
            throw new IllegalArgumentException("Debe proporcionar un número par de JLabels.");
        }

        for (int i = 0; i < paresDeLabels.length; i += 2) {
            JLabel labelDerechoCubo = paresDeLabels[i];
            JLabel labelIzqCubo = paresDeLabels[i + 1];

            // Obtén los colores actuales de los labels
            String colorDerecho = labelDerechoCubo.getText();
            String colorIzquierdo = labelIzqCubo.getText();

            // Convierte las cadenas de color en objetos Color
            Color colorDerechoObj = getColorFromName(colorDerecho);
            Color colorIzquierdoObj = getColorFromName(colorIzquierdo);

            // Establece el color de fondo de los labels
            labelDerechoCubo.setBackground(colorDerechoObj);
            labelIzqCubo.setBackground(colorIzquierdoObj);

            // Asegúrate de que los labels sean opacos para mostrar el color de fondo
            labelDerechoCubo.setOpaque(true);
            labelIzqCubo.setOpaque(true);
        }
    }

    public static Color getColorFromName(String colorName) {
        switch (colorName) {
            case "rojo":
                return Color.RED;
            case "verde":
                return Color.GREEN;
            case "blanco":
                return Color.WHITE;
            case "amarillo":
                return Color.YELLOW;
            // Agrega más casos para otros colores según tus necesidades
            default:
                return Color.BLACK; // Color predeterminado si no se encuentra el color
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        cuboParaTexto = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        cuboParaTexto2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        cuboParaTexto3 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        cuboParaTexto1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        labelDerechoCubo = new javax.swing.JLabel();
        labelDerechoCubo1 = new javax.swing.JLabel();
        labelDerechoCubo2 = new javax.swing.JLabel();
        labelDerechoCubo3 = new javax.swing.JLabel();
        labelIzqCubo = new javax.swing.JLabel();
        labelIzqCubo1 = new javax.swing.JLabel();
        labelIzqCubo2 = new javax.swing.JLabel();
        labelIzqCubo3 = new javax.swing.JLabel();
        verRespuestas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel3.setBackground(new java.awt.Color(255, 204, 153));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        cuboParaTexto.setText("1");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 16, Short.MAX_VALUE)
                .addComponent(cuboParaTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(cuboParaTexto)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 204, 153));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        cuboParaTexto2.setText("3");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(cuboParaTexto2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(cuboParaTexto2)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(255, 204, 153));
        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        cuboParaTexto3.setText("4");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(cuboParaTexto3, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(cuboParaTexto3)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(255, 204, 153));
        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        cuboParaTexto1.setText("2");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(cuboParaTexto1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(cuboParaTexto1)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Respuestas: ");

        labelDerechoCubo.setForeground(new java.awt.Color(0, 0, 0));
        labelDerechoCubo.setText("----");

        labelDerechoCubo1.setForeground(new java.awt.Color(0, 0, 0));
        labelDerechoCubo1.setText("----");

        labelDerechoCubo2.setForeground(new java.awt.Color(0, 0, 0));
        labelDerechoCubo2.setText("----");

        labelDerechoCubo3.setForeground(new java.awt.Color(0, 0, 0));
        labelDerechoCubo3.setText("----");

        labelIzqCubo.setForeground(new java.awt.Color(0, 0, 0));
        labelIzqCubo.setText("----");

        labelIzqCubo1.setForeground(new java.awt.Color(0, 0, 0));
        labelIzqCubo1.setText("----");

        labelIzqCubo2.setForeground(new java.awt.Color(0, 0, 0));
        labelIzqCubo2.setText("----");

        labelIzqCubo3.setForeground(new java.awt.Color(0, 0, 0));
        labelIzqCubo3.setText("----");

        verRespuestas.setBackground(new java.awt.Color(153, 255, 153));
        verRespuestas.setForeground(new java.awt.Color(0, 102, 0));
        verRespuestas.setText("Ver Respuestas");
        verRespuestas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verRespuestasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(90, 90, 90)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelDerechoCubo2)
                            .addComponent(labelDerechoCubo3, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelIzqCubo)
                            .addComponent(labelIzqCubo2)
                            .addComponent(labelIzqCubo3)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelDerechoCubo1)
                            .addComponent(labelDerechoCubo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(169, 169, 169)
                                .addComponent(verRespuestas, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelIzqCubo1)))))
                .addContainerGap(1934, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(91, 91, 91)
                                .addComponent(labelIzqCubo))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(92, 92, 92)
                                .addComponent(labelDerechoCubo)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(38, 38, 38)
                                        .addComponent(labelDerechoCubo1))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelIzqCubo1)
                                .addGap(51, 51, 51)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(26, 26, 26)
                                        .addComponent(labelDerechoCubo2)))
                                .addGap(29, 29, 29)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(24, 24, 24)
                                        .addComponent(labelDerechoCubo3))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(labelIzqCubo2)
                                .addGap(116, 116, 116)
                                .addComponent(labelIzqCubo3))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(verRespuestas, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(1654, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 829, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 556, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//Metodos para las aristas:   
public static LinkedList<String> compararCarasYCrearAristas(LinkedList<Cubo1> cuboSolucion1) {

    for (Cubo1 cubo1 : cuboSolucion1) {
        String cara1 = cubo1.getCara1Cubo1();
        String cara2 = cubo1.getCara2Cubo1();
        String cara3 = cubo1.getCara3Cubo1();
        String cara4 = cubo1.getCara4Cubo1();
        String cara5 = cubo1.getCara5Cubo1();
        String cara6 = cubo1.getCara6Cubo1();

        // Comparar cara1 con cara3
        if (cara1.equals(cara3)) {
            aristasCubo1.add(cara1 + "-" + cara3);
        } else {
            aristasCubo1.add(cara1 + "-" + cara3);
        }

        // Comparar cara2 con cara4
        if (cara2.equals(cara4)) {
            aristasCubo1.add(cara2 + "-" + cara4);
        } else {
            aristasCubo1.add(cara2 + "-" + cara4);
        }

        // Comparar cara6 con cara5
        if (cara6.equals(cara5)) {
            aristasCubo1.add(cara6 + "-" + cara5);
        } else {
            aristasCubo1.add(cara6 + "-" + cara5);
        }
    }

    return aristasCubo1;
}
public static LinkedList<String> compararCarasYCrearAristas2(LinkedList<Cubo2> cuboSolucion2) {

    for (Cubo2 cubo2 : cuboSolucion2) {
        String cara1 = cubo2.getCara1Cubo2();
        String cara2 = cubo2.getCara2Cubo2();
        String cara3 = cubo2.getCara3Cubo2();
        String cara4 = cubo2.getCara4Cubo2();
        String cara5 = cubo2.getCara5Cubo2();
        String cara6 = cubo2.getCara6Cubo2();

        // Comparar cara1 con cara3
        if (cara1.equals(cara3)) {
            aristasCubo2.add(cara1 + "-" + cara3);
        } else {
            aristasCubo2.add(cara1 + "-" + cara3);
        }

        // Comparar cara2 con cara4
        if (cara2.equals(cara4)) {
            aristasCubo2.add(cara2 + "-" + cara4);
        } else {
            aristasCubo2.add(cara2 + "-" + cara4);
        }

        // Comparar cara6 con cara5
        if (cara6.equals(cara5)) {
            aristasCubo2.add(cara6 + "-" + cara5);
        } else {
            aristasCubo2.add(cara6 + "-" + cara5);
        }
    }

    return aristasCubo2;
}
public static LinkedList<String> compararCarasYCrearAristas3(LinkedList<Cubo3> cuboSolucion3) {

    for (Cubo3 cubo3 : cuboSolucion3) {
        String cara1 = cubo3.getCara1Cubo3();
        String cara2 = cubo3.getCara2Cubo3();
        String cara3 = cubo3.getCara3Cubo3();
        String cara4 = cubo3.getCara4Cubo3();
        String cara5 = cubo3.getCara5Cubo3();
        String cara6 = cubo3.getCara6Cubo3();

        // Comparar cara1 con cara3
        if (cara1.equals(cara3)) {
            aristasCubo3.add(cara1 + "-" + cara3);
        } else {
            aristasCubo3.add(cara1 + "-" + cara3);
        }

        // Comparar cara2 con cara4
        if (cara2.equals(cara4)) {
            aristasCubo3.add(cara2 + "-" + cara4);
        } else {
            aristasCubo3.add(cara2 + "-" + cara4);
        }

        // Comparar cara6 con cara5
        if (cara6.equals(cara5)) {
            aristasCubo3.add(cara6 + "-" + cara5);
        } else {
            aristasCubo3.add(cara6 + "-" + cara5);
        }
    }

    return aristasCubo3;
}
public static LinkedList<String> compararCarasYCrearAristas4(LinkedList<Cubo4> cuboSolucion4) {

    for (Cubo4 cubo4 : cuboSolucion4) {
        String cara1 = cubo4.getCara1Cubo4();
        String cara2 = cubo4.getCara2Cubo4();
        String cara3 = cubo4.getCara3Cubo4();
        String cara4 = cubo4.getCara4Cubo4();
        String cara5 = cubo4.getCara5Cubo4();
        String cara6 = cubo4.getCara6Cubo4();

        // Comparar cara1 con cara3
        if (cara1.equals(cara3)) {
            aristasCubo4.add(cara1 + "-" + cara3);
        } else {
            aristasCubo4.add(cara1 + "-" + cara3);
        }

        // Comparar cara2 con cara4
        if (cara2.equals(cara4)) {
            aristasCubo4.add(cara2 + "-" + cara4);
        } else {
            aristasCubo4.add(cara2 + "-" + cara4);
        }

        // Comparar cara6 con cara5
        if (cara6.equals(cara5)) {
            aristasCubo4.add(cara6 + "-" + cara5);
        } else {
            aristasCubo4.add(cara6 + "-" + cara5);
        }
    }

    return aristasCubo4;
}
    private void verRespuestasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verRespuestasActionPerformed
        // TODO add your handling code here:

        LinkedList<String> aristasCubo1 = compararCarasYCrearAristas(cuboSolucion1);
        LinkedList<String> aristasCubo2 = compararCarasYCrearAristas2(cuboSolucion2);
        LinkedList<String> aristasCubo3 = compararCarasYCrearAristas3(cuboSolucion3);
        LinkedList<String> aristasCubo4 = compararCarasYCrearAristas4(cuboSolucion4);
        System.out.println("Aqui es en el orden de respuestas antes");
        System.out.println("Aristas Cubo 1: " + aristasCubo1);
        System.out.println("Aristas Cubo 2: " + aristasCubo2);
        System.out.println("Aristas Cubo 3: " + aristasCubo3);
        System.out.println("Aristas Cubo 4: " + aristasCubo4);
        llenarSubgrafoVerticalDesdeAristasCubo1();

        System.out.println("Subgrafo Vertical 1: " + subgrafoVertical);
        llenarSubgrafoVerticalDesdeAristasCubo2();

        System.out.println("Subgrafo Vertical 2: " + subgrafoVertical);
        llenarSubgrafoVerticalDesdeAristasCubo3();

        System.out.println("Subgrafo Vertical 3: " + subgrafoVertical);
        llenarSubgrafoVerticalDesdeAristasCubo4();

        System.out.println("Subgrafo Vertical 4: " + subgrafoVertical);

        System.out.println("Aqui es en el orden de respuestas despues vertical");
        System.out.println("Aristas Cubo 1: " + aristasCubo1);
        System.out.println("Aristas Cubo 2: " + aristasCubo2);
        System.out.println("Aristas Cubo 3: " + aristasCubo3);
        System.out.println("Aristas Cubo 4: " + aristasCubo4);
        
        llenarSubgrafoHorizontalDesdeAristasCubo1();
        System.out.println("Subgrafo Horizontal 1:  " + subgrafoHorizontal);
        llenarSubgrafoHorizontalDesdeAristasCubo2();
 
        System.out.println("Subgrafo Horizontal 2:  " + subgrafoHorizontal);
        llenarSubgrafoHorizontalDesdeAristasCubo3();
       
        System.out.println("Subgrafo Horizontal 3:  " + subgrafoHorizontal);
        llenarSubgrafoHorizontalDesdeAristasCubo4();
        
        System.out.println("Subgrafo Horizontal 4:  " + subgrafoHorizontal);
        
        System.out.println("Aqui es en el orden de respuestas despues Horizontal");
        System.out.println("Aristas Cubo 1: " + aristasCubo1);
        System.out.println("Aristas Cubo 2: " + aristasCubo2);
        System.out.println("Aristas Cubo 3: " + aristasCubo3);
        System.out.println("Aristas Cubo 4: " + aristasCubo4);
        llenarLabels();
        // Llama al método para cambiar los colores de los labels
        cambiarColorLabels(
                labelDerechoCubo, labelIzqCubo,
                labelDerechoCubo1, labelIzqCubo1,
                labelDerechoCubo2, labelIzqCubo2,
                labelDerechoCubo3, labelIzqCubo3
        );

    }//GEN-LAST:event_verRespuestasActionPerformed
public static void llenarSubgrafoVerticalDesdeAristasCubo1() {
    if (!aristasCubo1.isEmpty() && subgrafoVertical.size() < 4) {
        String arista = aristasCubo1.removeFirst(); // Tomar el primer dato de aristasCubo1
        String aristaConEtiqueta = arista + " (arista" + (subgrafoVertical.size() + 1) + ")";
        subgrafoVertical.add(aristaConEtiqueta);
    }
}
public static void llenarSubgrafoVerticalDesdeAristasCubo2() {
    if (!aristasCubo2.isEmpty() && subgrafoVertical.size() < 4) {
        String aristaConEtiqueta = null;
        boolean aristaEncontrada = false;
        Set<String> coloresUsados = new HashSet<>();

        for (String arista : subgrafoVertical) {
            String[] coloresArista = arista.split("-"); // Obtener colores de aristas ya en subgrafo
            coloresUsados.add(coloresArista[0]);
            coloresUsados.add(coloresArista[1]);
        }

        Iterator<String> iterator = aristasCubo2.iterator();

        while (iterator.hasNext() && !aristaEncontrada) {
            String arista = iterator.next();
            String[] colores = arista.split("-");

            if (!coloresUsados.contains(colores[0]) && !coloresUsados.contains(colores[1])) {
                aristaConEtiqueta = arista + " (arista" + (subgrafoVertical.size() + 1) + ")";
                subgrafoVertical.add(aristaConEtiqueta);
                iterator.remove(); // Eliminar solo el dato utilizado
                aristaEncontrada = true;
            }
        }

        if (!aristaEncontrada) {
            System.out.println("No hay solucion");
        }
    }
}
public static void llenarSubgrafoVerticalDesdeAristasCubo3() {
    if (!aristasCubo3.isEmpty() && subgrafoVertical.size() < 4) {
        String aristaConEtiqueta = null;
        boolean aristaEncontrada = false;
        Set<String> coloresUsados = new HashSet<>();
        Map<String, Integer> colorCount = new HashMap<>();

        // Contar cuántas veces se repiten los colores en color1 y color2 en subgrafoVertical
        for (String arista : subgrafoVertical) {
            String[] splitArista = arista.split(" ");
            String aristaData = splitArista[0];
            String color1 = aristaData.split("-")[0];
            String color2 = aristaData.split("-")[1];

            // Actualizar el recuento de colores
            colorCount.put(color1, colorCount.getOrDefault(color1, 0) + 1);
            colorCount.put(color2, colorCount.getOrDefault(color2, 0) + 1);
        }

        Iterator<String> iterator = aristasCubo3.iterator();

        while (iterator.hasNext() && !aristaEncontrada) {
            String arista = iterator.next();
            String[] colores = arista.split("-");
            String color1 = colores[0];
            String color2 = colores[1];

            // Verificar si los colores de la arista no se repiten más de dos veces
            if (colorCount.getOrDefault(color1, 0) < 2 && colorCount.getOrDefault(color2, 0) < 2) {
                aristaConEtiqueta = arista + " (arista" + (subgrafoVertical.size() + 1) + ")";
                // Verificar si la aristaConEtiqueta no existe ya en subgrafoVertical
                if (!subgrafoVertical.contains(aristaConEtiqueta)) {
                    subgrafoVertical.add(aristaConEtiqueta);
                    iterator.remove(); // Eliminar la arista utilizada
                    aristaEncontrada = true;
                }
            }
        }

        if (!aristaEncontrada) {
            System.out.println("No hay solución en aristasCubo3");
        }
    }
}
public static void llenarSubgrafoVerticalDesdeAristasCubo4() {
    if (!aristasCubo4.isEmpty() && subgrafoVertical.size() < 4) {
        String aristaConEtiqueta = null;
        boolean aristaEncontrada = false;
        Set<String> coloresUsados = new HashSet<>();
        Map<String, Integer> colorCount = new HashMap<>();

        // Contar cuántas veces se repiten los colores en color1 y color2 en subgrafoVertical
        for (String arista : subgrafoVertical) {
            String[] splitArista = arista.split(" ");
            String aristaData = splitArista[0];
            String color1 = aristaData.split("-")[0];
            String color2 = aristaData.split("-")[1];

            // Actualizar el recuento de colores
            colorCount.put(color1, colorCount.getOrDefault(color1, 0) + 1);
            colorCount.put(color2, colorCount.getOrDefault(color2, 0) + 1);
        }

        Iterator<String> iterator = aristasCubo4.iterator();

        while (iterator.hasNext() && !aristaEncontrada) {
            String arista = iterator.next();
            String[] colores = arista.split("-");
            String color1 = colores[0];
            String color2 = colores[1];

            // Verificar si los colores de la arista no se repiten más de dos veces
            if (colorCount.getOrDefault(color1, 0) < 2 && colorCount.getOrDefault(color2, 0) < 2) {
                aristaConEtiqueta = arista + " (arista" + (subgrafoVertical.size() + 1) + ")";
                // Verificar si la aristaConEtiqueta no existe ya en subgrafoVertical
                if (!subgrafoVertical.contains(aristaConEtiqueta)) {
                    subgrafoVertical.add(aristaConEtiqueta);
                    iterator.remove(); // Eliminar la arista utilizada
                    aristaEncontrada = true;
                }
            }
        }

        if (!aristaEncontrada) {
            System.out.println("No hay solución en aristasCubo4");
        }
    }
}

public static void llenarSubgrafoHorizontalDesdeAristasCubo1() {
    if (!aristasCubo1.isEmpty() && subgrafoHorizontal.size() < 4) {
        String arista = aristasCubo1.removeFirst(); // Tomar el primer dato de aristasCubo1
        String aristaConEtiqueta = arista + " (arista" + (subgrafoHorizontal.size() + 1) + ")";
        subgrafoHorizontal.add(aristaConEtiqueta);
    }
}
public static void llenarSubgrafoHorizontalDesdeAristasCubo2() {
    if (!aristasCubo2.isEmpty() && subgrafoHorizontal.size() < 4) {
        String aristaConEtiqueta = null;
        boolean aristaEncontrada = false;
        Set<String> coloresUsados = new HashSet<>();

        for (String arista : subgrafoHorizontal) {
            String[] coloresArista = arista.split("-"); // Obtener colores de aristas ya en subgrafo
            coloresUsados.add(coloresArista[0]);
            coloresUsados.add(coloresArista[1]);
        }

        Iterator<String> iterator = aristasCubo2.iterator();

        while (iterator.hasNext() && !aristaEncontrada) {
            String arista = iterator.next();
            String[] colores = arista.split("-");

            if (!coloresUsados.contains(colores[0]) && !coloresUsados.contains(colores[1])) {
                aristaConEtiqueta = arista + " (arista" + (subgrafoHorizontal.size() + 1) + ")";
                subgrafoHorizontal.add(aristaConEtiqueta);
                iterator.remove(); // Eliminar solo el dato utilizado
                aristaEncontrada = true;
            }
        }

        if (!aristaEncontrada) {
            System.out.println("No hay solucion");
        }
    }
}
public static void llenarSubgrafoHorizontalDesdeAristasCubo3() {
    if (!aristasCubo3.isEmpty() && subgrafoHorizontal.size() < 4) {
        String aristaConEtiqueta = null;
        boolean aristaEncontrada = false;
        Set<String> coloresUsados = new HashSet<>();
        Map<String, Integer> colorCount = new HashMap<>();

        // Contar cuántas veces se repiten los colores en color1 y color2 en subgrafoHorizontal
        for (String arista : subgrafoHorizontal) {
            String[] splitArista = arista.split(" ");
            String aristaData = splitArista[0];
            String color1 = aristaData.split("-")[0];
            String color2 = aristaData.split("-")[1];

            // Actualizar el recuento de colores
            colorCount.put(color1, colorCount.getOrDefault(color1, 0) + 1);
            colorCount.put(color2, colorCount.getOrDefault(color2, 0) + 1);
        }

        Iterator<String> iterator = aristasCubo3.iterator();

        while (iterator.hasNext() && !aristaEncontrada) {
            String arista = iterator.next();
            String[] colores = arista.split("-");
            String color1 = colores[0];
            String color2 = colores[1];

            // Verificar si los colores de la arista no se repiten más de dos veces
            if (colorCount.getOrDefault(color1, 0) < 2 && colorCount.getOrDefault(color2, 0) < 2) {
                aristaConEtiqueta = arista + " (arista" + (subgrafoHorizontal.size() + 1) + ")";
                // Verificar si la aristaConEtiqueta no existe ya en subgrafoHorizontal
                if (!subgrafoHorizontal.contains(aristaConEtiqueta)) {
                    subgrafoHorizontal.add(aristaConEtiqueta);
                    iterator.remove(); // Eliminar la arista utilizada
                    aristaEncontrada = true;
                }
            }
        }

        if (!aristaEncontrada) {
            System.out.println("No hay solución en aristasCubo3");
        }
    }
}
public static void llenarSubgrafoHorizontalDesdeAristasCubo4() {
    if (!aristasCubo4.isEmpty() && subgrafoHorizontal.size() < 4) {
        String aristaConEtiqueta = null;
        boolean aristaEncontrada = false;
        Set<String> coloresUsados = new HashSet<>();
        Map<String, Integer> colorCount = new HashMap<>();

        // Contar cuántas veces se repiten los colores en color1 y color2 en subgrafoHorizontal
        for (String arista : subgrafoHorizontal) {
            String[] splitArista = arista.split(" ");
            String aristaData = splitArista[0];
            String color1 = aristaData.split("-")[0];
            String color2 = aristaData.split("-")[1];

            // Actualizar el recuento de colores
            colorCount.put(color1, colorCount.getOrDefault(color1, 0) + 1);
            colorCount.put(color2, colorCount.getOrDefault(color2, 0) + 1);
        }

        Iterator<String> iterator = aristasCubo4.iterator();

        while (iterator.hasNext() && !aristaEncontrada) {
            String arista = iterator.next();
            String[] colores = arista.split("-");
            String color1 = colores[0];
            String color2 = colores[1];

            // Verificar si los colores de la arista no se repiten más de dos veces
            if (colorCount.getOrDefault(color1, 0) < 2 && colorCount.getOrDefault(color2, 0) < 2) {
                aristaConEtiqueta = arista + " (arista" + (subgrafoHorizontal.size() + 1) + ")";
                // Verificar si la aristaConEtiqueta no existe ya en subgrafoHorizontal
                if (!subgrafoHorizontal.contains(aristaConEtiqueta)) {
                    subgrafoHorizontal.add(aristaConEtiqueta);
                    iterator.remove(); // Eliminar la arista utilizada
                    aristaEncontrada = true;
                }
            }
        }

        if (!aristaEncontrada) {
            System.out.println("No hay solución en aristasCubo4");
        }
    }
}

public static String invertirArista(String arista) {
    String[] colores = arista.split("-");
    return colores[1] + "-" + colores[0];
}
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ordenDeRespuestas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ordenDeRespuestas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ordenDeRespuestas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ordenDeRespuestas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ordenDeRespuestas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cuboParaTexto;
    private javax.swing.JLabel cuboParaTexto1;
    private javax.swing.JLabel cuboParaTexto2;
    private javax.swing.JLabel cuboParaTexto3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelDerechoCubo;
    private javax.swing.JLabel labelDerechoCubo1;
    private javax.swing.JLabel labelDerechoCubo2;
    private javax.swing.JLabel labelDerechoCubo3;
    private javax.swing.JLabel labelIzqCubo;
    private javax.swing.JLabel labelIzqCubo1;
    private javax.swing.JLabel labelIzqCubo2;
    private javax.swing.JLabel labelIzqCubo3;
    private javax.swing.JButton verRespuestas;
    // End of variables declaration//GEN-END:variables
}
