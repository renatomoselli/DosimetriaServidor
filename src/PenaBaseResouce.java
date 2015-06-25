import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("pena")
public class PenaBaseResouce {
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<PenaBase> getTodasPenas() {
		PenaBaseBanco dao = new PenaBaseBanco();
		return dao.getPenas();
	}
	
//	@Path("{idPena}")
//	@GET
//	@Produces(MediaType.APPLICATION_JSON)
//	public PenaBase getPenaById(@PathParam("idPena") int id) {
//		PenaBaseBanco dao = new PenaBaseBanco();
//		return dao.getPena(id);
//	}
	
	@Path("{nomePena}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public PenaBase getPenaByNome(@PathParam("nomePena") String nome) {
		PenaBaseBanco dao = new PenaBaseBanco();
		return dao.getPenaNome(nome);
	}

	
	
}
