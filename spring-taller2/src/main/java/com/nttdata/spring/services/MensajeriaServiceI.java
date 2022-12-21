/**
 * 
 */
package com.nttdata.spring.services;

import com.nttdata.spring.repository.Pedido;
import com.nttdata.spring.repository.Producto;

/**
 * @author DURAN
 *
 */
public interface MensajeriaServiceI {

	public Pedido createOrder(Pedido pedido); 
	public Pedido addProductToAnOrder(Producto producto);
	public Pedido breakdownOrder(Pedido pedido);
}
