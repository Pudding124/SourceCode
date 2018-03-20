package SourceCode;

import java.util.*;
public class uva10019{

    public static int[] bin = new int[14];
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        bin[0] = 1;
        bin[1] = 2;
        for(int i = 2;i<14;i++){
            bin[i] = bin[i-1]*2;
        }
        int Case = input.nextInt();

        for(int i = 0;i<Case;i++){
            int D = input.nextInt();
            System.out.println(ten(D)+" "+sis(D));
        }

    }

    public static int ten(int n){
        int count = 0;
        for(int i = 13;i>=0;i--){
            if(n >= bin[i]){
                n = n - bin[i];
                count++;
            }
        }
        return count;
    }

    public static int sis(int n){
        int count = 0;
        while(n > 0){
            int tmp = n%10;
            for(int i = 3;i>=0;i--){
                if(tmp>=bin[i]){
                    tmp = tmp - bin[i];
                    count++;
                }
            }
            n = n/10;
        }
        return count;
    }

}