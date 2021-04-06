import java.util.Scanner;

public class PlanManager {
	Plan plan;
	Scanner input;
	PlanManager(Scanner input) {
		this.input=input;
		
	}
	
	
	public void addplan() {
		plan= new Plan();
		System.out.println("What to do :");
		plan.what=input.next();
		System.out.println("When to do :");
		plan.when=input.next();
		System.out.println("Priority :");
		plan.priority=input.nextInt();
	} 
	public void deleteplan() {
		System.out.println("Plan Name :");
		String WhatPlan=input.next();
		if(plan==null) {
			return;
		}
		if(plan.what==WhatPlan) {
			plan=null;
			System.out.println("삭제되었습니다.");	
		}
		
	}
	public void editplan() {
		System.out.println("Plan Name :");
		String WhatPlan=input.next();
		if(plan.what==WhatPlan) {
			System.out.println("Edited plan will be"+plan);	
		}
		
	}
	public void viewplan() {
		System.out.println("What to do :");
		String WhatPlan=input.next();
		if(plan.what==WhatPlan) {
			plan.printInfo();
		}
	}
}
