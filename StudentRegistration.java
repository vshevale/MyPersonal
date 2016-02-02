
import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.Vector;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

public class StudentRegistration extends JFrame implements ActionListener 
{
	private static final long serialVersionUID = 1L;
	
	JSpinner DD,MM,YY;
	JLabel name,qualification,subject,bdt,gender,selectsub,selectedsub,info;
    JTextField txtname;
    JComboBox<String> comboqualification;
    JList listSub1,listSub2;
    JButton register,add,remove,reset;
    JRadioButton button1; 
    JRadioButton button2; 
    Object selectionValues[];
    Vector <Object> data;
    Vector <Object> data2;
    JPanel jp1;
    GridBagLayout gbl;
    GridBagConstraints gbc;
    int currentYear;
	public StudentRegistration() 
	{
		super("Student Registration Form");
		Container cp=getContentPane();
		jp1=new JPanel();
		gbl = new GridBagLayout();
		gbc = new GridBagConstraints();
		jp1.setLayout(gbl);
		
		name=new JLabel("Name");
		gbc.fill=GridBagConstraints.HORIZONTAL;
		gbc.gridx=0;
		gbc.gridy=0;
		gbc.gridwidth=2;
		gbl.setConstraints(name, gbc);
				
		txtname=new JTextField(10);
		gbc.gridx=1;
		gbc.gridy=0;
		gbc.gridwidth=2;
		gbl.setConstraints(txtname, gbc);
		
		
		setVisible(true);
		
		
		bdt = new JLabel("Birthdate :");
		gbc.gridx=0;
		gbc.gridy=1;
		gbc.gridwidth=2;
		gbl.setConstraints(bdt, gbc);
		
		
		Calendar calendar = Calendar.getInstance();
		currentYear = calendar.get(Calendar.YEAR);
		SpinnerModel yearModel = new SpinnerNumberModel(currentYear,currentYear - 100,currentYear + 100,1);
		SpinnerModel dateModel =new SpinnerNumberModel(1,1,31,1);
		SpinnerModel monthModel=new SpinnerNumberModel(1,1,12,1);
		
		DD=new JSpinner(dateModel);
		
		gbc.gridx=1;
		gbc.gridy=1;
		gbc.gridwidth=1;
		gbl.setConstraints(DD, gbc);
		
		MM=new JSpinner(monthModel);
		
		gbc.gridx=2;
		gbc.gridy=1;
		gbc.gridwidth=1;
		gbl.setConstraints(MM, gbc);
				
		
		YY=new JSpinner(yearModel);
		
		gbc.gridx=3;
		gbc.gridy=1;
		gbc.gridwidth=1;
		gbl.setConstraints(YY, gbc);
		
		
		qualification=new JLabel("Qualification");
		gbc.gridx=0;
		gbc.gridy=2;
		gbl.setConstraints(qualification, gbc);
		
		
		comboqualification=new JComboBox();
		
		
		gbc.gridx=1;
		gbc.gridy=2;
		gbl.setConstraints(comboqualification, gbc);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	    comboqualification.addItem("BCA");
	    comboqualification.addItem("BCS");
	    comboqualification.addItem("BE");
	    comboqualification.addItem("ME");
	    comboqualification.addItem("MCA");
	    comboqualification.addItem("MCS");
	    comboqualification.addItem("MCM");
	    	    
	    comboqualification.setEditable(true);//why set editable?
	    setVisible(true);
	    
	    
	    gender=new JLabel("Gender");
	    gbc.gridx=0;
	    gbc.gridy=3;
	    gbl.setConstraints(gender, gbc);
	    
	     button1 = new JRadioButton("Male");
	     	
			gbc.gridx=1;
			gbc.gridy=3;
			gbl.setConstraints(button1, gbc);
	     button2 = new JRadioButton("Female");
	     	
			gbc.gridx=2;
			gbc.gridy=3;
			gbl.setConstraints(button2, gbc);
	     ButtonGroup buttonGroup = new ButtonGroup();
	     buttonGroup.add(button1);
	     buttonGroup.add(button2);
	     button1.setSelected(true);
	     
		 setVisible(true);
		 
		 
		 selectsub=new JLabel("Select subjects");
		 	gbc.gridx=0;
		    gbc.gridy=4;
		    gbc.gridwidth=2;
		    gbl.setConstraints(selectsub, gbc);
		selectedsub=new JLabel("Selected subjects");
		 	gbc.gridx=2;
		    gbc.gridy=4;
		    gbc.gridwidth=1;
		    gbl.setConstraints(selectedsub, gbc);
		 
		data=new Vector<Object> ();
		data2=new Vector<Object>();
		data.addElement("JAVA");
		data.addElement("DotNet");
		data.addElement("Testing");
		data.addElement("Web Designing");
		listSub1=new JList(data);
		gbc.gridx=0;
		gbc.gridy=5;
		gbc.gridheight=2;
		
		gbl.setConstraints(listSub1, gbc);
		
		
		
				int cellWidth = 200;
				listSub1.setFixedCellWidth(cellWidth);
				int cellHeight = 18;
				listSub1.setFixedCellHeight(cellHeight);
				
				gbc.gridx=0;
				gbc.gridy=5;
				


				pack();
				setVisible(true);
				
				JPanel buttonpanel=new JPanel();
				buttonpanel.setLayout(new GridLayout(2,1,25,5));
				gbc.gridx=1;
				gbc.gridy=5;
			
				gbc.fill=GridBagConstraints.BOTH;
				
				gbl.setConstraints(buttonpanel, gbc);
				add=new JButton(">>");
					
				add.addActionListener(this);
				
				remove=new JButton("<<");
				remove.addActionListener(this);
				
				
				setVisible(true);
					
				buttonpanel.add(add);
				buttonpanel.add(remove);
				
				listSub2=new JList();
				cellWidth = 200;
				listSub2.setFixedCellWidth(cellWidth);
				cellHeight = 18;
				listSub2.setFixedCellHeight(cellHeight);
				
				gbc.gridx=2;
				gbc.gridy=5;
				gbc.gridheight=2;
				gbc.fill=GridBagConstraints.BOTH;
				gbl.setConstraints(listSub2, gbc);
			
				setVisible(true);
				 
				
				
				
				register=new JButton("Register");
				
				
				gbc.gridx=0;
				gbc.gridy=7;
				gbc.fill=GridBagConstraints.CENTER;
				gbl.setConstraints(register, gbc);
				
				
				reset=new JButton("Reset");
				
				
				gbc.gridx=1;
				gbc.gridy=7;
				gbl.setConstraints(reset, gbc);
				
				jp1.add(name);
				jp1.add(txtname);
				
				jp1.add(bdt);
				jp1.add(DD);
				jp1.add(MM);
				jp1.add(YY);
			    	    
				jp1.add(qualification);
			    jp1.add(comboqualification);
		     
			   
			    jp1.add(gender);
			    jp1.add(button1);
			    jp1.add(button2);
			    
			    jp1.add(selectsub);
			    jp1.add(selectedsub);
			    jp1.add(listSub1);
				
			    jp1.add(buttonpanel);
				
				
				jp1.add(listSub2);	
				jp1.add(register);
				jp1.add(reset);
				
				cp.add(jp1);
				register.addActionListener(this);
				reset.addActionListener(this);
	}
	public static void main(String[] args) 
	{
		StudentRegistration s=new StudentRegistration();
		s.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		JLabel lblnm,lblbd,lblgender,lblsub;
		if(e.getSource()==add)
		{
			System.out.println("inside add");
			//collected all selected values
			
			Object []listitems1=listSub1.getSelectedValues();
			
			//iterated through the values and then added to data2 
			for (Object object : listitems1) {
				data2.addElement(object);
			}	
			
			//added data2 to second list
			listSub2.setListData(data2);
			
			//for removing elements from the list
			int []selectedindices=listSub1.getSelectedIndices();
			for (int i=selectedindices.length-1;i>-1;i--) {
				
				data.removeElementAt(selectedindices[i]);	
			}
			listSub1.setListData(data);			
		}
		if(e.getSource()==remove)
		{
			System.out.println("inside remove");
			Object []listitems2=listSub2.getSelectedValues();
			
			for (Object object : listitems2) {
				data.addElement(object);
			}	
			listSub1.setListData(data);
			int []selectedindices=listSub2.getSelectedIndices();
			for (int i=selectedindices.length-1;i>-1;i--) {
				
				data2.removeElementAt(selectedindices[i]);	
			}
			listSub2.setListData(data2);
			
		}
		if(e.getSource()==register)
		{
			System.out.println("inside Register");
			String gender,nm,Bd,sub;
			nm=txtname.getText();
			Bd=DD.getValue()+"/"+MM.getValue()+"/"+YY.getValue();
			sub=data2.toString();
			if(button1.isSelected())
				gender="Male";
			else
				gender="Female";
			lblnm=new JLabel("Student name ="+nm);
			lblbd=new JLabel("Birthdate ="+Bd);
			lblgender=new JLabel("Gender ="+gender);
			lblsub=new JLabel("Selected Subjects ="+sub);
				
		}
		if(e.getSource()==reset)
		{
			System.out.println("inside reset");
			txtname.setText("");
			DD.setValue(1);
			MM.setValue(1);
			YY.setValue(currentYear);
			data=new Vector<Object>();
				data.addElement("JAVA");
				data.addElement("DotNet");
				data.addElement("Testing");
				data.addElement("Web Designing");
			listSub1.setListData(data);
			
			Object obj[]=listSub1.getComponents();
			System.out.println(obj.toString());
			System.out.println(data.toString());
			data2.removeAllElements();
			listSub2.setListData(data2);
			comboqualification.setSelectedIndex(0);
			button1.setSelected(true);
			validate();
		}
		
		validate();
		//tree=null;
		lblnm=null;
		lblbd=null;
		lblgender=null;
		lblsub=null;
	}
		
}