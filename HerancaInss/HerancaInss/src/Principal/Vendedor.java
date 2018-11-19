
package Principal;


public class Vendedor extends Empregado{
public double valorVendas;
public int qtdVendas;

public void setvalorVendas(double valorVendas){
    this.valorVendas = valorVendas;
}
public double getvalorVendas(){
   return this.valorVendas;
}
 public void setqtdVendas(int qtdVendas){
     this.qtdVendas = qtdVendas;
     
 }   
 public int getqtdVendas(){
    return  this.qtdVendas;
 }
}
