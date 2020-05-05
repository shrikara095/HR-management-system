package pro1;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

public class viewcv3 extends JFrame implements ActionListener
{

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					viewcv3 frame = new viewcv3();
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
	public viewcv3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		JTextArea a=new JTextArea(20,30);
		contentPane.add(a, BorderLayout.CENTER);
		
		JScrollPane s=new JScrollPane(a,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		contentPane.add(s, BorderLayout.CENTER);
		JPanel p=new JPanel();
		JButton btnBack = new JButton("back");
		p.add(btnBack);
		contentPane.add(BorderLayout.SOUTH,p);
		btnBack.addActionListener(this);
		try
		{
			BufferedReader b=new BufferedReader(new FileReader("G://iit//edetails.txt"));
			String content;
			while((content=b.readLine())!=null)
			{
				a.append(content);
				a.append("\n");
			}
			b.close();
		}
		catch(Exception e6)
		{
			JOptionPane.showMessageDialog(null,"sorry...error");
		}
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		viewcv1 c=new viewcv1();
		c.setVisible(true);
		
	}

}
