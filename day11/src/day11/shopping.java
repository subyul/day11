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
	
	String item [] = {"사과","바나나","딸기"};
	
	int log = -1;
	
	while(true)
	{
	
	for(int i = 0; i<id.length;i++)
	{
		System.out.print("로그인할 아이디를 입력하세요 : ");
		String iddata = sc.next();
		System.out.println();
		
		System.out.print("패스워드를 입력하세요 : ");
		String pwdata = sc.next();
		System.out.println();
		if(id[i].equals(iddata))
		{
			if(pw[i].equals(pwdata))
			{
				log = i;
				System.out.println("메뉴를 선택하세요");
				System.out.println("1. 쇼핑");
				System.out.println("2. 종료");
				System.out.print("입력 :");
				int menu = sc.nextInt();
				
				if(menu == 1)
				{
					System.out.println("상품목록");
					System.out.println("1. 사과");
					System.out.println("2. 바나나");
					System.out.println("3. 딸기");
					System.out.println("입력 : ");
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
