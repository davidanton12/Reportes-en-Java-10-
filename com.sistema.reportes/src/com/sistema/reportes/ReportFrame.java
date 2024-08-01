
package com.sistema.reportes;

import javax.swing.*;  
import java.awt.*;  
import java.awt.event.ActionEvent;  
import java.awt.event.ActionListener;  
import java.time.LocalDate; 

public class ReportFrame extends JFrame{
    
 public ReportFrame() {  
        setTitle("Generar Reportes");  
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));  

        JButton generalReportButton = new JButton("Reporte General de Estudiantes");  
        JButton stateReportButton = new JButton("Reporte por Estado");  
        JButton individualReportButton = new JButton("Reporte Individual de Estudiante");  

        generalReportButton.addActionListener(e -> generateGeneralReport());  
        stateReportButton.addActionListener(e -> generateStateReport());  
        individualReportButton.addActionListener(e -> generateIndividualReport());  

        add(generalReportButton);  
        add(stateReportButton);  
        add(individualReportButton);  

        pack();  
        setLocationRelativeTo(null);  
        setVisible(true);  
    }  

    private void generateGeneralReport() {  
        String report = "Reporte General de Estudiantes\n";  
        report += "Fecha: " + LocalDate.now() + "\n";  
        report += "Página 1";  

        JOptionPane.showMessageDialog(this, report, "Reporte General", JOptionPane.INFORMATION_MESSAGE);  
    }  

    private void generateStateReport() {  
        String report = "Reporte de Estudiantes por Estado\n";  
        report += "Fecha: " + LocalDate.now() + "\n";  
        report += "Página 1";  

        JOptionPane.showMessageDialog(this, report, "Reporte por Estado", JOptionPane.INFORMATION_MESSAGE);  
    }  

    private void generateIndividualReport() {  
        String studentName = JOptionPane.showInputDialog(this, "Ingrese el nombre del estudiante:");  
        if (studentName != null && !studentName.trim().isEmpty()) {  
            String report = "Reporte Individual de " + studentName + "\n";  
            report += "Fecha: " + LocalDate.now() + "\n";  
            report += "Página 1";  

            JOptionPane.showMessageDialog(this, report, "Reporte Individual", JOptionPane.INFORMATION_MESSAGE);  
        } else {  
            JOptionPane.showMessageDialog(this, "El nombre no puede estar vacío.", "Error", JOptionPane.ERROR_MESSAGE);  
        }  
    }  
}     
    
    
    
    
    

