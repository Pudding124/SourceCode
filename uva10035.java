import java.util.*;
public class uva10035 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        while(input.hasNext()){
            int x = input.nextInt();
            int y = input.nextInt();
            int count = 0;
            int tmp = 0;
            if(x==0 && y==0){
                break;
            }
            while(x > 0 || y > 0){
                int x_num = x % 10;
                int y_num = y % 10;
                if((tmp + x_num + y_num) >= 10){
                    count++;
                    tmp = 1;
                    x = x / 10;
                    y = y / 10;
                }else{
                    x = x / 10;
                    y = y / 10;
                    tmp  = 0;
                }

            }


            if(count == 0){
                System.out.println("No carry operation.");
            }else{
                System.out.println(count+" carry operation.");
            }
        }

    }
}
