package serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ExternalizationTest {

	public static void main(String[] args) throws Exception {
		
		String fileName = "person.ser";
		Persion person = new Persion();
		person.setId(1);
		person.setName("Pankaj");
		person.setGender("Male");
		
		FileOutputStream fos = new FileOutputStream(fileName);
		@SuppressWarnings("resource")
		ObjectOutputStream oop = new ObjectOutputStream(fos);
		oop.writeObject(person);
		
		FileInputStream fis = new FileInputStream(fileName);
		@SuppressWarnings("resource")
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Persion tmpPersion = (Persion)ois.readObject();
		
		System.out.println("Person Object Read=" + tmpPersion);
	}
}
