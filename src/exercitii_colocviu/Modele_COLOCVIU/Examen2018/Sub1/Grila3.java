package exercitii_colocviu.Modele_COLOCVIU.Examen2018.Sub1;

public class Grila3 {
    public static void main(String[] args) {
        int x = 0;
        int[] a = {1, 2, 3, 4, 5};

        try {
            a[1] = a[5] / (a[0] - 1);
        } catch (ArithmeticException e) {
            System.out.print("AE ");
            x += 6;
        } catch (IndexOutOfBoundsException e) {
            System.out.print("IOBE ");
            x += 5;
        } catch (RuntimeException e) {
            System.out.print("RE ");
            x += 4;
        } catch (Exception e) {
            System.out.print("E ");
            x += 3;
        } finally {
            System.out.print("F ");
            x += 2;
        }

        System.out.print(++x);
    }
}
