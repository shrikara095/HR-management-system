package pro1;
import pro1.Hrmain;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class viewcv1 extends JFrame {

	private JPanel contentPane;
	private JTextField textano;
	private JTextField textexp;
	private JTextField textpost;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					viewcv1 frame = new viewcv1();
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
	public viewcv1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("view result");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				viewcv2 c=new viewcv2();
				c.setVisible(true);
			}
		});
		btnNewButton.setBounds(206, 229, 135, 23);
		contentPane.add(btnNewButton);
		
		JButton btnSubmit = new JButton("select candidate");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				new jframe(textpost.getText(),textexp.getText()).setVisible(true);
			
				
			}
			
		});
		btnSubmit.setBounds(168, 130, 135, 23);
		contentPane.add(btnSubmit);
		
		JLabel lblNewLabel = new JLabel("enter appno");
		lblNewLabel.setBounds(32, 167, 86, 14);
		contentPane.add(lblNewLabel);
		
		textano = new JTextField();
		textano.setBounds(128, 164, 86, 20);
		contentPane.add(textano);
		textano.setColumns(10);
		
		JButton btnView = new JButton("view photo");
		btnView.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
				DisplayImage d=new DisplayImage(textano.getText());
			
				}
				catch(Exception e4)
				{
					
				}
			}
		});
		btnView.setBounds(196, 195, 107, 23);
		contentPane.add(btnView);
		
		textpost = new JTextField();
		textpost.setBounds(146, 68, 86, 20);
		contentPane.add(textpost);
		textpost.setColumns(10);
		
		textexp = new JTextField();
		textexp.setBounds(146, 99, 86, 20);
		contentPane.add(textexp);
		textexp.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("post");
		lblNewLabel_1.setBounds(69, 71, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("experience");
		lblNewLabel_2.setBounds(69, 102, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton_1 = new JButton("view complete details");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				viewcv3 c=new viewcv3();
				c.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(21, 11, 135, 23);
		contentPane.add(btnNewButton_1);
	
	}
}
