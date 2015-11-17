package hipsterView;

import javax.swing.*;

import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.event.ActionEvent;

import hipsterController.HipsterAppController;
import hipster.model.*;


public class HipsterPanel extends JPanel
{
	private HipsterAppController baseController;
	private SpringLayout baseLayout;
	private JComboBox<String> phraseComboBox;
	
	
 
	public HipsterPanel(HipsterAppController baseController)
	{
		this.baseController = baseController;
		
		baseLayout = new SpringLayout();
		phraseComboBox = new JComboBox<String>();
		
		
		setupConboBox();
		setupPanel();
		setuplayout();
		setupListeners();
		
	}
	private void setupConboBox()
	{
		String [] phrases = baseController.getFirstHipster().getHipsterPhrases();
		ComboBoxModel<String> phraseModel = new DefaultComboBoxModel(phrases);
		phraseComboBox.setModel(phraseModel);
	}
	
	public void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setBackground(Color.ORANGE);
		this.add(phraseComboBox);
	}
	
	public void setuplayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, phraseComboBox, 59, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, phraseComboBox, 179, SpringLayout.WEST, this);
	}
	
	public void setupListeners()
	{
		phraseComboBox.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent selection)
			{
				int red = (int) (Math.random() * 256);
				int green = (int) (Math.random() * 256);
				int blue = (int) (Math.random() * 256);
				setBackground(new Color(red,green,blue));
				String updatedTitle = phraseComboBox.getSelectedItem(). toString();
				 baseController.getBaseFrame().setTitle(updatedTitle);
				
			}
		});
		
	}
}
