package SourceCode;
import java.util.*;

public class uva490{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        ArrayList<String> store = new ArrayList<String>();
        int max = 0;
        while(input.hasNext()){

            String data = input.nextLine();
            if(data.length()>max){
                max = data.length();
            }
            store.add(data);
        }

        for(int x = 0;x<max;x++){

            for(int y = store.size()-1;y>=0;y--){

                if(store.get(y).length()> x){
                    System.out.print(store.get(y).substring(x,x+1));
                }else if(y == 0){
                    System.out.print("");
                }else{
                    System.out.print(" ");
                }

            }
            System.out.println("");
        }

    }

}