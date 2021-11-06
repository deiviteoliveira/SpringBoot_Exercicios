package br.com.generation.lojadeGames.controle;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.generation.lojadeGames.Model.Categoria;
import br.com.generation.lojadeGames.repository.CategoriaRepository;

@RestController
@RequestMapping("/categoria")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class CategoriaController {

	
	@Autowired
	private CategoriaRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Categoria>> getAll () {
		return ResponseEntity.ok(repository.findAll()); // OK 200
		
		
	}
	
	@GetMapping("/{id}")
    public ResponseEntity<Categoria> GetById(@PathVariable long id) {
    	return repository.findById(id)
    			.map(resp -> ResponseEntity.ok(resp))
    			.orElse(ResponseEntity.notFound().build());
	
	}
	
	
	
	@GetMapping("/genero/{genero}")
    public ResponseEntity<List<Categoria>> getByCategoria(@PathVariable String genero){
    	   return ResponseEntity.ok(repository.findAllByGeneroContainingIgnoreCase(genero));
    }

	  @PostMapping
	    public ResponseEntity<Categoria> postCategoria(@RequestBody Categoria id){
	    	return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(id));
	    	
	    }

	  @PutMapping
	    public ResponseEntity<Categoria> putCategoria(@RequestBody Categoria id){
	    	return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(id));
	    	
	    }

	  @DeleteMapping("/{id}")
	    public void deleteCategoria(@PathVariable long id) {
	    	repository.deleteById(id
	    			);
	    	
	    }
	    
	  
	  
	  
}




