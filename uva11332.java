import java.util.*;
public class uva11332 {

    public static void main(String[] args){

        Scanner input  = new Scanner(System.in);

        while(true){
            String data = input.next();
            if(data.equals("0"))break;

            while(data.length()>1){
                data = String.valueOf(algo(data));
            }
            System.out.println(data);
        }



    }

    public static int algo(String num){
        int result = 0;
        for(int i = 0;i<num.length();i++){
            result = result + Integer.valueOf(num.substring(i,i+1));
        }
        return result;
    }

}
