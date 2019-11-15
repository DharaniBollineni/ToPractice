package Week3Files;

import ecs100.*;

import java.awt.Image;
import java.io.*;

import javax.imageio.ImageIO;

public class TestImagedRAW {

	public TestImagedRAW() {
		// TODO Auto-generated constructor stub
		try{
			UI.initialise();
		
		
		String imageName = UIFileChooser.open("Selct an image");
		File f = new File(imageName);
		Image img = ImageIO.read(f);
		//UI.drawImage(img, x, y);
		UI.drawImage(img, 0, 0);
		}
		catch(IOException e) {
			UI.println("Error --> "+e);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TestImagedRAW();
	}

}
