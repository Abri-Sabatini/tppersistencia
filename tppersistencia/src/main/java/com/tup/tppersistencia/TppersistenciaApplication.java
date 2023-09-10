package com.tup.tppersistencia;

import com.tup.tppersistencia.entidades.*;
import com.tup.tppersistencia.repositorios.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TppersistenciaApplication {

	@Autowired
	UsuarioRepository usuarioRepository;
	@Autowired
	DomicilioRepository domicilioRepository;
	@Autowired
	PedidoRepository pedidoRepository;
	@Autowired
	FacturaRepository facturaRepository;
	@Autowired
	DetallePedidoRepository detallePedidoRepository;
	@Autowired
	ProductoRepository productoRepository;
	@Autowired
	RubroRepository rubroRepository;
	@Autowired
	ClienteRepository clienteRepository;

	public static void main(String[] args) {
		SpringApplication.run(TppersistenciaApplication.class, args);
		System.out.println("Estoy funcionando");
	}
	@Bean
	CommandLineRunner init(UsuarioRepository usuarioRepository, DomicilioRepository domicilioRepository,
						   PedidoRepository pedidoRepository, FacturaRepository facturaRepository,
						   ProductoRepository productoRepository, DetallePedidoRepository detallePedidoRepository,
						   RubroRepository rubroRepository, ClienteRepository clienteRepository) {
		return args -> {
			Factura factura = Factura.builder()
					.fecha("08-10-2022")
					.numero(21324)
					.descuento(225)
					.formaPago(Factura.FormaPago.MERCADO_PAGO)
					.total(4275)
					.build();

			Cliente cliente = Cliente.builder()
					.nombre("Juan")
					.apellido("Pérez")
					.telefono("12345")
					.email("juanperez@gmail.com")
					.build();

			Cliente cliente2 = Cliente.builder()
					.nombre("Pamela")
					.apellido("Gonzalez")
					.telefono("54321")
					.email("pamelagonzalez54@gmail.com")
					.build();

			Domicilio domicilio = Domicilio.builder()
					.calle("Salchipapa")
					.numero("M17")
					.localidad("Godoy Cruz")
					.build();

			Usuario usuario = Usuario.builder()
					.nombre("pamGonzalez")
					.password("fhsfhsiu")
					.rol("Cliente")
					.build();

			Usuario usuario2 = Usuario.builder()
					.nombre("cookLautaro")
					.password("56gfjs")
					.rol("Cocinero")
					.build();

			Producto producto = Producto.builder()
					.tipo(Producto.Tipo.MANUFACTURADO)
					.tiempoEstimadoCocina(25)
					.denominacion("Sanguche")
					.precioVenta(1500)
					.precioCompra(700)
					.stockActual(200)
					.stockMinimo(10)
					.unidadMedida("kg")
					.foto("")
					.receta("Cortar jamón, queso y panceta, calentar por 60s en la sanguchera")
					.build();

			Rubro rubro = Rubro.builder()
					.denominacion("Sanguches")
					.build();

			Rubro rubro2 = Rubro.builder()
					.denominacion("Carnes")
					.build();

			Rubro rubro3 = Rubro.builder()
					.denominacion("Pizzas")
					.build();

			DetallePedido detallePedido = DetallePedido.builder()
					.cantidad(3)
					.subtotal(4500)
					.build();

			Pedido pedido = Pedido.builder()
					.fecha("08-10-2022")
					.estado(Pedido.Estado.ENTREGADO)
					.horaEstimadaEntrega("13:30")
					.tipoEnvio(Pedido.TipoEnvio.DELIVERY)
					.total(5130)
					.build();

			pedido.setFactura(factura);
			rubro.agregarProducto(producto);
			detallePedido.setProducto(producto);
			pedido.agregarDetallePedido(detallePedido);
			cliente2.agregarPedido(pedido);
			domicilio.agregarPedido(pedido);
			domicilio.setCliente(cliente2);
			usuario.agregarPedido(pedido);

			facturaRepository.save(factura);
			clienteRepository.save(cliente);
			clienteRepository.save(cliente2);
			productoRepository.save(producto);
			usuarioRepository.save(usuario);
			usuarioRepository.save(usuario2);
			domicilioRepository.save(domicilio);
			detallePedidoRepository.save(detallePedido);
			rubroRepository.save(rubro);
			rubroRepository.save(rubro2);
			rubroRepository.save(rubro3);
			productoRepository.save(producto);
			pedidoRepository.save(pedido);

		};
	}
}
