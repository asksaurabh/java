public class StringComparison {
    public static void main(String[] args) {
        // String literals - stored in string pool
        String str1 = "A";
        String str2 = "A";
        System.out.println("str1 == str2: " + (str1 == str2)); // true
        
        // New String object - not in string pool
        String str3 = new String("A");
        System.out.println("str1 == str3: " + (str1 == str3)); // false
        System.out.println("str1.equals(str3): " + str1.equals(str3)); // true
        
        // Scanner input creates new String objects (similar to new String())
        String str4 = new String("A"); // Simulates scanner input
        System.out.println("str1 == str4: " + (str1 == str4)); // false
        System.out.println("str1.equals(str4): " + str1.equals(str4)); // true
        
        // Demonstrating string pool
        System.out.println("\"A\" == \"A\": " + ("A" == "A")); // true
    }
}
