import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUIsetName extends JFrame {

    JTextField inputName;
    String namePokemon01;
    private BagUser bag = new BagUser();

    private DataUser data = new DataUser();
    private TreasuryItem item;

    public GUIsetName() {

        super("SetName First Pokemon");

        //data.statusStart();
        item = new TreasuryItem(data);
        //data.setBerry(data.getBerry());
        final JPanel areaPanel = new JPanel();
        final ImageIcon imgPokemonMain = new ImageIcon("C:\\Users\\User\\Desktop\\Y2\\Term2\\FinalPokemon\\Pokemon\\Picture\\GUIsetName\\Pikachu01.GIF");
        final ImageIcon imgGround = new ImageIcon("C:\\Users\\User\\Desktop\\Y2\\Term2\\FinalPokemon\\Pokemon\\Picture\\GUIsetName\\imgGround02.JPG");
        final JLabel backGroundLabel = new JLabel("", imgPokemonMain, JLabel.CENTER);
        final JLabel backGround2Label = new JLabel("", imgGround, JLabel.CENTER); 
        final JLabel toTextLabel = new JLabel("Enter Your NickName Pikachumon :");
        toTextLabel.setBounds(280, 30, 500, 30);
        final JButton acceptButton = new JButton("Accept");
        final JButton cancleButton = new JButton("Cancle");


        toTextLabel.setFont(new Font("Cunia", Font.TRUETYPE_FONT, 25));
        acceptButton.setFont(new Font("Cunia", Font.TRUETYPE_FONT, 12));
        cancleButton.setFont(new Font("Cunia", Font.TRUETYPE_FONT, 12));

        acceptButton.setBackground(new Color(219, 135, 50));
        cancleButton.setBackground(new Color(219, 135, 50));
        
        backGround2Label.setLayout(null);
        inputName = new JTextField();
        inputName.setBounds(300, 430, 400, 35);
        inputName.setFont(new Font("Cunia", Font.TRUETYPE_FONT, 18));

        areaPanel.add(inputName);

        areaPanel.setLayout(null);
        areaPanel.setSize(1024, 768);
        backGroundLabel.setBounds(350, 150, 300, 202);
        backGround2Label.setSize(1024,768);

        acceptButton.setBounds(500, 500, 100, 30);
        cancleButton.setBounds(605, 500, 100, 30);

      //  areaPanel.setBackground(Color.GREEN);
       
        areaPanel.add(toTextLabel);
        areaPanel.add(backGroundLabel);
        areaPanel.add(acceptButton);
        areaPanel.add(cancleButton);
        areaPanel.add(backGround2Label);
        add(areaPanel);
        


        acceptButton.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                data.statusStart();

                data.setBerry(item.getItemBerry().getNumItem());
                namePokemon01 = inputName.getText();
                data.setNamePokemon01(namePokemon01);
                bag.addItem(item.getItemBerry());
                bag.addItem(item.getItemMixBerry());
                bag.addItem(item.getItemPotionHP());
                bag.addItem(item.getItemPotionMP());
                bag.addItem(item.getItemPokemonRankA_Card());
                bag.addItem(item.getItemPokemonRankB_Card());
                bag.addItem(item.getItemPokemonRankC_Card());
                bag.addItem(item.getItemPokemonRankD_Card());

                System.out.print("\n\t   ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n"
                            +"\n\t\t  Your Pikacu NickName is "+data.getNamePokemon01()
                            +"\n\t\t    -----------Your Pokemon Status------------"
                            +"\n\t\t    Level : "+data.getLevel()
                            +"\n\t\t    HP : "+data.getHP()
                            +"\n\t\t    MP : "+data.getMP()
                            +"\n\t\t    Power : "+data.getPower()
                            +"\n\t\t    Stamina : "+data.getStamina()
                            +"\n\t\t    -----------Your Item------------"
                            +"\n\t\t    Berry : "+item.getItemBerry().getNumItem()
                            +"\n\t\t    MixBerry : "+item.getItemMixBerry().getNumItem()
                            +"\n\t\t    PokemonCard_RankS : "+item.getItemPokemonRankA_Card().getNumItem()
                            +"\n\t\t    PokemonCard_RankA : "+item.getItemPokemonRankB_Card().getNumItem()
                            +"\n\t\t    PokemonCard_RankB : "+item.getItemPokemonRankC_Card().getNumItem()
                            +"\n\t\t    PokemonCard_RankC : "+item.getItemPokemonRankD_Card().getNumItem()
                            +"\n\n\t  ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
                
                
                setVisible(false);
                new GUImenu(data);
                //dispose();

            }
        });

        cancleButton.addActionListener((ActionEvent e) -> {

            setVisible(false);
            new GUIpokemon();
        });

        /*inputName.addActionListener(new ActionListener() {
            //BagUser bag = new BagUser();
            public void actionPerformed(ActionEvent e) {
                namePokemon01 = inputName.getText();
                data.setNamePokemon01(namePokemon01);
                
                //setVisible(false);
                //new GUImenu();
                //dispose();

            }

        });*/

        pack();
        setBounds(200, 20, 1024,768);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);

        
    }

}