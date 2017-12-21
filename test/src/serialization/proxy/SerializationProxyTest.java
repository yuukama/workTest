package serialization.proxy;

import java.io.IOException;

import serialization.SerializeUtil;

public class SerializationProxyTest {

	public static void main(String[] args) {
		
        String fileName = "data.ser";
		
		Data data = new Data("Pankaj");
		
		try {
			
			SerializeUtil.serialize(data, fileName);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		try {
			
			Data newData = (Data) SerializeUtil.deserialize(fileName);
			System.out.println(newData);
		} catch (ClassNotFoundException | IOException e) {
			
			e.printStackTrace();
		}
	}
}
