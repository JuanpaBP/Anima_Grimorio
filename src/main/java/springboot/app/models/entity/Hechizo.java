package springboot.app.models.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name = "HECHIZOS")
public class Hechizo implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String nombre;

	private String coste_zeon;
	
	private int tipo_via;
	
	private String int_requerida;
	
	@Lob
	private String descripcion;
	
	private int nivel_hechizo;
	
	@Lob
	private String efecto;
	
	private boolean libre_acceso;

	private int via;
	
	private short tipo_hechizo;
	
	private String tipo;
	
	private String mantenimiento;
	
	private short accion;
	
	
	
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



	public String getCoste_zeon() {
		return coste_zeon;
	}



	public void setCoste_zeon(String coste_zeon) {
		this.coste_zeon = coste_zeon;
	}



	public int getTipo_via() {
		return tipo_via;
	}



	public void setTipo_via(int tipo_via) {
		this.tipo_via = tipo_via;
	}



	public String getInt_requerida() {
		return int_requerida;
	}



	public void setInt_requerida(String int_requerida) {
		this.int_requerida = int_requerida;
	}



	public String getDescripcion() {
		return descripcion;
	}



	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}



	public int getNivel_hechizo() {
		return nivel_hechizo;
	}



	public void setNivel_hechizo(int nivel_hechizo) {
		this.nivel_hechizo = nivel_hechizo;
	}



	public String getEfecto() {
		return efecto;
	}



	public void setEfecto(String efecto) {
		this.efecto = efecto;
	}



	public boolean isLibre_acceso() {
		return libre_acceso;
	}



	public void setLibre_acceso(boolean libre_acceso) {
		this.libre_acceso = libre_acceso;
	}



	public int getVia() {
		return via;
	}



	public void setVia(int via) {
		this.via = via;
	}



	public short getTipo_hechizo() {
		return tipo_hechizo;
	}



	public void setTipo_hechizo(short tipo_hechizo) {
		this.tipo_hechizo = tipo_hechizo;
	}



	public String getTipo() {
		return tipo;
	}



	public void setTipo(String tipo) {
		this.tipo = tipo;
	}



	public String getMantenimiento() {
		return mantenimiento;
	}



	public void setMantenimiento(String mantenimiento) {
		this.mantenimiento = mantenimiento;
	}



	public short getAccion() {
		return accion;
	}



	public void setAccion(short accion) {
		this.accion = accion;
	}



	public static long getSerialversionuid() {
		return serialVersionUID;
	}



	private static final long serialVersionUID = -786941722589776734L;

}
