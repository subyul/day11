package day11;
import java.util.Scanner;
import java.util.Random;
public class StringEx10 {
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
	
	for(int j = 0; j<word.length;j++)
	{
		System.out.println("문제 : "+word[j]);
		
		System.out.print("입력 : ");
		String data = sc.next();
		
		if(word[j].equals(data))
		{
			continue;
		}
		else
		{
			break;
		}
		
		
		
	}
}
}
