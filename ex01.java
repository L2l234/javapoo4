package Supplier;

import java.util.List;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Collectors;


public class ex01 {

    
    public static void main(String[] args) {
        //interface Supplier com entrada de dados do tipo lista 
        //com retorno de dados do tipo List<Integer>
        Supplier<List<Integer>> randomNumbers = () ->{
             
            int lengthList = 10; //adicionei o tamanho da lista
            int minimumValue = 1;//o valor mínimo que será gerado entre os 10 números aleatórios
            int maxValue = 50; // valor máximo que será gerado entre os 10 números aleatórios
            
            //função random que irá gerar os números de forma aleatória
            Random random = new Random();
            
            //random ints: gerar numeros aleatórios inteiros, passando como parâmetro
            //o tamanho, valor mínimo e valor máximo + 1
            
            //.boxed pega esses números gerados do tipo primitivo "int"
            //e converte para o tipo objeto Integer
            
            //Collectors.toList() é usado como argumento do método collect()
            //Collectors.toList() é um coletor fornecido pela API de Stream do Java 
            //que coleta os elementos em uma lista.
            List<Integer> randomNumbersList = random.ints(lengthList, 
                    minimumValue, maxValue + 1)
                    .boxed().collect(Collectors.toList());
            
            //retorno a minha lista de números aleatórios
            return randomNumbersList;
        };
        
        //armazeno esse retorno em uma variável do tipo
        //List<Integer>
        List<Integer> numbersList = randomNumbers.get();
        
        //mostro os números na tela
        System.out.println("Random int numbers: ");
        for(int n : numbersList){
            System.out.println(n);
        }
       
    }
      
        


        
        
        
        
        
    
    
}
