package pojo;

public class childPojo {

	public static void main(String[] args) {

		ParentPojo obj = new ParentPojo();

		
		obj.setname("vino");
		obj.setAge(25);
		obj.setDeparment("ECE");
		obj.setCity("chennai");

		System.out.println("Nmae :" + obj.getname());

		System.out.println("Age :" + obj.getAge());
		
		System.out.println("Department :" + obj.getDeparment());

		System.out.println("City :" + obj.getCity());

	}

}
