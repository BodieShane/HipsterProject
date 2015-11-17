package hipsterView;

import hipsterController.HipsterAppController;

import javax.swing.*;


public class HipsterFrame extends JFrame
{
	private HipsterAppController baseController;
	private HipsterPanel basePanel;
	
	
	public HipsterFrame(HipsterAppController baseController)
	{
		this.baseController = baseController;
		basePanel = new HipsterPanel(baseController);
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setSize(400,400);
		this.setTitle("Silly app!!");
		this.setResizable(false);
		this.setVisible(true);
	}
	public HipsterAppController getBaseController(){
		return baseController;
	}

	public String getResonse(String prompt)
	{
		String response = JOptionPane.showInputDialog(this, prompt);
		return response;
	}
}
