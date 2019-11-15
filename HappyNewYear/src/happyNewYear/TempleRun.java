package happyNewYear;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.geom.AffineTransform;
import java.awt.geom.Ellipse2D;
import java.awt.geom.RoundRectangle2D;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.Timer;

public class TempleRun extends JPanel implements ActionListener,KeyListener {
	
	Timer timer;
	private int delay=6;
	private Image[] image=new Image[8];
	private int j=0, a=1,b=890,z=100,h=120,count3=0;
	private int f=0,x,y,flag1=0,flag2=0,flag3=0,flag4=1,count=0,count2=0,color=0,color2=0;
	private double[] leg1= {4,-6},Hand1= {6,-6};
	private double[] leg2= {6,-10},Hand2= {6,-6};
	private double L1=-.6,L2=.6,L3=0,L4=0,H1=-1,H2=1,H3=0,H4=0;
	private double n=0,m=1500,c=0,d=0,S=4,T=27,K=700;
	
	public TempleRun() throws IOException {
		// TODO Auto-generated constructor stub
		
		addKeyListener(this);
		setFocusable(true);
		setFocusTraversalKeysEnabled(false);
		setPreferredSize(new Dimension(10,1000));
		
		timer=new Timer(delay,this);
		timer.start();
		
			image[0]=ImageIO.read(getClass().getResourceAsStream("/azaz2.jpg"));
			image[1]=ImageIO.read(getClass().getResourceAsStream("/azaz3.jpg"));
			image[2]=ImageIO.read(getClass().getResourceAsStream("/azaz3.jpg"));
			image[3]=ImageIO.read(getClass().getResourceAsStream("/azaz4.jpg"));
			image[4]=ImageIO.read(getClass().getResourceAsStream("/azaz5.jpg"));
			
		
		
		
		
		
	}
	
