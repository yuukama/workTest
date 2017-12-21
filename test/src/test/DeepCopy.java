package test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;

public class DeepCopy {
	
	public static void main(String[] args) {
		
		List<String> origenalList = new ArrayList<String>();
		origenalList.add("A");
		origenalList.add("B");
		origenalList.add("C");
		
		@SuppressWarnings("unchecked")
		List<String> deepCopyList = (List<String>) deepCopy(origenalList);
		
		deepCopyList.add("D");
		
		printList(origenalList);
		printList(deepCopyList);
	}
	
	private static void printList (List<String> a) {
		
		System.out.println("---------------");
		
		for(String tmp: a){
			
			System.out.print(tmp);
			System.out.print(",");
		}
		System.out.println("");
	}
	
	private static Object deepCopy(Object object) {

		try{

			ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
			ObjectOutputStream outputStrm = new ObjectOutputStream(outputStream);
			outputStrm.writeObject(object);
			
			ByteArrayInputStream inputStream = new ByteArrayInputStream(outputStream.toByteArray());
			ObjectInputStream inputStrm = new ObjectInputStream(inputStream);

			return inputStrm.readObject();
		} catch(Exception e) {
			
			 e.printStackTrace();
		     return null;
		}
	}

}
