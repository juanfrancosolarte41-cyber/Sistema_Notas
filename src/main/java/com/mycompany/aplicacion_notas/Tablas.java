/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aplicacion_notas;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author HP
 */
public class Tablas {
    private DefaultTableModel modelo;

    public Tablas(JTable tabla) {
        modelo = new DefaultTableModel(
            new Object[]{"Código", "Nombre", "Primera nota", "Segunda nota",
                         "Tercera nota", "Definitiva", "Estado"}, 0) {
            
            public boolean isCellEditable(int fila, int columna) {
                return false;
            }
        };
        tabla.setModel(modelo); // reemplaza las 31 filas vacías del diseñador
    }

    public double calcularDefinitiva(double n1, double n2, double n3) {
        return n1 * 0.30 + n2 * 0.30 + n3 * 0.40;
    }

    public String obtenerEstado(double definitiva) {
        return (definitiva >= 3.0) ? "Aprobó" : "Reprobó";
    }

    public boolean notaValida(double nota) {
        return nota >= 0.0 && nota <= 5.0;
    }

    public void agregarEstudiante(String codigo, String nombre,
                                  double n1, double n2, double n3) {
        double definitiva = calcularDefinitiva(n1, n2, n3);
        String estado = obtenerEstado(definitiva);

        modelo.addRow(new Object[]{
            codigo, nombre, n1, n2, n3,
            String.format("%.2f", definitiva), estado
        });
    }

    public void eliminarTodo() {
        modelo.setRowCount(0);
    }
}
