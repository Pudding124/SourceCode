package SourceCode;

import java.util.*;

public class uva10409{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        while(input.hasNext()){
            int Case = input.nextInt();
            if(Case == 0)break;
            int top = 1;
            int down = 6;
            int N = 2;
            int S = 5;
            int W = 3;
            int E = 4;
            for(int i = 0;i<Case;i++){
                String cmd = input.next();
                if(cmd.equals("north")){
                    int tmp1 = top;
                    int tmp2 = down;
                    top = S;
                    down = N;
                    N = tmp1;
                    S = tmp2;
                }else if(cmd.equals("south")){
                    int tmp1 = top;
                    int tmp2 = down;
                    top = N;
                    down = S;
                    N = tmp2;
                    S = tmp1;
                }else if(cmd.equals("west")){
                    int tmp1 = top;
                    int tmp2 = down;
                    top = E;
                    down = W;
                    W = tmp1;
                    E = tmp2;
                }else if(cmd.equals("east")){
                    int tmp1 = top;
                    int tmp2 = down;
                    top = W;
                    down = E;
                    W = tmp2;
                    E = tmp1;
                }
            }
            System.out.println(top);
        }
    }

}