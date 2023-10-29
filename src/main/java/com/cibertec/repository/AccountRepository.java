package com.cibertec.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.cibertec.entity.Account;

public interface AccountRepository extends MongoRepository<Account, Integer>{

	@Query("{account_id : ?0}")
	public abstract List<Account> listaCuentaPorId(int id);

	
	@Query("{ $and: [ {limit:{$gte: ?0 }}, {limit:{$lte:?1 }} ] }")
	public abstract List<Account> listaCuentaPorLimitRango(int desde, int hasta);
	
	
	@Query("{ products: {$in : [ ?0 ] } }")
	public abstract List<Account> listaArrayProducto(String producto);
	
	
	@Query(value =  "{ products: {$in : [ ?0 ] } }" , count = true)
	public abstract Integer cuentaArrayProducto(String producto);
	
	@Query("{ products: {$in : [ ?0 ] } }")
	public abstract List<Account> listaArrayVariosProducto(List<String> producto);
	
}
