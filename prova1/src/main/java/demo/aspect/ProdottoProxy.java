package demo.aspect;

import java.util.ArrayList;
import java.util.List;

public class ProdottoProxy implements ProdottoInterface {
    private ProdottoInterface prodottoInterface;

    public ProdottoProxy(ProdottoInterface prodottoInterface) {
        this.prodottoInterface = prodottoInterface;
    }

    @Override
    public String getProdotto() {
        return prodottoInterface.getProdotto();
    }

    @Override
    public List<String> getProdotti() {
        return prodottoInterface.getProdotti();
    }
}
