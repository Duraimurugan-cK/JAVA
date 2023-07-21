import java.util.*;
class spiralmodel{
    public static void  rec(int a[][],int rs,int re,int cs,int ce)
    {
        if(rs>re||cs>ce)
        {
            return;
        }
        for(int i=cs;i<=ce;i++)
        {
            System.out.print(a[rs][i]+",");
        }
        for(int i=rs+1;i<=re;i++)
        {
            System.out.print(a[i][ce]+",");
        }
        if(re!=cs)
        {
            for(int i=ce-1;i>=cs;i--)
            {
                System.out.print(a[re][i]+",");
            }
        }
        if(ce!=cs)
        {
            for(int i=re-1;i>=cs+1;i--)
            {
                    System.out.print(a[i][rs]+",");
            }
        }
        rec(a,rs+1,re-1,cs+1,ce-1);
        
}
    public static void main(String args[])
    {
        int a[][]={{1,2,3},{4,5,6},{7,8,9}};
        int rs=0,re=2,cs=0,ce=2;
        System.out.print("[");
        rec(a,rs,re,cs,ce);
        System.out.print("]");
}
}