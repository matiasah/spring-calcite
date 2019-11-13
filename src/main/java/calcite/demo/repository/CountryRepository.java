/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcite.demo.repository;

import calcite.demo.model.Country;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Matías
 */
public interface CountryRepository extends CrudRepository<Country, String> {
    
    @Transactional(propagation=Propagation.NOT_SUPPORTED)
    @Override
    public Iterable<Country> findAll();
    
}
