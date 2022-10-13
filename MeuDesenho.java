public class MeuDesenho extends BaseTurtle {



	public void draw() {

  	//----------- Example 1:  A triangle ---------------
        pen.up();
        moveTo(-3.50, -4);
        pen.setRandomColor();
        pen.setStrokeWidth(2);
        pen.down();

        face(90);
		forward(8);
        face(0);
        forward(2);
        face(270);
        forward(3);
        face(0);
        forward(3);
        face(90);
        forward(3);
        face(0);
        forward(2);
        face(270);
        forward(8);
        face(180);
        forward(2);
        face(90);
        forward(3);
        face(180);
        forward(3);
        face(270);
        forward(3);
        face(180);
        forward(2);


    }
}
