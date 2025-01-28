import java.util.HashMap;

public class hashmapp {
    static HashMap<String, String> hm = new HashMap<>();

    static String put(String key, String value) { // JUST MADE A FUNCTION FOR FUN TO ADD ELEMENTS TO THE HASHMAP
        hm.put(key, value);                             //VARIABLE.put IS USED TO ADD ELEMENTS TO THE HASHMAP
        return "Added " + key + " : " + value;
    }

    static int search(String key) {
        if (hm.containsKey(key)) {                                  //hm.containsKey IS USED TO CHECK IF THE KEY EXISTS IN THE HASHMAP
            System.out.println("Found the key " + key + " : " + hm.get(key));   //hm.get IS USED TO GET THE VALUE OF THE KEY
            return 0;
        } else {
            System.out.println("does not exist");
            return 1;
        }
    }

    public static void main(String[] args) {
       String a =  put("a", "apple");    // IF WE WANT TO READ THE RETURNED STATEMENT IN THE FUNC WE CAN ADD THAT IN STRING AND THEN SOUT THE STRING 
        put("b", "banana");
        System.out.println(a);
        System.out.println(hm);
        search("c");
    }
}
