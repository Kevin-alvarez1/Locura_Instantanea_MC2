/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.mc1_202203038_proyectofinal;

import static com.mycompany.mc1_202203038_proyectofinal.AppDataListas.cubo1List;
import static com.mycompany.mc1_202203038_proyectofinal.AppDataListas.cubo2List;
import static com.mycompany.mc1_202203038_proyectofinal.AppDataListas.cubo3List;
import static com.mycompany.mc1_202203038_proyectofinal.AppDataListas.cubo4List;
import static com.mycompany.mc1_202203038_proyectofinal.AppDataListas.cuboSolucion1;
import static com.mycompany.mc1_202203038_proyectofinal.AppDataListas.cuboSolucion2;
import static com.mycompany.mc1_202203038_proyectofinal.AppDataListas.cuboSolucion3;
import static com.mycompany.mc1_202203038_proyectofinal.AppDataListas.cuboSolucion4;
import java.util.LinkedList;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;


public class Personalizacion_de_cubos extends javax.swing.JFrame {

    /**
     * Creates new form Personalizacion_de_cubos
     */
private AppDataListas AppDataListas; // Agrega una instancia de AppDataListas
    public Personalizacion_de_cubos() {
        initComponents();
        llenarCamposTextoDesdeLista(cubo1List);
        llenarCamposTextoDesdeLista2(cubo2List);
        llenarCamposTextoDesdeLista3(cubo3List);
        llenarCamposTextoDesdeLista4(cubo4List);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Menu de selección");

        // Inicializa la instancia de AppDataListas
        AppDataListas = new AppDataListas();
    }
    
private String[] carasCubo1 = new String[6];
private String[] carasCubo2 = new String[6];
private String[] carasCubo3 = new String[6];
private String[] carasCubo4 = new String[6];

public void llenarCamposTextoDesdeLista(LinkedList<String> cubo1List) {
    // Asegurarse de que la lista tenga al menos 6 elementos antes de asignarlos a los campos de texto
    if (cubo1List.size() >= 6) {
        cara1Cubo1.setText(cubo1List.get(0));
        cara2Cubo1.setText(cubo1List.get(1));
        cara3Cubo1.setText(cubo1List.get(2));
        cara4Cubo1.setText(cubo1List.get(3));
        cara5Cubo1.setText(cubo1List.get(4));
        cara6Cubo1.setText(cubo1List.get(5));
    } else {
        
    }
}
public void llenarCamposTextoDesdeLista2(LinkedList<String> cubo2List) {
    // Asegurarse de que la lista tenga al menos 6 elementos antes de asignarlos a los campos de texto
    if (cubo2List.size() >= 6) {
        cara1Cubo2.setText(cubo2List.get(0));
        cara2Cubo2.setText(cubo2List.get(1));
        cara3Cubo2.setText(cubo2List.get(2));
        cara4Cubo2.setText(cubo2List.get(3));
        cara5Cubo2.setText(cubo2List.get(4));
        cara6Cubo2.setText(cubo2List.get(5));
    } else {
        
    }
}
public void llenarCamposTextoDesdeLista3(LinkedList<String> cubo3List) {
    // Asegurarse de que la lista tenga al menos 6 elementos antes de asignarlos a los campos de texto
    if (cubo3List.size() >= 6) {
        cara1Cubo3.setText(cubo3List.get(0));
        cara2Cubo3.setText(cubo3List.get(1));
        cara3Cubo3.setText(cubo3List.get(2));
        cara4Cubo3.setText(cubo3List.get(3));
        cara5Cubo3.setText(cubo3List.get(4));
        cara6Cubo3.setText(cubo3List.get(5));
    } else {
        
    }
}
public void llenarCamposTextoDesdeLista4(LinkedList<String> cubo4List) {
    // Asegurarse de que la lista tenga al menos 6 elementos antes de asignarlos a los campos de texto
    if (cubo4List.size() >= 6) {
        cara1Cubo4.setText(cubo4List.get(0));
        cara2Cubo4.setText(cubo4List.get(1));
        cara3Cubo4.setText(cubo4List.get(2));
        cara4Cubo4.setText(cubo4List.get(3));
        cara5Cubo4.setText(cubo4List.get(4));
        cara6Cubo4.setText(cubo4List.get(5));
    } else {
        
    }
}
public void obtenerValoresTemporales() {
    carasCubo1[0] = cara1Cubo1.getText();
    carasCubo1[1] = cara2Cubo1.getText();
    carasCubo1[2] = cara3Cubo1.getText();
    carasCubo1[3] = cara4Cubo1.getText();
    carasCubo1[4] = cara5Cubo1.getText();
    carasCubo1[5] = cara6Cubo1.getText();

    // Repite el mismo proceso para los demás cubos (cubo2, cubo3, cubo4)
}

// Establecer los valores almacenados en los campos de texto cuando regreses a la ventana
public void establecerValoresDesdeTemporales() {
    cara1Cubo1.setText(carasCubo1[0]);
    cara2Cubo1.setText(carasCubo1[1]);
    cara3Cubo1.setText(carasCubo1[2]);
    cara4Cubo1.setText(carasCubo1[3]);
    cara5Cubo1.setText(carasCubo1[4]);
    cara6Cubo1.setText(carasCubo1[5]);

    // Repite el mismo proceso para los demás cubos (cubo2, cubo3, cubo4)
}
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cara1Cubo1 = new javax.swing.JTextField();
        cara2Cubo1 = new javax.swing.JTextField();
        cara3Cubo1 = new javax.swing.JTextField();
        cara4Cubo1 = new javax.swing.JTextField();
        cara5Cubo1 = new javax.swing.JTextField();
        cara6Cubo1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        cara5Cubo2 = new javax.swing.JTextField();
        cara6Cubo2 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        cara1Cubo2 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        cara2Cubo2 = new javax.swing.JTextField();
        cara3Cubo2 = new javax.swing.JTextField();
        cara4Cubo2 = new javax.swing.JTextField();
        cara5Cubo3 = new javax.swing.JTextField();
        cara6Cubo3 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        cara1Cubo3 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        cara2Cubo3 = new javax.swing.JTextField();
        cara3Cubo3 = new javax.swing.JTextField();
        cara4Cubo3 = new javax.swing.JTextField();
        cara5Cubo4 = new javax.swing.JTextField();
        cara6Cubo4 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        cara1Cubo4 = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        cara2Cubo4 = new javax.swing.JTextField();
        cara3Cubo4 = new javax.swing.JTextField();
        cara4Cubo4 = new javax.swing.JTextField();
        VerCubosBoton = new javax.swing.JButton();
        SalirBoton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel2.setBackground(new java.awt.Color(153, 102, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel30.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(0, 0, 0));
        jLabel30.setText("Por medio de texto los colores:");

        jLabel31.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(0, 0, 0));
        jLabel31.setText("En este espacio deberas ingresar");

