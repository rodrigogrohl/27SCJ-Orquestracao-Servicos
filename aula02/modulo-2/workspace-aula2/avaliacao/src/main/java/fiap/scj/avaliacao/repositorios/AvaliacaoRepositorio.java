package fiap.scj.avaliacao.repositorios;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import javax.inject.Named;

import fiap.scj.avaliacao.to.AvaliacaoTO;

/**
 * Classe responsável por armazenar os horários livres e agendamentos efetuados.
 * 
 * @author Eduardo Galego
 */
@Named
public class AvaliacaoRepositorio {

	private static Collection<AvaliacaoTO> listaAvaliacao = new ArrayList<AvaliacaoTO>();
	
	public AvaliacaoTO registrarAvaliacao(Date dataInicio, Date dataFim, String avaliacao) {
		AvaliacaoTO to = new AvaliacaoTO();
		to.setDataInicio(dataInicio);
		to.setDataFim(dataFim);
		to.setAvaliacao(avaliacao);
		listaAvaliacao.add(to);
		return to;
	}
}
