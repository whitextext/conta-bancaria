import java.util.ArrayList;
import java.util.List;

public class Banco {
    List<Cliente> sistemaBancario;

    public Banco () {
        this.sistemaBancario = new ArrayList<>();
    }


    public void AdicionarCliente ( String nome, String agencia ) {
        int id = sistemaBancario.size();
        if ( id == 0 ) { id = 1; }
        sistemaBancario.add( new Cliente( nome, agencia, id, 0 ) );
    }

    public void Depositar(int id , int valor ) {
        for ( Cliente c : sistemaBancario ) {
            if (c.getId() == id){
                c.setSaldo(valor, 1);
            }
        }
    }

    public void Sacar ( int id , int valor ) {
        for ( Cliente c : sistemaBancario ) {
            if (c.getId() == id){
                c.setSaldo(valor, 0);
                System.out.println( c.getSaldo() );
            }
        }
    }

    public void DadosDoCliente ( int id ) {
        for ( Cliente c : sistemaBancario ) {
            if (c.getId() == id) {
                System.out.println( c );
            }
        }
    }

}
