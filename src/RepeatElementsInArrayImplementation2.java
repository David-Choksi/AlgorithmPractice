public class RepeatElementsInArrayImplementation2 {

        // java.util.* and java.util.streams.* have been imported for this problem.
        // You don't need any other imports.

    public static String duplicate(int[] numbers){
        
        // use Treemap; the map is sorted by key.
        TreeMap<Integer, Integer> duplicate = new TreeMap();
        
        // Check if map contains array value, if not add it. If it's their, increase value of key by 1.
        for (int element : numbers) {
            if (!duplicate.containsKey(element)) {
                duplicate.put(element, 1);
            } else {
                duplicate.put(element, duplicate.get(element) + 1);
            }
        }
        
        // Use ArrayList to store the relevant keys.

        List<Integer> result = new ArrayList();
        
        // Store keys with values greater than 1 into the ArrayList, return as String. 
        // i.e. store only keys that are duplicates. 
        
        for (Integer repeats : duplicate.keySet()) {
            if (duplicate.get(repeats) > 1 ) {
                result.add(repeats); 
            }
        }
        
        return result.toString();
    }
}