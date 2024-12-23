

public class UseDataType {
	
	public void areaRectangel() {
		
		int length = 70;
		int width = 40;
		int area = 0;
		
		area = length * width;
		
		System.out.println("area="+area);
		
	}
	
	public void areaTraingle() {
		int l =10;
		int b = 20;
		double area = 0.5*(l*b);
		System.out.println("Area of Triangle: "+area);
	}

	public static void main(String[] args) {
		UseDataType u = new UseDataType();
		u.areaRectangel();
		u.areaTraingle();
	}

}
