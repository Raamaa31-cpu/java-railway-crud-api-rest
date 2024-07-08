package com.ramiro.apirest.apirest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ramiro.apirest.apirest.entities.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long>{

}
