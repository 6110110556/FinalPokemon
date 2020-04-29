import javax.swing.*;
import javax.xml.crypto.Data;

import java.awt.*;
import java.awt.event.*;

public class GUImenu extends JFrame {

    public GUImenu(DataUser data) {
        super("Menu");

        ImageIcon imgMenu = new ImageIcon("C:\\Users\\User\\Desktop\\Y2\\Term2\\FinalPokemon\\Pokemon\\Picture\\GUImenu\\imgGround03.JPG");

        JPanel backGroundPanel01 = new JPanel();
        JLabel menuLabel = new JLabel("", imgMenu, JLabel.CENTER);
        JButton travelButton = new JButton("Travel");
        JButton fightButton = new JButton("Fight");
        JButton houseButton = new JButton("My House");
        JButton exitButton = new JButton("Exit");
        
        travelButton.setFont(new Font("Cunia", Font.TRUETYPE_FONT, 20));
        fightButton.setFont(new Font("Cunia", Font.TRUETYPE_FONT, 20));
        houseButton.setFont(new Font("Cunia", Font.TRUETYPE_FONT, 20));
        exitButton.setFont(new Font("Cunia", Font.TRUETYPE_FONT, 20));

        backGroundPanel01.setSize(1024, 768);
        backGroundPanel01.setLayout(null);
        menuLabel.setBounds(5, 50, 1000, 625);
        menuLabel.setLayout(null);
        travelButton.setBounds(600, 200, 200, 50);
        travelButton.setLayout(null);
        
        fightButton.setBounds(600, 300, 200, 50);
        houseButton.setBounds(600, 400, 200, 50);
        exitButton.setBounds(600, 500, 200, 50);

        backGroundPanel01.setBackground(Color.GRAY);
        travelButton.setBackground(new Color(219, 135, 50));
        fightButton.setBackground(new Color(219, 135, 50));
        houseButton.setBackground(new Color(219, 135, 50));
        exitButton.setBackground(new Color(219, 135, 50));

        backGroundPanel01.add(travelButton);
        backGroundPanel01.add(fightButton);
        backGroundPanel01.add(houseButton);
        backGroundPanel01.add(exitButton);
        backGroundPanel01.add(menuLabel);
        add(backGroundPanel01);

        travelButton.addActionListener((final ActionEvent e) -> {
            new GUIplace(data);
            dispose();

        });

        fightButton.addActionListener((final ActionEvent e) -> {
            new GUIbattle();
            dispose();

        });

        houseButton.addActionListener((final ActionEvent e) -> {
           // new GUIhouse();
            dispose();

        });

        exitButton.addActionListener((final ActionEvent e) -> {
            System.exit(0);

        });

        
        setBounds(200, 20, 1024,768);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);


    }
}