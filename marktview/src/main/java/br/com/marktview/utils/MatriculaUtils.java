package br.com.marktview.utils;

import java.util.concurrent.ThreadLocalRandom;

public class MatriculaUtils {
    public static long gerarMatriculaAleatoria() {
        // Gera um número aleatório entre 100000 e 999999 (sempre terá 6 dígitos)
        long numero = ThreadLocalRandom.current().nextInt(100000, 1000000);
        return numero;
    }
}
