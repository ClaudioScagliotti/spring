package demo.aspect;

import java.util.ArrayList;
import java.util.List;

public class ProdottoImpl implements ProdottoInterface {

    @Override
    public String getProdotto() {
        return "Prodotto1";
    }

    @Override
    public List<String> getProdotti() {
        List<String> prodotti= new ArrayList<>();
        prodotti.add("Prodotto2");
        prodotti.add("Prodotto3");
        return prodotti;
    }
}
