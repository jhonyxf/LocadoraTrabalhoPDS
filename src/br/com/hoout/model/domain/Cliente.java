package br.com.hoout.model.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
@Table(name="TB_CLIENTE")
public class Cliente implements Serializable {
	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="CD_CLIENTE")
	private Integer codigo;
	
	@Column(name="NM_CLIENTE",length=255,nullable=false)
	private String nome;
	
	@OneToMany(mappedBy="cliente")
	private List<Veiculo> veiculos;
	
	@OneToMany(mappedBy="cliente")
	private List<Locacao> locacoes;
	
	
	public Cliente(){}
	
	public Cliente(Integer codigo, String nome){
		this.codigo = codigo;
		this.nome = nome;
	}

	public List<Veiculo> getVeiculos(){
		return veiculos;
	}

	public Integer getCodigo() {
		return codigo;
	}


	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}



}
