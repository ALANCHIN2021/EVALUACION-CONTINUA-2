package com.idat.EC2AlanEscumpaniBodega.Controller;




public class ClienteController {
	
	
	@Controller
	@RequestMapping(path = "/cliente/v1")
	public class ClienteController {

		@Autowired
		private ClienteService service;
		
		@RequestMapping("/listar")
		public @ResponseBody ResponseEntity<List<Cliente>> listar() {
			
			return new ResponseEntity<List<Cliente>>(service.listarCliente(), HttpStatus.OK);
		}
		
		@RequestMapping( path = "/guardar", method = RequestMethod.POST)
		public ResponseEntity<Void> guardar(@RequestBody Cliente cliente) {
			service.guardarCliente(cliente);
			return new ResponseEntity<Void>(HttpStatus.CREATED);
		}
		
		
		@RequestMapping( path = "/eliminar/{id}", method = RequestMethod.DELETE)
		public ResponseEntity<Void> eliminar(@PathVariable Integer id) {
			
			Cliente cliente = service.obtenerClienteId(id);
			
			if(cliente !=null) {
			service.eliminarCliente(id);
			return new ResponseEntity<Void>(HttpStatus.OK);
			}
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		}
		
		@RequestMapping( path = "/actualizar", method = RequestMethod.PUT)
		public ResponseEntity<Void> actualizar(@RequestBody Cliente cliente) {
			
			Cliente clientes =service.obtenerClienteId(cliente.getIdCliente());
		
		if(cliente !=null) {
		    service.actualizarCliente(cliente);
			return new ResponseEntity<Void>(HttpStatus.OK);
			
		}
		
		return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		}
		
		@RequestMapping( path = "/listar/{id}", method = RequestMethod.GET)
		public ResponseEntity<Cliente> obtenerId(@PathVariable Integer id) {
			
			Cliente Cliente =service.obtenerClienteId(id);
		
			if(Cliente !=null) {
				return new ResponseEntity<Cliente>(service.obtenerClienteId(id),(HttpStatus.OK));
		}
		
			return new ResponseEntity<Cliente>(HttpStatus.NOT_FOUND);
		}

	}
	

}
