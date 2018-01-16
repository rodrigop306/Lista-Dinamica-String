import javax.swing.JOptionPane;

public class Principal {
	public static void main(String[] args) {
		int opc = 0;
		ListaLigada l1 = new ListaLigada();
		String nome;
		int pos;
		while(opc!=8){
			opc = Integer.parseInt(JOptionPane.showInputDialog("1 - Adicionar Nome\n"
					+ "2 - Remover inicio \n"
					+ "3 - Remover posicao especifica \n"
					+ "4 - Remover final \n"
					+ "5 - Visualizar lista \n"
					+ "6 - Sair"));
			switch(opc){
			case 1:
				nome=JOptionPane.showInputDialog("Digite um nome: ");
				l1.adiciona(nome);
				break;
			case 2:
				l1.removeInicio();
				break;
			case 3:
				pos = Integer.parseInt(JOptionPane.showInputDialog("Digite a posicao"));
				l1.removePos(pos);
				break;
			case 4:
				l1.removeFinal();
				break;
			case 5:
				JOptionPane.showMessageDialog(null, l1.toString());
				break;
			case 6:
				System.exit(0);
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opcao invalida");
				break;
			}
		}
	}
}
