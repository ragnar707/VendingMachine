<<<<<<< HEAD
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Cassa {

    private Map<Double, Integer> monete = new TreeMap<>(Collections.reverseOrder());

    public Cassa(){
        monete.put(2.0, 10);
        monete.put(1.0, 10);
        monete.put(0.5, 10);
        monete.put(0.2, 10);
        monete.put(0.1, 10);
    }

    public void aggiungiMonete(Double valore, int quantita){
        if(!monete.containsKey(valore)){
            System.out.println("Il taglio di moneta che vuoi inserire non è supportato");
            return;
        }
        monete.put(valore, monete.get(valore) + quantita);
        System.out.println("Hai inserito " + quantita + " monete da " + valore);
    }

    public void mostraCassa(){
        System.out.println("Contenuto cassa:");
        for(Map.Entry<Double, Integer> entry : monete.entrySet()){
            System.out.println("$" + entry.getKey() + " : " + entry.getValue());
        }
    }

    public Map<Double, Integer> daiResto(double resto){
        Map<Double, Integer> daDare = new LinkedHashMap<>();

        for(Map.Entry<Double, Integer> entry : monete.entrySet()){
            double valore = entry.getKey();
            int disponibili = entry.getValue();
            int daUsare = 0;

            while(resto >= valore - 0.001 && disponibili > 0){
                resto -= valore;
                resto = Math.round(resto * 100.0) / 100.0;
                disponibili--;
                daUsare++;
            }
            if(daUsare > 0){
                daDare.put(valore, daUsare);
                monete.put(valore, monete.get(valore) - daUsare);
            }
            if(resto == 0){
                break;
            }
        }
        if(resto > 0.0){
            for(Map.Entry<Double, Integer> entry : daDare.entrySet()){
                monete.put(entry.getKey(), monete.get(entry.getKey()) + entry.getValue());
            }
            return null;
        }
        return daDare;
    }
}
