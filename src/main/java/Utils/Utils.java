/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

/**
 *
 * @author gabri
 */
public class Utils {
    public static boolean validarCPF(String cpf) {
        cpf = cpf.replaceAll("[^0-9]", "");

        if (cpf.length() != 11) {
            return false;
        }

        if (cpf.matches("(\\d)\\1{10}")) {
            return false;
        }

        int soma = 0;
        for (int i = 10; i > 1; i--) {
            soma += Integer.parseInt(cpf.substring(10 - i, 11 - i)) * i;
        }
        int digito1 = 11 - (soma % 11);
        if (digito1 >= 10) {
            digito1 = 0;
        }

        if (digito1 != Integer.parseInt(cpf.substring(9, 10))) {
            return false;
        }

        soma = 0;
        for (int i = 11; i > 1; i--) {
            soma += Integer.parseInt(cpf.substring(11 - i, 12 - i)) * i;
        }
        int digito2 = 11 - (soma % 11);
        if (digito2 >= 10) {
            digito2 = 0;
        }

        if (digito2 != Integer.parseInt(cpf.substring(10, 11))) {
            return false;
        }

        return true;
    }
    
    public static boolean validarSenha(String senha1, String senha2) {
        if (senha1 == null || senha2 == null || senha1.isEmpty() || senha2.isEmpty()) {
            return false;
        }
        return senha1.equals(senha2);
    }
}

