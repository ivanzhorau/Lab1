package Lab1.ego.balls;

public class Basket {
	private Ball[] balls;
	public Basket(Ball[] balls) {
		this.setBalls(balls);
	}
	public Ball[] getBalls() {
		return balls;
	}
	public void setBalls(Ball[] balls) {
		this.balls = balls;
	}
	
}
