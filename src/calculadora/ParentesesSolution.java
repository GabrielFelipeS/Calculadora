package calculadora;

import java.util.ArrayList;
import java.util.List;

public class ParentesesSolution {
	private String texto;
	private List<String> listaDeStringParaReplace = new ArrayList<String>();

	public ParentesesSolution(String texto) {
		this.texto = texto;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public void setAdd(String texto) {
		this.listaDeStringParaReplace.add(0, texto);
	}
	
	public String indexZeroListaDeStringParaReplace() {
		return listaDeStringParaReplace.get(0);
	}
}
