	import java.awt.Component;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.*;
public class VotingSystemGOOEY {

	private JButton voteButton;
	private JPanel content;
	private JLabel voteResult;
	private JTextField  name;
	private JTextField lname;
	
	private JSpinner candidatesSpinner;
	private SpinnerListModel candidates;	
	private String[] candidatesList = {"Kang", "Kodos", "Ronald McDonald", "Dora the Explorer"};
	
		public VotingSystemGOOEY()
		{
			voteButton = new JButton("VOTE");
			voteButton.addActionListener(convertAction());
			
			name = new JTextField("Name");

			lname = new JTextField("Last Name");
			
			voteResult = new JLabel("Voting system, choose your candidate: ");
			
			candidates   = new SpinnerListModel(candidatesList);
			candidatesSpinner   = new JSpinner(candidates);
			
			content = new JPanel();
			
			content.add(name);
			content.add(lname);
			content.add(voteButton);
			content.add(candidatesSpinner);
			content.add(voteResult);
		}
		
		private ActionListener convertAction()
		{
			ActionListener action = new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					try {
						if(VotingSystem.vote(name.getText().toString(), lname.getText().toString(), candidatesSpinner.getValue().toString()))
						{
							voteResult.setText("Voted Sucessfully");
						}
						else
						{
							voteResult.setText("Already voted yo!");
						}
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			};
			return action;
		}
		
		public Component getContent()
		{
			return content;
		}
	}