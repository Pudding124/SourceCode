package SourceCode;

import java.util.*;

public class uva10415{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int Case = input.nextInt();
        String cmp[] = {"c0111001111", "d0111001110", "e0111001100", "f0111001000", "g0111000000", "a0110000000", "b0100000000", "C0010000000", "D1111001110", "E1111001100", "F1111001000", "G1111000000", "A1110000000", "B1100000000"};
        for(int i = 0;i<Case;i++){
            String current = "0000000000";
            int[] result = new int[10];
            String data = input.next();
            for(int x = 0;x<data.length();x++){
                String tmp = data.substring(x,x+1);

                for(int y = 0;y<cmp.length;y++){
                    if(tmp.equals(cmp[y].substring(0,1))){
                        tmp = cmp[y].substring(1,11);
                        break;
                    }
                }

                for(int y = 0;y<tmp.length();y++){
                    String per = tmp.substring(y,y+1);
                    if(per.equals("1") && current.substring(y,y+1).equals("0")){
                        result[y]++;
                    }
                }
                current = tmp;
            }

            for(int z = 0;z<10;z++){
                if(z == 9){
                    System.out.println(result[z]);
                }else{
                    System.out.print(result[z]+" ");
                }
            }

        }

    }

}