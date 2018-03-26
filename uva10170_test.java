import java.util.*;
public class uva10170_test {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        while(input.hasNext()){
            long people = input.nextLong();
            long dayLine = input.nextLong();

            long day = 1;
            long tmp = 0;
            while(dayLine >= day){
                day = day + people ;
                tmp = people;
                people = people + 1;
            }
            System.out.println(tmp);
        }
    }
}