	protected void paintComponent(Graphics g) 
	{
		
		
		
		Graphics2D g2D=(Graphics2D) g;
		
		g2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
		
		AffineTransform transform2 = new AffineTransform();
		g2D.setColor(Color.gray);
	
		g2D.translate(0,0);
		g2D.drawImage(image[j+1],a+2000 ,0,2000,690, this);
		g2D.drawImage(image[j],a,0,2000,690, this);
		g2D.setTransform(transform2);
		g2D.rotate(-3.15);
		g2D.drawImage(image[j+1],-3950-a,-1250,2000,500, this);
	    g2D.drawImage(image[j],-1950-a,-1250,2000,500, this);
	    g2D.setTransform(transform2);
	    g2D.fillRect(a+2000,690,2500,100);
	    g2D.fillRect(a,690,2500,100);
	    //a--;
		if(j>=4) j=0;
		if(a==-2000) {
			j++;
			a=2;
			
		}
		
		drawMale(g2D);
		if(n<m-75) n=n+.5;
		drawFemale(g2D);
		
		
		
		if(n>=m-75) {
			
			
			L1=0;
			L2=0;
			
			Hand1[0]=3;
		
			if(count<=200) {
				H4=1;
				H1=-1;
			}
			else {
				H4=0;
				H1=0;
				
			}
			
			flag1=1;
		}
		
		if(flag1==1) count++;
		if(count>=400) {
			H4=2.7;
			Hand2[0]=2;
			
			S=S+.4;
			T=T+2.5;
			
			
			
			
			
			
			
			
		}
		
		if(S>=80&&T>=590) {
			
		
			
			
		if(K>=700) {
			flag2=1;
			flag3=0;
		}
		else if(K<=680) {
			flag3=1;
			flag2=0;
		}
		count2++;
		if(flag2==1&&count2<400) K=K-.5;
		else if(flag3==1&&count2<400) K=K+.5;
		
		
		
		
		
		color++;
		count3++;
		if(color>=11) color=1;
		if(count3>600) flag4=0;
		
		
	
	
		
		
		if(flag4==1) {
			
		
		if(color==2) g2D.setColor(Color.blue);
		if(color==1) g2D.setColor(Color.RED);
		if(color==6) g2D.setColor(Color.blue);
		if(color==3) g2D.setColor(Color.green);
		if(color==4) g2D.setColor(Color.yellow);
		if(color==5) g2D.setColor(Color.orange);
		if(color==7) g2D.setColor(Color.lightGray);
		if(color==8) g2D.setColor(Color.MAGENTA);
		if(color==9) g2D.setColor(Color.PINK);
		if(color==10) g2D.setColor(Color.CYAN);
		
		}
		else g2D.setColor(Color.blue);
	
		
		g2D.setFont(new Font("serif",Font.BOLD,80));
		g2D.drawString("H",650+z,h);
		
		
		
		if(flag4==1) {
			
		if(color==6) g2D.setColor(Color.RED);
		if(color==4) g2D.setColor(Color.blue);
		if(color==9) g2D.setColor(Color.green);
		if(color==7) g2D.setColor(Color.yellow);
		if(color==5) g2D.setColor(Color.orange);
		if(color==2) g2D.setColor(Color.lightGray);
		if(color==8) g2D.setColor(Color.MAGENTA);
		if(color==4) g2D.setColor(Color.PINK);
		if(color==3) g2D.setColor(Color.CYAN);
		}
		else g2D.setColor(Color.RED);
		g2D.setFont(new Font("serif",Font.BOLD,80));
		g2D.drawString("A",700+z,h);
		
		
		if(flag4==1) {
		if(color==10) g2D.setColor(Color.RED);
		if(color==1) g2D.setColor(Color.blue);
		if(color==7) g2D.setColor(Color.green);
		if(color==3) g2D.setColor(Color.yellow);
		if(color==5) g2D.setColor(Color.orange);
		if(color==7) g2D.setColor(Color.lightGray);
		if(color==2) g2D.setColor(Color.MAGENTA);
		if(color==4) g2D.setColor(Color.PINK);
		if(color==9) g2D.setColor(Color.CYAN);
		
		}
		else g2D.setColor(Color.green);
		g2D.setFont(new Font("serif",Font.BOLD,80));
		g2D.drawString("P",750+z,h);
		
		if(flag4==1) {
		if(color==9) g2D.setColor(Color.RED);
		if(color==2) g2D.setColor(Color.blue);
		if(color==3) g2D.setColor(Color.green);
		if(color==8) g2D.setColor(Color.yellow);
		if(color==5) g2D.setColor(Color.orange);
		if(color==4) g2D.setColor(Color.lightGray);
		if(color==8) g2D.setColor(Color.MAGENTA);
		if(color==6) g2D.setColor(Color.PINK);
		if(color==1) g2D.setColor(Color.CYAN);
		}
		
		else g2D.setColor(Color.yellow);
		g2D.setFont(new Font("serif",Font.BOLD,80));
		g2D.drawString("P",800+z,h);
		
		
		if(flag4==1) {
		if(color==6) g2D.setColor(Color.RED);
		if(color==2) g2D.setColor(Color.blue);
		if(color==9) g2D.setColor(Color.green);
		if(color==10) g2D.setColor(Color.yellow);
		if(color==6) g2D.setColor(Color.orange);
		if(color==7) g2D.setColor(Color.lightGray);
		if(color==4) g2D.setColor(Color.MAGENTA);
		if(color==9) g2D.setColor(Color.PINK);
		if(color==5) g2D.setColor(Color.CYAN);
		}
		else g2D.setColor(Color.orange);
		g2D.setFont(new Font("serif",Font.BOLD,80));
		g2D.drawString("Y",850+z,h);
		
		if(flag4==1) {
		if(color==3) g2D.setColor(Color.RED);
		if(color==9) g2D.setColor(Color.blue);
		if(color==8) g2D.setColor(Color.green);
		if(color==5) g2D.setColor(Color.yellow);
		if(color==4) g2D.setColor(Color.orange);
		if(color==7) g2D.setColor(Color.lightGray);
		if(color==5) g2D.setColor(Color.MAGENTA);
		if(color==3) g2D.setColor(Color.PINK);
		if(color==2) g2D.setColor(Color.CYAN);
		}
		else g2D.setColor(Color.lightGray);
		g2D.setFont(new Font("serif",Font.BOLD,80));
		g2D.drawString("N",950+z,h);
		
		
		if(flag4==1) {
		if(color==7) g2D.setColor(Color.RED);
		if(color==8) g2D.setColor(Color.blue);
		if(color==9) g2D.setColor(Color.green);
		if(color==10) g2D.setColor(Color.yellow);
		if(color==1) g2D.setColor(Color.orange);
		if(color==2) g2D.setColor(Color.lightGray);
		if(color==3) g2D.setColor(Color.MAGENTA);
		if(color==5) g2D.setColor(Color.PINK);
		if(color==4) g2D.setColor(Color.CYAN);
		}
		else g2D.setColor(Color.MAGENTA);
		g2D.setFont(new Font("serif",Font.BOLD,80));
		g2D.drawString("E",1000+z,h);
		
		
		
		if(flag4==1) {
		if(color==6) g2D.setColor(Color.RED);
		if(color==7) g2D.setColor(Color.blue);
		if(color==8) g2D.setColor(Color.green);
		if(color==9) g2D.setColor(Color.yellow);
		if(color==10) g2D.setColor(Color.orange);
		if(color==6) g2D.setColor(Color.lightGray);
		if(color==4) g2D.setColor(Color.MAGENTA);
		if(color==3) g2D.setColor(Color.PINK);
		if(color==2) g2D.setColor(Color.CYAN);
		}
		else g2D.setColor(Color.PINK);
		g2D.setFont(new Font("serif",Font.BOLD,80));
		g2D.drawString("W",1050+z,h);
		
		
		
		if(flag4==1) {
		if(color==5) g2D.setColor(Color.RED);
		if(color==6) g2D.setColor(Color.blue);
		if(color==7) g2D.setColor(Color.green);
		if(color==8) g2D.setColor(Color.yellow);
		if(color==9) g2D.setColor(Color.orange);
		if(color==10) g2D.setColor(Color.lightGray);
		if(color==1) g2D.setColor(Color.MAGENTA);
		if(color==2) g2D.setColor(Color.PINK);
		if(color==3) g2D.setColor(Color.CYAN);
		}
		else g2D.setColor(Color.RED);
		g2D.setFont(new Font("serif",Font.BOLD,80));
		g2D.drawString("Y",1150+z,h);
		
		
		
		if(flag4==1) {
		if(color==4) g2D.setColor(Color.RED);
		if(color==5) g2D.setColor(Color.blue);
		if(color==6) g2D.setColor(Color.green);
		if(color==7) g2D.setColor(Color.yellow);
		if(color==8) g2D.setColor(Color.orange);
		if(color==9) g2D.setColor(Color.lightGray);
		if(color==10) g2D.setColor(Color.MAGENTA);
		if(color==7) g2D.setColor(Color.PINK);
		if(color==4) g2D.setColor(Color.CYAN);
		}
		else g2D.setColor(Color.yellow);
		g2D.setFont(new Font("serif",Font.BOLD,80));
		g2D.drawString("E",1200+z,h);
		
		
		if(flag4==1) {
		if(color==3) g2D.setColor(Color.RED);
		if(color==4) g2D.setColor(Color.blue);
		if(color==5) g2D.setColor(Color.green);
		if(color==6) g2D.setColor(Color.yellow);
		if(color==7) g2D.setColor(Color.orange);
		if(color==8) g2D.setColor(Color.lightGray);
		if(color==9) g2D.setColor(Color.MAGENTA);
		if(color==10) g2D.setColor(Color.PINK);
		if(color==5) g2D.setColor(Color.CYAN);
		}
		else g2D.setColor(Color.green);
		g2D.setFont(new Font("serif",Font.BOLD,80));
		g2D.drawString("A",1250+z,h);
		
		
		if(flag4==1) {
		if(color==10) g2D.setColor(Color.RED);
		if(color==9) g2D.setColor(Color.blue);
		if(color==3) g2D.setColor(Color.green);
		if(color==7) g2D.setColor(Color.yellow);
		if(color==5) g2D.setColor(Color.orange);
		if(color==2) g2D.setColor(Color.lightGray);
		if(color==4) g2D.setColor(Color.MAGENTA);
		if(color==1) g2D.setColor(Color.PINK);
		if(color==9) g2D.setColor(Color.CYAN);
		}
		else g2D.setColor(Color.blue);
		g2D.setFont(new Font("serif",Font.BOLD,80));
		g2D.drawString("R",1300+z,h);
		
		if(flag4==1) {
		if(color==1) g2D.setColor(Color.RED);
		if(color==3) g2D.setColor(Color.blue);
		if(color==5) g2D.setColor(Color.green);
		if(color==7) g2D.setColor(Color.yellow);
		if(color==2) g2D.setColor(Color.orange);
		if(color==6) g2D.setColor(Color.lightGray);
		if(color==4) g2D.setColor(Color.MAGENTA);
		if(color==10) g2D.setColor(Color.PINK);
		if(color==9) g2D.setColor(Color.CYAN);
		}
		else g2D.setColor(Color.blue);
		g2D.setFont(new Font("serif",Font.BOLD,80));
		g2D.drawString("2",900+z,h+80);
		
		if(flag4==1) {
		if(color==2) g2D.setColor(Color.RED);
		if(color==4) g2D.setColor(Color.blue);
		if(color==6) g2D.setColor(Color.green);
		if(color==7) g2D.setColor(Color.yellow);
		if(color==5) g2D.setColor(Color.orange);
		if(color==10) g2D.setColor(Color.lightGray);
		if(color==4) g2D.setColor(Color.MAGENTA);
		if(color==1) g2D.setColor(Color.PINK);
		if(color==8) g2D.setColor(Color.CYAN);
		}
		else g2D.setColor(Color.green);
		g2D.setFont(new Font("serif",Font.BOLD,80));
		g2D.drawString("0",950+z,h+80);
		
		if(flag4==1) {
		if(color==10) g2D.setColor(Color.RED);
		if(color==9) g2D.setColor(Color.blue);
		if(color==3) g2D.setColor(Color.green);
		if(color==8) g2D.setColor(Color.yellow);
		if(color==6) g2D.setColor(Color.orange);
		if(color==2) g2D.setColor(Color.lightGray);
		if(color==7) g2D.setColor(Color.MAGENTA);
		if(color==2) g2D.setColor(Color.PINK);
		if(color==9) g2D.setColor(Color.CYAN);
		}
		else g2D.setColor(Color.yellow);
		g2D.setFont(new Font("serif",Font.BOLD,80));
		g2D.drawString("1",1000+z,h+80);
		
		if(flag4==1) {
		if(color==9) g2D.setColor(Color.RED);
		if(color==8) g2D.setColor(Color.blue);
		if(color==7) g2D.setColor(Color.green);
		if(color==6) g2D.setColor(Color.yellow);
		if(color==1) g2D.setColor(Color.orange);
		if(color==2) g2D.setColor(Color.lightGray);
		if(color==3) g2D.setColor(Color.MAGENTA);
		if(color==4) g2D.setColor(Color.PINK);
		if(color==5) g2D.setColor(Color.CYAN);
		}
		else g2D.setColor(Color.RED);
		g2D.setFont(new Font("serif",Font.BOLD,80));
		g2D.drawString("8",1050+z,h+80);
		
		
		
		
		}
		
		
		
		
		
	}

