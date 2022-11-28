package shop.storage;

import shop.goods.*;

import java.util.HashMap;
import java.util.Map;

public class Stock {
   private static final Map<String, Product> productStock = getStock();

    private static Map<String, Product> getStock() {
        final Map<String, Product> productStock = new HashMap<>();
        productStock.put("G001", new Guitars("Fender Player Series Tele MN TPL", 737.32, "Fender", GuitarForm.TL, 6));
        productStock.put("G002", new Guitars("Fender AM Pro II Strat MBL", 1934.18, "Fender", GuitarForm.ST, 6));
        productStock.put("G003", new Guitars("ESP E-II Eclipse-7 Evertune BLKS", 2774.74, "ESP", GuitarForm.LP, 7));
        productStock.put("G004",new Guitars("Gibson SG ´61 Standard Sideway VC", 1833.18, "Gibson", GuitarForm.SG, 6));
        productStock.put("S001", new Synth("Teenage Engineering OP-Z", 498.06, "Teenage Engineering", SynthVoices.POLY, 51));
        productStock.put("S002", new Synth("Arturia MicroFreak", 335.52, "Arturia", SynthVoices.POLY, 25));
        productStock.put("S003", new Synth("Moog Subsequent 37", 1972.5, "Moog", SynthVoices.PARA, 37));
        productStock.put("S004", new Synth("Korg Monologue BK", 272.83, "Korg", SynthVoices.MONO, 25));

        return productStock;
    }
}
