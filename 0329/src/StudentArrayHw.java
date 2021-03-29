
import java.util.Scanner;

//나예진

class Student2{
	private String name;
	private String phone;
	private String birth;
	
	Student2(String name, String phone, String birth) {
		this.name=name;
		this.phone=phone;
		this.birth=birth;
	}
	
	Student2(String name){
		this.name=name;
	}
		
	public void showInfo() {
		if(birth==null || birth.isEmpty()) {
			System.out.println("name : "+name);
			System.out.println("phone : "+phone);
		}else {
			System.out.println("name : "+name);
			System.out.println("phone : "+phone);
			System.out.println("birth : "+birth);
		}
	}
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
}

public class StudentArrayHw {
	static Scanner sc2 = new Scanner(System.in);
	static Student2[] stList = new Student2[100];
	static int index=0;
	
	private static void inputData() {
		System.out.print("이름 : ");
		String name=sc2.nextLine();
		System.out.print("전화번호 : ");
		String phone=sc2.nextLine();
		System.out.print("생년월일 : ");
		String birth=sc2.nextLine();
		System.out.println("데이터 입력이 완료되었습니다\n");
		
		stList[index++]=new Student2(name,phone,birth);
	}
	
	private static void showData() {
		System.out.println("--------------------전체 데이터 조회----------------");
		
		for(int i=0;i<index;i++) {
			stList[i].showInfo();
			System.out.println();
		}
	}

	private static void searchData() {
		
		System.out.println("데이터 검색을 시작합니다");
		System.out.print("이름 : ");
		String name=sc2.next();
		
		Student2 st = new Student2(name);
		st.setName(name);
		
		for(int i=0;i<index;i++) {
			if(name.equals(stList[i].getName())){
				stList[i].showInfo();
			}
		}
		System.out.println("데이터 검색이 완료되었습니다.\n");
	}
	
	private static void delData() {
		System.out.println("데이터 삭제를 시작합니다.");
		System.out.print("이름 : ");
		String name=sc2.next();
		
		Student2 st = new Student2(name);
		st.setName(name);
		
		for(int i=0;i<index;i++) {
			if(name.equals(stList[i].getName())) {
				stList[i] = stList[i+1];
			}
		}
		index--;
		
		System.out.println("삭제가 완료되었습니다.\n");
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("선택하세요\n1.데이터입력\n2.전체 데이터 조회"
									+ "\n3.데이터 검색\n4.데이터 삭제\n5.프로그램 종료");
			System.out.print("\n선택 : ");
			int select=sc.nextInt();
			
			switch(select) {
			case 1:
				inputData();
				break;
			
			case 2:
				showData();
				break;
				
			case 3:
				searchData();
				break;
				
			case 4:
				delData();
				break;
				
			case 5:
				System.out.println("프로그램을 종료합니다");
				System.exit(0);
			
			default:
				System.out.println("잘못입력!");
				continue;
			}
		}//while
	}

}
