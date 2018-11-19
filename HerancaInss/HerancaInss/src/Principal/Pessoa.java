
package Principal;

public class Pessoa {
    public String nome,sexo;
    public int idade;
    
    public void setnome(String nome){
        this.nome = nome;
    }
    public void setsexo(String sexo){
        this.sexo = sexo;
    }
    public void setidade(int idade){
        this.idade = idade;
    }
    public String getnome(){
        return this.nome;
    }
    public String getsexo(){
        return this.sexo;
    }
    public int getidade(){
        return this.idade;
    }
}



