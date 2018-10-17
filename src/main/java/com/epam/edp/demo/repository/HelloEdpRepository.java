package com.epam.edp.demo.repository;

import com.epam.edp.demo.model.HelloEdpModel;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Roman_Martseniuk
 */
public interface HelloEdpRepository extends CrudRepository<HelloEdpModel, Integer> {
}
