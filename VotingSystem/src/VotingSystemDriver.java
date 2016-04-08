import javax.swing.JFrame;

public class VotingSystemDriver {

	public static void createGOOEY()
	{
		JFrame frame = new JFrame("TEMPERATURE CONVERTER PRO MASTER RELOADED V 23 TURBO ULTRA PLUS QUAN PERFECTO");
		VotingSystemGOOEY dg = new VotingSystemGOOEY();
		
		frame.getContentPane().add(dg.getContent());
		frame.pack();
		frame.setVisible(true);
	}
	
	public static void main(String[] args)
	{
		createGOOEY();
	}
	
}
