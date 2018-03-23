import java.util.*;
public class uva10226 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        // TreeMap 會自動幫你依照字母做小到大的排序
        // !(tmp=input.nextLine()).equals("") 格式要看
        int Case = input.nextInt();
        input.nextLine();
        int i = 0;
        while(i<=Case){
            TreeMap<String, Double> store = new TreeMap<String, Double>();
            String tmp;
            if(i>1){
                System.out.println("");
            }
            while(input.hasNextLine() && !(tmp=input.nextLine()).equals("")){
                boolean control = true;
                for(String key : store.keySet()){
                    if(key.equals(tmp)){
                        store.put(key,store.get(key)+1.0);
                        control = false;
                        break;
                    }
                }
                if(control){
                    store.put(tmp, 1.0);
                }
            }

            Double total = 0.0;
            for(String key : store.keySet()){
                total = total + store.get(key);
            }

            for(String key : store.keySet()){
                store.put(key,((store.get(key))/total)*100.0);
            }

            for(String key : store.keySet()){
                System.out.printf("%s %3.4f",key,store.get(key));
                System.out.println();
            }
            i++;

        }
    }
}
