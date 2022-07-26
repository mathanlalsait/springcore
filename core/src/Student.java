import java.util.List;

public class Student 
{

    private String name;
    private int age;
    private String company;
    private String email;
    private Address address;
	private List<String> courses;
	
    public Student(String name) {
		// TODO Auto-generated constructor stub
    	this.name=name;
	}
    
    public List<String> getCourses() {
		return courses;
	}

	public void setCourses(List<String> courses) {
		this.courses = courses;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getCompany() {
		return company;
	}

	public String getEmail() {
		return email;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
        this.address = address;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }


   
} 