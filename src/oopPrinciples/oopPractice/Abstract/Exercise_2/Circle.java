package oopPrinciples.oopPractice.Abstract.Exercise_2;

public class Circle  extends  Shape {
	 private double radis;
	 Circle(double radis){
		 super();
		 this.radis=radis;
	 }
	@Override
	public void calculateArea() {
		System.out.println(radis*radis*Math.PI);
		
	}

	@Override
	public void calculatePerimeter(){
		System.out.println(2*radis*Math.PI);
		
	}
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
	}
 
	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int sup(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public void drink() {
		// TODO Auto-generated method stub
		
	}

}
