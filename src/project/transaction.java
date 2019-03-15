package project;

import javax.swing.*;
import java.awt.event.*;
public class transaction{
    static int i;
    static String[] arr= new String [5];
	static private double balance=0.0;
	
public transaction() {
		// TODO Auto-generated constructor stub
	}
public void withdraw(String amount) {
	try {
   amount= amount+".0";
   double amountd=Double.parseDouble(amount);
//   System.out.println("double amount when withdraw= "+amountd);
	if(amountd>balance) {
        error(false);
	}
	else {
	balance-=amountd;
    for(i=0;i<4;i++){
      
    	arr[i]=arr[i+1];
    }
    i=5;
    arr[4]="Record of withdraw transactions with amount: " + amount;
   
    }
	}catch(Exception e){
     error(false);
	}
}
public void deposit(String amount) {
	try {
    amount= amount+".0";
    double amountd=Double.parseDouble(amount);
  //  System.out.println("double amount when deposit = "+amountd);
    if(amountd>0)
    {
        balance+=amountd;
    
    for(i=0;i<4;i++){
     
    	arr[i]=arr[i+1];
    }
    i=5;
    arr[4]="Record of deposit transactions with amount: " + amount;
    }
    else
	error(false);
	}catch(Exception e){
		error(false);
		
	}
}
public double getbalance() {
	
	return balance;
}
public void recordBalance(double balance){
     for(i=0;i<4;i++){
    	 arr[i]=arr[i+1];
    }
    i=5;
     arr[4]="Record of balance transactions with amount: " + Double.toString(getbalance());
    
}
public void error(boolean x){
  
    if(!x)
    {
   
  JOptionPane.showMessageDialog(null,"Invalid amount inserted,please insert a valid amount.","Invalid",JOptionPane.ERROR_MESSAGE);
         
    }
}
public void printH(Boolean x){ 

        JFrame f= new JFrame("History");
        f.setSize(600,400);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        f.setVisible(true); 
        JPanel p =new JPanel();
        JLabel l = new JLabel(" ");
        p.add(l);
        f.add(p);   
   
    if(x){
         p.setName("next");
        if(i<4)
            {
        	i++;
                l.setText(""+arr[i]);
            }
            else
                l.setText("No next to show,Choose Previuos");
    }
        else{
                p.setName("Previous");  
            i--;
          
            {
                  l.setText(""+arr[i]);
            }
            }
}
}
