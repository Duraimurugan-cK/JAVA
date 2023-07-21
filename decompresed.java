import java.util.*;
class decompressed {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String st=str.toLowerCase();
        char arr[]=st.toCharArray();
        int c=str.length();
        int wcount=1,scount=0,vcount=0,lcount=0,k=0;
        for(int i=0;i<c;i++)
        {
            if(arr[i]==' ' && arr[i+1]!='\0')
            wcount++;
            if(arr[i]==' ')
            scount++;
            if(arr[i]=='a' || arr[i]=='e' || arr[i]=='i' || arr[i]=='o' || arr[i]=='u')
            {vcount++;}
            lcount=0;
            if(arr[i]==' ' || i==c-1)
            {
                for(int j=k;j<i;j++)
                {
                    if(arr[j]=='a' || arr[j]=='e' || arr[j]=='i' || arr[j]=='o' || arr[j]=='u')
                    lcount++;
                }
                for(int m=k;m<i;m++)
                {
                    System.out.print(arr[m]);
                }
                System.out.print(":"+lcount+"\n");
                k=i+1;
            }
        }
        System.out.println("Word count:"+wcount);
        System.out.println("Space count:"+scount);
        System.out.println("Vowels count:"+vcount);
}
}