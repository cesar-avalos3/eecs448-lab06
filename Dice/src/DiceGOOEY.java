import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class DiceGOOEY {
	private JButton rollDiceButton;
	private SpinnerNumberModel numberInput;
	private JPanel content;
	private JLabel diceResult;
	private JSpinner numberSpinner;
	
	//Constructor
	public DiceGOOEY()
	{
		rollDiceButton = new JButton("Roll Dice");
		rollDiceButton.addActionListener(rollDiceAction());
		
		numberInput = new SpinnerNumberModel(6,2,800,1);
		
		diceResult = new JLabel("Number rolled: ");
		
		numberSpinner = new JSpinner(numberInput);
		
		content = new JPanel();
		
		content.add(rollDiceButton);
		content.add(numberSpinner);
		content.add(diceResult);
	}
	
	private ActionListener rollDiceAction()
	{
		ActionListener action = new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				diceResult.setText("Number rolled:" + Dice.rollDice(numberInput.getNumber().intValue() )) ;
			}
		};
		return action;
	}
	
	public Component getContent()
	{
		return content;
	}
}
