package exercitii_colocviu.Modele_COLOCVIU.Examen2023.Sub1;

public class Grila3 {
    public static void main(String[] args) {
        try {
            int a[] = {1, 2, 3, 4};
            for (int i = 1; i <= 4; i++) {
                System.out.print(a[i] / (3 - i) + " ");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.print("E1 ");
        } catch (Exception e) {
            System.out.print("E2 ");
        }
    }
}
