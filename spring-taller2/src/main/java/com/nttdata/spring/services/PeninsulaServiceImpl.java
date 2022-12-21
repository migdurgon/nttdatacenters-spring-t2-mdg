/**
 * 
 */
package com.nttdata.spring.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nttdata.spring.repository.Pedido;
import com.nttdata.spring.repository.Producto;

/**
 * @author DURAN
 *
 */
@Service("penisulaService")
public class PeninsulaServiceImpl implements MensajeriaServiceI {

	@Autowired
	MensajeriaServiceI mensajeriaService;

	@Override
	public Pedido createOrder(Pedido pedido) {
		Pedido p = pedido;
		return p;
	}

	@Override
	public Pedido addProductToAnOrder(Producto producto) {
		Pedido p = new Pedido();
		p.getProductos().add(producto);
		return p;
	}

	@Override
	public Pedido breakdownOrder(Pedido pedido) {
		int x = pedido.getProductos().size();

		for (int i = 0; i < x; i++) {
			Double pvp = pedido.getProductos().get(i).getPvp();
			Double pvpNuevo = pvp * 1.21;
			if (pedido.getPeninsula() == true) {
				pedido.getProductos().get(i).setPvp(pvpNuevo);
			} else {
				
			}

		}
		return pedido;
	}

}