	public void drawMale(Graphics2D g2D) {
		g2D.setColor(Color.red);
		g2D.fill(new RoundRectangle2D.Double(n,650,30,60, 10, 10));
		g2D.fill(new RoundRectangle2D.Double(n+10,630,10,20, 2, 2));
		g2D.fill(new Ellipse2D.Double(n,615,30,30));
		
		
		
		//legs
		AffineTransform transform2 = new AffineTransform();

		if(n<m-75) { L1=L1+.01;
	

	
		L2=L2-.01;
		
		if(L2<=-.7) {
			L2=0.7;
			
		
		}
		
		if(L1>=0.7) {
			L1=-0.7;
			
		}
		}
		
		g2D.setColor(Color.red);
		g2D.translate(n+8,700);
		g2D.rotate(L1);
		g2D.fill(new Rectangle.Double(leg1[0],leg1[1],10,50));
		g2D.setColor(Color.blue);
		g2D.fill(new Ellipse2D.Double(4,40,18,8));
		g2D.setTransform(transform2);
		
		
		
		g2D.setColor(Color.red);
		g2D.translate(n+8,700);
		g2D.rotate(L2);
		g2D.fill(new Rectangle.Double(leg2[0],leg2[1],10,50));
		g2D.setColor(Color.blue);
		g2D.fill(new Ellipse2D.Double(4,40,18,8));
		g2D.setTransform(transform2);
		
		
		
		//hands
		
		AffineTransform transform3 = new AffineTransform();

		 if(n<m-75) {
			 H1=H1+.01435;
		 
	
		
	
		H2=H2-.01435;
		
		if(H2<=-1) {
			H2=1;
			
		
		}
		
		if(H1>=1) {
			H1=-1;
			
		}
		}
		
		g2D.setColor(Color.red);
		g2D.translate(n+10,655);
		g2D.rotate(H1);
		g2D.fill(new Rectangle.Double(Hand1[0],Hand1[1],7,55));
		g2D.setColor(Color.red);
		g2D.fillOval(5,43,8,8);
		if(count<100) {
			
		
			g2D.setColor(Color.yellow);
			g2D.fillOval(6,45,15,15);
		}
		
		g2D.setTransform(transform2);
		g2D.setColor(Color.red);
		g2D.translate(n+10,655);
		g2D.rotate(H2);
		g2D.fill(new Rectangle.Double(Hand2[0],Hand2[1],7,55));
		g2D.setColor(Color.red);
		g2D.fillOval(5,43,8,8);
		g2D.setTransform(transform2);
		
		
	}
	

