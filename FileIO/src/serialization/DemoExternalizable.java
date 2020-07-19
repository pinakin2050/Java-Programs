package serialization;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class DemoExternalizable implements Externalizable {
	String name;
	int matches,runs,wickets;
	float avg;
	
	public DemoExternalizable(String name, int matches, int runs, int wickets, float avg)
	{
		this.name=name;
		this.matches=matches;
		this.runs=runs;
		this.wickets=wickets;
		this.avg=avg;
	}
	
	public void disp2()
	{
		System.out.println(name);
		System.out.println(matches);
		System.out.println(runs);
		System.out.println(avg);
		System.out.println(wickets);
	}
	
	public void writeExternal(ObjectOutput oo) throws IOException
	{
		oo.writeFloat(avg);
		oo.writeInt(runs);
		
	}
	public void readExternal(ObjectInput oi) throws IOException
	{
		runs=oi.readInt();
		avg=oi.readFloat();
	}
	
	public DemoExternalizable()
	{
		
	}
}
