package SourceCode;
import java.util.*;

public class uva10931{

    public static void main(String[] args){

        long[] bin = new long[32];
        bin[0] = 1;
        bin[1] = 2;
        for(int i = 2;i<32;i++){
            bin[i] = bin[i-1]*2;
        }
        Scanner input = new Scanner(System.in);
        while(true){
            long I = input.nextLong();
            String Result = "";
            int count = 0;
            if(I == 0) break;

            for(int x = 31;x>=0;x--){
                if(I >= bin[x]){
                    I = I - bin[x];
                    Result = Result + "1";
                    count++;
                }else if(!Result.equals("")){
                    Result = Result + "0";
                }
            }
            System.out.println("The parity of "+Result+" is "+count+" (mod 2).");
        }

    }

}