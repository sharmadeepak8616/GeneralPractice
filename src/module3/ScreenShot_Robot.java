package module3;

import java.awt.AWTException;
import java.awt.HeadlessException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

import org.testng.annotations.Test;

public class ScreenShot_Robot {

	@Test
	public void ScreenShotRobot() throws Exception
	{
		// This code will capture screenshot of current screen		
		BufferedImage image = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));

		
		// This will store screenshot on Specific location
		ImageIO.write(image, "png", new File("./ScreenShots/Robot.png"));

	}

}
