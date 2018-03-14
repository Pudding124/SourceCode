import java.util.*;

public class uva21924 {

        public static void main(String[] args){

            Scanner input = new Scanner(System.in);
            HashMap<String, Integer> store = new HashMap<String, Integer>();
            int num = input.nextInt();
            input.nextLine();
            for(int i = 0;i<num;i++){
                String country[] = input.nextLine().split(" ");
                boolean control = false;
                for(String data : store.keySet()){
                    if(data.equals(country[0])){
                        store.put(data,store.get(data)+1);
                        control = true;
                    }
                }
                if(control){
                    continue;
                }else{
                    store.put(country[0],1);
                }
            }
            String[][] result = new String[store.size()][2];
            int i = 0;
            for(String data : store.keySet()){
                result[i][0] = data;
                result[i][1] = String.valueOf(store.get(data));
                i++;
            }

            for(int x = i;x>=0;x--){
                for(int y = 0;y<x-1;y++){
                    String a = result[y][0].substring(0,1);
                    String b = result[y+1][0].substring(0,1);
                    char A = a.charAt(0);
                    char B = b.charAt(0);
                    if((A-B)>0){
                        String C = result[y][0];
                        String D = result[y][1];
                        result[y][0] = result[y+1][0];
                        result[y][1] = result[y+1][1];
                        result[y+1][0] = C;
                        result[y+1][1] = D;
                    }
                }
            }

            for(int x = 0;x<result.length;x++){
                System.out.println(result[x][0]+" "+result[x][1]);
            }

        }
    }

