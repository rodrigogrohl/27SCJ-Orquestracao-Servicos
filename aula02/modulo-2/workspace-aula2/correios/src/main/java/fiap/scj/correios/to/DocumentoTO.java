package fiap.scj.correios.to;

import java.util.Date;

public class DocumentoTO {

	private Integer codigoRastreio;
	private Date dataPostagem;
	private String endereco;
	private String nomeDestinatario;
	private String tipoDocumento;

	public Integer getCodigoRastreio() {
		return codigoRastreio;
	}

	public void setCodigoRastreio(Integer codigoRastreio) {
		this.codigoRastreio = codigoRastreio;
	}

	public Date getDataPostagem() {
		return dataPostagem;
	}

	public void setDataPostagem(Date dataPostagem) {
		this.dataPostagem = dataPostagem;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getNomeDestinatario() {
		return nomeDestinatario;
	}

	public void setNomeDestinatario(String nomeDestinatario) {
		this.nomeDestinatario = nomeDestinatario;
	}

	public String getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	@Override
	public String toString() {
		return "DocumentoTO [dataPostagem=" + dataPostagem + ", endereco=" + endereco + ", nomeDestinatario="
				+ nomeDestinatario + ", tipoDocumento=" + tipoDocumento + "]";
	}
}
