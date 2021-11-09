package br.com.generation.farmacia.Model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

	
	
	@Entity
	@Table(name = "tb_categoria")
	public class Categoria {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private long id;
		
		@NotBlank (message = "o campo é obrigatório")      
		@Size(min = 2, max = 50)
		private String atendimento;
		
		
		@NotNull(message = "o campo é obrigatório")
		@Size(min = 2, max = 50)
		private String setores;
		
		
		@OneToMany(mappedBy = "categoria", cascade = CascadeType.ALL)
		@JsonIgnoreProperties("categoria")
		private List<Produto> produto;


		public long getId() {
			return id;
		}


		public void setId(long id) {
			this.id = id;
		}


		public String getAtendimento() {
			return atendimento;
		}


		public void setAtendimento(String atendimento) {
			this.atendimento = atendimento;
		}


		public String getSetores() {
			return setores;
		}


		public void setSetores(String setores) {
			this.setores = setores;
		}


		public List<Produto> getProduto() {
			return produto;
		}


		public void setProduto(List<Produto> produto) {
			this.produto = produto;
		}
		
	}

