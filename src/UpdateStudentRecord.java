//3. Write a method to update the city attribute of Student object array list passed as an input parameter. 
//If the city is "Mumbai" then change it to "Delhi". The method should return how many student records were updated.
import java.util.*;
class Student
{
	private int id;
	private String name;
	private String city;

	public Student(int id,String name,String city)
	{
		this.id = id;
		this.name = name;
		this.city = city;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", city=" + city + "]";
	}


}
class UpdateStudentRecord
{
	public static void main(String[] args) 
	{

		Student st1 = new Student(1,"sarat","hyd");
		Student st2 = new Student(2,"prakash","bang");
		Student st3 = new Student(3,"sai","chennai");
		Student st4 = new Student(4,"sajja","mumbai");
		Student st5 = new Student(5,"kumar","mumbai");
		ArrayList<Student> list = new ArrayList<>();
		list.add(st1);
		list.add(st2);
		list.add(st3);
		list.add(st4);
		list.add(st5);
		int count = updateCityRecord(list);
		System.out.println(count);
		System.out.println(list.toString());
		
	}

	private static int updateCityRecord(ArrayList<Student> list){
		int count = 0;
		if(list.size() > 0)
		{
			for(Student st : list)
			{
				if(st.getCity().equalsIgnoreCase("Mumbai"))
				{
					st.setCity("Delhi");
					count++;
				}
			}
		}
		return count;
	}
}
