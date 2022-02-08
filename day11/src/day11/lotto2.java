package day11;
import java.util.Random;
public class lotto2 {
	public static void main(String[] args) {
		Random ran = new Random();
		
		int lotto [][] = new int [5][7];
		int win = 0;
		
		for(int i = 0;i<5;i++)
		{
			for(int j = 0; j<7;j++)
			{
				int Rd = ran.nextInt(2);
				if(Rd == 1)
				{
					lotto[i][j] = 3;
				}
				else
				{
					lotto[i][j] = 0;
				}
				
			}
			
			int check = -1;
			int count = 0;
			for(int j = 0; j<7;j++)
			{
				if(lotto[i][j]==3)
				{
					count+=1;
				}
				else
				{
					count = 0;
				}
				if(count == 3)
				{
					check = 1;
				}
			}
			
			if(check==1&&win==0)
			{
				win = 1;
			}
			else if(check==1 && win == 1)
			{
				i--;
			}
		}
		for(int i = 0;i<5;i++)
		{
			for(int j = 0;j<7;j++)
			{
				System.out.print(lotto[i][j]+" ");
			}
			System.out.println();
		}
		if(win == 1)
		{
			System.out.println("´çÃ·ÀÔ´Ï´Ù");
		}
		
			
			
		}
		
		
}
