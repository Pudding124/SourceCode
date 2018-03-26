package SourceCode;
import java.util.*;

public class uva10189{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int Case = 1;
        while(input.hasNext()){
            int col = input.nextInt();
            int row = input.nextInt();
            input.nextLine();
            if(col == 0 && row == 0)break;
            if(Case > 1){
                System.out.println();
            }
            System.out.println("Field #"+Case+":");
            String[][] num = new String[col][row];
            for(int x = 0;x<col;x++){
                String tmp = input.nextLine();
                for(int y = 0;y<row;y++){
                    if(tmp.substring(y,y+1).equals(".")){
                        num[x][y] = "0";
                    }else{
                        num[x][y] = tmp.substring(y,y+1);
                    }
                }
            }

            for(int x = 0;x<col;x++){
                for(int y = 0;y<row;y++){
                    if(num[x][y].equals("*")){
                        if((x-1)>=0 && !num[x-1][y].equals("*")){
                            int tmp = Integer.valueOf(num[x-1][y])+1;
                            num[x-1][y] = String.valueOf(tmp);
                        }
                        if((x+1)<col && !num[x+1][y].equals("*")){
                            int tmp = Integer.valueOf(num[x+1][y])+1;
                            num[x+1][y] = String.valueOf(tmp);
                        }
                        if((y-1)>=0 && !num[x][y-1].equals("*")){
                            int tmp = Integer.valueOf(num[x][y-1])+1;
                            num[x][y-1] = String.valueOf(tmp);
                        }
                        if((y+1)< row && !num[x][y+1].equals("*")){
                            int tmp = Integer.valueOf(num[x][y+1])+1;
                            num[x][y+1] = String.valueOf(tmp);
                        }
                        if((x-1)>=0 && (y-1)>=0 && !num[x-1][y-1].equals("*")){
                            int tmp = Integer.valueOf(num[x-1][y-1])+1;
                            num[x-1][y-1] = String.valueOf(tmp);
                        }
                        if((x+1)<col && (y+1)< row && !num[x+1][y+1].equals("*")){
                            int tmp = Integer.valueOf(num[x+1][y+1])+1;
                            num[x+1][y+1] = String.valueOf(tmp);
                        }
                        if((x+1)<col && (y-1)>=0 && !num[x+1][y-1].equals("*")){
                            int tmp = Integer.valueOf(num[x+1][y-1])+1;
                            num[x+1][y-1] = String.valueOf(tmp);
                        }
                        if((x-1)>=0 && (y+1)< row && !num[x-1][y+1].equals("*")){
                            int tmp = Integer.valueOf(num[x-1][y+1])+1;
                            num[x-1][y+1] = String.valueOf(tmp);
                        }
                    }
                }
            }

            for(int x = 0;x<col;x++){
                for(int y = 0;y<row;y++){
                    System.out.print(num[x][y]);
                }
                System.out.println();
            }
            Case++;
        }

    }

}