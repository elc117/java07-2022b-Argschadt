public class MeuMain {

	public static void main(String[] args) {

		MeuDesenho t = new MeuDesenho();
		
		Pen p = new Pen();
		t.setPen(p);

		TurtleView view = new SwingTurtleView();
		t.setView(view);

		view.initialize(100);
		t.draw();

	} 


} 