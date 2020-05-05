package pro1;
import pro1.Msubmit;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.imageio.ImageIO;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import java.awt.TextArea;
import javax.swing.JTextPane;

public class Hrmain extends JFrame {

	private JPanel contentPane;
	private JTextField textone;
	private JPasswordField texttwo;
	private JTextField textthree;
	private JPasswordField textfour;
	private JTextField txtname;
	private JTextField txtpname;
	private JTextField txtdob;
	private JTextField txtpost;
	private JTextField txtexp;
	private JTextField txtpic;
	public static String appno;
	public static int c;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Hrmain frame = new Hrmain();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Hrmain() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 11, 414, 239);
		contentPane.add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Production Team", null, panel, null);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Username");
		lblNewLabel.setBounds(49, 41, 69, 21);
		panel.add(lblNewLabel);
		
		textone = new JTextField();
		textone.setBounds(117, 37, 108, 25);
		panel.add(textone);
		textone.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setBounds(49, 88, 46, 14);
		panel.add(lblNewLabel_1);
		
		texttwo = new JPasswordField();
		texttwo.setBounds(117, 83, 108, 25);
		panel.add(texttwo);
		texttwo.setColumns(10);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textone.getText().equals("root") && texttwo.getText().equals("root"))
				{
				
				Msubmit m=new Msubmit();
				m.setVisible(true);
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Oops..wrong Password");
				}
			}
		});
		btnNewButton.setBounds(232, 129, 89, 28);
		panel.add(btnNewButton);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("HR Team", null, panel_1, null);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Username");
		lblNewLabel_2.setBounds(49, 41, 69, 21);
		panel_1.add(lblNewLabel_2);
		
		textthree = new JTextField();
		textthree.setBounds(117, 37, 108, 25);
		panel_1.add(textthree);
		textthree.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Password");
		lblNewLabel_3.setBounds(49, 88, 46, 14);
		panel_1.add(lblNewLabel_3);
		
		textfour = new JPasswordField();
		textfour.setBounds(117, 83, 108, 25);
		panel_1.add(textfour);
		textfour.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Submit");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(textthree.getText().equals("root") && textfour.getText().equals("root"))
				{
				
				Hrfirst1 h=new Hrfirst1();
				h.setVisible(true);
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Oops..wrong Password");
				}
			}
		});
		btnNewButton_1.setBounds(232, 129, 89, 28);
		panel_1.add(btnNewButton_1);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Customer", null, panel_2, null);
		panel_2.setLayout(null);
		
		JLabel lblApplicationForm = new JLabel("application form");
		lblApplicationForm.setBounds(135, 0, 110, 32);
		panel_2.add(lblApplicationForm);
		
		JLabel lblName = new JLabel("name");
		lblName.setBounds(40, 33, 46, 14);
		panel_2.add(lblName);
		
		txtname = new JTextField();
		txtname.setBounds(99, 30, 86, 20);
		panel_2.add(txtname);
		txtname.setColumns(10);
		
		txtpname = new JTextField();
		txtpname.setBounds(99, 61, 86, 20);
		panel_2.add(txtpname);
		txtpname.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Parent name");
		lblNewLabel_4.setBounds(10, 64, 76, 14);
		panel_2.add(lblNewLabel_4);
		
		JLabel lblDob = new JLabel("DOB");
		lblDob.setBounds(40, 93, 46, 14);
		panel_2.add(lblDob);
		
		txtdob = new JTextField();
		txtdob.setBounds(99, 90, 86, 20);
		panel_2.add(txtdob);
		txtdob.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Applying Post");
		lblNewLabel_5.setBounds(10, 118, 76, 14);
		panel_2.add(lblNewLabel_5);
		
		txtpost = new JTextField();
		txtpost.setBounds(99, 115, 86, 20);
		panel_2.add(txtpost);
		txtpost.setColumns(10);
		
		JLabel lblE = new JLabel("experience");
		lblE.setBounds(20, 143, 66, 14);
		panel_2.add(lblE);
		
		txtexp = new JTextField();
		txtexp.setBounds(99, 140, 86, 20);
		panel_2.add(txtexp);
		txtexp.setColumns(10);
		
		JLabel lblPhoto = new JLabel("image");
		lblPhoto.setBounds(255, 18, 46, 14);
		panel_2.add(lblPhoto);
		
		txtpic = new JTextField();
		txtpic.setBounds(226, 43, 86, 20);
		panel_2.add(txtpic);
		txtpic.setColumns(10);
		
		JLabel lblOther = new JLabel("Other details ");
		lblOther.setBounds(202, 74, 76, 14);
		panel_2.add(lblOther);
		TextArea textArea = new TextArea();
		textArea.setBounds(255, 93, 139, 86);
		panel_2.add(textArea);
		 
		JButton btnSubmit = new JButton("submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 c=1;
				try
				{	 
				File f=new File("G:\\iit\\cdetails.txt"
						+ "");
				if(f.exists())
				{
					BufferedReader bf=new BufferedReader(new FileReader("G:\\iit\\cdetails.txt"));
					String content;
					String c1=null;
					while((content=bf.readLine())!=null)
		{
						 c1=content;
		}
					
						String ar[]=c1.split(",");
						
						c=Integer.parseInt(ar[0]);
						c++;

				}
				}
				catch(Exception e)
				{
					JOptionPane.showMessageDialog(null, e);
				}
			
				 appno=String.valueOf(c);
				String name=txtname.getText();
				String parentname=txtpname.getText();
				String DOB=txtdob.getText();
				String post=txtpost.getText();
				String experience=txtexp.getText();
				String others=textArea.getText();
				
					try
					{
					PrintWriter p=new PrintWriter(new FileWriter("G:\\iit\\cdetails.txt",true));
					
					
					String s=String.format("%s,%s,%s,%s,%s,%s",appno,name,parentname,DOB,post,experience);
					p.println(s);
					p.close();
					}
					catch(Exception e)
					{
						JOptionPane.showMessageDialog(null, e);
					}
					try
					{
					PrintWriter p1=new PrintWriter(new FileWriter("G:\\iit\\edetails.txt",true));
					p1.println("Application number:"+appno);
					p1.println("name:"+name);
					p1.println("parentsname:"+parentname);
					p1.println("date of birth:"+DOB);
					p1.println("post"+post);
					p1.println("experience:"+experience);
					p1.println("other details"+others);
					p1.println("---------------------------------");
					p1.close();
					}
					catch(Exception e)
					{
						JOptionPane.showMessageDialog(null, e);
					}
					
				}	
				
		});
		btnSubmit.setBounds(171, 186, 89, 23);
		panel_2.add(btnSubmit);
		
		JButton btnUpload = new JButton("upload");
		btnUpload.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				
				int width = 963;    //width of the image 
			        int height = 640;   //height of the image 
			  
			        // For storing image in RAM 				/				/try mele hakidre error
			        BufferedImage image = null; 
			  
			        // READ IMAGE 
			        try
			        {
			     
			        	 c=Integer.parseInt(appno);
			            File input_file = new File(txtpic.getText()); //image file path 
			  
			            /* create an object of BufferedImage type and pass 
			               as parameter the width,  height and image int 
			               type.TYPE_INT_ARGB means that we are representing 
			               the Alpha, Red, Green and Blue component of the 
			               image pixel using 8 bit integer value. */
			            image = new BufferedImage(width, height, 
			                                    BufferedImage.TYPE_INT_ARGB); 
			  
			             // Reading input file 
			            image = ImageIO.read(input_file); 
			  
			            System.out.println("Reading complete."); 
			        } 
			        catch(Exception e) 
			        { 
			        	
			        	JOptionPane.showMessageDialog(null,"press submit beore upload!!" );
			        }
			        try
			        { 
			            // Output file path 
			            File output_file = new File("G://iit//"+c+".jpg"); 
			  
			            // Writing to file taking type and path as 
			            ImageIO.write(image, "jpg", output_file); 
			  
			            System.out.println("Writing complete."); 
			        } 
			        catch(IOException e) 
			        { 
			        
			        	JOptionPane.showMessageDialog(null,"Press submit before upload!!");
			        } 
			    
			}
		});
		btnUpload.setBounds(320, 42, 89, 23);
		panel_2.add(btnUpload);
		
		
	
		
		
	}
}
