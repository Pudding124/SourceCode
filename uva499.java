import java.util.*;
public class uva499 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        while (input.hasNext()){

            HashMap<String,Integer> table = new HashMap<String, Integer>();
            String undatas = input.nextLine();
            String datas = undatas.replaceAll(" ", "");

            String[] data = new String[datas.length()];
            for(int i = 0;i<datas.length();i++){
                    data[i] = datas.substring(i,i+1);
            }

            if(table.isEmpty()){
                table.put(data[0],0);

                for(int x = 0;x<data.length;x++){
                    boolean y = false;
                    for(String key : table.keySet()){
                        y = true;
                        if(data[x].equals(key)){
                            table.put(key,table.get(key)+1);
                            y = false;
                            break;
                        }
                    }

                    if(y){
                        table.put(data[x],1);
                    }
                }
            }

            int max = 0;

            for(String key : table.keySet()){
                if(table.get(key) > max){
                    max = table.get(key);
                }
            }
            ArrayList<Integer> allResult = new ArrayList<>();
            for(String key : table.keySet()){
                if(table.get(key) == max){
                    int charNum = key.charAt(0);
                    allResult.add(charNum);
                }
            }
            //System.out.println(allResult.toString());
            Integer a[] = (Integer[]) allResult.toArray(new Integer[0]);

            for(int x = allResult.size()-1;x>=0;x--){
                for(int y = 0;y<x;y++){
                    if(a[y]>a[y+1]){
                        int tmp = a[y+1];
                        a[y+1] = a[y];
                        a[y] = tmp;
                    }
                }
            }
            String Sum_result = "";
            for(int q = 0;q<a.length;q++){
                int x = a[q];
                Sum_result = Sum_result + (char)x;
            }

            System.out.println(Sum_result+" "+max);

        }

    }

}
