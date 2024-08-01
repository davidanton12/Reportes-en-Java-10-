
package com.sistema.reportes;

import javax.swing.JFrame;
import javax.swing.*;  
import java.awt.*;  
import java.awt.event.ActionEvent;  
import java.awt.event.ActionListener; 

public class MainMenuFrame extends JFrame{

  public MainMenuFrame() {  
     
setTitle("Menú Principal");  
        setLayout(new FlowLayout());  

        JButton reportButton = new JButton("Generar Reportes");  
        reportButton.addActionListener(new ActionListener() {  
            @Override  
            public void actionPerformed(ActionEvent e) {  
                showReportOptions();  
            }  
        });  

      add(reportButton);  
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        pack();  
        setVisible(true);  
        setLocationRelativeTo(null); // Centrar ventana  
    }  

    private void showReportOptions() {  
        String[] options = {  
            "Reporte General de Estudiantes",  
            "Reporte por Estado",  
            "Reporte Individual de Estudiante",  
            "Cancelar"  
        };  
        int choice = JOptionPane.showOptionDialog(this, "Seleccione un tipo de reporte", "Reportes",  
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);  
        
        switch (choice) {  
            case 0:  
                generateGeneralReport();  
                break;  
            case 1:  
                generateStateReport();  
                break;  
            case 2:  
                generateIndividualReport();  
                break;  
        }  
    }  

    private void generateGeneralReport() {  
        String report = "Reporte General de Estudiantes\n";  
        report += "Fecha: " + java.time.LocalDate.now().toString() + "\n";  
        report += "Página 1";  

        JOptionPane.showMessageDialog(this, report, "Reporte General", JOptionPane.INFORMATION_MESSAGE);  
    }  

    private void generateStateReport() {  
        String report = "Reporte de Estudiantes por Estado\n";  
        report += "Fecha: " + java.time.LocalDate.now().toString() + "\n";  
        report += "Página 1";  

        JOptionPane.showMessageDialog(this, report, "Reporte por Estado", JOptionPane.INFORMATION_MESSAGE);  
    }  

    private void generateIndividualReport() {  
        String studentName = JOptionPane.showInputDialog(this, "Ingrese el nombre del estudiante:");  
        if (studentName != null && !studentName.trim().isEmpty()) {  
            String report = "Reporte Individual de " + studentName + "\n";  
            report += "Fecha: " + java.time.LocalDate.now().toString() + "\n";  
            report += "Página 1";  
            JOptionPane.showMessageDialog(this, report, "Reporte Individual", JOptionPane.INFORMATION_MESSAGE);  
        } else {  
            JOptionPane.showMessageDialog(this, "Nombre del estudiante no puede estar vacío.", "Error", JOptionPane.ERROR_MESSAGE);  
        }  
    }  
}  