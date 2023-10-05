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
import static com.mycompany.mc1_202203038_proyectofinal.AppDataListas.subgrafoVertical;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

public class OrdenarCubos extends javax.swing.JFrame {

    public OrdenarCubos() {
        initComponents();
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Ordenar Cubos");
        consejo1Label.setVisible(false);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        caraPanelAbajo = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        caraPanelTrasera = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        caraPanelIzq = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        caraPanelDer = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        caraPanelArriba = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        caraPanelCentral = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        seleccionarCuboBoton = new javax.swing.JButton();
        consejo1Label = new javax.swing.JLabel();
        consejoBoton = new javax.swing.JButton();
        comprobarRespuestaBoton = new javax.swing.JButton();
        GiroBotonDer = new javax.swing.JButton();
        GiroBotonArriba = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        caraPanelAbajo.setBackground(new java.awt.Color(255, 255, 255));
        caraPanelAbajo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Cara abajo");

        javax.swing.GroupLayout caraPanelAbajoLayout = new javax.swing.GroupLayout(caraPanelAbajo);
        caraPanelAbajo.setLayout(caraPanelAbajoLayout);
        caraPanelAbajoLayout.setHorizontalGroup(
            caraPanelAbajoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(caraPanelAbajoLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        caraPanelAbajoLayout.setVerticalGroup(
            caraPanelAbajoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(caraPanelAbajoLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        caraPanelTrasera.setBackground(new java.awt.Color(255, 255, 255));
        caraPanelTrasera.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Cara trasera ");

        javax.swing.GroupLayout caraPanelTraseraLayout = new javax.swing.GroupLayout(caraPanelTrasera);
        caraPanelTrasera.setLayout(caraPanelTraseraLayout);
        caraPanelTraseraLayout.setHorizontalGroup(
            caraPanelTraseraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(caraPanelTraseraLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel7)
                .addContainerGap(32, Short.MAX_VALUE))
        );
        caraPanelTraseraLayout.setVerticalGroup(
            caraPanelTraseraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, caraPanelTraseraLayout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(39, 39, 39))
        );

        caraPanelIzq.setBackground(new java.awt.Color(255, 255, 255));
        caraPanelIzq.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Cara izquierda");

        javax.swing.GroupLayout caraPanelIzqLayout = new javax.swing.GroupLayout(caraPanelIzq);
        caraPanelIzq.setLayout(caraPanelIzqLayout);
        caraPanelIzqLayout.setHorizontalGroup(
            caraPanelIzqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(caraPanelIzqLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        caraPanelIzqLayout.setVerticalGroup(
            caraPanelIzqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(caraPanelIzqLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel9)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        caraPanelDer.setBackground(new java.awt.Color(255, 255, 255));
        caraPanelDer.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Cara Derecha");

        javax.swing.GroupLayout caraPanelDerLayout = new javax.swing.GroupLayout(caraPanelDer);
        caraPanelDer.setLayout(caraPanelDerLayout);
        caraPanelDerLayout.setHorizontalGroup(
            caraPanelDerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(caraPanelDerLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        caraPanelDerLayout.setVerticalGroup(
            caraPanelDerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(caraPanelDerLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel8)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        caraPanelArriba.setBackground(new java.awt.Color(255, 255, 255));
        caraPanelArriba.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Cara arriba");

        javax.swing.GroupLayout caraPanelArribaLayout = new javax.swing.GroupLayout(caraPanelArriba);
        caraPanelArriba.setLayout(caraPanelArribaLayout);
        caraPanelArribaLayout.setHorizontalGroup(
            caraPanelArribaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(caraPanelArribaLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel4)
                .addContainerGap(32, Short.MAX_VALUE))
        );
        caraPanelArribaLayout.setVerticalGroup(
            caraPanelArribaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(caraPanelArribaLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        caraPanelCentral.setBackground(new java.awt.Color(255, 255, 255));
        caraPanelCentral.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        caraPanelCentral.setForeground(new java.awt.Color(0, 0, 0));

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Cara mid");

        javax.swing.GroupLayout caraPanelCentralLayout = new javax.swing.GroupLayout(caraPanelCentral);
        caraPanelCentral.setLayout(caraPanelCentralLayout);
        caraPanelCentralLayout.setHorizontalGroup(
            caraPanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(caraPanelCentralLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel5)
                .addContainerGap(37, Short.MAX_VALUE))
        );
        caraPanelCentralLayout.setVerticalGroup(
            caraPanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(caraPanelCentralLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Ordena Los Cubos");

        seleccionarCuboBoton.setText("Selecciona el cubo");
        seleccionarCuboBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seleccionarCuboBotonActionPerformed(evt);
            }
        });

        consejo1Label.setForeground(new java.awt.Color(0, 0, 0));
        consejo1Label.setText("En este espacio, primero selecciona el cubo y luego en los botones podras girar el cubo vertical y horizontalmente");

        consejoBoton.setText("Consejo");
        consejoBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consejoBotonActionPerformed(evt);
            }
        });

        comprobarRespuestaBoton.setText("Comprobar Respuesta");
        comprobarRespuestaBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comprobarRespuestaBotonActionPerformed(evt);
            }
        });

        GiroBotonDer.setText("Girar Horizontal");
        GiroBotonDer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GiroBotonDerActionPerformed(evt);
            }
        });

        GiroBotonArriba.setText("Girar Vertical");
        GiroBotonArriba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GiroBotonArribaActionPerformed(evt);
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
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(seleccionarCuboBoton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(GiroBotonArriba, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(18, 18, 18)
                                        .addComponent(GiroBotonDer)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(caraPanelArriba, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(comprobarRespuestaBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(caraPanelDer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(caraPanelIzq, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(caraPanelCentral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(caraPanelAbajo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(caraPanelTrasera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(consejoBoton)
                        .addGap(18, 18, 18)
                        .addComponent(consejo1Label, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(31, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(caraPanelDer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(seleccionarCuboBoton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(caraPanelArriba, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(caraPanelCentral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(caraPanelAbajo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(caraPanelTrasera, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(GiroBotonDer, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(GiroBotonArriba, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(caraPanelIzq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comprobarRespuestaBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(consejoBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(consejo1Label, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 774, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 483, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void consejoBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consejoBotonActionPerformed
        consejo1Label.setVisible(true);
    }//GEN-LAST:event_consejoBotonActionPerformed
    
private boolean cubo1Seleccionado = false;
private boolean cubo2Seleccionado = false;
private boolean cubo3Seleccionado = false;
private boolean cubo4Seleccionado = false;

    private void seleccionarCuboBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seleccionarCuboBotonActionPerformed
boolean valorValido = false;

do {
    // Pedir al usuario que ingrese un número del 1 al 4
    String input = JOptionPane.showInputDialog("Ingrese un número del 1 al 4:");

    try {
        int numeroIngresado = Integer.parseInt(input);

        // Realizar una acción según el número ingresado
        switch (numeroIngresado) {
            case 1:
                pintarPanelesSegunCubo(cuboSolucion1);
                cubo1Seleccionado = true;
                cubo2Seleccionado = false;
                cubo3Seleccionado = false;
                cubo4Seleccionado = false;
                valorValido = true;
                break;
            case 2:
                pintarPanelesSegunCubo2(cuboSolucion2);
                cubo1Seleccionado = false;
                cubo2Seleccionado = true;
                cubo3Seleccionado = false;
                cubo4Seleccionado = false;
                valorValido = true;
                break;
            case 3:
                pintarPanelesSegunCubo3(cuboSolucion3);
                cubo1Seleccionado = false;
                cubo2Seleccionado = false;
                cubo3Seleccionado = true;
                cubo4Seleccionado = false;
                valorValido = true;
                break;
            case 4:
                pintarPanelesSegunCubo4(cuboSolucion4);
                cubo1Seleccionado = false;
                cubo2Seleccionado = false;
                cubo3Seleccionado = false;
                cubo4Seleccionado = true;
                valorValido = true;
                break;
            default:
                JOptionPane.showMessageDialog(null, "Número fuera de rango. Ingrese un número del 1 al 4.", "Error", JOptionPane.ERROR_MESSAGE);
                break;
        }
    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(null, "Ingrese un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
    }
} while (!valorValido);
    }//GEN-LAST:event_seleccionarCuboBotonActionPerformed

    private void GiroBotonArribaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GiroBotonArribaActionPerformed
        // TODO add your handling code here:
                // TODO add your handling code here:
        if (cubo1Seleccionado) {
            intercambiarCarasVertical(cuboSolucion1);
            pintarPanelesSegunCubo(cuboSolucion1);
        } else if (cubo2Seleccionado) {
            intercambiarCarasVertica2(cuboSolucion2);
            pintarPanelesSegunCubo2(cuboSolucion2);
        } else if (cubo3Seleccionado) {
            intercambiarCarasVertica3(cuboSolucion3);
            pintarPanelesSegunCubo3(cuboSolucion3);
        } else if (cubo4Seleccionado) {
            intercambiarCarasVertica4(cuboSolucion4);
            pintarPanelesSegunCubo4(cuboSolucion4);
        } else {
            System.out.println("Ningún cubo seleccionado");
        } 
    }//GEN-LAST:event_GiroBotonArribaActionPerformed
public void intercambiarCarasVertical(LinkedList<Cubo1> cuboSolucion1) {
    // Recorre la lista de cubos y realiza el intercambio en cada uno
    for (Cubo1 cubo : cuboSolucion1) {
        String cara1 = cubo.getCara1Cubo1();
        String cara3 = cubo.getCara3Cubo1();
        String cara2 = cubo.getCara2Cubo1();
        String cara4 = cubo.getCara4Cubo1();

        // Realiza el intercambio de caras
        cubo.setCara2(cara4);
        cubo.setCara4(cara2);
        // Realiza el intercambio de caras
        cubo.setCara1(cara3);
        cubo.setCara3(cara1);
    }

}
public void intercambiarCarasVertica2(LinkedList<Cubo2> cuboSolucion2) {
    // Recorre la lista de cubos y realiza el intercambio en cada uno
    for (Cubo2 cubo : cuboSolucion2) {
        String cara1 = cubo.getCara1Cubo2();
        String cara3 = cubo.getCara3Cubo2();
        String cara2 = cubo.getCara2Cubo2();
        String cara4 = cubo.getCara4Cubo2();

        // Realiza el intercambio de caras
        cubo.setCara2(cara4);
        cubo.setCara4(cara2);
        // Realiza el intercambio de caras
        cubo.setCara1(cara3);
        cubo.setCara3(cara1);
    }

}
public void intercambiarCarasVertica3(LinkedList<Cubo3> cuboSolucion3) {
    // Recorre la lista de cubos y realiza el intercambio en cada uno
    for (Cubo3 cubo : cuboSolucion3) {
        String cara1 = cubo.getCara1Cubo3();
        String cara3 = cubo.getCara3Cubo3();
        String cara2 = cubo.getCara2Cubo3();
        String cara4 = cubo.getCara4Cubo3();

        // Realiza el intercambio de caras
        cubo.setCara2(cara4);
        cubo.setCara4(cara2);
        // Realiza el intercambio de caras
        cubo.setCara1(cara3);
        cubo.setCara3(cara1);
    }

}
public void intercambiarCarasVertica4(LinkedList<Cubo4> cuboSolucion4) {
    // Recorre la lista de cubos y realiza el intercambio en cada uno
    for (Cubo4 cubo : cuboSolucion4) {
        String cara1 = cubo.getCara1Cubo4();
        String cara3 = cubo.getCara3Cubo4();
        String cara2 = cubo.getCara2Cubo4();
        String cara4 = cubo.getCara4Cubo4();

        // Realiza el intercambio de caras
        cubo.setCara2(cara4);
        cubo.setCara4(cara2);
        // Realiza el intercambio de caras
        cubo.setCara1(cara3);
        cubo.setCara3(cara1);
    }

}
    private void GiroBotonDerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GiroBotonDerActionPerformed
        // TODO add your handling code here:
        if (cubo1Seleccionado) {
            intercambiarCaras(cuboSolucion1);
            pintarPanelesSegunCubo(cuboSolucion1);
        } else if (cubo2Seleccionado) {
            intercambiarCaras2(cuboSolucion2);
            pintarPanelesSegunCubo2(cuboSolucion2);
        } else if (cubo3Seleccionado) {
            intercambiarCaras3(cuboSolucion3);
            pintarPanelesSegunCubo3(cuboSolucion3);
        } else if (cubo4Seleccionado) {
            intercambiarCaras4(cuboSolucion4);
            pintarPanelesSegunCubo4(cuboSolucion4);
        } else {
            System.out.println("Ningún cubo seleccionado");
        } 
    }//GEN-LAST:event_GiroBotonDerActionPerformed

    private void comprobarRespuestaBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comprobarRespuestaBotonActionPerformed
        // TODO add your handling code here:
        //este metodo sirve para ver el grado de los vertices
            contarFrecuenciaPalabras();
                // Imprimir la frecuencia de colores
                    System.out.println("Frecuencia de colores:");
                    System.out.println("Rojo: " + Rojo);
                    System.out.println("Blanco: " + Blanco);
                    System.out.println("Verde: " + Verde);
                    System.out.println("Amarillo: " + Amarillo);
            LinkedList<String> aristasCubo1 = compararCarasYCrearAristas(cuboSolucion1);
            LinkedList<String> aristasCubo2 = compararCarasYCrearAristas2(cuboSolucion2);
            LinkedList<String> aristasCubo3 = compararCarasYCrearAristas3(cuboSolucion3);
            LinkedList<String> aristasCubo4 = compararCarasYCrearAristas4(cuboSolucion4);     

        copiarPrimerDatoASubgrafo(subgrafoVertical, aristasCubo1);
        copiarPrimerDatoASubgrafo2(subgrafoVertical, aristasCubo2,aristasCubo1);
        copiarPrimerDatoASubgrafo3(subgrafoVertical, aristasCubo2, aristasCubo1, aristasCubo3);
        copiarPrimerDatoASubgrafo4(subgrafoVertical,aristasCubo4);
        
         // Imprimir subgrafoVertical
         System.out.println("subGrafo con todo");
        for (String arista : subgrafoVertical) {
            System.out.println(arista);
        }
    }//GEN-LAST:event_comprobarRespuestaBotonActionPerformed
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
    LinkedList<String> aristasCubo2 = new LinkedList<>();

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

    return aristasCubo3;
}


private int Rojo;
private int Blanco;
private int Verde;
private int Amarillo;

public void contarFrecuenciaPalabras() {
    // Inicializar las variables para contar las palabras
    int rojo1 = 0;
    int blanco1 = 0;
    int verde1 = 0;
    int amarillo1 = 0;

    // Definir las palabras a buscar
    String[] palabrasBuscar = {"rojo", "blanco", "verde", "amarillo"};

    // Iterar a través de los cubos en cuboSolucion1
    for (Cubo1 cubo : cuboSolucion1) {
        // Obtener las caras del cubo y convertirlas en minúsculas para hacer coincidencias sin distinción entre mayúsculas y minúsculas
        String cara1 = cubo.getCara1Cubo1().toLowerCase();
        String cara2 = cubo.getCara2Cubo1().toLowerCase();
        String cara3 = cubo.getCara3Cubo1().toLowerCase();
        String cara4 = cubo.getCara4Cubo1().toLowerCase();
        String cara5 = cubo.getCara5Cubo1().toLowerCase();
        String cara6 = cubo.getCara6Cubo1().toLowerCase();

        // Buscar las palabras en las caras y contar su frecuencia
        for (String palabra : palabrasBuscar) {
            if (cara1.contains(palabra)) {
                if (palabra.equals("rojo")) {
                    rojo1++;
                } else if (palabra.equals("blanco")) {
                    blanco1++;
                } else if (palabra.equals("verde")) {
                    verde1++;
                } else if (palabra.equals("amarillo")) {
                    amarillo1++;
                }
            }
            if (cara2.contains(palabra)) {
                if (palabra.equals("rojo")) {
                    rojo1++;
                } else if (palabra.equals("blanco")) {
                    blanco1++;
                } else if (palabra.equals("verde")) {
                    verde1++;
                } else if (palabra.equals("amarillo")) {
                    amarillo1++;
                }
            }
            if (cara3.contains(palabra)) {
                if (palabra.equals("rojo")) {
                    rojo1++;
                } else if (palabra.equals("blanco")) {
                    blanco1++;
                } else if (palabra.equals("verde")) {
                    verde1++;
                } else if (palabra.equals("amarillo")) {
                    amarillo1++;
                }
            }
            if (cara4.contains(palabra)) {
                if (palabra.equals("rojo")) {
                    rojo1++;
                } else if (palabra.equals("blanco")) {
                    blanco1++;
                } else if (palabra.equals("verde")) {
                    verde1++;
                } else if (palabra.equals("amarillo")) {
                    amarillo1++;
                }
            }
            if (cara5.contains(palabra)) {
                if (palabra.equals("rojo")) {
                    rojo1++;
                } else if (palabra.equals("blanco")) {
                    blanco1++;
                } else if (palabra.equals("verde")) {
                    verde1++;
                } else if (palabra.equals("amarillo")) {
                    amarillo1++;
                }
            }
            if (cara6.contains(palabra)) {
                if (palabra.equals("rojo")) {
                    rojo1++;
                } else if (palabra.equals("blanco")) {
                    blanco1++;
                } else if (palabra.equals("verde")) {
                    verde1++;
                } else if (palabra.equals("amarillo")) {
                    amarillo1++;
                }
            }
        }
    }
    // Inicializar las variables para contar las palabras en cuboSolucion2
    int rojo2 = 0;
    int blanco2 = 0;
    int verde2 = 0;
    int amarillo2 = 0;

    // Iterar a través de los cubos en cuboSolucion2
    for (Cubo2 cubo : cuboSolucion2) {
        // Obtener las caras del cubo y convertirlas en minúsculas para hacer coincidencias sin distinción entre mayúsculas y minúsculas
        String cara1 = cubo.getCara1Cubo2().toLowerCase();
        String cara2 = cubo.getCara2Cubo2().toLowerCase();
        String cara3 = cubo.getCara3Cubo2().toLowerCase();
        String cara4 = cubo.getCara4Cubo2().toLowerCase();
        String cara5 = cubo.getCara5Cubo2().toLowerCase();
        String cara6 = cubo.getCara6Cubo2().toLowerCase();

        // Buscar las palabras en las caras y contar su frecuencia
        for (String palabra : palabrasBuscar) {
            if (cara1.contains(palabra)) {
                if (palabra.equals("rojo")) {
                    rojo2++;
                } else if (palabra.equals("blanco")) {
                    blanco2++;
                } else if (palabra.equals("verde")) {
                    verde2++;
                } else if (palabra.equals("amarillo")) {
                    amarillo2++;
                }
            }
            if (cara2.contains(palabra)) {
                if (palabra.equals("rojo")) {
                    rojo2++;
                } else if (palabra.equals("blanco")) {
                    blanco2++;
                } else if (palabra.equals("verde")) {
                    verde2++;
                } else if (palabra.equals("amarillo")) {
                    amarillo2++;
                }
            }
            if (cara3.contains(palabra)) {
                if (palabra.equals("rojo")) {
                    rojo2++;
                } else if (palabra.equals("blanco")) {
                    blanco2++;
                } else if (palabra.equals("verde")) {
                    verde2++;
                } else if (palabra.equals("amarillo")) {
                    amarillo2++;
                }
            }
            if (cara4.contains(palabra)) {
                if (palabra.equals("rojo")) {
                    rojo2++;
                } else if (palabra.equals("blanco")) {
                    blanco2++;
                } else if (palabra.equals("verde")) {
                    verde2++;
                } else if (palabra.equals("amarillo")) {
                    amarillo2++;
                }
            }
            if (cara5.contains(palabra)) {
                if (palabra.equals("rojo")) {
                    rojo2++;
                } else if (palabra.equals("blanco")) {
                    blanco2++;
                } else if (palabra.equals("verde")) {
                    verde2++;
                } else if (palabra.equals("amarillo")) {
                    amarillo2++;
                }
            }
            if (cara6.contains(palabra)) {
                if (palabra.equals("rojo")) {
                    rojo2++;
                } else if (palabra.equals("blanco")) {
                    blanco2++;
                } else if (palabra.equals("verde")) {
                    verde2++;
                } else if (palabra.equals("amarillo")) {
                    amarillo2++;
                }
            }
        }
    }
    // Inicializar las variables para contar las palabras en cuboSolucion3
    int rojo3 = 0;
    int blanco3 = 0;
    int verde3 = 0;
    int amarillo3 = 0;

    // Iterar a través de los cubos en cuboSolucion3
    for (Cubo3 cubo : cuboSolucion3) {
        // Obtener las caras del cubo y convertirlas en minúsculas para hacer coincidencias sin distinción entre mayúsculas y minúsculas
        String cara1 = cubo.getCara1Cubo3().toLowerCase();
        String cara2 = cubo.getCara2Cubo3().toLowerCase();
        String cara3 = cubo.getCara3Cubo3().toLowerCase();
        String cara4 = cubo.getCara4Cubo3().toLowerCase();
        String cara5 = cubo.getCara5Cubo3().toLowerCase();
        String cara6 = cubo.getCara6Cubo3().toLowerCase();

        // Buscar las palabras en las caras y contar su frecuencia
        for (String palabra : palabrasBuscar) {
            if (cara1.contains(palabra)) {
                if (palabra.equals("rojo")) {
                    rojo3++;
                } else if (palabra.equals("blanco")) {
                    blanco3++;
                } else if (palabra.equals("verde")) {
                    verde3++;
                } else if (palabra.equals("amarillo")) {
                    amarillo3++;
                }
            }
            if (cara2.contains(palabra)) {
                if (palabra.equals("rojo")) {
                    rojo3++;
                } else if (palabra.equals("blanco")) {
                    blanco3++;
                } else if (palabra.equals("verde")) {
                    verde3++;
                } else if (palabra.equals("amarillo")) {
                    amarillo3++;
                }
            }
            if (cara3.contains(palabra)) {
                if (palabra.equals("rojo")) {
                    rojo3++;
                } else if (palabra.equals("blanco")) {
                    blanco3++;
                } else if (palabra.equals("verde")) {
                    verde3++;
                } else if (palabra.equals("amarillo")) {
                    amarillo3++;
                }
            }
            if (cara4.contains(palabra)) {
                if (palabra.equals("rojo")) {
                    rojo3++;
                } else if (palabra.equals("blanco")) {
                    blanco3++;
                } else if (palabra.equals("verde")) {
                    verde3++;
                } else if (palabra.equals("amarillo")) {
                    amarillo3++;
                }
            }
            if (cara5.contains(palabra)) {
                if (palabra.equals("rojo")) {
                    rojo3++;
                } else if (palabra.equals("blanco")) {
                    blanco3++;
                } else if (palabra.equals("verde")) {
                    verde3++;
                } else if (palabra.equals("amarillo")) {
                    amarillo3++;
                }
            }
            if (cara6.contains(palabra)) {
                if (palabra.equals("rojo")) {
                    rojo3++;
                } else if (palabra.equals("blanco")) {
                    blanco3++;
                } else if (palabra.equals("verde")) {
                    verde3++;
                } else if (palabra.equals("amarillo")) {
                    amarillo3++;
                }
            }
        }
    }
    // Inicializar las variables para contar las palabras en cuboSolucion4
    int rojo4 = 0;
    int blanco4 = 0;
    int verde4 = 0;
    int amarillo4 = 0;

    // Iterar a través de los cubos en cuboSolucion4
    for (Cubo4 cubo : cuboSolucion4) {
        // Obtener las caras del cubo y convertirlas en minúsculas para hacer coincidencias sin distinción entre mayúsculas y minúsculas
        String cara1 = cubo.getCara1Cubo4().toLowerCase();
        String cara2 = cubo.getCara2Cubo4().toLowerCase();
        String cara3 = cubo.getCara3Cubo4().toLowerCase();
        String cara4 = cubo.getCara4Cubo4().toLowerCase();
        String cara5 = cubo.getCara5Cubo4().toLowerCase();
        String cara6 = cubo.getCara6Cubo4().toLowerCase();

        // Buscar las palabras en las caras y contar su frecuencia
        for (String palabra : palabrasBuscar) {
            if (cara1.contains(palabra)) {
                if (palabra.equals("rojo")) {
                    rojo4++;
                } else if (palabra.equals("blanco")) {
                    blanco4++;
                } else if (palabra.equals("verde")) {
                    verde4++;
                } else if (palabra.equals("amarillo")) {
                    amarillo4++;
                }
            }
            if (cara2.contains(palabra)) {
                if (palabra.equals("rojo")) {
                    rojo4++;
                } else if (palabra.equals("blanco")) {
                    blanco4++;
                } else if (palabra.equals("verde")) {
                    verde4++;
                } else if (palabra.equals("amarillo")) {
                    amarillo4++;
                }
            }
            if (cara3.contains(palabra)) {
                if (palabra.equals("rojo")) {
                    rojo4++;
                } else if (palabra.equals("blanco")) {
                    blanco4++;
                } else if (palabra.equals("verde")) {
                    verde4++;
                } else if (palabra.equals("amarillo")) {
                    amarillo4++;
                }
            }
            if (cara4.contains(palabra)) {
                if (palabra.equals("rojo")) {
                    rojo4++;
                } else if (palabra.equals("blanco")) {
                    blanco4++;
                } else if (palabra.equals("verde")) {
                    verde4++;
                } else if (palabra.equals("amarillo")) {
                    amarillo4++;
                }
            }
            if (cara5.contains(palabra)) {
                if (palabra.equals("rojo")) {
                    rojo4++;
                } else if (palabra.equals("blanco")) {
                    blanco4++;
                } else if (palabra.equals("verde")) {
                    verde4++;
                } else if (palabra.equals("amarillo")) {
                    amarillo4++;
                }
            }
            if (cara6.contains(palabra)) {
                if (palabra.equals("rojo")) {
                    rojo4++;
                } else if (palabra.equals("blanco")) {
                    blanco4++;
                } else if (palabra.equals("verde")) {
                    verde4++;
                } else if (palabra.equals("amarillo")) {
                    amarillo4++;
                }
            }
        }
    }
   // Sumar las frecuencias de colores en ambas listas a las variables correspondientes
    Rojo = rojo1 + rojo2 + rojo3 + rojo4;
    Blanco = blanco1 + blanco2 + blanco3 + blanco4;
    Verde = verde1 + verde2 + verde3 + verde4;
    Amarillo = amarillo1 + amarillo2 + amarillo3 + amarillo4;
}
//metodo para subGrafo Vertical


public static void copiarPrimerDatoASubgrafo(LinkedList<String> subgrafoVertical, LinkedList<String> aristasCubo1) {
    if (!aristasCubo1.isEmpty()) {
        String ultimoDato = aristasCubo1.getLast(); // Obtener el último dato de aristasCubo1
        String mensaje = "Dato ingresado desde aristaCubo1: " + ultimoDato;
        if (!subgrafoVertical.contains(ultimoDato)) {
            subgrafoVertical.addFirst(ultimoDato); // Agregar el último dato en la primera posición de subgrafoVertical si no está presente
            System.out.println(mensaje);
        }
    }
}

public static void copiarPrimerDatoASubgrafo2(LinkedList<String> subgrafoVertical, LinkedList<String> aristasCubo2, LinkedList<String> aristasCubo1) {
    if (!aristasCubo2.isEmpty()) {
        String ultimoDatoCubo2 = aristasCubo2.getLast(); // Obtener el último dato de aristasCubo2
        String mensaje = "Dato ingresado desde aristaCubo2: " + ultimoDatoCubo2;

        if (!aristasCubo1.isEmpty()) {
            String ultimoDatoCubo1 = aristasCubo1.getLast(); // Obtener el último dato de aristasCubo1

            if (ultimoDatoCubo2.equals(ultimoDatoCubo1)) {
                if (aristasCubo2.size() > 1) {
                    String datoPosicion1 = aristasCubo2.get(1); // Obtener el dato en la posición 1 de aristasCubo2
                    mensaje = "Dato ingresado desde aristaCubo2 (posición 1): " + datoPosicion1;
                    if (!subgrafoVertical.contains(datoPosicion1)) {
                        subgrafoVertical.addFirst(datoPosicion1); // Agregar dato en la posición 1 de aristasCubo2 en la primera posición de subgrafoVertical si no está presente
                    }
                }
            }
        }
        System.out.println(mensaje);
    }
}
public static void copiarPrimerDatoASubgrafo3(
    LinkedList<String> subgrafoVertical, 
    LinkedList<String> aristasCubo2, 
    LinkedList<String> aristasCubo1, 
    LinkedList<String> aristasCubo3
) {
    if (!aristasCubo2.isEmpty() && !aristasCubo1.isEmpty() && !aristasCubo3.isEmpty()) {
        String ultimoDatoCubo2 = aristasCubo2.getLast(); // Obtener el último dato de aristasCubo2
        String ultimoDatoCubo1 = aristasCubo1.getLast(); // Obtener el último dato de aristasCubo1

        // Comprobar si el último dato de aristasCubo2 es igual al último dato de aristasCubo1
        if (ultimoDatoCubo2.equals(ultimoDatoCubo1)) {
            // Buscar un dato en aristasCubo3 que no coincida con ningún dato en subgrafoVertical
            String datoNoCoincidente = null;
            for (String datoAristasCubo3 : aristasCubo3) {
                if (!subgrafoVertical.contains(datoAristasCubo3)) {
                    datoNoCoincidente = datoAristasCubo3;
                    break;
                }
            }

            // Imprimir el dato que se va a agregar
            if (datoNoCoincidente != null) {
                System.out.println("Dato a agregar en subgrafoVertical 3: " + datoNoCoincidente);
                // Agregar el primer dato no coincidente de aristasCubo3 en la posición 2 de subgrafoVertical
                subgrafoVertical.add(2, datoNoCoincidente);
            }
        }
    }
}
public static void copiarPrimerDatoASubgrafo4(
    LinkedList<String> subgrafoVertical,
    LinkedList<String> aristasCubo4
) {
    if (subgrafoVertical.size() >= 3) {
        String datoNoCoincidente = null;
        
        // Obtener los datos de las posiciones (0, 1, 2) de subgrafoVertical
        String dato0 = subgrafoVertical.get(0);
        String dato1 = subgrafoVertical.get(1);
        String dato2 = subgrafoVertical.get(2);

        // Comprobar si alguno de los datos (0, 1, 2) de subgrafoVertical no coincide con aristasCubo4
        for (String datoAristasCubo4 : aristasCubo4) {
            if (!dato0.equals(datoAristasCubo4) && !dato1.equals(datoAristasCubo4) && !dato2.equals(datoAristasCubo4)) {
                datoNoCoincidente = datoAristasCubo4;
                break;
            }
        }

        // Imprimir el dato que se va a agregar
        if (datoNoCoincidente != null) {
            System.out.println("Dato a agregar en subgrafoVertical 4: " + datoNoCoincidente);
            // Agregar el primer dato no coincidente de aristasCubo4 en la posición 3 de subgrafoVertical
            subgrafoVertical.add(3, datoNoCoincidente);
        }
    }
}

public void intercambiarCaras(LinkedList<Cubo1> cuboSolucion1) {
    // Recorre la lista de cubos y realiza el intercambio en cada uno
    for (Cubo1 cubo : cuboSolucion1) {
        String cara2 = cubo.getCara2Cubo1();
        String cara4 = cubo.getCara4Cubo1();
        String cara5 = cubo.getCara5Cubo1();
        String cara6 = cubo.getCara6Cubo1();

        // Realiza el intercambio de caras
        cubo.setCara2(cara6);
        cubo.setCara4(cara2);
        cubo.setCara5(cara4);
        cubo.setCara6(cara5);
    }

}
public void intercambiarCaras2(LinkedList<Cubo2> cuboSolucion2) {
    // Recorre la lista de cubos y realiza el intercambio en cada uno
    for (Cubo2 cubo : cuboSolucion2) {
        String cara2 = cubo.getCara2Cubo2();
        String cara4 = cubo.getCara4Cubo2();
        String cara5 = cubo.getCara5Cubo2();
        String cara6 = cubo.getCara6Cubo2();

        // Realiza el intercambio de caras
        cubo.setCara2(cara6);
        cubo.setCara4(cara2);
        cubo.setCara5(cara4);
        cubo.setCara6(cara5);
    }

}
public void intercambiarCaras3(LinkedList<Cubo3> cuboSolucion3) {
    // Recorre la lista de cubos y realiza el intercambio en cada uno
    for (Cubo3 cubo : cuboSolucion3) {
        String cara2 = cubo.getCara2Cubo3();
        String cara4 = cubo.getCara4Cubo3();
        String cara5 = cubo.getCara5Cubo3();
        String cara6 = cubo.getCara6Cubo3();

        // Realiza el intercambio de caras
        cubo.setCara2(cara6);
        cubo.setCara4(cara2);
        cubo.setCara5(cara4);
        cubo.setCara6(cara5);
    }

}
public void intercambiarCaras4(LinkedList<Cubo4> cuboSolucion4) {
    // Recorre la lista de cubos y realiza el intercambio en cada uno
    for (Cubo4 cubo : cuboSolucion4) {
        String cara2 = cubo.getCara2Cubo4();
        String cara4 = cubo.getCara4Cubo4();
        String cara5 = cubo.getCara5Cubo4();
        String cara6 = cubo.getCara6Cubo4();

        // Realiza el intercambio de caras
        cubo.setCara2(cara6);
        cubo.setCara4(cara2);
        cubo.setCara5(cara4);
        cubo.setCara6(cara5);
    }

}

    public void pintarPanelesSegunCubo(LinkedList<Cubo1> cuboSolucion1) {
        if (cuboSolucion1.isEmpty()) {
            System.out.println("La lista está vacía.");
            return;
        }

        // Obtener el primer elemento de la lista (puedes modificar esto si deseas pintar un cubo específico)
        Cubo1 cubo = cuboSolucion1.getFirst();

        // Obtener los colores de las caras
        String cara1 = cubo.getCara1Cubo1();
        String cara2 = cubo.getCara2Cubo1();
        String cara3 = cubo.getCara3Cubo1();
        String cara4 = cubo.getCara4Cubo1();
        String cara5 = cubo.getCara5Cubo1();
        String cara6 = cubo.getCara6Cubo1();

        // Pintar los paneles según el orden especificado
        caraPanelAbajo.setBackground(obtenerColorPorNombre(cara3));
        caraPanelArriba.setBackground(obtenerColorPorNombre(cara1));
        caraPanelCentral.setBackground(obtenerColorPorNombre(cara2));
        caraPanelDer.setBackground(obtenerColorPorNombre(cara6));
        caraPanelIzq.setBackground(obtenerColorPorNombre(cara5));
        caraPanelTrasera.setBackground(obtenerColorPorNombre(cara4));
    }
    public void pintarPanelesSegunCubo2(LinkedList<Cubo2> cuboSolucion2) {
        if (cuboSolucion2.isEmpty()) {
            System.out.println("La lista está vacía.");
            return;
        }

        // Obtener el primer elemento de la lista (puedes modificar esto si deseas pintar un cubo específico)
        Cubo2 cubo = cuboSolucion2.getFirst();

        // Obtener los colores de las caras
        String cara1 = cubo.getCara1Cubo2();
        String cara2 = cubo.getCara2Cubo2();
        String cara3 = cubo.getCara3Cubo2();
        String cara4 = cubo.getCara4Cubo2();
        String cara5 = cubo.getCara5Cubo2();
        String cara6 = cubo.getCara6Cubo2();

        // Pintar los paneles según el orden especificado
        caraPanelAbajo.setBackground(obtenerColorPorNombre(cara3));
        caraPanelArriba.setBackground(obtenerColorPorNombre(cara1));
        caraPanelCentral.setBackground(obtenerColorPorNombre(cara2));
        caraPanelDer.setBackground(obtenerColorPorNombre(cara6));
        caraPanelIzq.setBackground(obtenerColorPorNombre(cara5));
        caraPanelTrasera.setBackground(obtenerColorPorNombre(cara4));
    }
    public void pintarPanelesSegunCubo3(LinkedList<Cubo3> cuboSolucion3) {
        if (cuboSolucion3.isEmpty()) {
            System.out.println("La lista está vacía.");
            return;
        }

        // Obtener el primer elemento de la lista (puedes modificar esto si deseas pintar un cubo específico)
        Cubo3 cubo = cuboSolucion3.getFirst();

        // Obtener los colores de las caras
        String cara1 = cubo.getCara1Cubo3();
        String cara2 = cubo.getCara2Cubo3();
        String cara3 = cubo.getCara3Cubo3();
        String cara4 = cubo.getCara4Cubo3();
        String cara5 = cubo.getCara5Cubo3();
        String cara6 = cubo.getCara6Cubo3();

        // Pintar los paneles según el orden especificado
        caraPanelAbajo.setBackground(obtenerColorPorNombre(cara3));
        caraPanelArriba.setBackground(obtenerColorPorNombre(cara1));
        caraPanelCentral.setBackground(obtenerColorPorNombre(cara2));
        caraPanelDer.setBackground(obtenerColorPorNombre(cara6));
        caraPanelIzq.setBackground(obtenerColorPorNombre(cara5));
        caraPanelTrasera.setBackground(obtenerColorPorNombre(cara4));
    }
    public void pintarPanelesSegunCubo4(LinkedList<Cubo4> cuboSolucion4) {
        if (cuboSolucion4.isEmpty()) {
            System.out.println("La lista está vacía.");
            return;
        }

        // Obtener el primer elemento de la lista (puedes modificar esto si deseas pintar un cubo específico)
        Cubo4 cubo = cuboSolucion4.getFirst();

        // Obtener los colores de las caras
        String cara1 = cubo.getCara1Cubo4();
        String cara2 = cubo.getCara2Cubo4();
        String cara3 = cubo.getCara3Cubo4();
        String cara4 = cubo.getCara4Cubo4();
        String cara5 = cubo.getCara5Cubo4();
        String cara6 = cubo.getCara6Cubo4();

        // Pintar los paneles según el orden especificado
        caraPanelAbajo.setBackground(obtenerColorPorNombre(cara3));
        caraPanelArriba.setBackground(obtenerColorPorNombre(cara1));
        caraPanelCentral.setBackground(obtenerColorPorNombre(cara2));
        caraPanelDer.setBackground(obtenerColorPorNombre(cara6));
        caraPanelIzq.setBackground(obtenerColorPorNombre(cara5));
        caraPanelTrasera.setBackground(obtenerColorPorNombre(cara4));
    }    
    private Color obtenerColorPorNombre(String nombreColor) {
        // Convertir el nombre del color a minúsculas para evitar errores de capitalización
        nombreColor = nombreColor.toLowerCase();

        // Definir los colores y sus nombres correspondientes (en minúsculas)
        switch (nombreColor) {
            case "rojo":
                return Color.RED;
            case "azul":
                return Color.BLUE;
            case "verde":
                return Color.GREEN;
            case "amarillo":
                return Color.YELLOW;
            // Agregar más colores según tus necesidades
            default:
                // En caso de que el nombre del color no coincida con ninguno de los colores definidos, devolver un color por defecto
                return Color.WHITE;
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
            java.util.logging.Logger.getLogger(OrdenarCubos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OrdenarCubos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OrdenarCubos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OrdenarCubos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OrdenarCubos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton GiroBotonArriba;
    private javax.swing.JButton GiroBotonDer;
    private javax.swing.JPanel caraPanelAbajo;
    private javax.swing.JPanel caraPanelArriba;
    private javax.swing.JPanel caraPanelCentral;
    private javax.swing.JPanel caraPanelDer;
    private javax.swing.JPanel caraPanelIzq;
    private javax.swing.JPanel caraPanelTrasera;
    private javax.swing.JButton comprobarRespuestaBoton;
    private javax.swing.JLabel consejo1Label;
    private javax.swing.JButton consejoBoton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton seleccionarCuboBoton;
    // End of variables declaration//GEN-END:variables
}
