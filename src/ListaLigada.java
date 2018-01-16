import javax.swing.JOptionPane;

public class ListaLigada {
	private No inicio;
	public ListaLigada() {
		inicio=null;
	}
	
	public void adiciona(String nome) {
		No novo = new No(nome);
		if (inicio == null || inicio.dado.compareTo(nome) > 0) {
			novo.prox = inicio;
			inicio = novo;
		} else {
			No aux1 = inicio;
			int compara = aux1.dado.compareTo(nome);
			while (aux1.prox != null && compara < 0) {
				if(aux1.prox!=null){
					compara = aux1.prox.dado.compareTo(nome);
				}if(compara<0){
					aux1 = aux1.prox;
				}
				
			}
			if (compara >= 0) {
				novo.prox = aux1.prox;
				aux1.prox = novo;
			} else {
				aux1.prox = novo;
			}
		}
	}	

	public String removeInicio() {
		String removido = null;
		if(inicio==null) {
			JOptionPane.showMessageDialog(null, "ERRO: Lista vazia");
		}else {
			removido=inicio.dado;
			inicio=inicio.prox;
		}
		return removido;
	}
	
	public String removePos(int pos) {
		String r="";
		if(inicio==null) {
			JOptionPane.showMessageDialog(null, "ERRO: Lista vazia");
		}
		if(pos==1) {
			r=inicio.dado;
			inicio=inicio.prox;
		}else {
			int contador=1;
			No aux1=inicio;
			No aux2=null;
			while(aux1.prox!=null && contador<pos){
				aux2=aux1;	
				aux1=aux1.prox;
				contador++;
			}
			System.out.println(contador);
			if(aux1.prox==null && contador==pos) {
				r=aux1.dado;
				aux2.prox=null;
			}
			else if(contador==pos) {
				r=aux1.dado;
				aux2.prox=aux1.prox;
			}else {
				JOptionPane.showMessageDialog(null, "Posicao invalida");
			}
		}
		return r;
	}
	
	public String removeFinal() {
		String removido = null;
		if(inicio==null) {
			JOptionPane.showMessageDialog(null, "ERRO: Lista vazia");
		}else if(inicio.prox==null) {
			removido=inicio.dado;
			inicio=null;
		}else {
			No aux1=inicio;
			No aux2=null;
			while(aux1.prox!=null) {
				aux2=aux1;
				aux1=aux1.prox;
			}
			removido=aux1.dado;
			aux2.prox=null;
		}
		return removido;
	}
	@Override
	public String toString() {
		String s="";
		No aux = inicio;
		while(aux!=null) {
			s=s+" "+aux.dado;
			aux=aux.prox;
		}
		return s;
	}
		
}
