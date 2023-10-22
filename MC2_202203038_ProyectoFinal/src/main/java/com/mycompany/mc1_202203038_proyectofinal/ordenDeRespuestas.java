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
import javax.swing.JOptionPane;
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
        continuarBoton.setVisible(false);

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
public void llenarLabelsSuperiorInferior() {
    // Crear una lista temporal para ordenar los datos
    List<String> ordenarLabels = new ArrayList<>(subgrafoHorizontal);

    // Ordenar la lista de acuerdo al número de arista
    Collections.sort(ordenarLabels, (arista1, arista2) -> {
        int numeroArista1 = Integer.parseInt(arista1.substring(arista1.indexOf("(") + 7, arista1.indexOf(")")));
        int numeroArista2 = Integer.parseInt(arista2.substring(arista2.indexOf("(") + 7, arista2.indexOf(")")));
        return Integer.compare(numeroArista1, numeroArista2);
    });

    // Asignar valores a los labels superiores e inferiores en el orden deseado
    JLabel[] labelsSuperior = {labelSuperior, labelSuperior1, labelSuperior2, labelSuperior3};
    JLabel[] labelsInferior = {labelInferior, labelInferior1, labelInferior2, labelInferior3};
    JLabel[] labelsCuboParaTexto = {cuboParaTexto, cuboParaTexto1, cuboParaTexto2, cuboParaTexto3};

    for (int i = 0; i < ordenarLabels.size(); i++) {
        String arista = ordenarLabels.get(i);

        // Dividir la arista en tres partes
        String[] partes = arista.split("-");
        String superior = partes[0].trim(); // Parte antes del "-"
        String[] etiquetaPartes = partes[1].split(" "); // Dividir por espacios
        String inferior = etiquetaPartes[0].trim(); // Parte antes del primer espacio
        String cuboTexto = "cubo " + (i + 1); // Agregar "cubo" antes del número

        // Asignar a los labels
        labelsSuperior[i].setText(superior);
        labelsInferior[i].setText(inferior);
        labelsCuboParaTexto[i].setText(cuboTexto);
    }
}

