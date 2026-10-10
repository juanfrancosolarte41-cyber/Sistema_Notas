/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aplicacion_notas;

import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class Aplicacion_notas {

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Bienvenido al sistemas de notas");
        javax.swing.SwingUtilities.invokeLater(() -> {
            Esquema_estudiantes form = new Esquema_estudiantes();
            form.setVisible(true);
        });
    }
}