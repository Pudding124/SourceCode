package SourceCode;

import java.util.*;

public class uva10193{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int Case = input.nextInt();
        int[] bin = new int[31];
        bin[0] = 1;
        bin[1] = 2;
        for(int i = 2;i<31;i++){
            bin[i] = bin[i-1]*2;
        }
        for(int i = 1;i<=Case;i++){
            String A = input.next();
            String B = input.next();
            int A_sum = 0;
            int B_sum = 0;
            int vari = 0;
            for(int x = A.length();x>0;x--){
                if(A.substring(x-1,x).equals("1")){
                    A_sum = A_sum + bin[vari];
                }
                vari++;
            }
            vari = 0;
            for(int x = B.length();x>0;x--){
                if(B.substring(x-1,x).equals("1")){
                    B_sum = B_sum + bin[vari];
                }
                vari++;
            }

            boolean control = true;
            if(A_sum > B_sum){
                for(int x = 2;x<=B_sum;x++){
                    if((A_sum%x)==0 && (B_sum%x)==0){
                        System.out.println("Pair #"+i+": All you need is love!");
                        control = false;
                        break;
                    }
                }
            }else{
                for(int x = 2;x<=A_sum;x++){
                    if((A_sum%x)==0 && (B_sum%x)==0){
                        System.out.println("Pair #"+i+": All you need is love!");
                        control = false;
                        break;
                    }
                }
            }
            if(control){
                System.out.println("Pair #"+i+": Love is not all you need!");
            }
        }
    }

}