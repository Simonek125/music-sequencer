package ui;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class MainWindow extends JFrame {

    private List<JCheckBox> checkboxList = new ArrayList<>();

    public MainWindow() {
        setTitle("JL Studio");
        setSize(600, 800);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        try{
            loadToolbar();
            loadStatusbar();
            loadGrid();
        } catch (Exception e) {
            System.err.println("Error loading UI: " + e.getMessage());
        }

        this.setVisible(true);



    }

    private void loadGrid() {
        // A 4x16 grid (4 tracks, 16 beats)
        JPanel gridPanel = new JPanel(new GridLayout(4, 16));

        for (int i = 0; i < 64; i++) {
            JCheckBox cb = new JCheckBox();
            cb.setSelected(false);
            checkboxList.add(cb);
            gridPanel.add(cb);
        }

        add(gridPanel, BorderLayout.CENTER);
    }

    private void loadStatusbar() {
        JLabel statusLabel = new JLabel(" Ready to create music...");
        add(statusLabel, BorderLayout.SOUTH);
    }

    private void loadToolbar() {
        JPanel toolbar = new JPanel();

        JButton playBtn = new JButton("Play");
        JButton stopBtn = new JButton("Stop");

        // Requirement: Multiple windows (at least 3)
        // These buttons will eventually open your Settings and About windows
        JButton settingsBtn = new JButton("Settings");
        JButton aboutBtn = new JButton("Save/Load");

        toolbar.add(playBtn);
        toolbar.add(stopBtn);
        toolbar.add(settingsBtn);
        toolbar.add(aboutBtn);

        add(toolbar, BorderLayout.NORTH);
    }

    private void loadUi() {
        JButton playButton = new JButton("Play");
        this.add(playButton);
    }
}
