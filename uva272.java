package SourceCode;

import java.util.*;

public class uva272{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int count = 0;
        while(input.hasNext()){

            String data = input.nextLine();

            for(int i = 0;i<data.length();i++){
                if(data.substring(i,i+1).equals("\"") && count == 0){
                    System.out.print("``");
                    count = 1;
                }else if(data.substring(i,i+1).equals("\"") && count == 1){
                    System.out.print("''");
                    count = 0;
                }else{
                    System.out.print(data.substring(i,i+1));
                }
            }
            System.out.println("");
        }
    }
}