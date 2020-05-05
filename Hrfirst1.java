package pro1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Hrfirst1 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Hrfirst1 frame = new Hrfirst1();
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
	public Hrfirst1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		JTextArea texta = new JTextArea(20,20);
		contentPane.add(texta, BorderLayout.CENTER);
		JScrollPane s=new JScrollPane(texta,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		contentPane.add(s, BorderLayout.CENTER);
		
		JButton b1 = new JButton("view requierments");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
					BufferedReader b=new BufferedReader(new FileReader("G://iit//requirements12.txt"));
					//String content;
						
						texta.read(b,null);
						b.close();
						texta.requestFocus();
						
					
					b.close();
				}
				catch(Exception e3)
				{
					JOptionPane.showMessageDialog(null,"sorry...error");
				}
			}
		});
		//contentPane.add(btnNewButton, BorderLayout.WEST);
		JPanel p=new JPanel();
		p.add(b1);
		JButton b2 = new JButton("view cv");
		b2.setAlignmentX(CENTER_ALIGNMENT);
		//contentPane.add(b2, BorderLayout.NORTH);
		
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				viewcv1 c=new viewcv1();
				c.setVisible(true);
				
			}
		});
		//btnNewButton
		//contentPane.add(btnNewButton_1, BorderLayout.EAST);
	
		JButton b3= new JButton("BACK");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		//contentPane.add(btnNewButton, BorderLayout.SOUTH);
		p.add(b2);
		p.add(b3);
		contentPane.add(BorderLayout.SOUTH,p);
		
		
		
	
		
	}

}
