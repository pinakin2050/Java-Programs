package SerializationDeserialization;

import java.io.Serializable;

public class Serialization implements Serializable {
	
	String name;
	int runs;
	float avg;
	
	public Serialization(String name, int runs, float avg)
	{
		this.name=name;
		this.runs=runs;
		this.avg=avg;
	}
	
	void display()
	{
		System.out.println(name);
		System.out.println(runs);
		System.out.println(avg);
	}
}
