import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CreateCustomerUI extends JPanel implements ActionListener
{
	private JLabel lblFirstname;
	private JLabel lblLastname;
	private JTextField txtFirstname;
	private JTextField txtLastname;
	private JLabel lblEmailid;
	private JTextField txtEmailid;
	private JLabel lblContactno;
	private JTextField txtContactno;
	private JButton btnRegister;
	private JButton btnCancel;

	public CreateCustomerUI() {
		// construct components
		lblFirstname = new JLabel("Firstname");
		lblLastname = new JLabel("Lastname");
		txtFirstname = new JTextField(5);
		txtLastname = new JTextField(5);
		lblEmailid = new JLabel("Email ID");
		txtEmailid = new JTextField(5);
		lblContactno = new JLabel("Contact No");
		txtContactno = new JTextField(5);
		btnRegister = new JButton("Register");
		btnCancel = new JButton("Cancel");

		// adjust size and set layout
		setPreferredSize(new Dimension(309, 253));
		setLayout(null);

		// add components
		add(lblFirstname);
		add(lblLastname);
		add(txtFirstname);
		add(txtLastname);
		add(lblEmailid);
		add(txtEmailid);
		add(lblContactno);
		add(txtContactno);
		add(btnRegister);
		add(btnCancel);

		// set component bounds (only needed by Absolute Positioning)
		lblFirstname.setBounds(30, 30, 100, 25);
		txtFirstname.setBounds(110, 30, 155, 25);
		
		lblLastname.setBounds(30, 70, 100, 25);
		txtLastname.setBounds(110, 70, 155, 25);
		
		lblEmailid.setBounds(30, 110, 100, 25);
		txtEmailid.setBounds(110, 110, 155, 25);
		
		lblContactno.setBounds(30, 150, 100, 25);
		txtContactno.setBounds(110, 150, 155, 25);
		
		btnRegister.setBounds(55, 190, 100, 25);
		btnCancel.setBounds(165, 190, 100, 25);
		
		btnRegister.addActionListener(this);
		btnCancel.addActionListener(this);
	}

	public static void main(String[] args) {
		JFrame frame = new JFrame("Register New Customer");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(new CreateCustomerUI());
		frame.pack();
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource() == btnRegister)
		{
			System.out.println("Register Button Pressed");
		}
		if(e.getSource() == btnCancel)
		{
			System.out.println("Cancel Button Pressed");
		}
		
	}
}
