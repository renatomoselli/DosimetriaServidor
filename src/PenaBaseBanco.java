import java.time.Period;
import java.util.ArrayList;
import java.util.List;


public class PenaBaseBanco {
	List<PenaBase> pena;
	
	Period aux;
	
	public PenaBaseBanco(){
		
		pena = new ArrayList<PenaBase>();
		
		PenaBase pena1 = new PenaBase();
		pena1.setId(1);
		pena1.setNome("furto");
		pena1.setAno(5);
		pena1.setMes(3);
		//aux.plusYears(5).plusMonths(3);
		//pena1.setTempo(null);
		pena.add(pena1);
		
		PenaBase pena2 = new PenaBase();
		pena2.setId(2);
		pena2.setNome("assalto");
		pena2.setAno(7);
		pena2.setMes(1);
		//aux.plusYears(7).plusMonths(2);
		//pena2.setTempo(null);
		pena.add(pena2);
	}
	
	public List<PenaBase> getPenas() {
		// TODO Auto-generated method stub
		return pena;
	}
	
	public PenaBase getPena(int id) {
		// TODO Auto-generated method stub
		for (PenaBase c : pena){
			if (c.getId() == id)
				return c;
		}
		return null;//pena.get(0);
	}
	
	public PenaBase getPenaNome(String nome) {
		// TODO Auto-generated method stub
		for (PenaBase c : pena){
			if (c.getNome().equals(nome))
				return c;
		}
		return null;//pena.get(0);
	}

}
