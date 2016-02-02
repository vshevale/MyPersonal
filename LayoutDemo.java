
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 * 
 * @author vshevale
 *
 */
public class LayoutDemo extends JPanel implements ActionListener
{
	private static final long serialVersionUID = 1L;
	
	private JButton btnLogin;
	    private JButton btnCancel;
	    private JLabel label0;
	    private JLabel label1;
	    private JTextField txtUsername;
	    private JPasswordField txtPassword;

	    public LayoutDemo()
	    {
	        //construct components
	        btnLogin = new JButton ("Submit");
	        btnCancel = new JButton ("Cancel");
	        label0 = new JLabel ("Username");
	        label1 = new JLabel ("Password");
	        txtUsername = new JTextField();
	        txtPassword = new JPasswordField();

	        //adjust size and set layout
	        setPreferredSize (new Dimension (345, 227));
	        setLayout (null);

	        //add components
	        add (btnLogin);
	        add (btnCancel);
	        add (label0);
	        add (label1);
	        add (txtUsername);
	        add (txtPassword);

	        //set component bounds (only needed by Absolute Positioning)
	        btnLogin.setBounds (85, 160, 100, 20);
	        btnCancel.setBounds (200, 160, 100, 20);
	        label0.setBounds (50, 55, 100, 25);
	        label1.setBounds (50, 105, 100, 25);
	        txtUsername.setBounds (145, 60, 145, 25);
	        txtPassword.setBounds (145, 105, 145, 25);
	        
	        btnLogin.addActionListener(this);
	        btnCancel.addActionListener(this);
	    }


	    public static void main (String[] args) {
	        JFrame frame = new JFrame ("Please Login");
	        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
	        frame.getContentPane().add(new LayoutDemo());
	        frame.pack();
	        frame.setVisible (true);
	    }
	    
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource() == btnLogin)
			System.out.println("Login Pressed");
		if(e.getSource() == btnCancel)
			System.out.println("Cancel Pressed");
	}
}
