import java.util.*;
public class uva10062 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        boolean flag = false;
        while(input.hasNext()){
            if(!flag){
                flag = true;
            }else{
                System.out.println();
            }
            String data = input.nextLine();
            TreeMap<Integer, Integer> store = new TreeMap<Integer, Integer>();
            char characters[] = data.toCharArray();
            int[] result = new int[characters.length];
            for(int i = 0;i<characters.length;i++){
                result[i] = characters[i];
            }
            Arrays.sort(result);

            for(int x = result.length-1;x>=0;x--){
                boolean control = true;
                for(int key : store.keySet()){
                    if(key == result[x]){
                        store.put(result[x], store.get(key)+1);
                        control = false;
                    }
                }
                if(control){
                    store.put(result[x], 1);
                }
            }
            int[] name = new int[store.size()];
            int[] value = new int[store.size()];
            int x = 0;
            for(int key : store.keySet()){
                name[x] = key;
                value[x] = store.get(key);
                x++;
            }

            for(int i = name.length-1;i>=0;i--){
                for(int j = 0;j<i;j++){
                    if(value[j] > value[j+1]){
                        int tmpName = name[j];
                        int tmpValue = value[j];
                        value[j] = value[j+1];
                        name[j] = name[j+1];
                        value[j+1] = tmpValue;
                        name[j+1] = tmpName;
                    }
                }
            }

            for(int i = name.length-1;i>=0;i--){
                for(int j = 0;j<i;j++){
                    if(value[j] == value[j+1] && name[j] < name[j+1]){
                        int tmpName = name[j];
                        int tmpValue = value[j];
                        value[j] = value[j+1];
                        name[j] = name[j+1];
                        value[j+1] = tmpValue;
                        name[j+1] = tmpName;
                    }
                }
            }

            for(int i = 0;i<name.length;i++){
                System.out.println(name[i]+" "+value[i]);
            }

        }
    }
}
