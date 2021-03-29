
import java.util.Scanner;

//������

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
		System.out.print("�̸� : ");
		String name=sc2.nextLine();
		System.out.print("��ȭ��ȣ : ");
		String phone=sc2.nextLine();
		System.out.print("������� : ");
		String birth=sc2.nextLine();
		System.out.println("������ �Է��� �Ϸ�Ǿ����ϴ�\n");
		
		stList[index++]=new Student2(name,phone,birth);
	}
	
	private static void showData() {
		System.out.println("--------------------��ü ������ ��ȸ----------------");
		
		for(int i=0;i<index;i++) {
			stList[i].showInfo();
			System.out.println();
		}
	}

	private static void searchData() {
		
		System.out.println("������ �˻��� �����մϴ�");
		System.out.print("�̸� : ");
		String name=sc2.next();
		
		Student2 st = new Student2(name);
		st.setName(name);
		
		for(int i=0;i<index;i++) {
			if(name.equals(stList[i].getName())){
				stList[i].showInfo();
			}
		}
		System.out.println("������ �˻��� �Ϸ�Ǿ����ϴ�.\n");
	}
	
	private static void delData() {
		System.out.println("������ ������ �����մϴ�.");
		System.out.print("�̸� : ");
		String name=sc2.next();
		
		Student2 st = new Student2(name);
		st.setName(name);
		
		for(int i=0;i<index;i++) {
			if(name.equals(stList[i].getName())) {
				stList[i] = stList[i+1];
			}
		}
		index--;
		
		System.out.println("������ �Ϸ�Ǿ����ϴ�.\n");
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("�����ϼ���\n1.�������Է�\n2.��ü ������ ��ȸ"
									+ "\n3.������ �˻�\n4.������ ����\n5.���α׷� ����");
			System.out.print("\n���� : ");
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
				System.out.println("���α׷��� �����մϴ�");
				System.exit(0);
			
			default:
				System.out.println("�߸��Է�!");
				continue;
			}
		}//while
	}

}
