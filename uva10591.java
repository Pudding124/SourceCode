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