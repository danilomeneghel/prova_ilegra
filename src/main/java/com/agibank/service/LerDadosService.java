package com.agibank.service;

import java.io.File;
import com.agibank.util.Constantes;
import com.agibank.util.ValidarDirArq;

public class LerDadosService {

    public static File[] getArquivos() throws Exception {
        String pathIn = Constantes.dirIn.replace("\\src\\main\\java", "").replace("\\target", "");

        //Verifica se existe o diretório para ler o arquivo
        ValidarDirArq.validar(new File(pathIn));

        File diretorio = new File(pathIn);
        return diretorio.listFiles();
    }
}
