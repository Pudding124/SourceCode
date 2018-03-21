package SourceCode;

import java.util.*;

public class uva10050{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int Case = input.nextInt();

        for(int i = 0;i<Case;i++){
            int D = input.nextInt();
            ArrayList<Integer> stopDay = new ArrayList<Integer>();
            ArrayList<Integer> hartalsDay = new ArrayList<Integer>();
            int x = 6;
            int y = 7;
            while(x<=D){
                stopDay.add(x);
                x = x + 7;
            }

            while(y<=D){
                stopDay.add(y);
                y = y + 7;
            }
            int Num = input.nextInt();
            for(int n = 0;n<Num;n++){
                int day = input.nextInt();
                int tmp = day;
                while(day<=D){
                    boolean control = true;
                    for(int key : hartalsDay){
                        if(key == day){
                            control = false;
                            break;
                        }
                    }
                    if(control){
                        hartalsDay.add(day);
                    }
                    day = day + tmp;
                }
            }
            int count = 0;
            for(int key1 : hartalsDay){
                boolean control = true;
                for(int key2 : stopDay){
                    if(key1 == key2){
                        control = false;
                        break;
                    }
                }
                if(control){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}