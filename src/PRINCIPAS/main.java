package PRINCIPAS;

import ClienteClasse.Cliente;
import EnderecoClasse.Endereco;
import ItemTema.Themu;
import TemaClasse.Tema;

public class main {

	public static void main(String[] args) {
		Themu itemtema = new Themu(1, "sla", "sei la tb");
		Tema tema1 = new Tema(2, "escuro", 2300, "verde");
		Endereco endereco1 = new Endereco(1, "rua dos bobos", 23, "casa", "do santos", "Jopiranga", "19292992", "SP");
		Cliente cliente1 = new Cliente(1, "sJonas", "15 77383884", "4851662737", "58633838");
		
		System.out.println(endereco1.getLogradouro());
		System.out.println(endereco1.getId());
		System.out.println(endereco1.getNumero());
		System.out.println(endereco1.getComplemento());
		System.out.println(endereco1.getBairro());
		System.out.println(endereco1.getCidade());
		System.out.println(endereco1.getCep());
		System.out.println(endereco1.getUf());
		
		System.out.println(itemtema.getId());
		System.out.println(itemtema.getNome());
		System.out.println(itemtema.getDescricao());
		
		System.out.println(tema1.getId());
		System.out.println(tema1.getNome());
		System.out.println(tema1.getValorAluguel());
		System.out.println(tema1.getCorTolha());
		
		System.out.println(cliente1.getId());
		System.out.println(cliente1.getNome());
		System.out.println(cliente1.getTelefone());
		System.out.println(cliente1.getCpf());
		System.out.println(cliente1.getRg());
	}

}
