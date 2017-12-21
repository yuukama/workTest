package test;

import java.lang.reflect.Method;

public class Reflaction {

	public static void main(String[] args) throws Exception {
		
		
		testForm test = new testForm("cc", 1002);
		
		Object o = getValueByProperty(test, "printResult", "hello world");
		
		System.out.println(o);
	}
	
	private static Object getValueByProperty(testForm form, String property, String param) throws Exception {
		
		@SuppressWarnings("unchecked")
		Class<testForm> classz = (Class<testForm>) form.getClass();
		
		Method getMethod = classz.getMethod(property, String.class);
		
		return getMethod.invoke(form, param);
	}

}

class testForm {
	
	private String name = null;
	private int id;
	
	public testForm(String name, int id) {
		
		this.name = name;
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public void printResult (String msg) {
		
		System.out.println("Name : " + this.name  + " , Id :" + this.getId() + "  : " + msg);
	}
}
