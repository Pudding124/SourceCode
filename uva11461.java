import java.util.*;
public class uva11461 {
    public static void main(String[] args){

        Scanner  input = new Scanner(System.in);

        while(input.hasNext()){
            int min = input.nextInt();
            int max = input.nextInt();
            if(min == 0 && max == 0){
                break;
            }

            int count = 0;
            int num = 1;
            while(true){
                int tmp = num*num;
                if(tmp >= min && tmp <= max){
                    count++;
                }else if(tmp > max){
                    break;
                }
                num++;
            }
            System.out.println(count);
        }
    }
}
