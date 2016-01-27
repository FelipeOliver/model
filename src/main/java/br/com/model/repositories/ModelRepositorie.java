package br.com.model.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.model.models.Model;

@Repository
public interface ModelRepositorie extends CrudRepository<Model, Long>{

}
