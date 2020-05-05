package pro1;
import pro1.Hrmain;


import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class Msubmit extends JFrame {

	private JPanel contentPane;
	private JTextField txt1;
	private JTextField txt2;
	private JTextField txt3;
	private JTextField txt4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Msubmit frame = new Msubmit();
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
	public Msubmit() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 414, 226);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Position");
		lblNewLabel.setBounds(69, 34, 58, 21);
		panel.add(lblNewLabel);
		
		txt1 = new JTextField();
		txt1.setBounds(137, 34, 153, 20);
		panel.add(txt1);
		txt1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("No.of positions");
		lblNewLabel_1.setBounds(38, 73, 89, 14);
		panel.add(lblNewLabel_1);
		
		txt2 = new JTextField();
		txt2.setBounds(137, 70, 153, 20);
		panel.add(txt2);
		txt2.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Min quaification");
		lblNewLabel_2.setBounds(38, 108, 89, 21);
		panel.add(lblNewLabel_2);
		
		txt3 = new JTextField();
		txt3.setBounds(137, 108, 153, 20);
		panel.add(txt3);
		txt3.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Experience");
		lblNewLabel_3.setBounds(61, 140, 66, 21);
		panel.add(lblNewLabel_3);
		
		txt4 = new JTextField();
		txt4.setBounds(137, 140, 153, 20);
		panel.add(txt4);
		txt4.setColumns(10);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
				PrintWriter p=new PrintWriter(new FileWriter("G://iit//requirements12.txt",true));
				p.println("Position:"+txt1.getText());
				p.println("number of positions:"+txt2.getText());
				p.println("minimum qualification:"+txt3.getText());
				p.println("Experience:"+txt4.getText());
				p.println("----------------------------------");
				p.close();  //very important
				
				}
				catch(Exception e1)
				{
					JOptionPane.showMessageDialog(null, "sorry..error");
				}
				
			}
		});
		btnNewButton.setBounds(285, 171, 89, 23);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Hrmain h=new Hrmain();
				h.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(93, 171, 89, 23);
		panel.add(btnNewButton_1);
		
		JLabel lblYears = new JLabel("years");
		lblYears.setBounds(300, 143, 46, 14);
		panel.add(lblYears);
	}

}
