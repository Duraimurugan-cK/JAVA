public class wrappers {
    public static void main(String[] args) {
        int n=5;
        Integer obj=Integer.valueOf(n);//boxing
        int j=obj.intValue();//unboxing
        Integer k=20;//Integer.value autoboxing
        int l=obj;//auto unboxing
        String s="123";
        int y=Integer.parseInt(s);
        System.out.println(y);
    }
    
}
