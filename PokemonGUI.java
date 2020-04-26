import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class PokemonGUI extends JFrame {

    public PokemonGUI() {
        super("PokemonGame");
        ImageIcon imgGround = new ImageIcon("C:\\Users\\User\\Desktop\\ปี2\\เทอม 2\\FinalPokemon\\Pokemon\\Picture\\PokemonGUI\\imgGround1.JPG");
        JLabel Background = new JLabel("", imgGround, JLabel.CENTER);
        JButton BStart = new JButton("START GAME");
        JButton BQuit = new JButton("QUIT");

        BStart.setFont(new Font("impact",Font.TRUETYPE_FONT,20));
        BQuit.setFont(new Font("impact",Font.TRUETYPE_FONT,20));
        Background.setLayout(null);
        Background.setBounds(0,0,1024,768);
        BStart.setBounds(200,400,200,50);
        BQuit.setBounds(200,500,200,50);
        
        Background.add(BStart);
        Background.add(BQuit);   
        add(Background);

        
        BStart.addActionListener((final ActionEvent e) ->{
            setVisible(false);
            new setNameGUI();
        });
        
        BQuit.addActionListener((final ActionEvent e) ->{
            System.exit(0);
        });

        
        setSize(1024,768);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false); 
        setVisible(true);
    }
}