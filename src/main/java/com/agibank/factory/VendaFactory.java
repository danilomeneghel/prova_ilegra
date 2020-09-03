package com.agibank.factory;

import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;
import com.agibank.entity.Venda;

public class VendaFactory {

    private final List<Venda> venda = new ArrayList<Venda>();

    public void getVendas(String[] dados) {
        venda.add(new Venda(dados[1], getPrecoVenda(dados[2]), dados[3]));
    }

    public int TotalVendas() {
        return venda.size();
    }

    public double getPrecoVenda(String sale) {
        double preco = 0;
        String splitVirgula[] = sale.split(",");
        for (int i = 0; i < splitVirgula.length; i++) {
            String splitHifen[] = splitVirgula[i].split("-");
            preco = preco + Double.parseDouble(splitHifen[1].replace("[", "")) * Double.parseDouble(splitHifen[2].replace("]", ""));
        }
        return preco;
    }

    public String getIdVendaCara() {
        venda.sort(Comparator.comparing(Venda::getSalePrice).reversed());
        return venda.get(0).getSaleId();
    }

    public String getPiorVenda() {
		venda.sort(Comparator.comparing(Venda::getSalePrice));
		return venda.get(0).getSalesMan();
	}
}
