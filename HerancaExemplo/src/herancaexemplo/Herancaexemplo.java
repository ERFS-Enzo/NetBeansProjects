package herancaexemplo;
import herancaexemplo.model.Cliente;
import herancaexemplo.model.Fornecedor;
import herancaexemplo.model.Pessoa;
import java.util.ArrayList;
import java.util.List;
public class Herancaexemplo {
    public static void main(String[] args) {
        //obj subclasse cliente
        Cliente objCliente = new Cliente("janeiro", 1000, 1, "cliente","592489249");
        //obj subclasse fornecedor
        Fornecedor objFornecedor = new Fornecedor(1500000000, 1500000, 2, "empresa", "294928492992");
        //obj da super classe e transforma-la em abstrata, ou seja nao pode instancia-la
        //Pessoa objPessoa = new Pessoa(1, "pessoa", "11122233344"); -> não se cria um objeto abstrato
        
        //*******Polimorfismo*******
        Pessoa objCliente2 = new Cliente("janeiro", 1000, 1, "cliente","592489249");
        Pessoa objFornecedor2 = new Fornecedor(1500000000, 1500000, 2, "empresa", "294928492992");
        
        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(objCliente);
        pessoas.add(objFornecedor);
        pessoas.add(objCliente2);
        pessoas.add(objFornecedor2);
        
        for(Pessoa oPessoa: pessoas){
            System.out.println(oPessoa.toString());
        }
        
    }
}
