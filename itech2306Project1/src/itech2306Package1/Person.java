/**
 * 
 */
package itech2306Package1;

/**
 * @author kkeogh
 *
 */
public class Person {
	String name;
	String address;
	String postcode;
	Animal pet;
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	
	/**
	 * @return the postcode
	 */
	public String getPostcode() {
		return postcode;
	}
	/**
	 * @param postcode
	 */
	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Person p = new Person("80 Somewhere St", "Fluffy", "3000");
		Animal myPet = new Animal("Fluffy", false);
		p.addAPet(myPet);
		
	}
	
	public Person(String _address, String _name, String _postcode) {
		super();
		this.name = _name;
		this.address = _address;
		this.postcode = _postcode;
	}
	
	void addAPet(Animal _pet) {
		this.pet = _pet;
	}
	
	

}
