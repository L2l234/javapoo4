package Predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;


public class ex02 {

    
    public static void main(String[] args) {
        //criei uma lista de Strings
        List<String> wordsList = new ArrayList<>();
        
        wordsList.add("Amante");
        wordsList.add("Hello");
        wordsList.add("Arm");
        
        Predicate<String> wordsStartsA = words -> words.startsWith("A");
        
        for(String w : wordsList){
            if(wordsStartsA.test(w)){
                System.out.println(w);
            }
        }
        
    }
      
        


        
        
        
        
        
    
    
}