        jLabel32.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 153));
        jLabel32.setText("Amarillo");

        jLabel33.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(153, 255, 0));
        jLabel33.setText("Verde");

        jLabel34.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText("blanco");

        jLabel35.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 51, 102));
        jLabel35.setText("Rojo");

        jLabel36.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(0, 0, 0));
        jLabel36.setText("<------ A las caras de los cubos");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel30, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel34, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel33, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel32, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Personaliza tus cubos");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Cubo 1");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Cubo 2");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Cubo 3");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Cubo 4");

        cara1Cubo1.setText("rojo");
        cara1Cubo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cara1Cubo1ActionPerformed(evt);
            }
        });

        cara2Cubo1.setText("blanco");

        cara3Cubo1.setText("blanco");

        cara4Cubo1.setText("blanco");
        cara4Cubo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cara4Cubo1ActionPerformed(evt);
            }
        });

        cara5Cubo1.setText("amarillo");

        cara6Cubo1.setText("verde");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Cara 1");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Cara 2");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Cara 3");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Cara 4");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Cara 5");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Cara 6");

        cara5Cubo2.setText("amarillo");
        cara5Cubo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cara5Cubo2ActionPerformed(evt);
            }
        });

        cara6Cubo2.setText("verde");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Cara 1");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Cara 2");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Cara 3");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Cara 4");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("Cara 5");

        cara1Cubo2.setText("rojo");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("Cara 6");

        cara2Cubo2.setText("rojo");

        cara3Cubo2.setText("amarillo");

        cara4Cubo2.setText("verde");

        cara5Cubo3.setText("verde");

        cara6Cubo3.setText("rojo");

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setText("Cara 1");

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setText("Cara 2");

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 0));
        jLabel20.setText("Cara 3");

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 0, 0));
        jLabel21.setText("Cara 4");

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 0, 0));
        jLabel22.setText("Cara 5");

        cara1Cubo3.setText("blanco");

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 0, 0));
        jLabel23.setText("Cara 6");

        cara2Cubo3.setText("rojo");

        cara3Cubo3.setText("amarillo");
        cara3Cubo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cara3Cubo3ActionPerformed(evt);
            }
        });

        cara4Cubo3.setText("verde");

        cara5Cubo4.setText("amarillo");

        cara6Cubo4.setText("verde");

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 0, 0));
        jLabel24.setText("Cara 1");

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(0, 0, 0));
        jLabel25.setText("Cara 2");

        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(0, 0, 0));
        jLabel26.setText("Cara 3");

        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(0, 0, 0));
        jLabel27.setText("Cara 4");

        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(0, 0, 0));
        jLabel28.setText("Cara 5");

        cara1Cubo4.setText("blanco");

        jLabel29.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(0, 0, 0));
        jLabel29.setText("Cara 6");

        cara2Cubo4.setText("rojo");

        cara3Cubo4.setText("blanco");

        cara4Cubo4.setText("verde");

        VerCubosBoton.setText("Ver  cubos");
        VerCubosBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerCubosBotonActionPerformed(evt);
            }
        });

        SalirBoton.setText("Salir");
        SalirBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirBotonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cara1Cubo1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cara2Cubo1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cara3Cubo1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cara4Cubo1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cara5Cubo1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cara6Cubo1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel19)
                            .addComponent(jLabel18)
                            .addComponent(jLabel20)
                            .addComponent(jLabel21)
                            .addComponent(jLabel22)
                            .addComponent(jLabel23)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cara1Cubo3, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cara2Cubo3, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cara3Cubo3, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cara4Cubo3, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cara5Cubo3, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cara6Cubo3, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel17))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cara1Cubo2, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cara2Cubo2, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cara3Cubo2, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cara4Cubo2, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cara5Cubo2, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cara6Cubo2, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel25)
                            .addComponent(jLabel24)
                            .addComponent(jLabel26)
                            .addComponent(jLabel27)
                            .addComponent(jLabel28)
                            .addComponent(jLabel29)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cara1Cubo4, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cara2Cubo4, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cara3Cubo4, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cara4Cubo4, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cara5Cubo4, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cara6Cubo4, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(66, 66, 66)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(VerCubosBoton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SalirBoton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(222, 222, 222))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(VerCubosBoton, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(SalirBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cara1Cubo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel18))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cara2Cubo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel19))
                            .addGap(13, 13, 13)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cara3Cubo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel20))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cara4Cubo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel21))
                            .addGap(12, 12, 12)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cara5Cubo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel22))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cara6Cubo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel23))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(jLabel5))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(cara1Cubo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel12))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(cara2Cubo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel13))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(cara3Cubo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel14))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(cara4Cubo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel15))
                                    .addGap(12, 12, 12)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(cara5Cubo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel16))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(cara6Cubo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel17)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(cara1Cubo4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel24))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(cara2Cubo4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel25))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(cara3Cubo4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel26))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(cara4Cubo4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel27))
                                    .addGap(12, 12, 12)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(cara5Cubo4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel28))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(cara6Cubo4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel29))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cara1Cubo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cara2Cubo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cara3Cubo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cara4Cubo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cara5Cubo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cara6Cubo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))))
                .addGap(75, 75, 75))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SalirBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirBotonActionPerformed
        // TODO add your handling code here:
        Menu_Opciones Aparece = new Menu_Opciones();
        Aparece.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_SalirBotonActionPerformed

    private void VerCubosBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerCubosBotonActionPerformed
        // TODO add your handling code here:  
        ObtenerCarasCubo1(cubo1List);
        System.out.println("Aqui Empieza la lista1");
        for (String item : AppDataListas.cubo1List) {
            System.out.println(item);
        }
        llenarCuboSolucion1(cubo1List);
        llenarCuboSolucion2(cubo2List);
        llenarCuboSolucion3(cubo3List);
        llenarCuboSolucion4(cubo4List);

    }//GEN-LAST:event_VerCubosBotonActionPerformed
