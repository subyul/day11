package day11;
import java.util.Scanner;
import java.util.Random;
public class StringEx12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		
		String [] word = {"java","mysql","jsp","spring"};
		
		int i = 0;
		while (i<1000)
		{
			int Rd = ran.nextInt(word.length);
			String temp = word[0];
			word[0] = word[Rd];
			word[Rd] = temp;
			i++;
		}
		
		i = 0;
		while(i<word.length)
		{
			int Rd = ran.nextInt(word[i].length());
			
			System.out.print("문제 : " );
			for(int j = 0; j<word[i].length();j++)
			{
				if(j==Rd)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(word[i].charAt(j));
				}
				
			}
			System.out.println();
			
			System.out.print("입력 : ");
			String data = sc.next();
			
			if(data.equals(word[i]))
			{
				System.out.println("정답");
				i++;
			
			}
			else
			{
				System.out.println("오답");
			}
		}
	}

}
