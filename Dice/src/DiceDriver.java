import javax.swing.*;

public class DiceDriver {
	
private static void createDisplayGOOEY()
{
	JFrame frame = new JFrame("DICE PRO MASTER RELOADED V 23 TURBO ULTRA PLUS QUAN PERFECTO");
	DiceGOOEY dg = new DiceGOOEY();
	
	frame.getContentPane().add(dg.getContent());
	frame.pack();
	frame.setVisible(true);
}


public static void main(String[] args)
{
	createDisplayGOOEY();
}

}
