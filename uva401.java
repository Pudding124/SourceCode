package SourceCode;

//使用Java的考生請注意，最外層的類別(class)需命名為 main 。
//如果遇到超乎想像的狀況，請更改編譯器試看看!! 各編譯器特性不同!!
//預設測資、隨機測資、固定測資是用來幫助除錯用的。批改時，只看暗中測資是否通過!!
import java.util.*;

public class uva401{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        HashMap<String,String> map = new HashMap<String,String>();
        map.put("A","A");
        map.put("E","3");
        map.put("H","H");
        map.put("I","I");
        map.put("J","L");
        map.put("L","J");
        map.put("M","M");
        map.put("O","O");
        map.put("S","2");
        map.put("T","T");
        map.put("U","U");
        map.put("V","V");
        map.put("W","W");
        map.put("X","X");
        map.put("Y","Y");
        map.put("Z","5");
        map.put("1","1");
        map.put("2","S");
        map.put("3","E");
        map.put("5","Z");
        map.put("8","8");
        while(input.hasNextLine()){

            String data = input.nextLine();

            boolean isPalindrome = true;
            boolean isMirrored = true;

            for(int x = 0;x < data.length();x++){
                if(!(data.substring(x,x+1).equals(data.substring(data.length()-x-1,data.length()-x)))){
                    isPalindrome = false;
                    break;
                }
            }
            String result = "";
            for(int x = 0;x < data.length();x++){
                for(String key : map.keySet()){
                    if((data.substring(x,x+1).equals(key))){
                        result = result + map.get(key);
                    }
                }
            }

            for(int x = 0;x < data.length();x++){
                if(!(data.substring(x,x+1).equals(result.substring(result.length()-x-1,result.length()-x)))){
                    isMirrored = false;
                    break;
                }
            }

            if(!isPalindrome && !isMirrored){
                System.out.println(data+" -- is not a palindrome.");
                System.out.println();
            }else if(isPalindrome && !isMirrored){
                System.out.println(data+" -- is a regular palindrome.");
                System.out.println();
            }else if(!isPalindrome && isMirrored){
                System.out.println(data+" -- is a mirrored string.");
                System.out.println();
            }else if(isPalindrome && isMirrored){
                System.out.println(data+" -- is a mirrored palindrome.");
                System.out.println();
            }

        }

    }

}