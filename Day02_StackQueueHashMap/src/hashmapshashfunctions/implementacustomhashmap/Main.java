package hashmapshashfunctions.implementacustomhashmap;

public class Main {

    public static void main(String[] args) {
        CustomHashMap<String, Integer> hashMap = new CustomHashMap<>();
        hashMap.put("One", 1);
        hashMap.put("Two", 2);
        hashMap.put("Three", 3);
        hashMap.put("Four", 4);

        System.out.println("Value for 'Two': " + hashMap.get("Two"));

        hashMap.remove("Three");
        System.out.println("After removing 'Three':");
        hashMap.display();
    }
}



