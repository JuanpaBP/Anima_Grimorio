package springboot.app.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springboot.app.converters.ConvertHechizo;
import springboot.app.models.dao.IHechizoDao;
import springboot.app.models.entity.Hechizo;

@Service
public class HechizoTransformer {

	@Autowired
	private IHechizoDao ihd;

	List<ConvertHechizo> lch = new ArrayList<>();

	public List<ConvertHechizo> convertir() {
		
		List<Hechizo> lista = ihd.findAll();		
		for(Hechizo h : lista)
		{
			ConvertHechizo ch = new ConvertHechizo();
 			ch.setId(h.getId());
			ch.setNombre(h.getNombre());
			ch.setNivel(h.getNivel_hechizo());
			if(h.getAccion()==0)
			{
				ch.setAccion("Pasiva");
			}
			else
			{
				ch.setAccion("Activa");
			}
			ch.setTipo(h.getTipo());
			ch.setDescripcion(h.getDescripcion());
			ch.setGrados(Arrays.asList("Base", "Intermedio", "Avanzado", "Arcano"));
			String[] temp = h.getCoste_zeon().split(",");
			List<Integer> costes = new ArrayList<>();
			for(String c : temp)
			{
				//String numero = c.trim();
				//Integer numeroAAgregar = Integer.parseInt(numero); La linea sin comentar, equivale a estas 2 lineas, cambiando a costes.add(numeroAAgregar)
				costes.add(Integer.parseInt(c.trim()));
			}
			ch.setZeonr(costes);
			String[] tempi = h.getInt_requerida().split(",");
			List<Integer> intr = new ArrayList<>();
			for(String i : tempi)
			{
				intr.add(Integer.parseInt(i.trim()));
			}
			ch.setIntr(intr);
			String[] tempe = h.getEfecto().split("@");
			List<String> efectos = new ArrayList<>();
			for(String e : tempe)
			{
				efectos.add(e);
			}
			ch.setEfecto(efectos);
			if(h.isLibre_acceso())
			{
				ch.setLibreacceso("Sí");
			}
			else
			{
				ch.setLibreacceso("No");
			}	
			
			ch.setVia(MVias.mapaVias.get(h.getVia()));
			
			ch.setMantenimiento(h.getMantenimiento());
			
			lch.add(ch);
		}
			
			
			return lch;
	}

}
