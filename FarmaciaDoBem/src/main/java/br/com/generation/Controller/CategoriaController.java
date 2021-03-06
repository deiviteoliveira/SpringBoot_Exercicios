package br.com.generation.Controller;

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

import br.com.generation.farmacia.Model.Categoria;
import br.com.generation.farmacia.repository.CategoriaRepository;


	
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
		
		
		
		@GetMapping("atendimento/{atendimento}")
	    public ResponseEntity<List<Categoria>> getByCategoria(@PathVariable String atendimento){
	    	   return ResponseEntity.ok(repository.findAllByAtendimentoContainingIgnoreCase(atendimento));
	    }

		  @PostMapping
		    public ResponseEntity<Categoria> postCategoria(@RequestBody Categoria setores){
		    	return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(setores));
		    	
		    }

		  @PutMapping
		    public ResponseEntity<Categoria> putCategoria(@RequestBody Categoria setores){
		    	return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(setores));
		    	
		    }

		  @DeleteMapping("/{id}")
		    public void deleteCategoria(@PathVariable long id) {
		    	repository.deleteById(id
		    			);
		    	
		    }
	}
		  
		  
		  
	

	
	
	

