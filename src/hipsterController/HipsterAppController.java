package hipsterController;

import hipster.model.Hipster;
import hipsterView.HipsterFrame;

public class HipsterAppController
{
	private Hipster firstHipster;
	private HipsterFrame baseFrame;
	
	public HipsterAppController()
	{
		firstHipster = new Hipster();
		baseFrame = new HipsterFrame(this);
	}
	
	public void start()
	{
		String myName = baseFrame.getResonse("what is your name?");
		firstHipster.setName(myName);
		baseFrame.setTitle(myName = "'hipster's project");
		
	}
	public Hipster FirstHipster()
	{
		return firstHipster;
	}
	public HipsterFrame getBaseFrame()
	{
		
		return baseFrame;
	}

	public Hipster getFirstHipster()
	{
		return firstHipster;
	}
}
