package br.com.fipgati.eventos.web.controllers;

import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Resource;
import br.com.fipgati.eventos.domain.model.Usuario;

@Resource
public class LoginController {
	
	@Path("/admin")
	public void index(){
		
	}
	
	public void autenticar(Usuario organizador){
		//logar
	}

}
