/**
 * 
 */
package itech2306Package1;

/**
 * @author Kkeogh
 *
 */
public class Animal {
	String name;
	Boolean registered;
	
	/*
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	/*
	 * @param the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/*
	 * @return the name
	 */
	public Boolean getRegistered() {
		return registered;
	}
	
	/*
	 * @return is the animal registered
	 */
	public void setRegistered(Boolean registered) {
		this.registered = registered;
	}

	public Animal(String name, Boolean registered) {
		super();
		this.name = name;
		this.registered = registered;
	}
	
	
	
	
}
