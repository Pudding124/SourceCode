import java.util.*;
public class uva10008 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int Case = input.nextInt();
        input.nextLine();
        HashMap<String, Integer> store = new HashMap<String, Integer>();
        for(int i =0;i<Case;i++){
            String data = input.nextLine();
            data = data.replace(" ","");
            String str = data.toUpperCase();
            char strNum[] = str.toCharArray(); //65~90

            for(int j =0;j<str.length();j++){
                if(strNum[j]>=65 && strNum[j]<=90){
                    String tmp = String.valueOf(strNum[j]);
                    boolean control = true;
                    for(String key : store.keySet()){
                        if(tmp.equals(key)){
                            store.put(key,store.get(key)+1);
                            control = false;
                        }
                    }

                    if(control){
                        store.put(tmp,1);
                    }
                }
            }

        }
        String[] result1 = new String[store.size()];
        int[] result2 = new int[store.size()];
        int z = 0;
        for(String key : store.keySet()){
            result1[z] = key;
            result2[z] = store.get(key);
            z++;
        }

        for(int x = store.size();x>0;x--){
            for(int y = 0;y<x-1;y++){
                if(result2[y] < result2[y+1]){
                    String tmp1 = result1[y];
                    int tmp2 = result2[y];
                    result1[y] = result1[y+1];
                    result2[y] = result2[y+1];
                    result1[y+1] = tmp1;
                    result2[y+1] = tmp2;
                }
                char com1 = result1[y].charAt(0);
                char com2 = result1[y+1].charAt(0);
                if(result2[y] == result2[y+1] && com1>com2){
                    String tmp1 = result1[y];
                    int tmp2 = result2[y];
                    result1[y] = result1[y+1];
                    result2[y] = result2[y+1];
                    result1[y+1] = tmp1;
                    result2[y+1] = tmp2;
                }
            }
        }
        for(int d = 0;d<result1.length;d++){
            System.out.println(result1[d]+" "+result2[d]);
        }

    }


}
