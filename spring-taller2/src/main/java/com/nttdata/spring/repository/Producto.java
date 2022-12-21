/**
 * 
 */
package com.nttdata.spring.repository;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

/**
 * @author DURAN
 *
 */
@Entity
public class Producto implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long productoId;
	private String nombre;
	private Double pvp;
	private double precio;
	private Pedido pedido;
	
	public Producto() {
		
	}
	/**
	 * @param productoId
	 * @param nombre
	 * @param pvp
	 * @param precio
	 * @param pedido
	 */
	public Producto(Long productoId, String nombre, Double pvp, double precio, Pedido pedido) {
		super();
		this.productoId = productoId;
		this.nombre = nombre;
		this.pvp = pvp;
		this.precio = precio;
		this.pedido = pedido;
	}
	/**
	 * @return the productoId
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "C_PK_PRODUCTO_ID")
	public Long getProductoId() {
		return productoId;
	}
	/**
	 * @param productoId the productoId to set
	 */
	public void setProductoId(Long productoId) {
		this.productoId = productoId;
	}
	/**
	 * @return the nombre
	 */
	@Column(name = "C_NOMBRE")
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the pvp
	 */
	@Column(name = "C_PVP")
	public Double getPvp() {
		return pvp;
	}
	/**
	 * @param pvp the pvp to set
	 */
	public void setPvp(Double pvp) {
		this.pvp = pvp;
	}
	/**
	 * @return the precio
	 */
	@Column(name = "C_PRECIO")
	public double getPrecio() {
		return precio;
	}
	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	/**
	 * @return the pedido
	 */
	@ManyToOne
	@JoinColumn(name = "C_FK_PEDIDO")
	public Pedido getPedido() {
		return pedido;
	}
	/**
	 * @param pedido the pedido to set
	 */
	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

}
