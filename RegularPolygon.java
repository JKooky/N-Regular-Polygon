public class RegularPolygon {
	private int n = 3;
	private double side = 1;
	private double x = 0;
	private double y = 0;
	
	public RegularPolygon() {
	}
	
	public RegularPolygon(int n, double side) {
		this.n= n;
		this.side = side;
	}
	
	public RegularPolygon(int n, double side, double x, double y) {
		this.n= n;
		this.side = side;
		this.x = x;
		this.y= y;
	}
	
	public int getNOfRegularPolygon() {
		return this.n;
	}
	
	public double getSideOfRegularPolygon() {
		return this.side;
	}
	
	public double getXOfRegularPolygon() {
		return this.x;
	}
	
	public double getYOfRegularPolygon() {
		return this.y;
	}
	
	public void setNOfRegularPolygon(int n) {
		this.n = n;
	}
	
	public void setSideOfRegularPolygon(double side) {
		this.side = side;
	}
	
	public void setXOfRegularPolygon(double x) {
		this.x = x;
	}
	
	public void setYOfRegularPolygon(double y) {
		this.y = y;
	}
	
	public double getPerimeter() {
		return this.n * this.side;
	}
	
	public double getArea() {
		return this.n * this.side * this.side / 4 / Math.tan(Math.PI / this.n);
	}
}