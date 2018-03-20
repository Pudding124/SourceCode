package SourceCode;
import java.util.*;
public class uva10093 {
        public static void main(String[] args){

            Scanner input = new Scanner(System.in);

            while(input.hasNext()){
//A~Z 65~90
//a~z 97~122
                String data = input.next();
                int max = 0;
                int div = 0;
                int result = 0;
                if(data.substring(0,1).equals("+") || data.substring(0,1).equals("-")){
                    for(int x = 1;x<data.length();x++){
                        int tmp = 0;
                        int check = data.substring(x,x+1).charAt(0);
                        if(check >= 65 && check <= 90){
                            tmp = check-55;
                        }else if(check >= 97 && check <= 122){
                            tmp = check-61;
                        }else{
                            tmp = Integer.valueOf(data.substring(x,x+1));
                        }
                        if(max<=tmp){
                            max = tmp;
                        }
                        result = result + tmp;
                    }
                }else{
                    for(int x = 0;x<data.length();x++){
                        int tmp = 0;
                        int check = data.substring(x,x+1).charAt(0);
                        if(check >= 65 && check <= 90){
                            tmp = check-55;
                        }else if(check >= 97 && check <= 122){
                            tmp = check-61;
                        }else{
                            tmp = Integer.valueOf(data.substring(x,x+1));
                        }
                        if(max<=tmp){
                            max = tmp;
                        }
                        result = result + tmp;
                    }
                }

                for(int y = max;y<=62;y++){

                    if(result == 0){
                        System.out.println("2");
                        break;
                    }else if(result%y==0){
                        System.out.println(y+1);
                        break;
                    }else if(y == 62){
                        System.out.println("such number is impossible!");
                        break;
                    }

                }

            }




    }

}
