package SourceCode;

import java.util.*;

public class uva11150{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        while(input.hasNext()){
            int bottle = input.nextInt();
            int result = 0;
            if(bottle %3 == 2 || bottle %3 == 1 || bottle %3 == 0){
                int n_bottle = 1;
                while(bottle > 0){
                    result = result + bottle;
                    int tmp = bottle;
                    bottle = (bottle+n_bottle)/3;
                    n_bottle = (tmp+n_bottle)%3;
                }
            }
            System.out.println(result);
        }

    }
}
