package SourceCode;

import java.util.*;

public class uva10783{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int Case = input.nextInt();

        for(int i =1;i<=Case;i++){
            int min = input.nextInt();
            int max = input.nextInt();
            int result = 0;
            if(min == max){
                System.out.print("Case "+i+": "+result);
            }
            if(min%2 == 0){
                min = min+1;
            }
            while(min<=max){
                result = result + min;
                min += 2;
            }
            System.out.print("Case "+i+": "+result);
            System.out.println();
        }
    }

}