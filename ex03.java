package Supplier;

import java.security.SecureRandom;
import java.util.function.Supplier;


public class ex03 {
    
    public static void main(String[] args){
        Supplier<String> generatePassword = () -> {
            final String characters = "abcdefghijklmnopqrstuvwxyz"
                    + "12345567890"
                    + "!@#$%¨&*()-=_+/*.,;:~^[]{}´`''|"
                    + "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
            
            int lengthPassword = 15;
            
            SecureRandom secureRandom = new SecureRandom();
            
            StringBuilder password = new StringBuilder();
            
            for(int i = 0; i < lengthPassword; i++){
                int index = secureRandom.nextInt(characters.length());
                char character = characters.charAt(index);
                password.append(character);
            }
            
            return password.toString();
        };
        
        
        String passw = generatePassword.get();
        /*do {
            passw = generatePassword.get();
        } while (!validarSenha(passw));*/
        
        System.out.println(passw);
    }
    

    //método para validar senha com 5 numeros, 5 letras e 5 caracteres especiais
 /*public static boolean validarSenha(String senha) {
        int numeros = 0;
        int letras = 0;
        int especiais = 0;

        for (char caractere : senha.toCharArray()) {
            if (Character.isDigit(caractere)) {
                numeros++;
            } else if (Character.isLetter(caractere)) {
                letras++;
            } else {
                especiais++;
            }
        }

        return numeros >= 5 && letras >= 5 && especiais >= 5;
    }*/
}