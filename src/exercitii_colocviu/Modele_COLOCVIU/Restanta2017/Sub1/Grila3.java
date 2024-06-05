package exercitii_colocviu.Modele_COLOCVIU.Restanta2017.Sub1;

public class Grila3 {
    public static void main(String[] args) {
        String s = "abracadabra";
        s = s.replace('r', 'R'); // Replace 'r' with 'R'
        int p = s.indexOf('R'); // Find the first occurrence of 'R'
        int q = s.lastIndexOf('b'); // Find the last occurrence of 'b'
        s = s.substring(0, q - p); // Extract the substring from index 0 to (q - p)
        System.out.println(s.length()); // Print the length of the resulting substring
    }
}