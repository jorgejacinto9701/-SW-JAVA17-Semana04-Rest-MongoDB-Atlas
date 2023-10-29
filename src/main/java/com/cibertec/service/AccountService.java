package com.cibertec.service;

import java.util.List;

import com.cibertec.entity.Account;

public interface AccountService {

	public abstract List<Account> listaAccount();
	public abstract List<Account> listaCuentaPorId(int id);
	public abstract List<Account> listaCuentaPorLimitRango(int desde, int hasta);
	public abstract List<Account> listaArrayProducto(String producto);
	public abstract Integer cuentaArrayProducto(String producto);
	public abstract List<Account> listaArrayVariosProducto(List<String> producto);
}
