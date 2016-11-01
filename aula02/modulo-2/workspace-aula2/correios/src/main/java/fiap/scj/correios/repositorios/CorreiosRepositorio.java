package fiap.scj.correios.repositorios;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import javax.inject.Named;

import fiap.scj.correios.to.DocumentoTO;

/**
 * Classe responsável por armazenar os documento postados.
 * 
 * @author Eduardo Galego
 */
@Named
public class CorreiosRepositorio {

	private static Collection<DocumentoTO> listaDocumentos = new ArrayList<DocumentoTO>();
	private static Integer proxCodigoRastreio = 1;

	public DocumentoTO registrarDocumento(String endereco, String nomeDestinatario, String tipoDocumento) {
		DocumentoTO to = new DocumentoTO();
		to.setDataPostagem(new Date());
		to.setCodigoRastreio(proxCodigoRastreio++);
		to.setEndereco(endereco);
		to.setNomeDestinatario(nomeDestinatario);
		to.setTipoDocumento(tipoDocumento);
		listaDocumentos.add(to);
		
		System.out.println("Novo documento postado: "+ to.toString());
		
		return to;
	}
}
