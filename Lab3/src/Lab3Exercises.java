import javax.swing.JFrame;

public class Lab3Exercises {
	public static void main(String[] args) {
		JFrame AndresFrame = new JFrame("Hello, world!");
		AndresFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		AndresFrame.setLocation(850, 400);
		AndresFrame.setSize(200, 200);
		MyPanelClass myPanel = new MyPanelClass();
        AndresFrame.getContentPane().add(myPanel);
		AndresFrame.setVisible(true);
	}
}