package pro1;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class jframe extends JFrame implements ActionListener, Runnable {

	private static final long serialVersionUID = 1L;
	JTable tab;
	JProgressBar p;
	JButton bt;
	public static void main(String[] args)
	{
		
		//Thread	thread =new Thread(this);
		//thread.start();
		}
		public jframe(String s,String s2)
		{
			 
			
			super("shri");
			 
			String a=s;
			String a1=s2;
			setSize(400,400);
			setResizable(true);
			setLayout(new FlowLayout());
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			bt=new JButton("submit");
			 p=new JProgressBar();
			
			bt.addActionListener(this);
			
			try
			{
			BufferedReader br=new BufferedReader(new FileReader("G://iit//cdetails.txt"));
			ArrayList<String> list=new ArrayList<String>();
			String content;
			while((content=br.readLine())!=null)
			{
			list.add(content);
			}
			br.close();
			int i=0;
			String ar2[][]=new String[list.size()][7];
			String ar1[][]=new String[list.size()][7];
			for(i=0;i<list.size();i++)
			{
				
			String sp=(String)list.get(i);
			String val[]=sp.split(",");
		
			ar2[i][0]=val[0];
			ar2[i][1]=val[1];
			ar2[i][2]=val[2];
			ar2[i][3]=val[3];
			ar2[i][4]=val[4];
			ar2[i][5]=val[5];
			ar2[i][6]="";
			
			}
			
			if(!(a.equals("") && a1.equals("")))
					{
				for(i=0;i<list.size();i++)
				{

					if(a.equals(ar2[i][4]) || a1.equals(ar2[i][5]))
					{
				String sp=(String)list.get(i);
				String val[]=sp.split(",");
				System.out.println(ar1[i][0]=val[0]);
				System.out.println(ar1[i][1]=val[1]);
				System.out.println(ar1[i][2]=val[2]);
				System.out.println(ar1[i][3]=val[3]);
				System.out.println(ar1[i][4]=val[4]);
				System.out.println(ar1[i][5]=val[5]);
				System.out.println(ar1[i][6]="");
					}
				}
				String header[]= {"appno","name","parentname","DOB","Post","experience","status"};
				
			       tab = new JTable( ar1 , header);
			      add(tab);
			     JScrollPane jsp = new JScrollPane( tab, 21 , 31 );
			     jsp.setPreferredSize(new Dimension(480, 300));
			      add(jsp);
				}
				
			    else
				{

					for(i=0;i<list.size();i++)
					{
						String sp=(String)list.get(i);
						String val[]=sp.split(",");
					
						System.out.println(ar1[i][0]=val[0]);
						System.out.println(ar1[i][1]=val[1]);
						System.out.println(ar1[i][2]=val[2]);
						System.out.println(ar1[i][3]=val[3]);
						System.out.println(ar1[i][4]=val[4]);
						System.out.println(ar1[i][5]=val[5]);
						System.out.println(ar1[i][6]="");
						}
						String header[]= {"appno","name","parentname","DOB","Post","experience","status"};
						
					     tab = new JTable( ar1 , header);
					     
					      add(tab);
					     JScrollPane jsp = new JScrollPane( tab, 20 , 30 );
					     jsp.setPreferredSize(new Dimension(480, 300));
					      add(jsp);
						}
					
						}
				
			
			

			catch(Exception e)
			{
				
			}
			
			add(bt);
			add(p);
			
	 }
		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			Thread th=new Thread(this);
			th.start();
			bt.setEnabled(false);
			System.out.println("hell123");
			
			
		}
		@Override
		public void run() {
			// TODO Auto-generated method stub
			try {
				
				PrintWriter p1=new PrintWriter(new FileWriter("G://iit//cdetails.txt"));
				int rows=tab.getRowCount();
				p.setMaximum(rows);
				int i=0;
				for( i=0;i<rows;i++) {
					
					String f1=(String)tab.getValueAt(i, 0);
					String f2=(String)tab.getValueAt(i, 1);
					String f3=(String)tab.getValueAt(i, 2);
					String f4=(String)tab.getValueAt(i, 3);
					String f5=(String)tab.getValueAt(i, 4);
					String f6=(String)tab.getValueAt(i, 5);
					String f9=(String)tab.getValueAt(i, 6);
	
					
					p1.println(f1+","+f2+","+f3+","+f4+","+f5+","+f6+","+f9);
					int j=i;
					p.setValue(j+1);
					
					
					try
					{
						Thread.sleep(300);
					}
					catch(Exception e4)
					{
					}
					}
				p1.close();
			}
			catch(Exception e5)
			{
				
			}
			
			finally
			{
				p.setValue(0);
				bt.setEnabled(true);
			}
			
		}
		
}
