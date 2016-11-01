package fiap.scj.correios.endpoints;

import java.math.BigInteger;

import javax.inject.Inject;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import br.com.fiap.mba.scj.correios.RegistrarDocumentoParaEnvioRequest;
import br.com.fiap.mba.scj.correios.RegistrarDocumentoParaEnvioResponse;
import fiap.scj.correios.repositorios.CorreiosRepositorio;
import fiap.scj.correios.to.DocumentoTO;

@Endpoint
public class CorreiosEndpoint {
	private static final String NAMESPACE_URI = "http://www.fiap.com.br/mba/scj/correios";

	@Inject
	private CorreiosRepositorio repositorio;

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "registrarDocumentoParaEnvioRequest")
	@ResponsePayload
	public RegistrarDocumentoParaEnvioResponse registrarAvaliacao(
			@RequestPayload RegistrarDocumentoParaEnvioRequest request) {
		RegistrarDocumentoParaEnvioResponse response = new RegistrarDocumentoParaEnvioResponse();
		DocumentoTO to = repositorio.registrarDocumento(request.getEndereco(), request.getNomeDestinatario(),
				request.getTipoDocumento());
		response.setCodigoRastreio(BigInteger.valueOf(to.getCodigoRastreio()));
		return response;
	}

}