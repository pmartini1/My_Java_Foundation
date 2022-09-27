
import javax.swing.JFrame;

public class RubberBand extends JFrame{

private final int WIDTH = 600;
private final int HEIGHT = 600;

public void init(){

this.getContentPane().add (new RubberBandCircle());
setSize (WIDTH, HEIGHT);
this.setVisible(true);
this.setResizable(false);
this.setDefaultCloseOperation(EXIT_ON_CLOSE);
}
public RubberBand(){
init();
}
public static void main(String[] args) {
new RubberBand();


}
}


