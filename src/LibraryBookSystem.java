
public class LibraryBookSystem {
	protected User accountHolder;
	/** This will be used to count the number of books the user took out. This will be a mandatory parameter. */
	protected int books;
	
	
	/** No arg constructor*/
	public LibraryBookSystem () {
		
	}
	
	/**
	 * Parameterized constructor
	 * Description: 
	 * @param books this is the total number of books that the user has taken out and not returned
	 */
	public LibraryBookSystem (User accountHolder, int books) {
		this.books = books;
	}
	
	
	//The birthDate getter:
	public int books () {
		return books;
	}
}
