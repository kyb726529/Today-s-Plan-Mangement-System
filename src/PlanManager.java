import java.util.ArrayList;
import java.util.Scanner;

public class PlanManager {
	ArrayList<Plan> plans= new ArrayList<Plan>();
	Scanner input;
	PlanManager(Scanner input) {
		this.input=input;
		}
	public void addplan() {
		int kind=0;
		Plan plan= new Plan();//맞나???
		while(kind!=1&&kind!=2) {
			
			System.out.println("1 for Day :");
			System.out.println("2 for Mounth :");
			System.out.println("1, 2 중 선택");
			kind=input.nextInt();
			if(kind==1) { 
				plan=new DayPlan(PlanKind.DayPlan);
				plan.getPlanInput(input);
				plans.add(plan);
				break;
			}
			else if(kind==2) { 
				plan=new MonthPlan(PlanKind.MonthPlan);
				plan.getPlanInput(input);
				plans.add(plan);
				break;
			}
			else {
				System.out.println("Select num for Plan Kind between 1 and 2");
			}
		}
//		System.out.println("무엇을 해야합니까? :");    얘넨 왜 사라졌지??
//		plan.what=input.next();
//		System.out.println("언제까지 해야됩니까? :");
//		plan.when=input.next();
//		System.out.println("우선순위는? :");
//		plan.priority=input.nextInt();
//		plans.add(plan);
//		}
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
		if(index>=0) {
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
					System.out.println("**편집 메뉴**");
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
