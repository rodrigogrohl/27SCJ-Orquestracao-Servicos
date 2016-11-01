package fiap.scj.avaliacao.endpoints;

import javax.inject.Inject;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import br.com.fiap.mba.scj.avaliacao.RegistrarAvaliacaoRequest;
import fiap.scj.avaliacao.repositorios.AvaliacaoRepositorio;
import fiap.scj.avaliacao.to.AvaliacaoTO;

@Endpoint
public class AvaliacaoEndpoint {
	private static final String NAMESPACE_URI = "http://www.fiap.com.br/mba/scj/avaliacao";

	@Inject
	private AvaliacaoRepositorio repositorio;

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "registrarAvaliacaoRequest")
	@ResponsePayload
	public void registrarAvaliacao(@RequestPayload RegistrarAvaliacaoRequest request) {				
		AvaliacaoTO to = repositorio.registrarAvaliacao(
				request.getDataInicio().toGregorianCalendar().getTime(), 
				request.getDataFim().toGregorianCalendar().getTime(), 
				request.getAvaliacao());
		
		System.out.println("Avaliação registrada "+ to.toString());
	}

}