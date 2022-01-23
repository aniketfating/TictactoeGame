
package tictactoe3_game;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Who_Win_Series {
    
    
    Who_Win_Series(String message)
    {
         JFrame jf=new JFrame();
         jf.setLayout(null);
         jf.setBackground(Color.red);
         jf.setSize(600,400);
         jf.setFont(new Font("Arial",1,30));
         jf.setTitle("series won"); 
         
         jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
        
        
         
         JLabel jl=new JLabel(message);
         
         jl.setBounds(100,100,300,50);
         
         jl.setForeground(Color.orange);
         jl.setFont(new Font("Arial",1,30));
         jf.add(jl);
         
         jf.setVisible(true);
        
    }
    
}