public static void cambiarColorLabelsSuperiorInferior(JLabel... paresDeLabels) {
    // Verifica que el número de argumentos sea par
    if (paresDeLabels.length % 2 != 0) {
        throw new IllegalArgumentException("Debe proporcionar un número par de JLabels.");
    }

    for (int i = 0; i < paresDeLabels.length; i += 2) {
        JLabel labelSuperior = paresDeLabels[i];
        JLabel labelInferior = paresDeLabels[i + 1];

        // Obtén los colores actuales de los labels
        String colorSuperior = labelSuperior.getText();
        String colorInferior = labelInferior.getText();

        // Convierte las cadenas de color en objetos Color
        Color colorSuperiorObj = getColorFromName(colorSuperior);
        Color colorInferiorObj = getColorFromName(colorInferior);

        // Establece el color de fondo de los labels
        labelSuperior.setBackground(colorSuperiorObj);
        labelInferior.setBackground(colorInferiorObj);

        // Asegúrate de que los labels sean opacos para mostrar el color de fondo
        labelSuperior.setOpaque(true);
        labelInferior.setOpaque(true);
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
        labelSuperior = new javax.swing.JLabel();
        labelInferior = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        cuboParaTexto2 = new javax.swing.JLabel();
        labelSuperior2 = new javax.swing.JLabel();
        labelInferior2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        cuboParaTexto3 = new javax.swing.JLabel();
        labelSuperior3 = new javax.swing.JLabel();
        labelInferior3 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        cuboParaTexto1 = new javax.swing.JLabel();
        labelSuperior1 = new javax.swing.JLabel();
        labelInferior1 = new javax.swing.JLabel();
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
        rendirseBoton = new javax.swing.JButton();
        continuarBoton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel3.setBackground(new java.awt.Color(255, 204, 153));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        cuboParaTexto.setText("Cubo1");

        labelSuperior.setForeground(new java.awt.Color(0, 0, 0));
        labelSuperior.setText("---------");

        labelInferior.setForeground(new java.awt.Color(0, 0, 0));
        labelInferior.setText("---------");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 16, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelInferior)
                    .addComponent(labelSuperior)
                    .addComponent(cuboParaTexto))
                .addGap(35, 35, 35))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(labelSuperior)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(cuboParaTexto)
                .addGap(24, 24, 24)
                .addComponent(labelInferior))
        );

        jPanel4.setBackground(new java.awt.Color(255, 204, 153));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        cuboParaTexto2.setText("Cubo 3");

        labelSuperior2.setForeground(new java.awt.Color(0, 0, 0));
        labelSuperior2.setText("---------");

        labelInferior2.setForeground(new java.awt.Color(0, 0, 0));
        labelInferior2.setText("---------");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelInferior2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cuboParaTexto2)
                    .addComponent(labelSuperior2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(labelSuperior2)
                .addGap(18, 18, 18)
                .addComponent(cuboParaTexto2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(labelInferior2))
        );

        jPanel5.setBackground(new java.awt.Color(255, 204, 153));
        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        cuboParaTexto3.setText("Cubo4");

        labelSuperior3.setForeground(new java.awt.Color(0, 0, 0));
        labelSuperior3.setText("---------");

        labelInferior3.setForeground(new java.awt.Color(0, 0, 0));
        labelInferior3.setText("---------");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(labelInferior3))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cuboParaTexto3)
                            .addComponent(labelSuperior3))))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(labelSuperior3)
                .addGap(18, 18, 18)
                .addComponent(cuboParaTexto3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(labelInferior3)
                .addContainerGap())
        );

        jPanel6.setBackground(new java.awt.Color(255, 204, 153));
        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        cuboParaTexto1.setText("Cubo2");

        labelSuperior1.setForeground(new java.awt.Color(0, 0, 0));
        labelSuperior1.setText("---------");

        labelInferior1.setForeground(new java.awt.Color(0, 0, 0));
        labelInferior1.setText("---------");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cuboParaTexto1)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(labelInferior1, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(labelSuperior1, javax.swing.GroupLayout.Alignment.TRAILING)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(labelSuperior1)
                .addGap(18, 18, 18)
                .addComponent(cuboParaTexto1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(labelInferior1))
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

        rendirseBoton.setBackground(new java.awt.Color(255, 102, 102));
        rendirseBoton.setForeground(new java.awt.Color(153, 0, 0));
        rendirseBoton.setText("Me Rindo :(");
        rendirseBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rendirseBotonActionPerformed(evt);
            }
        });

        continuarBoton.setBackground(new java.awt.Color(153, 255, 204));
        continuarBoton.setForeground(new java.awt.Color(0, 102, 102));
        continuarBoton.setText("Continuar");
        continuarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                continuarBotonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(2218, 2500, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 267, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(labelDerechoCubo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(labelDerechoCubo3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(labelIzqCubo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(labelIzqCubo3)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(labelDerechoCubo, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                                    .addComponent(labelDerechoCubo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(labelIzqCubo, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(115, 115, 115)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(rendirseBoton, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                                            .addComponent(verRespuestas, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                                            .addComponent(continuarBoton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addComponent(labelIzqCubo1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(1934, 1934, 1934))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(labelDerechoCubo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(labelIzqCubo)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelIzqCubo1)
                        .addGap(51, 51, 51))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(labelDerechoCubo1))
                            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(labelDerechoCubo2)
                                .addGap(77, 77, 77)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(labelDerechoCubo3))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(labelIzqCubo2)
                        .addGap(102, 102, 102)
                        .addComponent(labelIzqCubo3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(verRespuestas, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(rendirseBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(continuarBoton)
                .addGap(2000, 2000, 2000))
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

        asignarValoresDeCara1(cuboSolucion1, labelDerechoCubo);
        asignarValoresDeCara2(cuboSolucion2, labelDerechoCubo1);
        asignarValoresDeCara3(cuboSolucion3, labelDerechoCubo2);
        asignarValoresDeCara4(cuboSolucion4, labelDerechoCubo3);
        
        asignarValoresDeCara1izq(cuboSolucion1, labelIzqCubo);
        asignarValoresDeCara2izq(cuboSolucion2, labelIzqCubo1);
        asignarValoresDeCara3izq(cuboSolucion3, labelIzqCubo2);
        asignarValoresDeCara4izq(cuboSolucion4, labelIzqCubo3);
        
        asignarValoresDeCara1sup(cuboSolucion1, labelSuperior);
        asignarValoresDeCara2sup(cuboSolucion2, labelSuperior1);
        asignarValoresDeCara3sup(cuboSolucion3, labelSuperior2);
        asignarValoresDeCara4sup(cuboSolucion4, labelSuperior3);
        
        asignarValoresDeCara1Inf(cuboSolucion1, labelInferior);
        asignarValoresDeCara2Inf(cuboSolucion2, labelInferior1);
        asignarValoresDeCara3Inf(cuboSolucion3, labelInferior2);
        asignarValoresDeCara4Inf(cuboSolucion4, labelInferior3);
        
        asignarColorFondoLabel(labelDerechoCubo);
        asignarColorFondoLabel(labelDerechoCubo1);
        asignarColorFondoLabel(labelDerechoCubo2);
        asignarColorFondoLabel(labelDerechoCubo3);

        asignarColorFondoLabel(labelIzqCubo);
        asignarColorFondoLabel(labelIzqCubo1);
        asignarColorFondoLabel(labelIzqCubo2);
        asignarColorFondoLabel(labelIzqCubo3);
        
        asignarColorFondoLabel(labelSuperior);
        asignarColorFondoLabel(labelSuperior1);
        asignarColorFondoLabel(labelSuperior2);
        asignarColorFondoLabel(labelSuperior3);

        asignarColorFondoLabel(labelInferior);
        asignarColorFondoLabel(labelInferior1);
        asignarColorFondoLabel(labelInferior2);
        asignarColorFondoLabel(labelInferior3);     
        contarYVerificarColores(labelDerechoCubo, labelDerechoCubo1, labelDerechoCubo2, labelDerechoCubo3, labelIzqCubo, labelIzqCubo1, labelIzqCubo2, labelIzqCubo3);
        contarYVerificarColoresParaSuperiorEInferior(labelSuperior, labelSuperior1, labelSuperior2, labelSuperior3, labelInferior, labelInferior1, labelInferior2, labelInferior3);
        if (verticalIncorrecta && horizontalIncorrecta) {
            int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea continuar?", "Continuar", JOptionPane.YES_NO_OPTION);
            if (respuesta == JOptionPane.YES_OPTION) {
                verRespuestas.setEnabled(false);

            } else {
                Game_Over Aparece = new Game_Over();
                Aparece.setVisible(true);
                this.dispose();
            }
        }
    }//GEN-LAST:event_verRespuestasActionPerformed

public static boolean contarYVerificarColores(JLabel... labels) {
    // Usamos un mapa para contar cuántas veces se repite cada color
    Map<String, Integer> contadorColores = new HashMap<>();
    
    // Inicializamos el contador para cada color
    contadorColores.put("rojo", 0);
    contadorColores.put("verde", 0);
    contadorColores.put("amarillo", 0);
    contadorColores.put("blanco", 0);

    for (JLabel label : labels) {
        String texto = label.getText().toLowerCase(); // Convertimos el texto a minúsculas para evitar problemas de mayúsculas/minúsculas
        if (contadorColores.containsKey(texto)) {
            contadorColores.put(texto, contadorColores.get(texto) + 1);
        }
    }

    // Verificamos si algún color se repite más o menos de 2 veces
    boolean respuestaCorrecta = true;
    for (String color : contadorColores.keySet()) {
        int contador = contadorColores.get(color);
        if (contador != 2) {
            respuestaCorrecta = false;
            break;
        }
    }

    if (!respuestaCorrecta) {
        JOptionPane.showMessageDialog(null, "Respuesta Incorrecta", "Error Horizontal", JOptionPane.ERROR_MESSAGE);
        horizontalIncorrecta = true;  // Se establece la variable horizontalIncorrecta en true
    } else {
        JOptionPane.showMessageDialog(null, "Respuesta Correcta");
    }
    
    return respuestaCorrecta;
}

private static boolean verticalIncorrecta = false;  // Variable para indicar si hubo un error vertical
private static boolean horizontalIncorrecta = false;  // Variable para indicar si hubo un error vertical

public static boolean contarYVerificarColoresParaSuperiorEInferior(JLabel... labels) {
    // Usamos un mapa para contar cuántas veces se repite cada color
    Map<String, Integer> contadorColores = new HashMap<>();
    
    // Inicializamos el contador para cada color
    contadorColores.put("rojo", 0);
    contadorColores.put("verde", 0);
    contadorColores.put("amarillo", 0);
    contadorColores.put("blanco", 0);

    for (JLabel label : labels) {
        String texto = label.getText().toLowerCase(); // Convertimos el texto a minúsculas para evitar problemas de mayúsculas/minúsculas
        if (contadorColores.containsKey(texto)) {
            contadorColores.put(texto, contadorColores.get(texto) + 1);
        }
    }

    // Verificamos si algún color se repite más o menos de 2 veces
    boolean respuestaCorrecta = true;
    for (String color : contadorColores.keySet()) {
        int contador = contadorColores.get(color);
        if (contador != 2) {
            respuestaCorrecta = false;
            break;
        }
    }

    if (!respuestaCorrecta) {
        JOptionPane.showMessageDialog(null, "Respuesta Incorrecta", "Error Vertical", JOptionPane.ERROR_MESSAGE);
        verticalIncorrecta = true;  // Se establece la variable verticalIncorrecta en true
    } else {
        JOptionPane.showMessageDialog(null, "Respuesta Correcta");
    }
    
    return respuestaCorrecta;
}

public static void asignarValoresDeCara1(LinkedList<Cubo1> cuboSolucion1, JLabel labelDerechoCubo) {
    if (!cuboSolucion1.isEmpty()) {
        Cubo1 cubo1 = cuboSolucion1.getFirst();
        String cara6 = cubo1.getCara6Cubo1();
        labelDerechoCubo.setText(cara6);
    }
}
public static void asignarValoresDeCara2(LinkedList<Cubo2> cuboSolucion2, JLabel labelDerechoCubo1) {
    if (!cuboSolucion2.isEmpty()) {
        Cubo2 cubo1 = cuboSolucion2.getFirst();
        String cara6 = cubo1.getCara6Cubo2();
        labelDerechoCubo1.setText(cara6);
    }
}
public static void asignarValoresDeCara3(LinkedList<Cubo3> cuboSolucion3, JLabel labelDerechoCubo2) {
    if (!cuboSolucion3.isEmpty()) {
        Cubo3 cubo1 = cuboSolucion3.getFirst();
        String cara6 = cubo1.getCara6Cubo3();
        labelDerechoCubo2.setText(cara6);
    }
}
public static void asignarValoresDeCara4(LinkedList<Cubo4> cuboSolucion4, JLabel labelDerechoCubo3) {
    if (!cuboSolucion4.isEmpty()) {
        Cubo4 cubo1 = cuboSolucion4.getFirst();
        String cara6 = cubo1.getCara6Cubo4();
        labelDerechoCubo3.setText(cara6);
    }
}
public static void asignarValoresDeCara1izq(LinkedList<Cubo1> cuboSolucion1, JLabel labelIzqCubo) {
    if (!cuboSolucion1.isEmpty()) {
        Cubo1 cubo1 = cuboSolucion1.getFirst();
        String cara5 = cubo1.getCara5Cubo1();
        labelIzqCubo.setText(cara5);
    }
}
public static void asignarValoresDeCara2izq(LinkedList<Cubo2> cuboSolucion2, JLabel labelIzqCubo1) {
    if (!cuboSolucion2.isEmpty()) {
        Cubo2 cubo1 = cuboSolucion2.getFirst();
        String cara5 = cubo1.getCara5Cubo2();
        labelIzqCubo1.setText(cara5);
    }
}
public static void asignarValoresDeCara3izq(LinkedList<Cubo3> cuboSolucion3, JLabel labelIzqCubo2) {
    if (!cuboSolucion3.isEmpty()) {
        Cubo3 cubo1 = cuboSolucion3.getFirst();
        String cara5 = cubo1.getCara5Cubo3();
        labelIzqCubo2.setText(cara5);
    }
}
public static void asignarValoresDeCara4izq(LinkedList<Cubo4> cuboSolucion4, JLabel labelIzqCubo3) {
    if (!cuboSolucion4.isEmpty()) {
        Cubo4 cubo1 = cuboSolucion4.getFirst();
        String cara5 = cubo1.getCara5Cubo4();
        labelIzqCubo3.setText(cara5);
    }
}
public static void asignarValoresDeCara1sup(LinkedList<Cubo1> cuboSolucion1, JLabel labelSuperior) {
    if (!cuboSolucion1.isEmpty()) {
        Cubo1 cubo1 = cuboSolucion1.getFirst();
        String cara1 = cubo1.getCara1Cubo1();
        labelSuperior.setText(cara1);
    }
}
public static void asignarValoresDeCara2sup(LinkedList<Cubo2> cuboSolucion2, JLabel labelSuperior1) {
    if (!cuboSolucion2.isEmpty()) {
        Cubo2 cubo1 = cuboSolucion2.getFirst();
        String cara1 = cubo1.getCara1Cubo2();
        labelSuperior1.setText(cara1);
    }
}
public static void asignarValoresDeCara3sup(LinkedList<Cubo3> cuboSolucion3, JLabel labelSuperior2) {
    if (!cuboSolucion3.isEmpty()) {
        Cubo3 cubo1 = cuboSolucion3.getFirst();
        String cara1 = cubo1.getCara1Cubo3();
        labelSuperior2.setText(cara1);
    }
}
public static void asignarValoresDeCara4sup(LinkedList<Cubo4> cuboSolucion4, JLabel labelSuperior3) {
    if (!cuboSolucion4.isEmpty()) {
        Cubo4 cubo1 = cuboSolucion4.getFirst();
        String cara1 = cubo1.getCara1Cubo4();
        labelSuperior3.setText(cara1);
    }
}
public static void asignarValoresDeCara1Inf(LinkedList<Cubo1> cuboSolucion1, JLabel labelInferior) {
    if (!cuboSolucion1.isEmpty()) {
        Cubo1 cubo1 = cuboSolucion1.getFirst();
        String cara3 = cubo1.getCara3Cubo1();
        labelInferior.setText(cara3);
    }
}
public static void asignarValoresDeCara2Inf(LinkedList<Cubo2> cuboSolucion2, JLabel labelInferior1) {
    if (!cuboSolucion2.isEmpty()) {
        Cubo2 cubo1 = cuboSolucion2.getFirst();
        String cara3 = cubo1.getCara3Cubo2();
        labelInferior1.setText(cara3);
    }
}
public static void asignarValoresDeCara3Inf(LinkedList<Cubo3> cuboSolucion3, JLabel labelInferior2) {
    if (!cuboSolucion3.isEmpty()) {
        Cubo3 cubo1 = cuboSolucion3.getFirst();
        String cara3 = cubo1.getCara3Cubo3();
        labelInferior2.setText(cara3);
    }
}
public static void asignarValoresDeCara4Inf(LinkedList<Cubo4> cuboSolucion4, JLabel labelInferior3) {
    if (!cuboSolucion4.isEmpty()) {
        Cubo4 cubo1 = cuboSolucion4.getFirst();
        String cara3 = cubo1.getCara3Cubo4();
        labelInferior3.setText(cara3);
    }
}
public static void asignarColorFondoLabel(JLabel label) {
    String texto = label.getText();
    Color colorFondo = Color.BLACK;  // Color por defecto

    switch (texto.toLowerCase()) {
        case "verde":
            colorFondo = Color.GREEN;
            break;
        case "blanco":
            colorFondo = Color.WHITE;
            break;
        case "amarillo":
            colorFondo = Color.YELLOW;
            break;
        case "rojo":
            colorFondo = Color.RED;
            break;
    }

    label.setOpaque(true);
    label.setBackground(colorFondo);
}
    private void rendirseBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rendirseBotonActionPerformed

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
        llenarLabelsSuperiorInferior();
        // Llama al método para cambiar los colores de los labels
        cambiarColorLabelsSuperiorInferior(
                labelSuperior, labelInferior,
                labelSuperior1, labelInferior1,
                labelSuperior2, labelInferior2,
                labelSuperior3, labelInferior3
        );
        
        contarYVerificarColoresEnSubgrafoVertical();
        contarYVerificarColoresEnSubgrafoHorizontal();
        continuarBoton.setVisible(true);

    }//GEN-LAST:event_rendirseBotonActionPerformed

    private void continuarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_continuarBotonActionPerformed
        // TODO add your handling code here:
        Game_Over Aparece = new Game_Over();
        Aparece.setVisible(true); 
        this.dispose();
    }//GEN-LAST:event_continuarBotonActionPerformed
public static void contarYVerificarColoresEnSubgrafoVertical() {
    Map<String, Integer> colorCount = new HashMap<>();

    // Contar cuántas veces aparecen los colores en subgrafoVertical
    for (String arista : subgrafoVertical) {
        String[] splitArista = arista.split(" ");
        String aristaData = splitArista[0];
        String color1 = aristaData.split("-")[0];
        String color2 = aristaData.split("-")[1];

        colorCount.put(color1, colorCount.getOrDefault(color1, 0) + 1);
        colorCount.put(color2, colorCount.getOrDefault(color2, 0) + 1);
    }

    // Verificar si los colores se repiten exactamente 2 veces
    boolean solucionValida = true;
    for (String color : Arrays.asList("rojo", "verde", "amarillo", "blanco")) {
        int count = colorCount.getOrDefault(color, 0);
        if (count != 2) {
            solucionValida = false;
            break;
        }
    }

    if (!solucionValida) {
        JOptionPane.showMessageDialog(null, "No hay posible solución ", "Error Vertical", JOptionPane.ERROR_MESSAGE);
    }
}
public static void contarYVerificarColoresEnSubgrafoHorizontal() {
    Map<String, Integer> colorCount = new HashMap<>();

    // Contar cuántas veces aparecen los colores en subgrafoVertical
    for (String arista : subgrafoHorizontal) {
        String[] splitArista = arista.split(" ");
        String aristaData = splitArista[0];
        String color1 = aristaData.split("-")[0];
        String color2 = aristaData.split("-")[1];

        colorCount.put(color1, colorCount.getOrDefault(color1, 0) + 1);
        colorCount.put(color2, colorCount.getOrDefault(color2, 0) + 1);
    }

    // Verificar si los colores se repiten exactamente 2 veces
    boolean solucionValida = true;
    for (String color : Arrays.asList("rojo", "verde", "amarillo", "blanco")) {
        int count = colorCount.getOrDefault(color, 0);
        if (count != 2) {
            solucionValida = false;
            break;
        }
    }

    if (!solucionValida) {
        JOptionPane.showMessageDialog(null, "No hay posible solución", "Error Horizontal", JOptionPane.ERROR_MESSAGE);
    }
}
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
    private javax.swing.JButton continuarBoton;
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
    private javax.swing.JLabel labelInferior;
    private javax.swing.JLabel labelInferior1;
    private javax.swing.JLabel labelInferior2;
    private javax.swing.JLabel labelInferior3;
    private javax.swing.JLabel labelIzqCubo;
    private javax.swing.JLabel labelIzqCubo1;
    private javax.swing.JLabel labelIzqCubo2;
    private javax.swing.JLabel labelIzqCubo3;
    private javax.swing.JLabel labelSuperior;
    private javax.swing.JLabel labelSuperior1;
    private javax.swing.JLabel labelSuperior2;
    private javax.swing.JLabel labelSuperior3;
    private javax.swing.JButton rendirseBoton;
    private javax.swing.JButton verRespuestas;
    // End of variables declaration//GEN-END:variables
}
