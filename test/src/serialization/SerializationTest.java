package serialization;

public class SerializationTest {

	public static void main(String[] args) throws Exception {
		
		String fileName="employee.ser";
		Employee emp = new Employee("Pankaj", "10001","5000");
		
		//SerializeUtil.serialize(emp, fileName);
		
		Employee empCopy = (Employee) SerializeUtil.deserialize(fileName);
		
		System.out.println("emp Object::"+emp);
		System.out.println("empNew Object::"+empCopy);
	}
}
