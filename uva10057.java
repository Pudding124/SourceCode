package SourceCode;

import java.util.*;

public class uva10057{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        /* 1. 求A在input中最小值
           2. 求input中 有多少值跟A一樣
           3. 求所有整數中與 A 結果相同
         */

        while(input.hasNext()){

            int Case = input.nextInt();

            int[] num = new int[Case];

            for(int i = 0;i<Case;i++){
                num[i] = input.nextInt();
            }

            for(int x = Case-1;x>=0;x--){
                for(int y = 0;y<x;y++){
                    if(num[y] > num[y+1]){
                        int tmp = num[y];
                        num[y] = num[y+1];
                        num[y+1] = tmp;
                    }
                }
            }
            int A1 = num[Case/2];
            int A2 = num[(Case-1)/2];

            int count = 0;
            for(int x = 0;x<Case;x++){
                if(num[x] == A1 || num[x] == A2){
                    count++;
                }
            }

            int D = A1-A2+1;

            System.out.println(A2+" "+count+" "+D);

        }


    }

}
