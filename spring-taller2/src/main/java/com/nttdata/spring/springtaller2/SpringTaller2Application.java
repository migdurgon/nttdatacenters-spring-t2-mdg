package com.nttdata.spring.springtaller2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nttdata.spring.repository.Pedido;
import com.nttdata.spring.repository.Producto;
import com.nttdata.spring.services.MensajeriaServiceI;

@SpringBootApplication
public class SpringTaller2Application implements CommandLineRunner{
	
	@Autowired
	@Qualifier("penisulaService")
	private MensajeriaServiceI penisulaService;

	@Autowired
	@Qualifier("noPenisulaService")
	private MensajeriaServiceI noPenisulaService;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringTaller2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Pedido p = new Pedido();
		p.setPeninsula(true);
		Producto pr = new Producto();
		pr.setPedido(p);
		System.out.println(penisulaService.breakdownOrder(p));
		
	}

}
