package com.agibank.util;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Constantes {

    public static final Path dirRoot = Paths.get(".").normalize().toAbsolutePath();
    public static final String dirIn = dirRoot + "\\HOMEPATH\\data\\in";
    public static final String dirOut = dirRoot + "\\HOMEPATH\\data\\out";
    public static final String idVendedor = "001";
    public static final String idCliente = "002";
    public static final String idVenda = "003";
    public static final String delimitador = "ç";
}
