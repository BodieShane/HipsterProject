package hipster.model;

public class Hipster
{
	private String name;
	private String [] hipsterPhrases;
	
	public Hipster()
	{
		this.name = "";
		this.hipsterPhrases = new String[4];
		setupArray();
		//setupBoooks();
		
	}
	public void setupArray()
	{
		hipsterPhrases[0] = "Food thats is so instream!";
		hipsterPhrases[1] = "I don't eat anthing besides circus balls cereal.";
		hipsterPhrases[2]="oh wow you finley look good today :D.";
		hipsterPhrases[3]="I was into code before it was cool.";
		
	}
	
	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String[] getHipsterPhrases()
	{
		return hipsterPhrases;
	}

	public void setHipsterPhrases(String[] hipsterPhrases)
	{
		this.hipsterPhrases = hipsterPhrases;
	}
}
