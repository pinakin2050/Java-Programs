package p1;

public class EmployeeApp {
	public static void main(String args[]) {
		Employee e = new Employee();
		e.setEMP_ID("001");
		e.setEMP_NAME("Pinakin");
		
		Address a = new Address();
		a.setADD_ID("001");
		a.setADD_LINE("Arvind Nagar Society");
		a.setCITY("Navsari");
		a.setCOUNTRY("India");
		
		HibernateManager hm = new HibernateManager();
		hm.insert(e);
	}
}
