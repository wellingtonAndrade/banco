import java.util.List;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Conta conta1 = new ContaCorrente(3065, 9823705, 50);
		Conta conta2 = new ContaPoupanca(1545, 222222, 200.00);
		Conta conta3 = new ContaCorrente(3456, 333333, 3000.00);
		List<Cliente> cliente = new ArrayList<Cliente>();
		cliente.add(new Cliente("wellington Andrade", "361.616.898-80", 25, conta1));
		cliente.add(new Cliente("Viviane Andrade", "753.443.678-75", 25, conta2 ));
		cliente.add(new Cliente("Maria josé", "163.261.048-58", 25, conta3));
		
//		for(int i=0; i < cliente.size();i++) {
//			System.out.println(cliente.get(i));
//		}
		
//		for(int i=0; i < cliente.size();i++) {
//			if(cliente.get(i).getConta().getConta() == 3065 && cliente.get(i).getConta().getNumero() == 9823705) {
//				cliente.get(i).getConta().sacar(100);
//			}
//			System.out.println(cliente.get(i));
//		}
		
		for(int i=0; i < cliente.size();i++) {
			if(cliente.get(i).getConta().getConta() == 3065 && cliente.get(i).getConta().getNumero() == 9823705) {
					cliente.get(i).getConta().sacar(50);
				
			}
			System.out.println(cliente.get(i));
		}
		
		CalculadorImposto calc = new CalculadorImposto();
		calc.registra(conta3);
		System.out.println("Ïmposto: " + calc.getTotalImposto());
				
	}

}
