package lab5.ExSingleton;

public class SingletonApp {
    public static void main(String[] args) {
        CacheListaAnimale listaAnimale1 = CacheListaAnimale.getInstanceCacheListaNumere();
        CacheListaAnimale listaAnimale2 = CacheListaAnimale.getInstanceCacheListaNumere(); // vrajeala, e aceeasi instanta, nu se face instanta noua

        System.out.println("Sunt egale? (Da, avem aceeasi instanta careva sa zica)   --->   " + listaAnimale1.equals(listaAnimale2));

        listaAnimale1.addAnimal("Leu");
        listaAnimale2.addAnimal("Ghepard");
        listaAnimale1.addAnimal("Acvila");
        listaAnimale2.addAnimal("Pinguin");
        listaAnimale1.addAnimal("T-Rex");
        listaAnimale2.addAnimal("Delfin");
        listaAnimale1.addAnimal("Sirena");
        listaAnimale2.addAnimal("Sabertooth Tiger");

        System.out.println(listaAnimale1.getListaAnimale());
    }
}
