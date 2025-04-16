//Calculator Demo
import java.awt.*;
import java.awt.event.*;
class CalculatorDemo extends Frame implements ActionListener
{
	Panel p1,p2;
	Label lblR;
	Button btn7,btn8,btn9,btnA,btn4,btn5,btn6,btnS,btn1,btn2,btn3,btnM,btn0,btnC,btnE,btnD;
	
	double x=0.0,y=0.0,z=0.0;
	int op=0;
	
	public CalculatorDemo()
	{
		super("Calculator Demo");
		addWindowListener(new WindowAdapter()
							{
								public void windowClosing(WindowEvent we)
								{
									System.exit(0);
								}
							}
						 );
		setSize(300,500);
        setResizable(false);
		
		Dimension size=Toolkit.getDefaultToolkit().getScreenSize();
		int x=(int)size.getWidth();
		int y=(int)size.getHeight();
		setBounds((x/2)-(300/2),(y/2)-(500/2),300,500);
		
		p1=new Panel();
		p2=new Panel();
		
		lblR=new Label("0",Label.RIGHT);
		
		btn7=new Button("7");
		btn8=new Button("8");
		btn9=new Button("9");
		btnA=new Button("+");
		
		btn4=new Button("4");
		btn5=new Button("5");
		btn6=new Button("6");
		btnS=new Button("-");
		
		btn1=new Button("1");
		btn2=new Button("2");
		btn3=new Button("3");
		btnM=new Button("*");
		
		btn0=new Button("0");
		btnC=new Button("C");
		btnE=new Button("=");
		btnD=new Button("/");
		
		p1.setFont(new Font("serif",Font.PLAIN,68));
		p1.setLayout(new BorderLayout());
		p1.add(lblR,BorderLayout.NORTH);
		
		p2.setFont(new Font("serif",Font.BOLD,36));
		p2.setLayout(new GridLayout(4,4));
		p2.add(btn7);
		p2.add(btn8);
		p2.add(btn9);
		p2.add(btnA);
		p2.add(btn4);
		p2.add(btn5);
		p2.add(btn6);
		p2.add(btnS);
		p2.add(btn1);
		p2.add(btn2);
		p2.add(btn3);
		p2.add(btnM);
		p2.add(btn0);
		p2.add(btnC);
		p2.add(btnE);
		p2.add(btnD);
		
		setLayout(new BorderLayout());
		add(p1,BorderLayout.NORTH);
		add(p2,BorderLayout.CENTER);
		
		btn7.addActionListener(this);
		btn8.addActionListener(this);
		btn9.addActionListener(this);
		btnA.addActionListener(this);
		btn4.addActionListener(this);
		btn5.addActionListener(this);
		btn6.addActionListener(this);
		btnS.addActionListener(this);
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		btnM.addActionListener(this);
		btn0.addActionListener(this);
		btnC.addActionListener(this);
		btnE.addActionListener(this);
		btnD.addActionListener(this);
		
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==btn7)
		{
			x=Double.valueOf(lblR.getText());
			x=x*10+7;
			lblR.setText(String.valueOf(x));
		}			
		
		if(ae.getSource()==btn8)
		{
			x=Double.valueOf(lblR.getText());
			x=x*10+8;
			lblR.setText(String.valueOf(x));
		}
		
		if(ae.getSource()==btn9)
		{
			x=Double.valueOf(lblR.getText());
			x=x*10+9;
			lblR.setText(String.valueOf(x));
		}
				
		if(ae.getSource()==btn6)
		{
			x=Double.valueOf(lblR.getText());
			x=x*10+6;
			lblR.setText(String.valueOf(x));
		}			
		
		if(ae.getSource()==btn5)
		{
			x=Double.valueOf(lblR.getText());
			x=x*10+5;
			lblR.setText(String.valueOf(x));
		}
		
		if(ae.getSource()==btn4)
		{
			x=Double.valueOf(lblR.getText());
			x=x*10+4;
			lblR.setText(String.valueOf(x));
		}			
		
		if(ae.getSource()==btn3)
		{
			x=Double.valueOf(lblR.getText());
			x=x*10+3;
			lblR.setText(String.valueOf(x));
		}
		
		if(ae.getSource()==btn2)
		{
			x=Double.valueOf(lblR.getText());
			x=x*10+2;
			lblR.setText(String.valueOf(x));
		}			
		
		if(ae.getSource()==btn1)
		{
			x=Double.valueOf(lblR.getText());
			x=x*10+1;
			lblR.setText(String.valueOf(x));
		}
		
		if(ae.getSource()==btn0)
		{
			x=Double.valueOf(lblR.getText());
			x=x*10+0;
			lblR.setText(String.valueOf(x));
		}			
		
		if(ae.getSource()==btnC)
		{
			x=Double.valueOf(lblR.getText());
			x=Math.floor(x/10);
			lblR.setText(String.valueOf(x));
		}			
	
		if(ae.getSource()==btnA)
		{
			y=x;
			x=0.0;
			lblR.setText(String.valueOf(x));
			op=1;
		}		

		if(ae.getSource()==btnS)
		{
			y=x;
			x=0.0;
			lblR.setText(String.valueOf(x));
			op=2;
		}
		
		if(ae.getSource()==btnM)
		{
			y=x;
			x=0.0;
			lblR.setText(String.valueOf(x));
			op=3;
		}
		
		if(ae.getSource()==btnD)
		{
			y=x;
			x=0.0;
			lblR.setText(String.valueOf(x));
			op=4;
		}
		
		if(ae.getSource()==btnE)
		{
			if(op==1)
			{
				z=y+x;
			}
			if(op==2)
			{
				z=y-x;
			}
			if(op==3)
			{
				z=y*x;
			}
			if(op==4)
			{
				z=y/x;
			}
			
			lblR.setText(String.valueOf(z));
			x=z;
		}
	}
	
}
 public class calculator
{
	public static void main(String[] args)
	{
		new CalculatorDemo();
	}
} 