package serialization;

import java.io.Serializable;

public class Cricketer2 implements Serializable{
		String name;
		int matches,runs,wickets;
		float avg;
		
		public Cricketer2(String name, int matches, int runs, int wickets, float avg)
		{
			this.name=name;
			this.matches=matches;
			this.runs=runs;
			this.wickets=wickets;
			this.avg=avg;
		}
		
		public void disp1()
		{
			System.out.println(name);
			System.out.println(matches);
			System.out.println(runs);
			System.out.println(avg);
			System.out.println(wickets);
		}
}
