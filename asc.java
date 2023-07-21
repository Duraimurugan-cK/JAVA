class asc {
    public static void  main(String args[]) {
        int a[]={1};
        for(int i=a.length-1;i>=0;i--)
        {
            if(a[i]<9)
            {
                a[i]++;
                for(int i=0;i<a.length;i++)
                {
                    System.out.print(a[i]+" ");
                }
            }
        }
        int newa[]=new int[a.lenght+1];
        newa[0]=1;
        for(int i=0;i<2;i++)
                {
                    System.out.print(newa[i]+" ");
                }
        
    }
}