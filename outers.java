 class outer {
    int a=2;
 class inner{
    int y=4;
 }
}
public class outers
{
    public static void main(String[] args) 
 {
    outer obj=new outer();
    outer.inner obj1=obj.new inner();
    System.out.println(obj.a+obj1.y);
}
}