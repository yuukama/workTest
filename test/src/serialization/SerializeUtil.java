package serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializeUtil {

	public static void serialize(Object obj, String fileName) throws IOException{
		
		FileOutputStream fos = new FileOutputStream(fileName);
		ObjectOutputStream oop = new ObjectOutputStream(fos);
		
		oop.writeObject(obj);
		
		fos.close();
	}
	
	public static Object deserialize (String fileName) throws IOException, ClassNotFoundException {
		
		FileInputStream fis = new FileInputStream(fileName);
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Object obj = ois.readObject();
		ois.close();
		
		return obj;
	}
}
