package com.epam.edp.demo.service;

import com.epam.edp.demo.model.HelloEdpModel;
import com.epam.edp.demo.repository.HelloEdpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Iterator;

/**
 * @author Roman_Martseniuk
 */
@Service
public class HelloEdpService {

    @Autowired
    private HelloEdpRepository repository;

    public String getValue() {
        Iterator<HelloEdpModel> iterator = repository.findAll().iterator();
        if (iterator.hasNext()) {
            return iterator.next().getValue();
        }
        return "";
    }
}