	public void drawFemale(Graphics2D g2D) {
		
		/*AffineTransform transform = new AffineTransform();
		g2D.setColor(Color.blue);
		g2D.translate(m,650);
		g2D.fill(new RoundRectangle2D.Double(0,4,30,60, 10, 10));
		g2D.fill(new RoundRectangle2D.Double(0,4,30,60, 10, 10));
		
		g2D.fill(new RoundRectangle2D.Double(10,0,10,20, 2, 2));
		g2D.fill(new Ellipse2D.Double(0,-30,30,30));
		g2D.setTransform(transform);*/
		
		
		//legs
		AffineTransform transform2 = new AffineTransform();

		/* L3=L3+.01;
	

	
		L4=L4-.01;
		
		if(L4<=-.7) {
			L4=0.7;
			
		
		}
		
		if(L3>=0.7) {
			L3=-0.7;
			
		}*/
		
		g2D.setColor(Color.red);
		g2D.translate(m+8,K);
		g2D.rotate(L3);
		g2D.fill(new Rectangle.Double(leg1[0]-10,leg1[1],10,50));
		g2D.setColor(Color.green);
		g2D.fill(new Ellipse2D.Double(-10,38,14,8));
		g2D.setTransform(transform2);
		
		
		
		g2D.setColor(Color.red);
		g2D.translate(m+8,K);
		g2D.rotate(L4);
		g2D.fill(new Rectangle.Double(leg2[0]+3,leg2[1]+2,10,50));
		g2D.setColor(Color.green);
		g2D.fill(new Ellipse2D.Double(6,38,14,8));
		g2D.setTransform(transform2);
		
		
		
		//hands
		
		AffineTransform transform3 = new AffineTransform();

		/* H3=H3+.01435;
	
		
	
		H4=H4-.01435;
		
		if(H4<=-1) {
			H4=1;
			
		
		}
		
		if(H3>=1) {
			H3=-1;
			
		}*/
		
		g2D.setColor(Color.red);
		g2D.translate(m+5,K-40);
		g2D.rotate(H3);
		g2D.fill(new Rectangle.Double(Hand1[0],Hand1[1],7,52));
		//g2D.setColor(Color.yellow);
		//g2D.fillOval(6,45,10,10);
		
		g2D.setTransform(transform2);
		g2D.setColor(Color.red);
		g2D.translate(m+5,K-40);
		g2D.rotate(H4);
		g2D.fill(new Rectangle.Double(Hand2[0],Hand2[1],7,40));
		if(count>100&&S<80&&T<600) {
			g2D.setColor(Color.yellow);
		
			g2D.fill(new Ellipse2D.Double(S,T,13,13));
		}
		
		
		g2D.setTransform(transform2);
		
		
		
		AffineTransform transform = new AffineTransform();
		g2D.setColor(Color.red);
		g2D.translate(m,K-50);
		g2D.fill(new RoundRectangle2D.Double(0,4,30,60, 10, 10));
		g2D.fill(new RoundRectangle2D.Double(0,4,30,60, 10, 10));
		
		g2D.fill(new RoundRectangle2D.Double(10,0,10,20, 2, 2));
		g2D.fill(new Ellipse2D.Double(0,-30,30,30));
		g2D.setTransform(transform);
		
	}
	
	

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		for(int i=0;i<1000;i++) {
			
			System.out.println("azaz");
		}
		
		if(e.getKeyCode()==KeyEvent.VK_ENTER) {
			flag4=0;
		}
		
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		
		
		
		repaint();
		
	}
}
