import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class VishalDemo 
{
	JPanel pnPanel0;
	JTextField tfTxt_username;
	JLabel lbLabel0;
	JLabel lbLabel1;
	JTextField tfTxt_password;
	JButton btLogin;
	JButton btCancel;

	public VishalDemo()
	{
		pnPanel0 = new JPanel();
		pnPanel0.setBorder( BorderFactory.createTitledBorder( "" ) );
		pnPanel0.setBounds(0, 0, 100, 100);
		GridBagLayout gbPanel0 = new GridBagLayout();
		GridBagConstraints gbcPanel0 = new GridBagConstraints();
		pnPanel0.setLayout( gbPanel0 );
		
		tfTxt_username = new JTextField( );
		gbcPanel0.gridx = 8;
		gbcPanel0.gridy = 4;
		gbcPanel0.gridwidth = 10;
		gbcPanel0.gridheight = 2;
		gbcPanel0.fill = GridBagConstraints.BOTH;
		gbcPanel0.weightx = 1;
		gbcPanel0.weighty = 0;
		gbcPanel0.anchor = GridBagConstraints.NORTH;
		gbPanel0.setConstraints( tfTxt_username, gbcPanel0 );
		pnPanel0.add( tfTxt_username );

		lbLabel0 = new JLabel( "Username"  );
		gbcPanel0.gridx = 2;
		gbcPanel0.gridy = 4;
		gbcPanel0.gridwidth = 4;
		gbcPanel0.gridheight = 2;
		gbcPanel0.fill = GridBagConstraints.BOTH;
		gbcPanel0.weightx = 1;
		gbcPanel0.weighty = 1;
		gbcPanel0.anchor = GridBagConstraints.NORTH;
		gbPanel0.setConstraints( lbLabel0, gbcPanel0 );
		pnPanel0.add( lbLabel0 );

		lbLabel1 = new JLabel( "Password"  );
		gbcPanel0.gridx = 2;
		gbcPanel0.gridy = 7;
		gbcPanel0.gridwidth = 4;
		gbcPanel0.gridheight = 2;
		gbcPanel0.fill = GridBagConstraints.BOTH;
		gbcPanel0.weightx = 1;
		gbcPanel0.weighty = 1;
		gbcPanel0.anchor = GridBagConstraints.NORTH;
		gbPanel0.setConstraints( lbLabel1, gbcPanel0 );
		pnPanel0.add( lbLabel1 );

		tfTxt_password = new JTextField( );
		gbcPanel0.gridx = 8;
		gbcPanel0.gridy = 7;
		gbcPanel0.gridwidth = 10;
		gbcPanel0.gridheight = 2;
		gbcPanel0.fill = GridBagConstraints.BOTH;
		gbcPanel0.weightx = 1;
		gbcPanel0.weighty = 0;
		gbcPanel0.anchor = GridBagConstraints.NORTH;
		gbPanel0.setConstraints( tfTxt_password, gbcPanel0 );
		pnPanel0.add( tfTxt_password );

		btLogin = new JButton( "Login"  );
		gbcPanel0.gridx = 9;
		gbcPanel0.gridy = 11;
		gbcPanel0.gridwidth = 5;
		gbcPanel0.gridheight = 2;
		gbcPanel0.fill = GridBagConstraints.BOTH;
		gbcPanel0.weightx = 1;
		gbcPanel0.weighty = 0;
		gbcPanel0.anchor = GridBagConstraints.NORTH;
		gbPanel0.setConstraints( btLogin, gbcPanel0 );
		pnPanel0.add( btLogin );

		btCancel = new JButton( "Cancel"  );
		gbcPanel0.gridx = 15;
		gbcPanel0.gridy = 11;
		gbcPanel0.gridwidth = 1;
		gbcPanel0.gridheight = 2;
		gbcPanel0.fill = GridBagConstraints.BOTH;
		gbcPanel0.weightx = 1;
		gbcPanel0.weighty = 0;
		gbcPanel0.anchor = GridBagConstraints.NORTH;
		gbPanel0.setConstraints( btCancel, gbcPanel0 );
		pnPanel0.add( btCancel );
		
		pnPanel0.setVisible(true);
		pnPanel0.setSize(400,400);
	}
	
	public static void main(String[] args) 
	{
		new VishalDemo();
	}
}
