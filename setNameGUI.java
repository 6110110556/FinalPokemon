import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class setNameGUI extends JFrame{

    public setNameGUI(){
        super("SetName");

        final JPanel Background = new JPanel();
        final JPanel GArea = new JPanel();
        final JLabel LArea = new JLabel();
        final JButton BAccept = new JButton("Accept");
        final JButton BCancle = new JButton("Cancle");


        Background.setLayout(null);
        GArea.setBounds(10, 10, 1000, 50);

        BAccept.setBounds(200, 400, 100, 50);
        BCancle.setBounds(300, 400, 100, 50);

        
        Background.setBackground(Color.ORANGE);
        GArea.setBackground(Color.GREEN);
        GArea.add(BAccept);
        GArea.add(BCancle);
        Background.add(GArea);
        add(Background);


        BAccept.addActionListener((final ActionEvent e) -> {
            setVisible(false);
            new MenuGUI();
        });

        BCancle.addActionListener((final ActionEvent e) -> {
            setVisible(false);
            new PokemonGUI();
        });

        setSize(1024, 768);
        setResizable(false);
        setVisible(true);

        
        



    }

}