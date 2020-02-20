package springboot.app.converters;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class ConvertHechizo {

	private int id;
	private String nombre;
	private int nivel;
	private String accion;
	private String tipo;
	private String descripcion;
	private List<String> grados;
	private List<Integer> zeonr;
	private List<Integer> intr;
	private List<String> efecto;
	private String mantenimiento;
	private String tipoVia;
	private String via;
	private String libreacceso;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	public String getAccion() {
		return accion;
	}

	public void setAccion(String accion) {
		this.accion = accion;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public List<String> getGrados() {
		return grados;
	}

	public void setGrados(List<String> grados) {
		this.grados = grados;
	}

	public List<Integer> getZeonr() {
		return zeonr;
	}

	public void setZeonr(List<Integer> zeonr) {
		this.zeonr = zeonr;
	}

	public List<Integer> getIntr() {
		return intr;
	}

	public void setIntr(List<Integer> intr) {
		this.intr = intr;
	}

	public List<String> getEfecto() {
		return efecto;
	}

	public void setEfecto(List<String> efecto) {
		this.efecto = efecto;
	}

	public String getMantenimiento() {
		return mantenimiento;
	}

	public void setMantenimiento(String mantenimiento) {
		this.mantenimiento = mantenimiento;
	}

	public String getTipoVia() {
		return tipoVia;
	}

	public void setTipoVia(String tipoVia) {
		this.tipoVia = tipoVia;
	}

	public String getVia() {
		return via;
	}

	public void setVia(String via) {
		this.via = via;
	}

	public String getLibreacceso() {
		return libreacceso;
	}

	public void setLibreacceso(String libreacceso) {
		this.libreacceso = libreacceso;
	}

}