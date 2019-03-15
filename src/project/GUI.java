package project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class GUI {
 
	private JFrame f;
	private JPanel p;
	private JButton b1;
	private JLabel lab;
	private JButton b2;
	private JButton b3;
	private JButton b4;
	private JButton b5;
    static String amount;
    
	public  GUI() {
           
       }
        
	public void gui() {
		 f = new JFrame("ATM MACHINE");
		 f.setSize(900,700);
		 f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 Container y =f.getContentPane();
		 y.setBackground(Color.green);
		 p = new JPanel(new GridBagLayout());
		 p.setBackground(Color.LIGHT_GRAY);
		 Font fo = new Font("Arial", Font.BOLD, 25);
		 b1 = new JButton("Previous");
                  
		  b1.setFont(fo); 
                 b1.setToolTipText("previous transactions");
                 b1.setSize(100,100);
		 b2 = new JButton ("Deposit");
                  b2.setFont(fo); 
                 b2.setToolTipText("Click to deposit");
                 b2.setSize(100,100);
		 b3 = new JButton ("Balance");
                  b3.setFont(fo); 
                 b3.setToolTipText("Click to see cuurent balance");
                 b3.setSize(100,100);
		 b4 = new JButton ("Withdraw");
                  b4.setFont(fo); 
                 b4.setToolTipText("Click to withdraw");
                 b4.setSize(100,100);
		 b5 = new JButton ("Next");
                  b5.setFont(fo); 
                 b5.setToolTipText("Click to go next");
		  lab = new JLabel("Please choose a transaction. ");
		  Font fo1 = new Font("Serif", Font.BOLD, 20); 
		  lab.setFont(fo1); 
		
		 GridBagConstraints c = new GridBagConstraints();
		 
		 c.insets = new Insets (20,20,20,20);
		 c.gridx = 0;
		 c.gridy = 5;
		 p.add(b1,c);
		 c.gridx = 1;
		 c.gridy = 0;
		 p.add(b2,c);
		 c.gridx = 2;
		 c.gridy = 0;
		 p.add(b3,c);
		 c.gridx = 3;
		 c.gridy = 0;
		 p.add(b4,c);
		 c.gridx = 4;
		 c.gridy = 5;
		 p.add(b5,c);
		 p.add(lab);
		 f.add(p);
		 f.add(lab,BorderLayout.NORTH);
		// f.pack();
		 f.setLocationRelativeTo(null);
		 f.setVisible(true);
              
	   b4.addActionListener((ActionEvent e) -> 
        {
            String amount=JOptionPane.showInputDialog(null,"Insert amount to withdraw:");
         
            transaction t1 =new transaction(); 
            t1.withdraw(amount);
                
        });
       b2.addActionListener((ActionEvent e) -> 
        {
            String amount=JOptionPane.showInputDialog(null,"Insert amount to deposit:");
             //  System.out.println(amount);
             transaction t1 =new transaction(); 
            t1.deposit(amount);
        });
       b3.addActionListener((ActionEvent e) ->      

        {
            transaction tt =new transaction(); 
            tt.recordBalance(tt.getbalance());
            lab.setText("Amount in balance is="+tt.getbalance());
        }); 
       b5.addActionListener((ActionEvent e) -> 
        {
            
            transaction tt =new transaction(); 
            tt.printH(true);
        });
       b1.addActionListener((ActionEvent e) -> 
        {
            transaction tt =new transaction(); 
            tt.printH(false);
        });
        }
    
   
  
}
	
