package SourceCode;

import java.util.*;

public class uva10235{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        while(input.hasNext()){
            int num = input.nextInt();
            int rotation = 0;

            String tmp = String.valueOf(num);
            String tmp2 = "";
            for(int i = tmp.length();i>0;i--){
                tmp2 = tmp2 + tmp.substring(i-1,i);
            }
            rotation = Integer.valueOf(tmp2);
            if(P(num)){
                if(P(rotation) && num != rotation){
                    System.out.println(num+" is emirp.");
                }else{
                    System.out.println(num+" is prime.");
                }
            }else{
                System.out.println(num+" is not prime.");
            }

        }

    }
    public static boolean P(int data){
        boolean control = true;
        for(int i = 2;i<=(data/2);i++){
            if((data%i)==0){
                control = false;
                break;
            }
        }
        return control;
    }
}