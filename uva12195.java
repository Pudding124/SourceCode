import java.util.*;
public class uva12195 {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String compare[] = {"W","64","H","32","Q","16","E","8","S","4","T","2","X","1"};
        while(input.hasNext()){

            String text = input.nextLine();
            int num = 0;
            if(text.equals("*")) break;

            String eachText[] = text.split("/");
            for(int i = 0;i<eachText.length;i++){
                int count = 0;
                String tmp = eachText[i];
                for(int g = 0;g<tmp.length();g++){
                    for(int j = 0;j<compare.length;j++){
                        if(tmp.substring(g,g+1).equals(compare[j])){
                            count = count + Integer.valueOf(compare[j+1]);
                        }
                    }
                }
                if(count == 64){
                    num = num +1;
                }
            }
            System.out.print(num+"\r\n");
        }
    }

}
