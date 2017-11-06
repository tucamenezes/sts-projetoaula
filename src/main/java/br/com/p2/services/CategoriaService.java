package br.com.p2.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.p2.domain.Categoria;
import br.com.p2.repositories.CategoriaRepository;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository repo;
	
	public Categoria buscar(Integer idCat) {
		
		return repo.findOne(idCat); 
	}
}
