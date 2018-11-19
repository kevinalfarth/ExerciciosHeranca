
import java.util.Scanner;

public class Principal {
    
    public static void main(String[] args) {
        Rica r = new Rica();
        Pobre p = new Pobre();
        Miseravel m = new Miseravel();
        Scanner sc = new Scanner(System.in);
        System.out.println("--------Pessoa Rica---------");
        r.idade = 17;
        r.nome = "Johson";
        r.dinheiro = 1500;
        
        System.out.println("Nome: "+r.nome);
        System.out.println("Idade: "+r.idade);
        System.out.println("Dinheiro: "+r.dinheiro);
        System.out.println(r.fazCompras());
        
        System.out.println("---------Pessoa Pobre--------");
        p.nome = "Mark";
        p.idade = 22;
        
        System.out.println("Nome: "+p.nome);
        System.out.println("Idade: "+p.idade);
        System.out.println(p.Trabalha());
        
        System.out.println("----------Pessoa Miseravel---------");
        m.idade = 32;
        m.nome = "Carlos";
        System.out.println("nome: "+m.nome);
        System.out.println("idade: "+m.idade);
        System.out.println(m.Mendiga());
             
        
        
}
}
