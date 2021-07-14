package view;

import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {

    public MainWindow(){
        this.setSize(new Dimension(500,500));
        initComponents();
        this.setVisible(true);
    }

    public void initComponents(){
        JTextField texto  = new JTextField("Documento Repositorio");
        this.add(texto);
    }
}
