/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.mc1_202203038_proyectofinal;

import static com.mycompany.mc1_202203038_proyectofinal.AppDataListas.cubo1List;
import static com.mycompany.mc1_202203038_proyectofinal.AppDataListas.cubo2List;
import static com.mycompany.mc1_202203038_proyectofinal.AppDataListas.cubo3List;
import static com.mycompany.mc1_202203038_proyectofinal.AppDataListas.cubo4List;
import java.awt.Color;
import java.awt.Graphics;
import java.util.LinkedList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

/**
 *
 * @author Player
 */
public class VistaDeCubos extends javax.swing.JFrame {

private LinkedList<String> listaSeleccionada; // Variable de instancia para la lista seleccionada

public VistaDeCubos() {
    initComponents();
    
    actualizarLabels();
    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    setVisible(true);
    setLocationRelativeTo(null);
    setResizable(false);
    setTitle("Menu de selección");
    
    // Crear un botón y agregarlo al JPanel o JFrame de tu interfaz
    JButton leerListaButton = new JButton("Leer Lista");
    leerListaButton.setBounds(10, 10, 120, 30); // Establece la posición y el tamaño del botón

    getContentPane().add(leerListaButton); // Agrega el botón al contenido del JFrame

    // Acción del botón para seleccionar un cubo y leer la lista correspondiente
    leerListaButton.addActionListener(e -> seleccionarCuboYLeerLista());
    // Inicializa la lista de colores y el índice

        posicionActual = 0;
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        panelParaCuadrado = new javax.swing.JPanel();
        CuboNumeroLabel = new javax.swing.JLabel();
        CaraNumeroLabel = new javax.swing.JLabel();
        OrdenarCubosBoton = new javax.swing.JButton();
        ComprobarBoton = new javax.swing.JButton();
        rendirseBoton = new javax.swing.JButton();
        regresarBoton = new javax.swing.JButton();
        VerSiguienteCuboBoton = new javax.swing.JButton();
        anteriorBotonCara = new javax.swing.JButton();
        siguienteBotonCara = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Vista de los cubos");

        panelParaCuadrado.setBackground(new java.awt.Color(153, 153, 255));
        panelParaCuadrado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        CuboNumeroLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        CuboNumeroLabel.setForeground(new java.awt.Color(0, 0, 0));
        CuboNumeroLabel.setText("Cubo: 1");

        CaraNumeroLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        CaraNumeroLabel.setForeground(new java.awt.Color(0, 0, 0));
        CaraNumeroLabel.setText("Cara No");

        javax.swing.GroupLayout panelParaCuadradoLayout = new javax.swing.GroupLayout(panelParaCuadrado);
        panelParaCuadrado.setLayout(panelParaCuadradoLayout);
        panelParaCuadradoLayout.setHorizontalGroup(
            panelParaCuadradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelParaCuadradoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CuboNumeroLabel)
                .addGap(203, 203, 203)
                .addComponent(CaraNumeroLabel)
                .addContainerGap(333, Short.MAX_VALUE))
        );
        panelParaCuadradoLayout.setVerticalGroup(
            panelParaCuadradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelParaCuadradoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelParaCuadradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CuboNumeroLabel)
                    .addComponent(CaraNumeroLabel))
                .addContainerGap(371, Short.MAX_VALUE))
        );

        OrdenarCubosBoton.setBackground(new java.awt.Color(153, 255, 204));
        OrdenarCubosBoton.setForeground(new java.awt.Color(0, 0, 0));
        OrdenarCubosBoton.setText("Ordenar cubos");

        ComprobarBoton.setBackground(new java.awt.Color(153, 255, 153));
        ComprobarBoton.setForeground(new java.awt.Color(0, 0, 0));
        ComprobarBoton.setText("Comprobar Solución");

        rendirseBoton.setBackground(new java.awt.Color(255, 153, 153));
        rendirseBoton.setForeground(new java.awt.Color(0, 0, 0));
        rendirseBoton.setText("Me rindo");

        regresarBoton.setText("Regresar");
        regresarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarBotonActionPerformed(evt);
            }
        });

        VerSiguienteCuboBoton.setBackground(new java.awt.Color(51, 51, 51));
        VerSiguienteCuboBoton.setForeground(new java.awt.Color(255, 255, 255));
        VerSiguienteCuboBoton.setText("Ver siguiente cubo");
        VerSiguienteCuboBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerSiguienteCuboBotonActionPerformed(evt);
            }
        });

        anteriorBotonCara.setText("<");
        anteriorBotonCara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anteriorBotonCaraActionPerformed(evt);
            }
        });

        siguienteBotonCara.setText(">");
        siguienteBotonCara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siguienteBotonCaraActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Cara anterior");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Cara Siguiente");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(209, 209, 209)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(anteriorBotonCara, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel2))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelParaCuadrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(OrdenarCubosBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(VerSiguienteCuboBoton)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(regresarBoton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ComprobarBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(rendirseBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(siguienteBotonCara, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelParaCuadrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(anteriorBotonCara, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(siguienteBotonCara, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(ComprobarBoton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(regresarBoton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(OrdenarCubosBoton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rendirseBoton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(VerSiguienteCuboBoton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private int listaActualIndex = 0;  // Índice de la lista actual
private int posicionActual = 0;   // Posición actual en la lista
private int numDeListas = 4;
private int numDePosiciones = 6;
    //el cuadrado debe ser de 300x300 centrado en el panel
    private void actualizarLabels() {

        // Obtener el nombre de la cara actual (por ejemplo, "Cara 1", "Cara 2", etc.)
        String nombreCara = "Cara " + (posicionActual + 1);

        CaraNumeroLabel.setText(nombreCara);
    }
    private boolean avanzarColor = false;
    private boolean retrocederColor = false;

public void paintComponent(Graphics g) {
    super.paintComponents(g);

    if (avanzarColor) {
        // Avanza a la siguiente posición de la lista de colores
        if (posicionActual < listaSeleccionada.size() - 1) {
            posicionActual++;
        } else {
            // Si llegamos al final, vuelve al inicio
            posicionActual = 0;
        }
    } else if (retrocederColor) {
        // Retrocede a la posición anterior de la lista de colores
        if (posicionActual > 0) {
            posicionActual--;
        } else {
            // Si estamos en el inicio, retrocede al final
            posicionActual = listaSeleccionada.size() - 1;
        }
    }

    // Obtiene el color actual de la lista
    String colorActual = listaSeleccionada.get(posicionActual);

    // Dibuja un cuadrado con el color actual
    g.setColor(Color.decode(colorActual)); // Convierte el nombre del color en un objeto Color
    g.fillRect(50, 50, 200, 200); // Dibuja el 
}

    private void irAListaSiguiente() {
        if (posicionActual < numDePosiciones - 1) {
            // Avanzar a la siguiente lista
            posicionActual++;
            // No necesitas reiniciar la posición si vas a la siguiente lista
            actualizarLabels();
        } else {
            // Si ya no hay más listas, no cambies el label
        }
    }

    private void irAListaAnterior() {
        if (posicionActual > 0) {
            // Retroceder a la lista anterior
            posicionActual--;
            // No necesitas reiniciar la posición si vas a la lista anterior
            actualizarLabels();
        } else {
            // Si ya no hay más listas hacia atrás, no cambies el label
        }
    }

    private void regresarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarBotonActionPerformed
        // TODO add your handling code here:
        Personalizacion_de_cubos aparece = new Personalizacion_de_cubos();
        aparece.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_regresarBotonActionPerformed

    private void anteriorBotonCaraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anteriorBotonCaraActionPerformed
        // TODO add your handling code here:
        irAListaAnterior();
        colorAnterior(); 
    }//GEN-LAST:event_anteriorBotonCaraActionPerformed

    private void siguienteBotonCaraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siguienteBotonCaraActionPerformed
        // TODO add your handling code here:
        irAListaSiguiente();
        siguienteColor();
    }//GEN-LAST:event_siguienteBotonCaraActionPerformed

    private void VerSiguienteCuboBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerSiguienteCuboBotonActionPerformed
        // TODO add your handling code here:
            seleccionarCuboYLeerLista();
            repaint();
    }//GEN-LAST:event_VerSiguienteCuboBotonActionPerformed
public void paint(Graphics g) {
    super.paintComponents(g);
    
    // Verificar que la lista y la posición actual sean válidas
    if (listaSeleccionada != null && !listaSeleccionada.isEmpty() && posicionActual >= 0 && posicionActual < listaSeleccionada.size()) {
        // Obtener el color en la posición actual
        String colorStr = listaSeleccionada.get(posicionActual);

        // Convertir el nombre del color a un objeto Color
        Color color = getColorFromString(colorStr);

        // Establecer el color de fondo
        g.setColor(color);

        // Dibujar un cuadrado en las coordenadas especificadas
        int x = 320; // Coordenada X
        int y = 190; // Coordenada Y
        int size = 250; // Tamaño del cuadrado
        g.fillRect(x, y, size, size);
        
        // Agregar un borde negro al cuadrado
        g.setColor(Color.BLACK);
        g.drawRect(x, y, size, size);
    }
}

    // Método para convertir el nombre del color a un objeto Color
    private Color getColorFromString(String colorStr) {
        switch (colorStr.toLowerCase()) {
            case "rojo":
                return Color.RED;
            case "amarillo":
                return Color.YELLOW;
            case "verde":
                return Color.GREEN;
            case "blanco":
                return Color.WHITE;
            default:
                return Color.BLACK; // Color por defecto si no se reconoce el nombre
        }
    }

    // Método para avanzar a la siguiente posición
    public void siguienteColor() {
        if (listaSeleccionada != null && !listaSeleccionada.isEmpty()) {
            posicionActual = (posicionActual) % listaSeleccionada.size();
            repaint(); // Volver a dibujar el cuadrado con el nuevo color
        }
    }

    // Método para retroceder a la posición anterior
    public void colorAnterior() {
        if (listaSeleccionada != null && !listaSeleccionada.isEmpty()) {
            posicionActual = (posicionActual) % listaSeleccionada.size();
            repaint(); // Volver a dibujar el cuadrado con el nuevo color
        }
    }
    private void seleccionarCuboYLeerLista() {
    try {
        // Pedir al usuario que ingrese un número del 1 al 4
        int numeroIngresado = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número del 1 al 4:"));

        // Verificar si el número está en el rango correcto
        if (numeroIngresado >= 1 && numeroIngresado <= 4) {
            // Actualizar el texto en el JLabel CuboNumeroLabel
            CuboNumeroLabel.setText("Cubo: " + numeroIngresado);

            // Asignar la lista correspondiente según el número ingresado a la variable de instancia
            switch (numeroIngresado) {
                case 1:
                    listaSeleccionada = cubo1List;
                    break;
                case 2:
                    listaSeleccionada = cubo2List;
                    break;
                case 3:
                    listaSeleccionada = cubo3List;
                    break;
                case 4:
                    listaSeleccionada = cubo4List;
                    break;
            }

            // Aquí puedes hacer algo con la lista seleccionada, como mostrar sus elementos
            if (listaSeleccionada != null) {
                System.out.println("Esta es la lista seleccionada");
                for (String elemento : listaSeleccionada) {
                    System.out.println(elemento);
                }
            }
            // Llamar a repaint() para actualizar el componente gráfico después de seleccionar el cubo
            panelParaCuadrado.repaint();
        } else {
            JOptionPane.showMessageDialog(null, "Número fuera de rango. Ingrese un número del 1 al 4.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(null, "Ingrese un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
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
            java.util.logging.Logger.getLogger(VistaDeCubos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaDeCubos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaDeCubos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaDeCubos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaDeCubos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CaraNumeroLabel;
    private javax.swing.JButton ComprobarBoton;
    private javax.swing.JLabel CuboNumeroLabel;
    private javax.swing.JButton OrdenarCubosBoton;
    private javax.swing.JButton VerSiguienteCuboBoton;
    private javax.swing.JButton anteriorBotonCara;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel panelParaCuadrado;
    private javax.swing.JButton regresarBoton;
    private javax.swing.JButton rendirseBoton;
    private javax.swing.JButton siguienteBotonCara;
    // End of variables declaration//GEN-END:variables
}
