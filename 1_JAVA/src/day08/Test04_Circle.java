package day08;

public class Test04_Circle {
	public static void main(String[] args) {
		  Circle c = new Circle();
		  Rectangle r = new Rectangle();
		  
          Drawable d = r;
          d.draw();
          
          
          Movable m =r;
          m.move();
          
          MovableAndDrawable[] md = {c,r};
          md[0].draw();
          md[0].move();
          
	}
}
