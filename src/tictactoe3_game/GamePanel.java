/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe3_game;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


public class GamePanel implements ActionListener{
        
    JFrame jf;  
    JButton jb1,jb2,jb3,jb4,jb5,jb6,jb7,jb8,jb9;
    
    Font f=new Font("Arial", 1, 30);
    int count=0;
    
    String x0_value="",title_string="";
    JLabel jl;
    
    boolean win=false;
    boolean player1_turn=true;
    
    Color color1;
    String player1,player2;
    String player_Who_Wins;
    int total_series;
    int series_count=1;
    
   // String who_win_series_player_name;
    int player1_win_count=0,player2_win_count=0;
    
    
    
    GamePanel(String player1,String player2,int total_series){
        this.player1=player1;
        this.player2=player2;
        this.total_series=total_series;
          
       
    }
    void gamePanel(){
         
        jf=new JFrame();
        jf.setTitle(player1+"(x) turns");
        jf.setSize(500,500);
        jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);//EXIT_ON_CLOSE is constant variable its valuse is 3
        jf.setLayout(new GridLayout(3, 3));
        
        jb1=new JButton();
        jb1.addActionListener(this);//this is rejistration part 
        jf.add(jb1);
       
        jb2=new JButton();
        jb2.addActionListener(this);
        jf.add(jb2);
        
        jb3=new JButton();
        jb3.addActionListener(this);
        jf.add(jb3);
        
        jb4=new JButton();
        jb4.addActionListener(this);
        jf.add(jb4);
        
        jb5=new JButton();
        jb5.addActionListener(this);
        jf.add(jb5);
        
        jb6=new JButton();
        jb6.addActionListener(this);
        jf.add(jb6); 
        
        jb7=new JButton();
        jb7.addActionListener(this);
        jf.add(jb7);        
   
        jb8=new JButton();
        jb8.addActionListener(this);
        jf.add(jb8);

        jb9=new JButton();
        jb9.addActionListener(this);
        jf.add(jb9);        
        
