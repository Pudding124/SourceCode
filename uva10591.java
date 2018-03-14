//使用Java的考生請注意，最外層的類別(class)需命名為 main 。
//如果遇到超乎想像的狀況，請更改編譯器試看看!! 各編譯器特性不同!!
//預設測資、隨機測資、固定測資是用來幫助除錯用的。批改時，只看暗中測資是否通過!!
import java.util.*;

public class uva10591{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int CaseNum = input.nextInt();

        for(int i = 1;i<=CaseNum;i++){
            ArrayList<String> list = new ArrayList<String>();
            String num = input.next();
            String tmp = num;
            boolean control = true;
            while(control){

                int tmpNum = 0;

                for(int x = 0;x<tmp.length();x++){
                    int store = Integer.valueOf(tmp.substring(x,x+1));
                    tmpNum = tmpNum + (store*store);
                }
                tmp = String.valueOf(tmpNum);
                if(tmp.equals("1")){
                    System.out.println("Case #"+i+": "+num+" is a Happy number.");
                    control = false;
                }
                for(String data:list){
                    if(tmp.equals(data)){
                        System.out.println("Case #"+i+": "+num+" is an Unhappy number.");
                        control = false;
                    }
                }
                list.add(tmp);
            }

        }
    }
}