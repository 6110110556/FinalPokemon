import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUIuserReceive extends JFrame{
    private DataUser data;
    
    public GUIuserReceive(DataUser data) {
        super("You get it!");

        ImageIcon imgBackGround = new ImageIcon("C:\\Users\\User\\Desktop\\Y2\\Term2\\FinalPokemon\\Pokemon\\Picture\\GUIyouReceive\\imgPlaceGround01.JPG");
        JPanel platePanel = new JPanel();
        JLabel backGroundLabel = new JLabel("", imgBackGround, JLabel.CENTER);

        JTextArea status = new JTextArea();

        status.setText("\n   ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n"
        +"\n  Pokeball "+data.getPokeBall()
        +"\n    Berry : "+data.getBerry()
        +"\n    MixBerry : "+data.getMixBerry()
        +"\n   PokemonS_Card : "+data.getCard_P1()
        +"\n   PokemonA_Card : "+data.getCard_P2()
        +"\n    PokemonB_Card : "+data.getCard_P3()
        +"\n    PokemonC_Card : "+data.getCard_P4()
        +"\n\n  ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");

        status.setSize(450, 500);


        JButton okButton = new JButton("OK");
        okButton.setFont(new Font("Cunia", Font.TRUETYPE_FONT, 20));

        platePanel.setLayout(null);
        backGroundLabel.setBounds(0, 0, 450, 500);
        okButton.setBounds(200, 310, 50, 40);

        platePanel.setBackground(new Color(158, 113, 0));

        platePanel.add(status);
        platePanel.add(okButton);
        platePanel.add(backGroundLabel);
        add(platePanel);
/*
        okButton.addActionListener((ActionEvent e) -> {
            dispose();
        });*/

        setSize(450, 500);
        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);

    }

}