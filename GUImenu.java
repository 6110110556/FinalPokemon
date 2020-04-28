import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUImenu extends JFrame {

    public GUImenu() {
        super("Menu");
        ImageIcon imgMenu = new ImageIcon("C:\\Users\\User\\Desktop\\Y2\\Term2\\FinalPokemon\\Pokemon\\Picture\\GUIPokemon\\imgGround1.JPG");
        JLabel menuLabel = new JLabel("", imgMenu, JLabel.CENTER);
        JButton travelButton = new JButton("Travel");
        JButton fightButton = new JButton("Fight");
        JButton hospitalButton = new JButton("Hospital");
        JButton houseButton = new JButton("My House");
        
        menuLabel.setLayout(null);
        menuLabel.setBounds(0, 0, 1024, 768);
        travelButton.setBounds(600, 200, 200, 50);
        fightButton.setBounds(600, 300, 200, 50);
        hospitalButton.setBounds(600, 400, 200, 50);
        houseButton.setBounds(600, 500, 200, 50);

        add(menuLabel);
        menuLabel.add(travelButton);
        menuLabel.add(fightButton);
        menuLabel.add(hospitalButton);
        menuLabel.add(houseButton);
        

        travelButton.addActionListener((final ActionEvent e) -> {
            setVisible(false);
            new GUIplace();
        });

        fightButton.addActionListener((final ActionEvent e) -> {
            setVisible(false);
            new GUIbattle();
        });

        

        setBounds(200, 20, 1024,768);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);


    }
}