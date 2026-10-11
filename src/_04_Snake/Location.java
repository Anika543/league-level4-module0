package _04_Snake;

public class Location {
	private int x;
	private int y; 

	public Location(int x, int y) {
		// TODO Auto-generated constructor stub
		this.x = x;
		this.y = y; 
	}

	public void setX(int x) {
		this.x = x; 
	}
	
	public int getX() {
		return x; 
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public int getY() {
		return y; 
	}
	
	
	public boolean equals(Location location) {
		if(location.getX() == x && location.getY() == y) {
			return true; 
		}else {
			return false; 
		}
	}
}
