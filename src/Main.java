import java.util.List;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		List<Cliente> cliente = new ArrayList<Cliente>();
		cliente.add(new Cliente("wellington Andrade", "361.616.898-80", 25, new Conta(3065, 9823705, 0)));
		cliente.add(new Cliente("Viviane Andrade", "753.443.678-75", 25, new Conta(1545, 222222, 200.00)));
		cliente.add(new Cliente("Maria josé", "163.261.048-58", 25, new Conta(3456, 333333, 3000.00)));
		
		for(int i=0; i < cliente.size();i++) {
			System.out.println(cliente.get(i));
		}
		
		for(int i=0; i < cliente.size();i++) {
			if(cliente.get(i).getConta().getConta() == 3065 && cliente.get(i).getConta().getNumero() == 9823705) {
				cliente.get(i).getConta().depositar(350);
			}
			System.out.println(cliente.get(i));
		}
		
		
	}

}
