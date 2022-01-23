
package tictactoe3_game;


import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javafx.scene.control.ComboBox;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class UserPanel implements ActionListener{
    JFrame jf;
    JButton jb;
    JTextField jt1,jt2;
    JLabel jl1,jl2,jl3;
    JComboBox cb;
    
    UserPanel(){
      jf=new JFrame("Tictactoe_game by aniket");
      jf.setSize(500,400);
      jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      jf.setLayout(null);
      
      jl1=new JLabel("Player1 :(x)");
      jl1.setFont(new Font("Arial",1,15));
      jl1.setBounds(70,50,100,30);
      jf.add(jl1);
      jt1=new JTextField();
      jt1.setBounds(180,50,250,30);
      jf.add(jt1);
      
      jl2=new JLabel("Player2 : (0)");
      jl2.setFont(new Font("Arial",1,15));
      jl2.setBounds(70,120,100,30);
      jf.add(jl2);
      jt2=new JTextField();
      jt2.setBounds(180,120,250,30);
      jf.add(jt2);
      
      jl3=new JLabel("Series ");
      jl3.setFont(new Font("Arial",1,15));
      jl3.setBounds(70,180,100,30);
      jf.add(jl3);
      
      String[] series={"3","5","7","9"};
      cb=new JComboBox(series);
      cb.setBounds(180,180,100,40);
      jf.add(cb);
      
      jb=new JButton();
      jb.setBounds(170,280,150,40);
      jb.addActionListener(this);
      jb.setText("Start Game");
      jf.add(jb);
      
      
      
      jf.setVisible(true);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if(e.getSource()==jb)
        {
          String   player1=jt1.getText();
          String   player2=jt2.getText();
          
          String series=(String)cb.getSelectedItem();
          
         GamePanel gp= new GamePanel(player1,player2,Integer.parseInt(series));
         gp.gamePanel();
         jf.setVisible(false);
        }
        
        
    }
        
    
}
