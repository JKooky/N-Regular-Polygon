public class testRegularPolygon {
	public static void main(String[] args) {
		RegularPolygon regularPolygon1 = new RegularPolygon();
		RegularPolygon regularPolygon2 = new RegularPolygon(6, 4);
		RegularPolygon regularPolygon3 = new RegularPolygon(10, 4, 5.6, 7.8);
		
		System.out.println("The perimeter and the area of regularPolygon1 are " 
				+ regularPolygon1.getPerimeter() + " and " + regularPolygon1.getArea());
		System.out.println("The perimeter and the area of regularPolygon2 are " 
				+ regularPolygon2.getPerimeter() + " and " + regularPolygon2.getArea());
		System.out.println("The perimeter and the area of regularPolygon3 are " 
				+ regularPolygon3.getPerimeter() + " and " + regularPolygon3.getArea());
	}
}