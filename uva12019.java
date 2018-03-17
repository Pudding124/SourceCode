package SourceCode;

import java.util.*;

public class uva12019{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int Case = input.nextInt();
        int month[] = {1,31,2,28,3,31,4,30,5,31,6,30,7,31,8,31,9,30,10,31,11,30,12,31};
        for(int i = 0;i<Case;i++){
            int M = input.nextInt();
            int D = input.nextInt();
            int Result = 0;
            for(int x = 0;x<month.length;x++){
                if(M == month[x]){
                    for(int y = x-1;y>0;y-=2){
                        Result = Result + month[y];
                    }
                    break;
                }
            }

            Result = Result + D;
            if(Result%7 == 0){
                System.out.println("Friday");
            }else if(Result%7 == 1){
                System.out.println("Saturday");
            }else if(Result%7 == 2){
                System.out.println("Sunday");
            }else if(Result%7 == 3){
                System.out.println("Monday");
            }else if(Result%7 == 4){
                System.out.println("Tuesday");
            }else if(Result%7 == 5){
                System.out.println("Wednesday");
            }else if(Result%7 == 6){
                System.out.println("Thursday");
            }

        }

    }

}