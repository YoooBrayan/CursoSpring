package com.bytecode.core.repositorio;

import java.util.List;

import com.bytecode.core.modelo.Modelo;

public interface IModelo  extends BaseRepositorio<Modelo>{

	public List<Modelo> buscarModelos(String filtro);
}
