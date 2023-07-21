import java.util.*;
public class withoutprintf {
    int i=1;
    public static void main(String[] args) {
        if(i<=20)
        {
            printf("%d",i);
            i++;
            withoutprintf();
        }
        
    }
    
}
