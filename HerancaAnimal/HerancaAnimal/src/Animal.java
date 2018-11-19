/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aluno
 */
public class Animal {
    public String nome,raca;
    
    public Animal(){
        
    }
    public Animal(String nome){
        this.nome = nome; 
    }
    public Animal(String nome,String raca){
        this.raca = raca;
    }
    public String Caminha(){
        
        return "Andando";
    }
}
