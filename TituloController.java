package edu.ifmt.cobranca.ifmt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.ifmt.cobranca.ifmt3.model.Titulo;

@Controller //anotação controller do Spring
@RequestMapping("/titulos")
class TituloController {
	@RequestMapping("/novo")//mapeamento da url
	
	//método que retorna uma String com o nome da view
	public String novo() {
		return "CadastroTitulo";

	}
	
	@RequestMapping(method=RequestMethod.POST)
	public void salvar(Titulo titulo) {
		
	}
}




