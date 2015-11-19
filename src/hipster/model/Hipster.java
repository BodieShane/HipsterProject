package hipster.model;

public class Hipster
{
	private String name;
	private String [] hipsterPhrases;
	private Book[]hipsterBooks;
	

	
	public Hipster()
	{
		this.name = "";
		this.hipsterPhrases = new String[4];
		setupArray();
	
		setupBoooks();
		
	}
	private  void setupBoooks()
	{
		Book firstBook, secondBook, thirdBook;
		firstBook= new Book();
		firstBook.setAuthor("Bodie Shane");
		firstBook.setTitle("Code Age");
		firstBook.setSubject("ScienceFiction");
		firstBook.setPageCount(301);
		firstBook.setPrice(300.48);
		
		secondBook = new Book();
		secondBook.setAuthor("not Bodie Shane");
		secondBook.setTitle("This will never be as good as Code Age");
		secondBook.setSubject("HistoryNonFiction");
		secondBook.setPageCount(1);
		secondBook.setPrice(-300.47);
		
		thirdBook = new Book(5, "Bodie Shane", "Jump Ball", "Fiction", 999.99);
		
		hipsterBooks[0] = firstBook;
		hipsterBooks[1] = secondBook;
		hipsterBooks[2] = thirdBook;
		
		
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
		public Book[] getHipsterBooks()
	{
		return hipsterBooks;
	}
	public void setHipsterBooks(Book[] hipsterBooks)
	{
		this.hipsterBooks = hipsterBooks;}
}
