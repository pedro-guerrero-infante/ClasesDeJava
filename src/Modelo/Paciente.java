package Modelo;

import java.time.LocalDate;

public class Paciente {

	private String nombre;
	private String documentoIdentificacion;
	private String telefono;
	private int edad;
	private LocalDate fechaIngreso;

	public Paciente()
	{
		
	}
	
	public String obtenerNombre() {
		return nombre;
	}

	public void modificarNombre(String nombrep) {
		this.nombre = nombrep;
	}

	public String getNombre() {
		return nombre;
	}

	public String getDocumentoIdentificacion() {
		return documentoIdentificacion;
	}

	public String getTelefono() {
		return telefono;
	}

	public int getEdad() {
		return edad;
	}

	public LocalDate getFechaIngreso() {
		return fechaIngreso;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setDocumentoIdentificacion(String documentoIdentificacion) {
		this.documentoIdentificacion = documentoIdentificacion;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public void setFechaIngreso(LocalDate fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}
	
	
}