public static void llenarCuboSolucion1(LinkedList<String> cubo1List) {
    // Asegura que haya suficientes elementos en cubo1List para crear un objeto Cubo1
    if (cubo1List.size() >= 6) {
        String cara1 = cubo1List.get(0);
        String cara2 = cubo1List.get(1);
        String cara3 = cubo1List.get(2);
        String cara4 = cubo1List.get(3);
        String cara5 = cubo1List.get(4);
        String cara6 = cubo1List.get(5);

        Cubo1 cubo = new Cubo1(cara1, cara2, cara3, cara4, cara5, cara6);
        cuboSolucion1.add(cubo);
        
        // Imprimir los datos contenidos en cuboSolucion1
        System.out.println("Datos en cuboSolucion1:");
        for (Cubo1 cuboActual : cuboSolucion1) {
            System.out.println("Cara1: " + cuboActual.getCara1Cubo1());
            System.out.println("Cara2: " + cuboActual.getCara2Cubo1());
            System.out.println("Cara3: " + cuboActual.getCara3Cubo1());
            System.out.println("Cara4: " + cuboActual.getCara4Cubo1());
            System.out.println("Cara5: " + cuboActual.getCara5Cubo1());
            System.out.println("Cara6: " + cuboActual.getCara6Cubo1());
            System.out.println();
        }
    } else {
        System.err.println("No hay suficientes elementos en cubo1List para crear un objeto Cubo1.");
    }
}
public static void llenarCuboSolucion2(LinkedList<String> cubo2List) {
    // Asegura que haya suficientes elementos en cubo1List para crear un objeto Cubo1
    if (cubo2List.size() >= 6) {
        String cara1 = cubo2List.get(0);
        String cara2 = cubo2List.get(1);
        String cara3 = cubo2List.get(2);
        String cara4 = cubo2List.get(3);
        String cara5 = cubo2List.get(4);
        String cara6 = cubo2List.get(5);

        Cubo2 cubo = new Cubo2(cara1, cara2, cara3, cara4, cara5, cara6);
        cuboSolucion2.add(cubo);
        
        // Imprimir los datos contenidos en cuboSolucion1
        System.out.println("Datos en cuboSolucion2:");
        for (Cubo2 cuboActual : cuboSolucion2) {
            System.out.println("Cara1: " + cuboActual.getCara1Cubo2());
            System.out.println("Cara2: " + cuboActual.getCara2Cubo2());
            System.out.println("Cara3: " + cuboActual.getCara3Cubo2());
            System.out.println("Cara4: " + cuboActual.getCara4Cubo2());
            System.out.println("Cara5: " + cuboActual.getCara5Cubo2());
            System.out.println("Cara6: " + cuboActual.getCara6Cubo2());
            System.out.println();
        }
    } else {
        System.err.println("No hay suficientes elementos en cubo2List para crear un objeto Cubo1.");
    }
}
public static void llenarCuboSolucion3(LinkedList<String> cubo3List) {
    // Asegura que haya suficientes elementos en cubo1List para crear un objeto Cubo1
    if (cubo3List.size() >= 6) {
        String cara1 = cubo3List.get(0);
        String cara2 = cubo3List.get(1);
        String cara3 = cubo3List.get(2);
        String cara4 = cubo3List.get(3);
        String cara5 = cubo3List.get(4);
        String cara6 = cubo3List.get(5);

        Cubo3 cubo = new Cubo3(cara1, cara2, cara3, cara4, cara5, cara6);
        cuboSolucion3.add(cubo);
        
        // Imprimir los datos contenidos en cuboSolucion1
        System.out.println("Datos en cuboSolucion3:");
        for (Cubo3 cuboActual : cuboSolucion3) {
            System.out.println("Cara1: " + cuboActual.getCara1Cubo3());
            System.out.println("Cara2: " + cuboActual.getCara2Cubo3());
            System.out.println("Cara3: " + cuboActual.getCara3Cubo3());
            System.out.println("Cara4: " + cuboActual.getCara4Cubo3());
            System.out.println("Cara5: " + cuboActual.getCara5Cubo3());
            System.out.println("Cara6: " + cuboActual.getCara6Cubo3());
            System.out.println();
        }
    } else {
        System.err.println("No hay suficientes elementos en cubo3List para crear un objeto Cubo1.");
    }
}
public static void llenarCuboSolucion4(LinkedList<String> cubo4List) {
    // Asegura que haya suficientes elementos en cubo1List para crear un objeto Cubo1
    if (cubo4List.size() >= 6) {
        String cara1 = cubo4List.get(0);
        String cara2 = cubo4List.get(1);
        String cara3 = cubo4List.get(2);
        String cara4 = cubo4List.get(3);
        String cara5 = cubo4List.get(4);
        String cara6 = cubo4List.get(5);

        Cubo4 cubo = new Cubo4(cara1, cara2, cara3, cara4, cara5, cara6);
        cuboSolucion4.add(cubo);
        
        // Imprimir los datos contenidos en cuboSolucion1
        System.out.println("Datos en cuboSolucion4:");
        for (Cubo4 cuboActual : cuboSolucion4) {
            System.out.println("Cara1: " + cuboActual.getCara1Cubo4());
            System.out.println("Cara2: " + cuboActual.getCara2Cubo4());
            System.out.println("Cara3: " + cuboActual.getCara3Cubo4());
            System.out.println("Cara4: " + cuboActual.getCara4Cubo4());
            System.out.println("Cara5: " + cuboActual.getCara5Cubo4());
            System.out.println("Cara6: " + cuboActual.getCara6Cubo4());
            System.out.println();
        }
    } else {
        System.err.println("No hay suficientes elementos en cubo4List para crear un objeto Cubo1.");
    }
}
    private void cara1Cubo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cara1Cubo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cara1Cubo1ActionPerformed

    private void cara5Cubo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cara5Cubo2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cara5Cubo2ActionPerformed

    private void cara3Cubo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cara3Cubo3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cara3Cubo3ActionPerformed

    private void cara4Cubo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cara4Cubo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cara4Cubo1ActionPerformed
   
    private boolean esColorValido(String color) {
        // Convertir el color ingresado a minúsculas para comparación
        color = color.toLowerCase();

        // Comprobar si el color es válido
        return color.equals("rojo") || color.equals("amarillo") || color.equals("verde") || color.equals("blanco");
    }
   
    
    public void ObtenerCarasCubo1(LinkedList<String> cubo1List) {
    String cara1 = cara1Cubo1.getText();
    String cara2 = cara2Cubo1.getText();
    String cara3 = cara3Cubo1.getText();
    String cara4 = cara4Cubo1.getText();
    String cara5 = cara5Cubo1.getText();
    String cara6 = cara6Cubo1.getText();

    // Validar cada color antes de agregarlo a la lista
    if (esColorValido(cara1) && esColorValido(cara2) && esColorValido(cara3) && esColorValido(cara4) && esColorValido(cara5) && esColorValido(cara6)) {
        // Llenar la LinkedList cubo1List desde la instancia de AppDataListas
        AppDataListas.cubo1List.clear(); // Limpiar la lista antes de llenarla nuevamente

        cubo1List.add(cara1);
        cubo1List.add(cara2);
        cubo1List.add(cara3);
        cubo1List.add(cara4);
        cubo1List.add(cara5);
        cubo1List.add(cara6);
          ObtenerCarasCubo2(cubo2List);
        System.out.println("Aqui Empieza la lista2");
        for (String item : AppDataListas.cubo2List) {
            System.out.println(item);
        }
    } else {
        // Mostrar un mensaje de error
        JOptionPane.showMessageDialog(null, "Se ingresó un color inválido en el cubo 1", "Error de Color", JOptionPane.ERROR_MESSAGE);
        return; // Regresar al método anterior después de mostrar el mensaje de error
        
    } 
}
    
    public void ObtenerCarasCubo2(LinkedList<String> cubo2List) {
        String cara1 = cara1Cubo2.getText();
        String cara2 = cara2Cubo2.getText();
        String cara3 = cara3Cubo2.getText();
        String cara4 = cara4Cubo2.getText();
        String cara5 = cara5Cubo2.getText();
        String cara6 = cara6Cubo2.getText();
    // Validar cada color antes de agregarlo a la lista
       if (esColorValido(cara1) && esColorValido(cara2) && esColorValido(cara3) && esColorValido(cara4) && esColorValido(cara5) && esColorValido(cara6)) {

           // Llenar la LinkedList cubo1List desde la instancia de AppDataListas
           AppDataListas.cubo2List.clear(); // Limpiar la lista antes de llenarla nuevamente

           cubo2List.add(cara1);
           cubo2List.add(cara2);
           cubo2List.add(cara3);
           cubo2List.add(cara4);
           cubo2List.add(cara5);
           cubo2List.add(cara6);
           ObtenerCarasCubo3(cubo3List);
        System.out.println("Aqui Empieza la lista3");
        for (String item : AppDataListas.cubo3List) {
            System.out.println(item);
        }
       } else {
           // Mostrar un mensaje de error
           JOptionPane.showMessageDialog(null, "Se ingresó un color inválido en el cubo 2", "Error de Color", JOptionPane.ERROR_MESSAGE);
        return; // Regresar al método anterior después de mostrar el mensaje de error

       }      
    }
    public void ObtenerCarasCubo3(LinkedList<String> cubo3List) {
        String cara1 = cara1Cubo3.getText();
        String cara2 = cara2Cubo3.getText();
        String cara3 = cara3Cubo3.getText();
        String cara4 = cara4Cubo3.getText();
        String cara5 = cara5Cubo3.getText();
        String cara6 = cara6Cubo3.getText();

        // Llenar la LinkedList cubo1List desde la instancia de AppDataListas
        AppDataListas.cubo3List.clear(); // Limpiar la lista antes de llenarla nuevamente
     // Validar cada color antes de agregarlo a la lista
        if (esColorValido(cara1) && esColorValido(cara2) && esColorValido(cara3) && esColorValido(cara4) && esColorValido(cara5) && esColorValido(cara6)) {
    
        cubo3List.add(cara1);
        cubo3List.add(cara2);
        cubo3List.add(cara3);
        cubo3List.add(cara4);
        cubo3List.add(cara5);
        cubo3List.add(cara6);
          ObtenerCarasCubo4(cubo4List);
        System.out.println("Aqui Empieza la lista4");
        for (String item : AppDataListas.cubo4List) {
            System.out.println(item);
        }
        } else {
            // Mostrar un mensaje de error
            JOptionPane.showMessageDialog(null, "Se ingresó un color inválido en el cubo 3", "Error de Color", JOptionPane.ERROR_MESSAGE);
        return; // Regresar al método anterior después de mostrar el mensaje de error

        }
    }   
    public void ObtenerCarasCubo4(LinkedList<String> cubo4List) {
        String cara1 = cara1Cubo4.getText();
        String cara2 = cara2Cubo4.getText();
        String cara3 = cara3Cubo4.getText();
        String cara4 = cara4Cubo4.getText();
        String cara5 = cara5Cubo4.getText();
        String cara6 = cara6Cubo4.getText();
 // Validar cada color antes de agregarlo a la lista
    if (esColorValido(cara1) && esColorValido(cara2) && esColorValido(cara3) && esColorValido(cara4) && esColorValido(cara5) && esColorValido(cara6)) {
    
        // Llenar la LinkedList cubo1List desde la instancia de AppDataListas
        AppDataListas.cubo4List.clear(); // Limpiar la lista antes de llenarla nuevamente

        cubo4List.add(cara1);
        cubo4List.add(cara2);
        cubo4List.add(cara3);
        cubo4List.add(cara4);
        cubo4List.add(cara5);
        cubo4List.add(cara6);
            VistaDeCubos aparece = new VistaDeCubos();
            aparece.setVisible(true);
            this.dispose();       
        } else {
            // Mostrar un mensaje de error
            JOptionPane.showMessageDialog(null, "Se ingresó un color inválido en el cubo 4", "Error de Color", JOptionPane.ERROR_MESSAGE);
        return; // Regresar al método anterior después de mostrar el mensaje de error

        }
    
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
            java.util.logging.Logger.getLogger(Personalizacion_de_cubos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Personalizacion_de_cubos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Personalizacion_de_cubos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Personalizacion_de_cubos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Personalizacion_de_cubos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SalirBoton;
    private javax.swing.JButton VerCubosBoton;
    private javax.swing.JTextField cara1Cubo1;
    private javax.swing.JTextField cara1Cubo2;
    private javax.swing.JTextField cara1Cubo3;
    private javax.swing.JTextField cara1Cubo4;
    private javax.swing.JTextField cara2Cubo1;
    private javax.swing.JTextField cara2Cubo2;
    private javax.swing.JTextField cara2Cubo3;
    private javax.swing.JTextField cara2Cubo4;
    private javax.swing.JTextField cara3Cubo1;
    private javax.swing.JTextField cara3Cubo2;
    private javax.swing.JTextField cara3Cubo3;
    private javax.swing.JTextField cara3Cubo4;
    private javax.swing.JTextField cara4Cubo1;
    private javax.swing.JTextField cara4Cubo2;
    private javax.swing.JTextField cara4Cubo3;
    private javax.swing.JTextField cara4Cubo4;
    private javax.swing.JTextField cara5Cubo1;
    private javax.swing.JTextField cara5Cubo2;
    private javax.swing.JTextField cara5Cubo3;
    private javax.swing.JTextField cara5Cubo4;
    private javax.swing.JTextField cara6Cubo1;
    private javax.swing.JTextField cara6Cubo2;
    private javax.swing.JTextField cara6Cubo3;
    private javax.swing.JTextField cara6Cubo4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
