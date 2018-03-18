package SourceCode;

import java.util.*;

public class uva10056{

    public static void main(String[] args){ //[q ^ (k-1) * p] / (1 - q ^ n)

        Scanner input = new Scanner(System.in);
        int Case = input.nextInt();
        for(int i = 0;i<Case;i++){

            int people = input.nextInt();
            Double opp = input.nextDouble();
            int num = input.nextInt();

            Double result = 0.0000;
            Double lose1 = 1-opp;
            Double lose2 = 1-opp;
            for(int x = 0;x<num-2;x++){
                lose1 = lose1*(1-opp);
            }
            for(int x = 0;x<people-1;x++){
                lose2 = lose2*(1-opp);
            }
            if(num == 1){
                result = opp/(1-lose2);
            }else if(opp != 0.0000){
                result = (lose1*opp)/(1-lose2);
            }

            System.out.printf("%.4f",result);
            System.out.println("");
        }

    }

}