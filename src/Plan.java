public class Plan {
	PlanKind kind=new PlanKind();
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
	public Plan(PlanKind kind, String what, String when, int priority) {
		this.kind=kind;
		this.what = what;
		this.when = when;
		this.priority = priority;
	}
	
	String skind="none";
	public void printInfo(){
		switch(this.kind) {
		case "���":
			skind="Hobby";
			break;
		case "�о�":
			skind="Study";
			break;
		default:
		}
		System.out.println("kind : "+skind);
		System.out.println("what : "+what);
		System.out.println("when : "+when);
		System.out.println("priority : "+priority);
		}
}
