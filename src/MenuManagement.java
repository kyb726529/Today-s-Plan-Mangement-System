import java.util.Scanner;

public class MenuManagement {

	public static void main(String[] args) {
		int num=0;
		Scanner input=new Scanner(System.in);
		while(num!=6) {
		
		System.out.println("1. Add Studnet");
		System.out.println("2. Delete Student");
		System.out.println("3. Edit Student");
		System.out.println("4. View Student");
		System.out.println("Exit");
		System.out.println("Slect one number between 1-6");
		num=input.nextInt();
		if(num==1) {
			System.out.println("Student Id :");
			int StudentId=input.nextInt();
			System.out.println("Student Name :");
			String StudentName=input.next();
			}
		}

	}
}
