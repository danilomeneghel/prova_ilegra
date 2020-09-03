package com.agibank.service;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import com.agibank.entity.Relatorio;
import com.agibank.util.Constantes;
import com.agibank.util.ValidarDirArq;

public class SalvarDadosService {

    public static void salvar(List<Relatorio> relatorio, String nomeArquivo) {
        String pathOut = Constantes.dirOut.replace("\\src\\main\\java", "").replace("\\target", "");
        
        try {
            //Verifica se existe o diretório para salvar o arquivo
            ValidarDirArq.validar(new File(pathOut));
            
            File arquivo = new File(pathOut + "/" + nomeArquivo);
            FileWriter writer = new FileWriter(arquivo);
            
            //Gera a data atual 
            LocalDateTime dataAtual = LocalDateTime.now();
            String dataFormatada = dataAtual.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
            
            //Faz o loop nos dados e escreve no arquivo
            for (Relatorio dado : relatorio) {
                writer.append("Qtd Clientes: " + dado.getTotalClientes().toString() + "\r\n");
                writer.append("Qtd Vendedores: " + dado.getTotalVendedores().toString() + "\r\n");
                writer.append("Id Venda Mais Cara: " + dado.getIdVendaCara() + "\r\n");
                writer.append("Pior Vendedor: " + dado.getPiorVendedor() + "\r\n\r\n");
                writer.append("Arquivo gerado em " + dataFormatada + "\r\n");
            }

            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
