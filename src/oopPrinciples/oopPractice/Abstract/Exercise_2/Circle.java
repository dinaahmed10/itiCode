package oopPrinciples.oopPractice.Abstract.Exercise_2;

public class Circle  extends  Shape {
	 private double radis;
	 Circle(double radis){
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

}
