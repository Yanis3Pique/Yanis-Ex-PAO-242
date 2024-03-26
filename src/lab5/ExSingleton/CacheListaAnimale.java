package lab5.ExSingleton;

import java.util.ArrayList;
import java.util.List;

public class CacheListaAnimale {
    private static CacheListaAnimale cacheListaAnimale;

    private List<String> listaAnimale = new ArrayList<>();

    private CacheListaAnimale() {}

    public static CacheListaAnimale getInstanceCacheListaNumere(){
        if(cacheListaAnimale == null){
            cacheListaAnimale = new CacheListaAnimale();
        }
        return cacheListaAnimale;
    }

    public List<String> getListaAnimale() {
        return listaAnimale;
    }

    public void addAnimal(String animal){
        listaAnimale.add(animal);
    }
}
