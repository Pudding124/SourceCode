package SourceCode;

import java.util.*;

public class uva10242{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        while(input.hasNext()){
            Double[][] data = new Double[4][2];
            Double downX = 0.0;
            Double downY = 0.0;
            Double topX = 0.0;
            Double topY = 0.0;
            for(int i = 0;i<4;i++){
                data[i][0] = input.nextDouble();
                data[i][1] = input.nextDouble();
            }
            boolean control = false;
            for(int i = 0;i<4;i++){
                for(int j = 0;j<4;j++){
                    if(i != j){
                        String tmp1 = String.valueOf(data[i][0]);
                        String tmp2 = String.valueOf(data[i][1]);
                        String tmp3 = String.valueOf(data[j][0]);
                        String tmp4 = String.valueOf(data[j][1]);

                        if(tmp1.equals(tmp3) && tmp2.equals(tmp4)){
                            downX = Double.valueOf(tmp1);
                            downY = Double.valueOf(tmp2);
                            control = true;
                            break;
                        }
                    }
                }
                if(control){
                    break;
                }
            }

            for(int i = 0;i<4;i++){
                if(!String.valueOf(data[i][0]).equals(String.valueOf(downX)) || !String.valueOf(data[i][1]).equals(String.valueOf(downY))){
                    topX = topX + data[i][0];
                    topY = topY + data[i][1];
                }
            }

            System.out.printf("%3.3f %3.3f",(topX-downX),(topY-downY));
            System.out.println();
        }

    }

}