package SourceCode;

import java.util.*;

public class uva10642{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int Case = input.nextInt();
        for(int i = 1;i<=Case;i++){
            int x = input.nextInt();
            int y = input.nextInt();
            int targetX = input.nextInt();
            int targetY = input.nextInt();
            int count = 0;
            while(x != targetX || y != targetY){
                if(y > 0){
                    x = x + 1;
                    y = y - 1;
                    count++;
                }else if(y == 0){
                    y = x + 1;
                    x = 0;
                    count++;
                }
            }
            System.out.println("Case "+i+": "+count);
        }

    }

}
//x y
//0 0
//0 1
//1 0
//0 2
//1 1
//2 0
//0 3