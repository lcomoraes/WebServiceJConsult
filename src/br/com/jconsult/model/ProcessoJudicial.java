package br.com.jconsult.model;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Classe entidade (Bean) processo judicial
 * @author luan
 *
 */
@XmlRootElement
public class ProcessoJudicial {
	
	private String numeroUnico;
    private String numeroProcesso;
    private String dataAbertura;
    private String natureza;
    private String classe;
    
    
	public String getNumeroUnico() {
		return numeroUnico;
	}
	public void setNumeroUnico(String numeroUnico) {
		this.numeroUnico = numeroUnico;
	}
	public String getNumeroProcesso() {
		return numeroProcesso;
	}
	public void setNumeroProcesso(String numeroProcesso) {
		this.numeroProcesso = numeroProcesso;
	}
	public String getDataAbertura() {
		return dataAbertura;
	}
	public void setDataAbertura(String dataAbertura) {
		this.dataAbertura = dataAbertura;
	}
	public String getNatureza() {
		return natureza;
	}
	public void setNatureza(String natureza) {
		this.natureza = natureza;
	}
	public String getClasse() {
		return classe;
	}
	public void setClasse(String classe) {
		this.classe = classe;
	}
	

}
