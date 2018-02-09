package com.javaSwing;

import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame {

    private JLabel labelNombre;
    private JLabel labelApellido;
    private JLabel labelEdad;
    private JLabel labelFechaNac;
    private JLabel labelCI;

    private JTextField fieldNombre;
    private JTextField fieldApellido;
    private JTextField fieldEdad;
    private JTextField fieldFechanac;
    private JTextField fieldCI;



    public Ventana() {
        super("Ejemplo de BorderLayout ");
        labelNombre = new JLabel("1");
        labelApellido = new JLabel("2");
        labelEdad = new JLabel("3");
        labelFechaNac = new JLabel("4");
        labelCI = new JLabel("5");

        setLayout(new BorderLayout());

        add(labelNombre, BorderLayout.NORTH);
        add(labelApellido, BorderLayout.WEST);
        add(labelEdad, BorderLayout.SOUTH);
        add(labelFechaNac, BorderLayout.EAST);




    }
}
