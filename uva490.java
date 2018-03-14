package SourceCode;
import java.util.Scanner;
public class uva490 {
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        while(input.hasNext()){
            String b = input.next();
            int judage = Integer.valueOf(b.substring(0,1));
            if(judage == 0 ) break;
            int callback = cul(b.length(),b);
            while(callback >= 10){
                String x = String.valueOf(callback);
                callback = cul(x.length(),x);
            }
            System.out.println(callback);
        }

    }

    public static int cul(int length,String body){
        int a = 0;
        for(int i = 0;i<length;i++){
            a = a + Integer.valueOf(body.substring(i,i+1));
        }

        return a;
    }
}
