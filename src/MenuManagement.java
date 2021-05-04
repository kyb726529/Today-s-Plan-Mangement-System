 import java.util.Scanner;

public class MenuManagement {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		PlanManager planManager=new PlanManager(input);
		int num=0;
		while(num!=6) {
			System.out.println("1. Add Plan");
			System.out.println("2. Delete Plan");
			System.out.println("3. Edit Plan");
			System.out.println("4. View Plans ");
			System.out.println("5. Exit");
			System.out.println("Slect one number between 1-6");
			num=input.nextInt();
			if (num==1) {
				planManager.addplan();
			}
			else if(num==2) {
				planManager.deleteplan();
			}
			else if(num==3) {
				planManager.editplan();
			}
			else if(num==4) {
				planManager.viewplans();
			}
			else {
				System.out.println("Á¾·á");
				break;
			}
		}
	}	
}