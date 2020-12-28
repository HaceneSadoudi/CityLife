package com.sadoudi.game;

import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {

    public Window() {
        setTitle("CityLife");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(new GamePanel(720, 600));
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }


}
