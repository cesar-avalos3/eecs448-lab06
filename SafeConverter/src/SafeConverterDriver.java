import javax.swing.JFrame;

public class SafeConverterDriver {

	public static void createGOOEY()
	{
		JFrame frame = new JFrame("TEMPERATURE CONVERTER PRO MASTER RELOADED V 23 TURBO ULTRA PLUS QUAN PERFECTO");
		SafeConverterGOOEY dg = new SafeConverterGOOEY();
		
		frame.getContentPane().add(dg.getContent());
		frame.pack();
		frame.setSize(500,500);
		frame.setVisible(true);
	}
	
	public static void main(String[] args)
	{
		createGOOEY();
	}
	
}
