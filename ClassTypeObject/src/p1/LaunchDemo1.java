package p1;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class LaunchDemo1 {

	public static void main(String[] args) {
		Demo1 d1 = new Demo1();
		Class c1= d1.getClass();
		System.out.println("Class Loader:"+c1.getCanonicalName());
		System.out.println("Class Modifier:"+c1.getModifiers());
		System.out.println("Class name:"+c1.getName());
		System.out.println("Class simple name:"+c1.getSimpleName());
		System.out.println("Type name:"+c1.getTypeName());
		System.out.println("Super class name:"+c1.getSuperclass());
		System.out.println("Class loader:"+c1.getClassLoader());
		
		Method m[]=c1.getDeclaredMethods();
		System.out.println("------Methos Present inside the class--------");
		for(Method mthd:m)
			System.out.println(mthd.getName());
		
		Field f[]=c1.getDeclaredFields();
		System.out.println("------Fields present inside the class--------");
		for(Field fld:f)
			System.out.println(fld.getName());
	}

}
