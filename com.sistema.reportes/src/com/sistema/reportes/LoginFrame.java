
package com.sistema.reportes;

import javax.swing.JFrame;
import javax.swing.*;  
import java.awt.*;  
import java.awt.event.ActionEvent;  
import java.awt.event.ActionListener;  



public class LoginFrame extends JFrame{
    
    private final JTextField usernameField;  
    private final JPasswordField passwordField;
    
    public LoginFrame() {  
        setTitle("Acceso al Sistema");  
        setLayout(new GridLayout(3, 2));  

        // Componentes de la ventana de acceso  
        add(new JLabel("Usuario:"));  
        usernameField = new JTextField();  
        add(usernameField);  

        add(new JLabel("Contraseña:"));  
        passwordField = new JPasswordField();  
        add(passwordField);  

        JButton loginButton = new JButton("Acceder");  
        add(loginButton);  

        // Manejar el evento del botón  
        loginButton.addActionListener(new ActionListener() {  
            @Override  
            public void actionPerformed(ActionEvent e) {  
                authenticate();  
            }  
        });  

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        pack();  
        setVisible(true);  
        setLocationRelativeTo(null); // Centrar ventana  
    }  

    private void authenticate() {  
        String username = usernameField.getText();  
        String password = new String(passwordField.getPassword());  

        // Validar usuario  
        if ("admin".equals(username) && "admin123".equals(password)) {  
            new MainMenuFrame().setVisible(true);  
            this.dispose();  
        } else {  
            JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrecto.", "Error", JOptionPane.ERROR_MESSAGE);  
        }  
    }  
}  

