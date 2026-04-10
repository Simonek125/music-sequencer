package ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class LoadWindow extends JFrame {
    public LoadWindow() {
        setTitle("Load project");
        setSize(600, 800);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        setLayout(new BorderLayout());
        this.setAlwaysOnTop(true);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                MainWindow.subWindowClosed();
            }
        });


        this.setVisible(true);



    }
}
