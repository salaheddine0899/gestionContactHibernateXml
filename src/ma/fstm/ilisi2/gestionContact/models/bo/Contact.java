package ma.fstm.ilisi2.gestionContact.models.bo;

public class Contact {
	private Long id;
	private String firstName;
	private String lastName;
	private String phone;
	private Type type;
	
	public Contact() {}
	
	public Contact(String firstName, String lastName, String phone, Type type) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.type = type;
	}



	public Contact(Long id, String firstName, String lastName, String phone, Type type) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.type = type;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}
	
	
}
