package lab5.Ex1;

public class Ex1App {
    public static void main(String[] args) {
        System.out.println("a".matches("[abc]"));
        System.out.println("x".matches("[^abc]"));
        System.out.println("g".matches("[a-z]"));
        System.out.println("A".matches("[a-zA-Z]"));
        System.out.println("gG".matches("[a-z][A-z]"));
        System.out.println("aab".matches("[abc]+"));
        System.out.println("".matches("[abc]*"));
        System.out.println("abccb".matches("[abc]{5}"));
        System.out.println("abcbabcaacbbacb".matches("[abc]{5,}"));
        System.out.println("abcbabcba".matches("[abc]{5,10}"));
    }
}
