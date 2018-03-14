import java.util.*;
public class uva10252 {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        while(input.hasNext()){
            String A = input.nextLine();
            String B = input.nextLine();
            ArrayList<String> tmpStore = new ArrayList<String>();

            for(int x = 0;x<A.length();x++){
                for(int y = 0;y<B.length();y++){
                    if(A.substring(x,x+1).equals(B.substring(y,y+1))){
                        boolean control = true;
                        for(String key:tmpStore){
                            if(key.equals(A.substring(x,x+1))){
                                control = false;
                                break;
                            }
                        }
                        if(control){
                            tmpStore.add(A.substring(x,x+1));
                            break;
                        }
                    }
                }
            }
            String[] result = new String[tmpStore.size()];
            int x = 0;
            for(String key : tmpStore){
                result[x] = key;
                x++;
            }

            for(int y = tmpStore.size();y>0;y--){
                for(int z = 0;z<y-1;z++){
                    char tmp1 = result[z].charAt(0);
                    char tmp2 = result[z+1].charAt(0);
                    if(tmp1>tmp2){
                        String tmp = result[z];
                        result[z] = result[z+1];
                        result[z+1] = tmp;
                    }
                }
            }

            for(String key : result){
                System.out.print(key);
            }
            System.out.println();
        }
    }


}
