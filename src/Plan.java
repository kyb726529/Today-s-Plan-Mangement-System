
public class Plan {
	String what;
	String when;
	int priority;
	
	public Plan() {
		
	}
	
	public Plan(String what, String when, int priority) {
		this.what = what;
		this.when = when;
		this.priority = priority;
	}
	public void printInfo(){
		System.out.println("what : "+what);
		System.out.println("when : "+when);
		System.out.println("priority : "+priority);
		
	}
}
