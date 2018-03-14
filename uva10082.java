import java.util.*;
public class uva10082 {

    public static void main(String args[]){

        Scanner input = new Scanner(System.in);
        String origins = "`1234567890-=QWERTYUIOP[]\\ASDFGHJKL;'ZXCVBNM,./";
        String[] origin = new String[origins.length()];
        for(int j = 0;j<origins.length();j++){ //比較資訊
            origin[j] =  origins.substring(j,j+1);
        }
        while(input.hasNext()){

            String result = "";
            String codes = input.next();

            String[] code = new String[codes.length()];

            for(int i = 0;i<codes.length();i++){ //使用者輸入放入陣列
                code[i] = codes.substring(i,i+1);
            }

            for(int x = 0;x<codes.length();x++){
                for(int y = 0;y<origins.length();y++){
                    if(code[x].equals(origin[y])){
                        result = result+origin[y-1];
                        break;
                    }
                }
            }
            System.out.print(result+" ");
        }

    }

}
