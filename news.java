import java.util.*;
class news
{
    public static void main(String[] args) {
        int n = 4;
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++){
                for (int k = j; k < n; k++){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}