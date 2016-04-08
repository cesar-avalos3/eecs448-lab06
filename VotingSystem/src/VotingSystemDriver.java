import javax.swing.JFrame;

public class VotingSystemDriver {

	public static void createGOOEY()
	{
		JFrame frame = new JFrame("PLUS TURBO VOTE ELECTION SEASON 20XX");
		VotingSystemGOOEY dg = new VotingSystemGOOEY();
		
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
