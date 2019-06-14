package entities;

public class Retangulo {
	
	public double width, height;
	
public double area() {
return width * height;
}

public double perimeter() {
return 2 * (width+height);
}

public double diagonal() {
	return Math.sqrt((width*width)+ (height*height));
}

public String toString() {

return String.format("%2f"+diagonal()+area()+perimeter());
}

}
