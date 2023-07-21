public class encapsulation {
    private String name="durai";
    public String getname(){
        return name;
    }
    public void setname()
    {
        this.name=name;
    }
    public static void main(String args[])
    {
        encapsulation obj=new encapsulation();
        String names=obj.getname();
        System.out.println(names);
    }
}
