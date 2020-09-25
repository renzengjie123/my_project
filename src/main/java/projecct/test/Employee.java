package projecct.test;

public class Employee implements Comparable<Object> {
	
	private int id;//编号
	private String name;//名字
	private String sex;//性别
	private int age;//年龄
	private String dept;//部门
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Employee(int id, String name, String sex, int age, String dept) {
		super();
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.dept = dept;
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
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", sex=" + sex + ", age=" + age + ", dept=" + dept + "]";
	}
	
	public int compareTo(Object o) {
		if(o instanceof Employee){
			Employee e = (Employee) o;
			if(e.id > this.id){
				return 1;
			}else if (e.id < this.id) {
				return -1;
			}
		}
		return 0;
	}
	

}
