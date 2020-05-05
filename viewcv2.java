package pro1;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.StringTokenizer;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JButton;

public class viewcv2 extends JFrame implements ActionListener {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					viewcv2 frame = new viewcv2();
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
	public viewcv2() {
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
			BufferedReader b=new BufferedReader(new FileReader("G://iit//cdetails.txt"));
			String content;
			while((content=b.readLine())!=null)
			{
				StringTokenizer str=new StringTokenizer(content,",");
				//System.out.println(str.toString());
				while(str.hasMoreElements())
				{
					a.append(str.nextToken()); 
					a.append("\n");// or str.nextelement()
				}
				a.append("-------------------------------");
				a.append("\n");
				//a.read
			}
				
				//a.read(b,null);
				//b.close();
				//a.requestFocus();
				
			
			b.close();
		}
		catch(Exception e3)
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
