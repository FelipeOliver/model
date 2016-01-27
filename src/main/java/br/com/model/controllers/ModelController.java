package br.com.model.controllers;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.model.models.Model;
import br.com.model.repositories.ModelRepositorie;

@Controller
@Transactional
public class ModelController {

	@Autowired
	private ModelRepositorie modelRepositorie;
	
	@RequestMapping("/")
	public String home(){
		return "home";
	}
	
	@RequestMapping("/adicionaModel")
	public String adicionaModel(){
		Model model = new Model();
		model.setNome("Felipe");
		modelRepositorie.save(model);
		return "home";
	}
}
