package com.alkemyjava2.mongodb.repository;

import com.alkemyjava2.mongodb.model.Producto;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IProductoRepository extends MongoRepository<Producto, String> {

    Optional<Producto> findByNombre(String nombre);
}
