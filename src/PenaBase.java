import java.security.Timestamp;
import java.sql.Date;
import java.time.Period;
import java.util.Calendar;


public class PenaBase {
	int id;
	String nome;
	int ano, mes;

	
	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "PenaBase [id=" + id + ", nome=" + nome + ", ano=" + ano
				+ ", mes=" + mes + "]";
	}

	

}
