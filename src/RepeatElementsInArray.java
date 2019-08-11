import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class RepeatElementsInArray {

    public static String duplicate (int[] numbers){

        TreeMap<Integer, Integer> map = new TreeMap<>();
        int oldValue = 0;

        for (int num : numbers) {

            //if the num does not exist, add to map
            if (!map.containsKey(num)) {
                map.put(num, 1);
            } else { //else update the value in the key

                //take old value of key and increment it
                oldValue = map.get(num);
                map.replace(num, oldValue + 1);
            }
        }

        //go over KeySet and get rid of any with value <= 1
        //put in new Set
        Set<Integer> set = new TreeSet();

        for (Integer num : map.keySet()){
            if (map.get(num) > 1){
                set.add(num);
            }
        }


        return set.toString();
    }

    public static void main(String[] args) {

        int[] arr = {1, 3, 4, 2, 1, 2, 4};
        System.out.println(duplicate(arr));

    }
}



