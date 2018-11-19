/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

/**
 *
 * @author Aluno
 */
public class Gerente extends Empregado {
 public String nomeGerencia;   
 
 public void setnomeGerencia(String nomeGerencia){
     this.nomeGerencia = nomeGerencia;
 }
 public String getnomeGerencia(){
     return this.nomeGerencia;
 }
}
