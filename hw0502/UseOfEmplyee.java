package homework.hw0502;

import java.util.Scanner;

public class UseOfEmplyee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//{new Employee(),new Employee(),new Employee(),...}
		//{new RegularEmployee(),new RegularEmployee(),...}
		Employee[] empArr = new Employee[100];
		
		Scanner sc = new Scanner(System.in);
		
		int eno;
		String name;
		int pay;
		int bonus;
		int hireYear;
		int workDay;
		int index = 0;
		
		while(true) {
			System.out.println("*** 메뉴 선택 ***");
			System.out.println("1. 정규직 저장");
			System.out.println("2. 계약직 저장");
			System.out.println("3. 임시직 저장");
			System.out.println("4. 전체 사원 정보 출력");
			System.out.println("5. 월급 계산 출력");
			System.out.println("6. 프로그램 종료");
			
			int putNum = sc.nextInt();
			
			switch(putNum) {
			case 1:
				System.out.println("사번을 입력하세요.");
				eno = sc.nextInt();
				//이해안됨.
				sc.nextLine();
				System.out.println("이름을 입력하세요.");
				name = sc.nextLine();
				System.out.println("급여를 입력하세요.");
				pay = sc.nextInt();
				System.out.println("보너스를 입력하세요.");
				bonus = sc.nextInt();
				Employee emp = new RegularEmployee(eno,name,pay,1,bonus);
				empArr[index++]=emp;
				
				//empArr[index++] = new RegularEmployee(eno,name,pay,1,bonus);
				break;						
			case 2:
				System.out.println("사번을 입력하세요.");
				eno = sc.nextInt();
				System.out.println("이름을 입력하세요.");
				name = sc.nextLine();
				System.out.println("급여를 입력하세요.");
				pay = sc.nextInt();
				System.out.println("근무년수를 입력하세요.");
				hireYear = sc.nextInt();
				
				empArr[index++] = new TempEmployee(eno,name,pay,1,hireYear);
				break;
			case 3:
				System.out.println("사번을 입력하세요.");
				eno = sc.nextInt();
				System.out.println("이름을 입력하세요.");
				name = sc.nextLine();
				System.out.println("급여를 입력하세요.");
				pay = sc.nextInt();
				System.out.println("근무일수를 입력하세요.");
				workDay = sc.nextInt();
				empArr[index++] = new ContractEmployee(eno,name,pay,1,workDay);
				break;
			case 4:
				for(int i=0; i<empArr.length; i++) {
					if(empArr != null)
						empArr[i].showEmployeeInfo();
					System.out.println("-----------");
//				for(int i=0; i<index; i++) {
//					empArr[i].showEmployeeInfo();
//				}도 가능
				}
				break;
			case 5:
				System.out.println("검색할 사원의 사번을 입력하세요.");
				eno = sc.nextInt();
				
				for(int i =0; i<index; i++) {
					if(empArr[i].getEno()==eno) {
						empArr[i].showEmployeeInfo();
						System.out.println("-----------");
					}
				}
				//showEmployeeInfo();
				break;
			case 6:
				System.out.println("프로그램을 종료합니다.");
				//while문 나감
				sc.close();
				//프로그램을 종료하는 구문
				System.exit(0);
			default:
				System.out.println("잘못 입력했습니다.");
				//다시 while문 실행
				continue;
			}
		}
		
		/*
		 * 1번 선택 시
		 * 입력한 내용을 empArr에 저장
		 * 
		 * 2번 선택 시
		 * 입력한 내용을 empArr에 저장
		 * 
		 * 3번 선택 시
		 * 입력한 내용을 empArr에 저장
		 * 
		 * 4번 선택 시
		 * empArr에 저장되어 있는 모든 사원의 정보출력
		 * showEmployeeInfo() 메소드 사용
		 * 
		 * 5번 선택 시
		 * 검색할 사원의 사번을 입력하세요.
		 * 1
		 * 입력한 사번에 해당하는 사원의 정보 출력(showEmployeeInfo() 메소드 사용)
		 * 
		 * 6번 선택 시 
		 * 프로그램 종료
		 * 
		 * 다른 번호가 입력되면 
		 * 잘못 입력하셨습니다. 출력하고 다시 입력할 수 있도록 메뉴 표출
		 * */
	}
	public void showEmployeeInfo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("검색할 사원의 사번을 입력하세요.");
		int putNum = sc.nextInt();
		
		switch(eno) {
		case 1:
			System.out.println("사번:");
			System.out.println("이름:");
			System.out.println("보너스:");
		case 2:
			System.out.println("사번:");
			System.out.println("이름:");
			System.out.println("급여:");
			System.out.println("근무년수:");
		case 3:
			System.out.println("사번:");
			System.out.println("이름:");
			System.out.println("급여:");
			System.out.println("근무년수:");
		case 4:
			System.out.println(empArr);
		case 5:
			
		case 6:
			System.out.println("프로그램을 종료합니다.");
			break;
		}
	}
	
	//위 코드를 간략히 하기 위해 겹치는 부분을 메소드로 만들음
	public static Employee generateEmployee(Scanner sc, int putNum) {
		System.out.println("사번을 입력하세요.");
		int eno = sc.nextInt();
		System.out.println("이름을 입력하세요.");
		String name = sc.nextLine();
		System.out.println("급여를 입력하세요.");
		int pay = sc.nextInt();
		if(putNum==1) {
			System.out.println("보너스를 입력하세요.");
			int bonus = sc.nextInt();
			
			return new RegularEmployee(eno,name,pay,putNum,bonus);
		}else if(putNum==2){
			System.out.println("근무년수를 입력하세요.");
			int hireYear = sc.nextInt();
			return new RegularEmployee(eno,name,pay,putNum,hireYear);
		}else {
			System.out.println("근무일수를 입력하세요.");
			int workDay = sc.nextInt();
			return new RegularEmployee(eno,name,pay,putNum,workDay);
		}
		
	}

}
