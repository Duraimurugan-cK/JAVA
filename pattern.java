import java.util.*;
public class pattern
{
	public static void main(String[] args) {
		Scanner box=new Scanner(System.in);
		int num,row,col;
		num=box.nextInt();
		for(row=1;row<=num;row++,System.out.print("\n"))
		{
		    for(col=1;col<=num;col++)
		    {
		        if(col==1||col==num)
		        System.out.print("1");
		        else if(row==num/2+1)
		        System.out.print("2");
		        else
		        System.out.print(" ");
		    }
		}
	}
}