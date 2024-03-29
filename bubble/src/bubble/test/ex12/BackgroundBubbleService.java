package bubble.test.ex12;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.print.DocFlavor.BYTE_ARRAY;


public class BackgroundBubbleService{
	
	private BufferedImage image;
	private Bubble bubble;
	
	
	public BackgroundBubbleService(Bubble bubble) {
		this.bubble = bubble;
		try {
			image = ImageIO.read(new File("image/backgroundMapService.png"));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public boolean leftWall() {
		Color leftcolor =new Color(image.getRGB(bubble.getX()- 10 , bubble.getY()+25));
		//외벽 충돌확인
		if (leftcolor.getRed() == 255 && leftcolor.getGreen() == 0 && leftcolor.getBlue() == 0) {
			return true;
		}
			
		return false;
	}
	public boolean rightWall() {
		Color rightcolor =new Color(image.getRGB(bubble.getX()+ 50 +15, bubble.getY()+25));
	if (rightcolor.getRed() == 255 && rightcolor.getGreen() == 0 && rightcolor.getBlue() == 0) {
		return true;
	}
		return false;
	}
	public boolean topWall() {
		Color topColor =new Color(image.getRGB(bubble.getX()+25, bubble.getY()-10));
		if (topColor.getRed() == 255 && topColor.getGreen() == 0 && topColor.getBlue() == 0) {
			return true;
		}
		return false;
	}
		
	}
	

