package variables;

public class Employee01 {
	//salary variable is a private static variable
    private static double salary;//default value 0.0;
    public static final String DEPARTMENT="Development";
	public static void main(String[] args) {
		salary=1000;
		System.out.println(DEPARTMENT + "average salary "+ salary);//Development average salary 1000.0

	}

}
