package happyNewYear;

import java.io.IOException;

import javax.swing.JFrame;

public class MainClass {

	public  static void main(String[] args) throws IOException {
			
		TempleRun tr=new TempleRun();
		JFrame frame=new JFrame("MD.AZAZUL HAQUE");
		
		frame.setSize(1700,1000);
		frame.setResizable(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(tr);
		frame.setVisible(true);
		
	}

}
