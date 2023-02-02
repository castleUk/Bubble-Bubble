package bubble.test.ex11.copy;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class BubbleFrame extends JFrame{
	
	private JLabel backgrundMap;
	private Player player;
	
	
	public BubbleFrame() {
		initObject();
		initSetting();
		initListenser();
		setVisible(true);
	}
	
	private void initObject() {
		backgrundMap = new JLabel(new ImageIcon("image/backgroundMap.png"));
		setContentPane(backgrundMap);
		
		player = new Player();
		add(player);
		}
	
	private void initSetting() {
		setSize(1000, 640);
		setLayout(null); // 자유롭게 그림을 그리는  absolute 레이아웃
		setLocationRelativeTo(null); // Jframe  가운데 배치
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //x 버튼으로 창을 끌때 JVM 같이 종료하기
		
	}
	
	private void initListenser() {
		addKeyListener(new KeyAdapter() {
			// 키보드 클릭이벤트 핸들러
			@Override
			public void keyPressed(KeyEvent e) {
				//System.out.println(e.getKeyCode());
				
				switch (e.getKeyCode()) {
				case KeyEvent.VK_LEFT:
					if (!player.isLeft() && !player.isLeftWallCrash()) {
						player.left();
					}
					break;
				case KeyEvent.VK_RIGHT:
					if (!player.isRight() && !player.isRightWallCrash()) {
						player.right();	
					}
					break;
				case KeyEvent.VK_UP:
					if(!player.isUp() && !player.isDown()) {
						player.up();
					}
					
					break;
				case KeyEvent.VK_SPACE:
					Bubble bubble = new Bubble(player);
					add(bubble);
					break;

					
				}
			
				}
			
			// 키보드 릴리즈 이벤트 핸들러
			@Override
			public void keyReleased(KeyEvent e) {
				switch(e.getKeyCode()) {
				case KeyEvent.VK_LEFT:
					player.setLeft(false);
					break;
				case KeyEvent.VK_RIGHT:
					player.setRight(false);
					break;
				}
				
			}
			
			
		});


	}

	public static void main(String[] args) {
		new BubbleFrame();

	}
}
