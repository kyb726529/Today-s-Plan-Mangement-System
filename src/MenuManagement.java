import java.util.Scanner;

public class MenuManagement {

	public static void main(String[] args) {
		int num=0;
		Scanner input=new Scanner(System.in);
		while(num!=6) {
		
		System.out.println("1. Add Plan");
		System.out.println("2. Delete Plan");
		System.out.println("3. Edit Plan");
		System.out.println("4. View Plan");
		System.out.println("Exit");
		System.out.println("Slect one number between 1-6");
		num=input.nextInt();
		if(num==1) {
			System.out.println("What to do :");
			String NewPlan=input.next();
			System.out.println("When to do :");
			int Priority=input.nextInt();
			}
		}

	}
}
