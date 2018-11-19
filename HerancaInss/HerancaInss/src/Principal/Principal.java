
package Principal;

public class Principal {
    public static void main(String[] args) {
        Empregado e = new Empregado();
        Cliente c = new Cliente();
        Gerente g = new Gerente();
        Vendedor v = new Vendedor();
        
       e.setidade(17);
       e.setmatricula("5555");
       e.setnome("John");
       e.setsalario(1500);//n esquecer de fazer salario com inss
       e.setsexo("Masculino");
        
        System.out.println("--------Empregado--------");
        System.out.println("nome: "+e.getnome());
        System.out.println("matricula: "+e.getmatricula());
        System.out.println("idade: "+e.getidade());
        System.out.println("salario: "+e.getsalario()+ " Salario com Inss: "+e.valorInss());
        System.out.println("sexo: "+e.getsexo());
        
       
    }
}
