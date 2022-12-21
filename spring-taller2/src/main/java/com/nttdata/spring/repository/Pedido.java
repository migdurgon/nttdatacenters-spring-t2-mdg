/**
 * 
 */
package com.nttdata.spring.repository;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

/**
 * @author DURAN
 *
 */
@Entity
public class Pedido implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long pedidoId;
	private String destinatario;
	private String direccionEntrega;
	private Boolean peninsula;
	private List<Producto> productos;
	
	
	public Pedido() {
		
	}
	/**
	 * @param pedidoId
	 * @param destinatario
	 * @param direccionEntrega
	 * @param peninsula
	 * @param productos
	 */
	public Pedido(Long pedidoId, String destinatario, String direccionEntrega, Boolean peninsula,
			List<Producto> productos) {
		super();
		this.pedidoId = pedidoId;
		this.destinatario = destinatario;
		this.direccionEntrega = direccionEntrega;
		this.peninsula = peninsula;
		this.productos = productos;
	}
	
	/**
	 * @return the pedidoId
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "C_PK_PEDIDO_ID")
	public Long getPedidoId() {
		return pedidoId;
	}
	/**
	 * @param pedidoId the pedidoId to set
	 */
	public void setPedidoId(Long pedidoId) {
		this.pedidoId = pedidoId;
	}
	/**
	 * @return the destinatario
	 */
	@Column(name = "C_DESTINATARIO")
	public String getDestinatario() {
		return destinatario;
	}
	/**
	 * @param destinatario the destinatario to set
	 */
	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}
	/**
	 * @return the direccionEntrega
	 */
	@Column(name = "C_DIRECCION_ENTREGA")
	public String getDireccionEntrega() {
		return direccionEntrega;
	}
	/**
	 * @param direccionEntrega the direccionEntrega to set
	 */
	public void setDireccionEntrega(String direccionEntrega) {
		this.direccionEntrega = direccionEntrega;
	}
	/**
	 * @return the península
	 */
	@Column(name = "C_PENINSULA")
	public Boolean getPeninsula() {
		return peninsula;
	}
	/**
	 * @param península the península to set
	 */
	public void setPeninsula(Boolean peninsula) {
		this.peninsula = peninsula;
	}
	/**
	 * @return the productos
	 */
	@OneToMany(mappedBy = "productos")
	public List<Producto> getProductos() {
		return productos;
	}
	/**
	 * @param productos the productos to set
	 */
	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}
		
}
