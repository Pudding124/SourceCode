package SourceCode;

import java.util.*;

public class uva10908{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int Case = input.nextInt();
        for(int i = 0;i<Case;i++){
            int martix_X = input.nextInt();
            int martix_Y = input.nextInt();
            int Ques = input.nextInt();
            input.nextLine();
            System.out.println(martix_X+" "+martix_Y+" "+Ques);
            String[][] martix = new String[martix_X][martix_Y];
            for(int x = 0;x<martix_X;x++){
                String data = input.nextLine();
                for(int y = 0;y<data.length();y++){
                    martix[x][y] = data.substring(y,y+1);
                }
            }
            for(int x = 0;x<Ques;x++){
                int targetX = input.nextInt();
                int targetY = input.nextInt();
                String target = martix[targetX][targetY];
                int count = 0;
                boolean control = true;
                while(control){
                    if(control){
                        count++;
                    }
                    int minX = targetX-count;
                    int minY = targetY-count;
                    int maxX = targetX+count;
                    int maxY = targetY+count;

                    if(minX < 0 || minY < 0){
                        break;
                    }
                    if(maxX >= martix_X || maxY >= martix_Y){
                        break;
                    }
                    for(int y = minX;y<=maxX;y++){
                        for(int z = minY;z<=maxY;z++){
                            if(!(martix[y][z]).equals(target)){
                                control = false;
                                break;
                            }
                        }
                        if(!control){
                            break;
                        }
                    }
                }
                System.out.println(((count-1)*2)+1);
            }
        }
    }

}