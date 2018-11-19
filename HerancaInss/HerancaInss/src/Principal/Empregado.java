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
public class Empregado  extends Pessoa {
public double salario;
public String matricula;

public  void setmatricula(String matricula){
    this.matricula = matricula;
}
public String getmatricula(){
    return this.matricula;
}
public void setsalario(double salario){
    this.salario = salario;
}
public double getsalario(){
    return this.salario;
}
public double valorInss(){
    double vt,p;
    p = (this.salario*11)/100;
    vt = salario*p;
    return vt;
}
}
