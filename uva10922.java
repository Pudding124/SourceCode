import java.util.*;
public class uva10922 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        while(true){

            String num = input.next();

            if(num.equals("0")) break;
            int result = 0;
            boolean control = true;
            for(int x = 0;x<num.length();x++){
                result = result + Integer.valueOf(num.substring(x,x+1));
            }
            if(result%9 != 0){
                System.out.println(num+" is not a multiple of 9.");
                control = false;
            }
            int count = 1;
            while(result > 9){
                count++;
                String tmp = String.valueOf(result);
                int tmpResult = 0;
                for(int x = 0;x<tmp.length();x++){
                    tmpResult = tmpResult + Integer.valueOf(tmp.substring(x,x+1));
                }
                result = tmpResult;
            }

            if(control){
                System.out.println(num+" is a multiple of 9 and has 9-degree "+count+".");
            }
        }
    }
}
