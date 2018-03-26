package SourceCode;

import java.util.*;

public class uva11063{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int count = 1;
        while(input.hasNext()){
            int dataNum = input.nextInt();
            int[] num = new int[dataNum];
            for(int i = 0;i<dataNum;i++){
                num[i] = input.nextInt();
            }

            int[] result = new int[((1+num.length)*num.length)/2];
            int count1 = 0;
            for(int x = 0;x<num.length;x++){
                for(int y = x;y<num.length;y++){
                    result[count1] = num[x]+num[y];
//System.out.println(result[x+y]);
                    count1++;
                }
            }
            boolean control = false;
            for(int x = 0;x<result.length;x++){
                for(int y = 0;y<result.length;y++){
                    if(result[x] == result[y] && x!=y){
                        control = true;
//System.out.println("Case #"+count+x+": "+result[x]);
                    }
                }
            }
            if(control && count == 1){
                System.out.println("Case #"+count+": It is not a B2-Sequence.");
            }else if(!control && count == 1){
                System.out.println("Case #"+count+": It is a B2-Sequence.");
            }else if(control){
                System.out.println();
                System.out.println("Case #"+count+": It is not a B2-Sequence.");
            }else{
                System.out.println();
                System.out.println("Case #"+count+": It is a B2-Sequence.");
            }
            count++;
        }

    }

}