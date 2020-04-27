import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUISetName extends JFrame {

    public GUISetName() {
        super("SetName");

        JPanel BackgroundPanel = new JPanel();
        JPanel AreaPanel = new JPanel();
        JButton AcceptButton = new JButton("Accept");
        JButton CancleButton = new JButton("Cancle");


        BackgroundPanel.setLayout(null);
        AreaPanel.setBounds(10, 10, 1000, 50);
        AcceptButton.setBounds(200, 400, 100, 50);
        CancleButton.setBounds(300, 400, 100, 50);

        BackgroundPanel.setBackground(Color.ORANGE);
        AreaPanel.setBackground(Color.GREEN);
        
        AreaPanel.add(AcceptButton);
        AreaPanel.add(CancleButton);
        BackgroundPanel.add(AreaPanel);
        add(BackgroundPanel);


        AcceptButton.addActionListener((final ActionEvent e) -> {
            setVisible(false);
            new GUIMenu();
        });

        CancleButton.addActionListener((final ActionEvent e) -> {
            setVisible(false);
            new GUIPokemon();
        });

        setSize(1024, 768);
        setResizable(false);
        setVisible(true);

        
        



    }

}