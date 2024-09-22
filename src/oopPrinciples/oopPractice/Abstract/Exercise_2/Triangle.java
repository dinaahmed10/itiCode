package oopPrinciples.oopPractice.Abstract.Exercise_2;

public class Triangle extends  Shape{
    double width;
    double hieght;
    Triangle(  double width,double hieght){
    this.width=	width;
    this.hieght=hieght;
    }
	@Override
	public void calculateArea() {
		System.out.println(width*hieght);
		
	}

	@Override
	public void calculatePerimeter() {
		System.out.println((width+hieght)*2);
		
	}

}
