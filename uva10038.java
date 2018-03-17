package SourceCode;
import java.util.*;

public class uva10038{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        while(input.hasNext()){

            int num = input.nextInt();
            int[] data = new int[num];
            int min = 1;
            int max = num-1;
            boolean control = true;
            ArrayList<Integer> tmp = new ArrayList<Integer>();
            for(int i = 0;i<num;i++){
                data[i] = input.nextInt();
            }

            for(int j = 0;j<num-1;j++){
                int Result = Math.abs(data[j]-data[j+1]);

                for(int key : tmp){
                    if(Result == key){
                        System.out.println("Not jolly");
                        control = false;
                        break;
                    }
                }
                if(!control){
                    break;
                }

                if(Result<min || Result>max){
                    System.out.println("Not jolly");
                    control = false;
                    break;
                }else{
                    tmp.add(Result);
                }

            }

            if(control){
                System.out.println("Jolly");
            }

        }

    }

}