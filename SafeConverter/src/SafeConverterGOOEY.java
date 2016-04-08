	import java.awt.Component;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;

	import javax.swing.*;
public class SafeConverterGOOEY {

	private JButton convertButton;
	private SpinnerNumberModel numberInput;
	private JPanel content;
	private JLabel tempResult;
	private JSpinner numberSpinner;
	
	private JSpinner temperatureFrom;
	private JSpinner temperatureTo;

	private SpinnerListModel tempFrom;
	private SpinnerListModel tempTo;
	
	private String[] modes = {"F", "C", "K"};
	
		public SafeConverterGOOEY()
		{
			convertButton = new JButton("Convert Temperature");
			convertButton.addActionListener(convertAction());
			
			numberInput = new SpinnerNumberModel(20,2,800,0.1);
			
			tempResult = new JLabel("The temperature converted is: ");
			
			tempFrom = new SpinnerListModel(modes);
			tempTo   = new SpinnerListModel(modes);
			
			numberSpinner   = new JSpinner(numberInput);
			temperatureFrom = new JSpinner(tempFrom);
			temperatureTo	= new JSpinner(tempTo);
			
			content = new JPanel();
			
			content.add(convertButton);
			content.add(numberSpinner);
			content.add(temperatureFrom);
			content.add(temperatureTo);
			content.add(tempResult);
		}
		
		private ActionListener convertAction()
		{
			ActionListener action = new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					tempResult.setText("The temperature converted from"+ tempFrom.getValue().toString() + " to " + tempTo.getValue().toString() + " is: " +SafeConverter.convertFromTo(tempFrom.getValue().toString(), tempTo.getValue().toString(), numberInput.getNumber().doubleValue()));
				}
			};
			return action;
		}
		
		public Component getContent()
		{
			return content;
		}
	}