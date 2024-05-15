/**
 * Date: Wednesday, May 15, 2024;
 * @version 11.0.8.10.1
 * @since 11.0.8
 * @author Krystan K
 * <p> Description: This class is used to create a template for all the users who will enter data into the system. 
 * Using accessors and mutators (setters and getters), the required information can be stored and retrieved as required for each User object. 
 * This program will simulate an environment where users enter their information on a platform to take out books at a library. In this case,
 * we only need the getters though, since we are using access modifiers to restrict and control information. 
 */
public class User {
	/** This will be used to store the first name of the user. This will be a mandatory parameter. */
	private String firstName;
	/** This will be used to store the last name of the user. This will be a mandatory parameter. */
	private String lastName;
	/** This will be used to store the birth date of the user. This will not be a mandatory parameter. */
	private long birthDate;
	/** This will be used to store the address of the user. This will not be a mandatory parameter. */
	private String address;
	
	/** No-arg constructor */
	public User () {
		
	}
	
	/**
	 * Parameterized constructor
	 * Description: This will be used if the user only enters the required information, and does not enter their birthDate and address.
	 * @param firstName this is the first name of each user
	 * @param lastName this is the last name of each user
	 */
	public User (String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = 00-00-0000;
		this.address = "";
	}
	
	/**
	 * Parameterized constructor
	 * Description: This will be used if the user enters all their information, including their birth date and address.
	 * @param firstName this is the first name of each user
	 * @param lastName this is the last name of each user
	 * @param birthDate this is the birth date of the user
	 * @param address this is the address of the user
	 */
	public User (String firstName, String lastName, long birthDate, String address) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = birthDate;
		this.address = address;
	}
	
	//The firstName getter:
		public String getfirstName() {
			return firstName;
		}
		
		//The lastName getter:
		public String getlastName () {
			return lastName;
		}
	
		//The birthDate getter:
		public long birthDate () {
			return birthDate;
		}
	
		//The birthDate getter:
		public String address () {
			return address;
		}
	
}

