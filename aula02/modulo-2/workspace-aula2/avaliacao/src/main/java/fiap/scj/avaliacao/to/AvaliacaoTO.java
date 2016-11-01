package fiap.scj.avaliacao.to;

import java.util.Date;

public class AvaliacaoTO {

	private Date dataInicio;
	private Date dataFim;
	private String avaliacao;

	public Date getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}

	public Date getDataFim() {
		return dataFim;
	}

	public void setDataFim(Date dataFim) {
		this.dataFim = dataFim;
	}

	public String getAvaliacao() {
		return avaliacao;
	}

	public void setAvaliacao(String avaliacao) {
		this.avaliacao = avaliacao;
	}

	@Override
	public String toString() {
		return "AvaliacaoTO [dataInicio=" + dataInicio + ", dataFim=" + dataFim + ", avaliacao=" + avaliacao + "]";
	}
}
