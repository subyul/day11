package day11;
import java.util.Scanner;

public class shopping {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	String id[] = {"qwer","javaking","abcd"};
	String pw[] = {"1111","2222","3333"};
	
	
	int max = 100;
	int jang [][] = new int[max][2];
	
	int count = 0;
	
	String item [] = {"���","�ٳ���","����"};
	
	int log = -1;
	
	while(true)
	{
	
	for(int i = 0; i<id.length;i++)
	{
		System.out.print("�α����� ���̵� �Է��ϼ��� : ");
		String iddata = sc.next();
		System.out.println();
		
		System.out.print("�н����带 �Է��ϼ��� : ");
		String pwdata = sc.next();
		System.out.println();
		if(id[i].equals(iddata))
		{
			if(pw[i].equals(pwdata))
			{
				log = i;
				System.out.println("�޴��� �����ϼ���");
				System.out.println("1. ����");
				System.out.println("2. ����");
				System.out.print("�Է� :");
				int menu = sc.nextInt();
				
				if(menu == 1)
				{
					System.out.println("��ǰ���");
					System.out.println("1. ���");
					System.out.println("2. �ٳ���");
					System.out.println("3. ����");
					System.out.println("�Է� : ");
					int select = sc.nextInt();
					
					if(select == 1)
					{
						
					}
					
				}
			
			}
		}
	}
	}
	
	
}
}
