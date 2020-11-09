package com.algaworks.osworks.api.model;

import javax.validation.constraints.NotBlank;

public class ComentarioInput {

	private String descricao;

	@NotBlank
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
