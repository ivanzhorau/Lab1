package Lab1.ego.balls;

public class Ball {
	private String color;
	private int weight;
	public Ball(String color,int weight) {
		this.setColor(color);
		this.setWeight(weight);
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
}
