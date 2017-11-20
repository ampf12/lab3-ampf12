import javax.swing.JFrame;

public class Lab3Exercises {
	public static void main(String[] args) {
		JFrame AndresFrame = new JFrame("Hello, world!");
		AndresFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		AndresFrame.setLocation(300, 100);
		AndresFrame.setSize(800, 500);
		MyPanelClass myPanel = new MyPanelClass();
        AndresFrame.getContentPane().add(myPanel);
		AndresFrame.setVisible(true);
	}
}