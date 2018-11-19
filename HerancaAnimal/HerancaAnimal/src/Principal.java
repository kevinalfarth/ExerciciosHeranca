
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aluno
 */
public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cachorro c = new Cachorro(); 
        Gato g = new Gato();
        c.nome = "John";
        c.raca = "Vira lata";
        System.out.println("---------Cachorro---------");
        System.out.println("Nome: "+c.nome);
        System.out.println("Raca: "+c.raca);
        System.out.println(c.Caminha());
        System.out.println(c.late());
       
        
        
        
        
        System.out.println("----------Gado------------");
        g.nome = "johnson";
        g.raca = "Siames";
        System.out.println("nome: "+g.nome);
        System.out.println("raca: "+g.raca);
        System.out.println(g.Caminha());
        System.out.println(g.mia());
        
        
    }
}
