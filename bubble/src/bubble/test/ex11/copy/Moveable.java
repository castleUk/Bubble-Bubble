package bubble.test.ex11.copy;


// default 인터페이스도 몸체가 있는 메서드를 만들수 있다.
// 다중 상속이 안되는것이 많기 때문에.
public interface Moveable {
	
	public abstract void left();
	public abstract void right();
	public abstract void up();
	default public void down() {}; 

}
