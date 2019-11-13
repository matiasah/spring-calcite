/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcite.demo.repository;

import calcite.demo.model.EMP;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Matías
 */
public interface EMPRepository extends CrudRepository<EMP, Integer> {
    
    @Transactional(propagation=Propagation.NOT_SUPPORTED)
    @Override
    public Iterable<EMP> findAll();
    
}
