import java.util.*;
public class uva10252 {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        while(input.hasNext()){
            boolean control = true;
            boolean control2 = true;
            String A = input.nextLine().replaceAll(" ","");
            String B = input.nextLine().replaceAll(" ","");
            HashMap<String, Integer> AStore = new HashMap<String, Integer>();
            HashMap<String, Integer> BStore = new HashMap<String, Integer>();
            String alph[] = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
            for(int x = 0;x<A.length();x++){
                control = true;
                for(String key : AStore.keySet()){
                    if(A.substring(x,x+1).equals(key)){
                        AStore.put(A.substring(x,x+1), AStore.get(key)+1);
                        control = false;
                        break;
                    }
                }
                if(control){
                    AStore.put(A.substring(x,x+1),1);
                }
            }

            for(int x = 0;x<B.length();x++){
                control2 = true;
                for(String key : BStore.keySet()){
                    if(B.substring(x,x+1).equals(key)){
                        BStore.put(B.substring(x,x+1), BStore.get(key)+1);
                        control2 = false;
                    }
                }
                if(control2){
                    BStore.put(B.substring(x,x+1),1);
                }
            }

            for(int x = 0;x<alph.length;x++){
                for(String Akey : AStore.keySet()){
                    if(Akey.equals(alph[x])){
                        for(String Bkey : BStore.keySet()){
                            if(Akey.equals(Bkey)){
                                if(AStore.get(Akey) >= BStore.get(Bkey)){
                                    for(int y = 0;y<BStore.get(Bkey);y++){
                                        System.out.print(Akey);
                                    }
                                    break;
                                }else{
                                    for(int y = 0;y<AStore.get(Akey);y++){
                                        System.out.print(Akey);
                                    }
                                    break;
                                }
                            }
                        }
                    }
                }
            }
            System.out.println("");

        }

    }
}
