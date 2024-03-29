package bubble.test.ex02;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class BubbleFrame extends JFrame{
	
	private JLabel backgrundMap;
	private Player player;
	
	
	public BubbleFrame() {
		initObject();
		initSetting();
		setVisible(true);
	}
	
	private void initObject() {
		backgrundMap = new JLabel(new ImageIcon("image/backgroundMap.png"));
		setContentPane(backgrundMap);
		
		player = new Player();
		add(player);
//		backgrundMap.setSize(100,100);
//		backgrundMap.setLocation(300,300);
//		backgrundMap.setSize(1000,600);
//		add(backgrundMap); // JFame에 JLabel이 그려짐
		}
	
	private void initSetting() {
		setSize(1000, 640);
		setLayout(null); // 자유롭게 그림을 그리는  absolute 레이아웃
		setLocationRelativeTo(null); // Jframe  가운데 배치
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //x 버튼으로 창을 끌때 JVM 같이 종료하기
		
	}

	public static void main(String[] args) {
		new BubbleFrame();

	}
}
