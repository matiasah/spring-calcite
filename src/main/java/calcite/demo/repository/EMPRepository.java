/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcite.demo.repository;

import calcite.demo.model.EMP;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Matías
 */
public interface EMPRepository extends CrudRepository<EMP, Integer> {
    
}
