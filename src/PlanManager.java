import java.util.ArrayList;
import java.util.Scanner;

public class PlanManager {
	ArrayList<Plan> plans= new ArrayList<Plan>();
	Scanner input;
	PlanManager(Scanner input) {
		this.input=input;
		
	}
	
	
	public void addplan() {
		Plan plan= new Plan();
		System.out.println("What to do :");
		plan.what=input.next();
		System.out.println("When to do :");
		plan.when=input.next();
		System.out.println("Priority :");
		plan.priority=input.nextInt();
		plans.add(plan);
	} 
	public void deleteplan() {
		System.out.println("Plan Name :");
		String WhatPlan=input.next();
		int index=-1; 
		for(int i=0;i<plans.size();i++) {
			if(plans.get(i).what==WhatPlan) {
				index=i;
				break;	
			}
		}
		if(index<=0) {
			plans.remove(index); 
			System.out.println(WhatPlan+"이삭제되었습니다.");
		}
		else {
			System.out.println("찾치 못함");
			return;
		}
	}
	public void editplan() {
		System.out.println("Plan Name :");
		String WhatPlan=input.next();
		for(int i=0;i<plans.size();i++) {
			Plan plan=plans.get(i);
			if(plan.what.equals(WhatPlan)) {
				int num=-1;
				while(num!=4) {
					System.out.println("**Plan Info Edit Menu**");
					System.out.println("1. Edit What");
					System.out.println("2. Edit When");
					System.out.println("3. Edit priority");
					System.out.println("4. Exit");
					num=input.nextInt();
					if(num==1) {
						System.out.println("What :");
						plan.what=input.next();
					}
					if(num==2) {
						System.out.println("When :");
						plan.when=input.next();
					}
					if(num==3) {
						System.out.println("priority :");
						plan.priority=input.nextInt();
					}
					else {
						continue;
					}
				}
			}//while
			break;
		}//if
	}//for
		
	public void viewplans() {
//		System.out.println("What to do :");
//		String WhatPlan=input.next();
		for(int i=0;i<plans.size();i++) {
			plans.get(i).printInfo();
		}
		
	}
}
