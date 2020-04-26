import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MenuGUI extends JFrame {

    public MenuGUI() {
        super("Menu");

        JLabel GMenu = new JLabel();
        JButton BTravel = new JButton("Travel");
        JButton BFight = new JButton("Fight");
        JButton BHospital = new JButton("Hospital");
        JButton BHouse = new JButton("My House");
        
        GMenu.setLayout(null);
        GMenu.setBounds(0, 0, 800, 533);
        BTravel.setBounds(600, 200, 200, 50);
        BFight.setBounds(600, 300, 200, 50);
        BHospital.setBounds(600, 400, 200, 50);
        BHouse.setBounds(600, 500, 200, 50);

        add(GMenu);
        GMenu.add(BTravel);
        GMenu.add(BFight);
        GMenu.add(BHospital);
        GMenu.add(BHouse);
        

        BTravel.addActionListener((final ActionEvent e) -> {
            setVisible(false);
            new PlaceGUI();
        });

        BFight.addActionListener((final ActionEvent e) -> {
            setVisible(false);
            new BattleGUI();
        });

        

        setSize(1024,768);
        setResizable(false);
        setVisible(true);


    }
}