        jf.setVisible(true);
    }
   
    @Override
    public void actionPerformed(ActionEvent e) {
        count=count+1;
        if(player1_turn==true){
            x0_value="x"; 
            title_string="0";
            color1=Color.yellow;
            jf.setTitle(player2+" ("+title_string+" )Turns");
            player1_turn=false;
                    
        }
        else{
             x0_value="0";
            color1=Color.red;
            title_string="x";
            jf.setTitle(player1+" ("+title_string+" )Turns");
            
             player1_turn=true;
        }
        
        
        
       if( e.getSource()==jb1){
          
           jb1.setFont(f);
           jb1.setText(x0_value);
           jb1.setEnabled(false);
           jb1.setBackground(color1);
           
           
       }
       
       if(e.getSource()==jb2){
           jb2.setFont(f);
           jb2.setText(x0_value);
           jb2.setEnabled(false);
           jb2.setBackground(color1);
       }
        
        if(e.getSource()==jb3){
           jb3.setFont(f);
           jb3.setText(x0_value);
           jb3.setEnabled(false);
           jb3.setBackground(color1);
       }
         if(e.getSource()==jb4){
           jb4.setFont(f);
           jb4.setText(x0_value);
           jb4.setEnabled(false);
           jb4.setBackground(color1);
       }
          if(e.getSource()==jb5){
           jb5.setFont(f);
           jb5.setText(x0_value);
           jb5.setEnabled(false);
           jb5.setBackground(color1);
       }
           if(e.getSource()==jb6){
           jb6.setFont(f);
           jb6.setText(x0_value);
           jb6.setEnabled(false);
           jb6.setBackground(color1);
       }
           if(e.getSource()==jb7){
           jb7.setFont(f);
           jb7.setText(x0_value);
           jb7.setEnabled(false);
           jb7.setBackground(color1);
       }
           if(e.getSource()==jb8){
           jb8.setFont(f);
           jb8.setText(x0_value);
           jb8.setEnabled(false);
           jb8.setBackground(color1);
       }
             
           if(e.getSource()==jb9){
           jb9.setFont(f);
           jb9.setText(x0_value);
           jb9.setEnabled(false);
           jb9.setBackground(color1);
       }
          this.winningPossibility();
    } 
    
        void winningPossibility(){ 
            //HORIZONTAL POSSIBILITIES
            
            if(jb1.getText()==jb2.getText()&&jb2.getText()==jb3.getText()&&jb3.getText()!=""){
                
              win=true;
                
            }
            else if(jb4.getText()==jb5.getText()&&jb5.getText()==jb6.getText()&&jb6.getText()!=""){
                
                  win=true;

            }
            else if(jb7.getText()==jb8.getText()&&jb8.getText()==jb9.getText()&&jb9.getText()!=""){
                
                 win=true;
            
            } 
            
            //VERTICLE POSSIBILITIES
            
            
            else if(jb1.getText()==jb4.getText()&&jb4.getText()==jb7.getText()&&jb7.getText()!=""){
                
                 win=true;
            }
            else if(jb2.getText()==jb5.getText()&&jb5.getText()==jb8.getText()&&jb8.getText()!=""){
                
                 win=true;
                
            }
            else if(jb3.getText()==jb6.getText()&&jb6.getText()==jb9.getText()&&jb9.getText()!=""){
                 win=true;
            } 
           //DIAGONAL POSSIBILITIES
            
            
            else if(jb1.getText()==jb5.getText()&&jb5.getText()==jb9.getText()&&jb9.getText()!=""){
                
                 win=true;

            }
            else if(jb3.getText()==jb5.getText()&&jb5.getText()==jb7.getText()&&jb7.getText()!="") {
                
                 win=true;

            
                }
            else{     
                  win=false;  //for false condition the sutable method is to cheak count= 9and no win possibity so we create who wins for conditon cheaking              
                }
            this.whoWins();
    }
        
        void whoWins(){
            if(win==true)
            {  
             series_count=series_count+1;
             
           if(x0_value.equals("x"))
            {
                player_Who_Wins=player1;
                player1_win_count=player1_win_count+1;
            }
            else
            {
                player_Who_Wins=player2;
                player2_win_count=player2_win_count+1;
            }
                String win_title=player_Who_Wins+"("+x0_value+")"+" wins";
                 jf.setTitle(win_title);
                JOptionPane.showMessageDialog(jf,win_title);
               
                restartGame();
            }
          
        
        else if(win==false&&count==9){
            series_count=series_count+1;
            JOptionPane.showMessageDialog(jf,"match drawn");
            restartGame();
  
        }   
        }
        
        void restartGame()
        {
            if(total_series>=series_count)
            { 
               int  i=JOptionPane.showConfirmDialog(jf,"Restart The Game");
           
            /**This dialoge box return int value 0 if user click on yes,1 for no 
             * and 2 for cancle and if we close this box this return -1*/
            
            if(i==0)
            {
                
                /**yes,when user click on yes we have to reset all the things such as
                 * count=0, x0_value=empty,win =false,test on button is empty and enable for clicking*/
                
                
                jb1.setText("");
                jb2.setText("");
                jb3.setText("");
                jb4.setText("");
                jb5.setText("");
                jb6.setText("");
                jb7.setText("");
                jb8.setText("");
                jb9.setText("");
                
                
                jb1.setBackground(null);
                jb2.setBackground(null);
                jb3.setBackground(null);
                jb4.setBackground(null);
                jb5.setBackground(null);
                jb6.setBackground(null);
                jb7.setBackground(null);
                jb8.setBackground(null);
                jb9.setBackground(null);
                
                btnEnabling(true); 
                count=0;
                  
                if(player_Who_Wins.equals(player1))
                   {
                      player1_turn=true;
                   }
                  
                else
                   {
                      player1_turn=false;
                   }
                  
                 jf.setTitle(player_Who_Wins+"("+x0_value+") turns");
                 win=false;
               
                 }
               else if(i==1)
               {
                //NO
                System.exit(0);
                
              }
               else
               {
                   
                 btnEnabling(false);
                
               } 
            
            
            }
            else
            {
                JOptionPane.showMessageDialog(jf, "series completed");
                
                if(player1_win_count>player2_win_count)
                {
                    new Who_Win_Series(player1+" win the series");
                   // JOptionPane.showMessageDialog(jf, player1+"win the series");
                   jf.setVisible(false);
                }
                else if(player2_win_count>player1_win_count)
                        {
                            new Who_Win_Series(player2+"win the series");
                            // JOptionPane.showMessageDialog(jf, player2+"win the series");
                             jf.setVisible(false);
                        }
                else
                    {
                        new Who_Win_Series("series draw");
                     // JOptionPane.showMessageDialog(jf,"series draw");
                         jf.setVisible(false);
                    }
            }
        }
       void btnEnabling(boolean b)
        {
            
                jb1.setEnabled(b);
                jb2.setEnabled(b);
                jb3.setEnabled(b);
                jb4.setEnabled(b);
                jb5.setEnabled(b);
                jb6.setEnabled(b);
                jb7.setEnabled(b);
                jb8.setEnabled(b);
                jb9.setEnabled(b);
        }
        
}

    
    

