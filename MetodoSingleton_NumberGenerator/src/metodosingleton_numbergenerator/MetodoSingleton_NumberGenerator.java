/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodosingleton_numbergenerator;

/**
 *
 * @author 20161BSI0403
 */
public class MetodoSingleton_NumberGenerator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NumberGeneratorTraditional generator = NumberGeneratorTraditional.getInstance();
        
        System.out.println("next Serial : " + generator.getNextNumber() + "\n");
        System.out.println("next Serial : " + generator.getNextNumber() + "\n");
        System.out.println("next Serial : " + generator.getNextNumber() + "\n");
    }
    
}
