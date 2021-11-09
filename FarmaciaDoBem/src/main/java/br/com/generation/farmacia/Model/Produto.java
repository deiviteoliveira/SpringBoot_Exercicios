package br.com.generation.farmacia.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

	
	
	

@Entity
@Table (name = "tb_produto")
public class Produto {
	
	
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;

@NotBlank(message = "o campo não pode ser nulo ou vazio")
@Size(min = 2, max = 50)
private String nome;


@NotNull(message = "o campo não pode ser nulo ou vazio")
@Size(min = 2, max = 50)
private double preco;


@NotBlank(message = "o campo não pode ser nulo ou vazio")
@Size(min = 3, max = 50 )
private String marca;


@NotBlank(message = "o campo não pode ser nulo ou vazio")
@Size(min = 3, max = 50)
private String setor;

@ManyToOne
@JsonIgnoreProperties("produto")
private Categoria categoria;

public long getId() {
	return id;
}

public void setId(long id) {
	this.id = id;
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public double getPreco() {
	return preco;
}

public void setPreco(double preco) {
	this.preco = preco;
}

public String getMarca() {
	return marca;
}

public void setMarca(String marca) {
	this.marca = marca;
}

public String getSetor() {
	return setor;
}

public void setSetor(String setor) {
	this.setor = setor;
}

public Categoria getCategoria() {
	return categoria;
}

public void setCategoria(Categoria categoria) {
	this.categoria = categoria;
}


}