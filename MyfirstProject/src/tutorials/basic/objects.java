package tutorials.basic;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class objects {
	public static void main(String[] args) {
		int number=5;
		
		//create a window
		JFrame window=new JFrame();//window variable that holds the JFrame objects
		window.setTitle("My Window");//calling methods on our JFrame object to configure
		window.setSize(800,600);
		window.setVisible(true);
		
        JLabel label=new JLabel();
        label.setText("My Label");//setText method is called on our JLabel object
        
        window.add(label);
        
        String s="hi"
	}
}


