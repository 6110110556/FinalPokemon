import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class GUIPokemon extends JFrame {

    public GUIPokemon() {
        super("PokemonGame");
        ImageIcon imgGround = new ImageIcon("C:\\Users\\User\\Desktop\\ปี2\\เทอม 2\\FinalPokemon\\Pokemon\\Picture\\PokemonGUI\\imgGround1.JPG");
        JLabel BackgroundLabel = new JLabel("", imgGround, JLabel.CENTER);
        JButton StartButton = new JButton("START GAME");
        JButton QuitButton = new JButton("QUIT");

        StartButton.setFont(new Font("impact",Font.TRUETYPE_FONT,20));
        QuitButton.setFont(new Font("impact",Font.TRUETYPE_FONT,20));
        BackgroundLabel.setLayout(null);
        BackgroundLabel.setBounds(0,0,1024,768);
        StartButton.setBounds(200,400,200,50);
        QuitButton.setBounds(200,500,200,50);
        
        BackgroundLabel.add(StartButton);
        BackgroundLabel.add(QuitButton);   
        add(BackgroundLabel);

        
        StartButton.addActionListener((final ActionEvent e) ->{
            setVisible(false);
            new GUISetName();
        });
        
        QuitButton.addActionListener((final ActionEvent e) ->{
            System.exit(0);
        });

        
        setSize(1024,768);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false); 
        setVisible(true);
    }
}