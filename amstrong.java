import java.util.*;
public class amstrong {
     public static void main(String args[]){
        int count=0,result=0,temp,rem;
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number:");
        int num=sc.nextInt();
        temp=num;
        while(temp!=0){
            rem=num/10;
            count++; 
        }
        while(temp!=0){
            int rev;
            rev=num%10;
            result+=(Math.pow(rev,count));
            temp=num/10;
        }
        if(result==num)
        System.out.println("amstrong number");
        else
        System.out.println("not a amstrong number:");
     }
}
