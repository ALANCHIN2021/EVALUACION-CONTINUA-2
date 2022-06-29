package com.idat.EC2AlanEscumpaniBodega.Controller;




public class UsuarioController {
	
	
	@Controller
	@RequestMapping(path = "/usuario/v1")
	public class UsuarioController {
		
		@Autowired
		private UsuarioService service;
		
		@RequestMapping("/listar")
		public @ResponseBody ResponseEntity<List<Usuario>> listar() {
			
			return new ResponseEntity<List<Usuario>>(service.listarUsuario(), HttpStatus.OK);
		}
		
		@RequestMapping( path = "/guardar", method = RequestMethod.POST)
		public ResponseEntity<Void> guardar(@RequestBody Usuario usuario) {
			service.guardarUsuario(usuario);
			return new ResponseEntity<Void>(HttpStatus.CREATED);
		}
		
		
		@RequestMapping( path = "/eliminar/{id}", method = RequestMethod.DELETE)
		public ResponseEntity<Void> eliminar(@PathVariable Integer id) {
			
			Usuario usuario = service.obtenerUsuarioId(id);
			
			if(usuario !=null) {
			service.eliminarUsuario(id);
			return new ResponseEntity<Void>(HttpStatus.OK);
			}
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		}
		
		@RequestMapping( path = "/actualizar", method = RequestMethod.PUT)
		public ResponseEntity<Void> actualizar(@RequestBody Usuario usuario) {
			
			Usuario usuarios =service.obtenerUsuarioId(usuario.getIdUsuario());
		
		if(usuario !=null) {
		    service.actualizarUsuario(usuario);
			return new ResponseEntity<Void>(HttpStatus.OK);
			
		}
		
		return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		}
		
		@RequestMapping( path = "/listar/{id}", method = RequestMethod.GET)
		public ResponseEntity<Usuario> obtenerId(@PathVariable Integer id) {
			
			Usuario usuario =service.obtenerUsuarioId(id);
		
			if(usuario !=null) {
				return new ResponseEntity<Usuario>(service.obtenerUsuarioId(id),(HttpStatus.OK));
		}
		
			return new ResponseEntity<Usuario>(HttpStatus.NOT_FOUND);
		}

	}
	

}
