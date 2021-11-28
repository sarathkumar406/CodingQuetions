class Employee1 implements Cloneable
{
	private int empid;
	private String name;
	
	public void setEmpid(int empid)
	{
		this.empid = empid;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public int getEmpid()
	{
		return empid;
	}
	public String getName()
	{
		return name;
	}
	public Object clone()throws CloneNotSupportedException{  
		return super.clone();  
	}  

	public static void main(String[] args) throws CloneNotSupportedException
	{
		Employee1 e = new Employee1();
		e.setEmpid(123);
		e.setName("sarat");

		Employee1 e1 = e;
		Employee1 e2 = (Employee1)e.clone();
		e.setEmpid(234);

		System.out.println(e.getEmpid());
		System.out.println(e1.getEmpid());
		System.out.println(e2.getEmpid());
	}
}
