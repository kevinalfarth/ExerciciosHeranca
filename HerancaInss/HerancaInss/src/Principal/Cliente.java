
package Principal;


public class Cliente extends Pessoa {
    public double valorDivida;
    public int anoNascim;
    
    public void setvalorDivida(double valorDivida){
        this.valorDivida = valorDivida;
    }
    public double getvalorDivida(){
        return this.valorDivida;
    }
    public void setanoNascim(int anoNascim){
        this.anoNascim = anoNascim;
    }
    public int getanoNascim(){
        return this.anoNascim;
    }
}
