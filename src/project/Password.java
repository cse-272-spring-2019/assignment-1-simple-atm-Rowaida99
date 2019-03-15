package project;

import java.awt.FlowLayout;
import java.awt.event.*; 
import java.awt.*; 
import java.util.Objects;
import javax.swing.*; 
class Password extends JFrame implements ActionListener {

static JTextField tf;
static JPasswordField pf;
static String pfs;
static JFrame f;
static JButton b;
static JLabel l; 
static String CardID="5828";
static char [] password ;
static String pass="";
 Password(){
	 
 }
	public static void main(String[] args) {
		 f = new JFrame("ATM Machine");
		 l = new JLabel("Welcome ,Please enter your card's ID and PIN.");
		 b = new JButton("submit");
         JLabel jpp= new JLabel("PIN");
		 Password ps = new Password();
		 b.addActionListener( ps); 
		 tf = new JTextField("Enter card's ID here", 16); 
         pf = new JPasswordField(16); 
         pf.setEchoChar('*');
		 Font fo = new Font("Serif", Font.BOLD, 20); 
		 tf.setFont(fo); 
         l.setFont(fo);
		 JPanel p = new JPanel(); 
         p.setBackground(Color.LIGHT_GRAY);
         p.add(l);
         GridBagConstraints c = new GridBagConstraints();
         c.insets = new Insets (20,20,20,20);
		 c.gridx = 1;
		 c.gridy = 7;
		 p.add(tf,c);
         p.add(jpp);
         c.gridx = 1;
		 c.gridy = 7;
	     p.add(pf,c); 
	     p.add(b);  
	     f.getContentPane().add(p); 
	     f.setSize(600,200);
	     // f.pack();
	     f.setLocationRelativeTo(null);
	     f.setVisible(true);
         b.addActionListener((ActionEvent e) -> 
        {
            password= pf.getPassword();
            pass = String.valueOf(password);
            if( Objects.equals(CardID,tf.getText()) &&  pass.equals("5828") )
            {
                GUI use =new GUI();
                use.gui();
                f.dispatchEvent(new WindowEvent(f, WindowEvent.WINDOW_CLOSING));
            }
            else
            {
             JOptionPane.showMessageDialog(null,"Invalid PIN or Card ID entered.","Invalid",JOptionPane.ERROR_MESSAGE);
            }
        });
                
        }
    @Override
    public void actionPerformed(ActionEvent arg0) {
        
    }
}
