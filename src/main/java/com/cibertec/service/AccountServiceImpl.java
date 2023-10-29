package com.cibertec.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.entity.Account;
import com.cibertec.repository.AccountRepository;

@Service
public class AccountServiceImpl implements AccountService{

	@Autowired
	private AccountRepository repository;
	
	@Override
	public List<Account> listaAccount() {
		return repository.findAll();
	}

	@Override
	public List<Account> listaCuentaPorId(int id) {
		return repository.listaCuentaPorId(id);
	}

	@Override
	public List<Account> listaCuentaPorLimitRango(int desde, int hasta) {
		return repository.listaCuentaPorLimitRango(desde, hasta);
	}

	@Override
	public List<Account> listaArrayProducto(String producto) {
		return repository.listaArrayProducto(producto);
	}

	@Override
	public Integer cuentaArrayProducto(String producto) {
		return repository.cuentaArrayProducto(producto);
	}

	@Override
	public List<Account> listaArrayVariosProducto(List<String> producto) {
		return repository.listaArrayVariosProducto(producto);
	}

}
