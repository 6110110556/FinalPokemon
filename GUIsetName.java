import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUIsetName extends JFrame {

    JTextField inputName;
    String namePokemon01;

    private DataUser data = new DataUser();

    public GUIsetName() {

        super("SetName First Pokemon");

        final JPanel areaPanel = new JPanel();
        final ImageIcon imgPokemonMain = new ImageIcon("C:\\Users\\User\\Desktop\\Y2\\Term2\\FinalPokemon\\Pokemon\\Picture\\GUIsetName\\Pikachu01.GIF");
        final JLabel backGroundLabel = new JLabel("", imgPokemonMain, JLabel.CENTER);
        final JLabel toTextLabel = new JLabel("Enter Your NickName Pikachumon :");
        toTextLabel.setBounds(300, 20, 500, 30);
        final JButton acceptButton = new JButton("Accept");
        final JButton cancleButton = new JButton("Cancle");


        toTextLabel.setFont(new Font("Cunia", Font.TRUETYPE_FONT, 25));
        acceptButton.setFont(new Font("Cunia", Font.TRUETYPE_FONT, 12));
        cancleButton.setFont(new Font("Cunia", Font.TRUETYPE_FONT, 12));
        
        inputName = new JTextField();
        inputName.setBounds(300, 400, 400, 30);
        inputName.setFont(new Font("Cunia", Font.TRUETYPE_FONT, 18));

        areaPanel.add(inputName);

        areaPanel.setLayout(null);
        areaPanel.setSize(1024, 768);
        backGroundLabel.setBounds(350, 150, 300, 202);
        acceptButton.setBounds(500, 500, 100, 30);
        cancleButton.setBounds(600, 500, 100, 30);

      //  areaPanel.setBackground(Color.GREEN);
       
        areaPanel.add(toTextLabel);
        areaPanel.add(backGroundLabel);
        areaPanel.add(acceptButton);
        areaPanel.add(cancleButton);
        add(areaPanel);
        


        acceptButton.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                data.statusStart();
                namePokemon01 = inputName.getText();
                data.setNamePokemon01(namePokemon01);

                System.out.print("\n\t   ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n"
                            +"\n\t\t  Your Pokemon Name is "+data.getNamePokemon01()
                            +"\n\t\t    Level : "+data.getLevel()
                            +"\n\t\t    HP : "+data.getHP()
                            +"\n\t\t    MP : "+data.getMP()
                            +"\n\t\t    Power : "+data.getPower()
                            +"\n\t\t    Stamina : "+data.getStamina()
                            +"\n\n\t  ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
                //setVisible(false);
                new GUImenu();
                dispose();

            }
        });

        cancleButton.addActionListener((ActionEvent e) -> {

            setVisible(false);
            new GUIpokemon();
        });
/*
        inputName.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                namePokemon01 = inputName.getText();
                //setVisible(false);
                //new GUImenu();
                //dispose();

            }

        });*/

        pack();
        setBounds(200, 20, 1024,768);
        setResizable(false);
        setVisible(true);

        
    }

}