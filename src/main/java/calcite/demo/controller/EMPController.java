/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcite.demo.controller;

import calcite.demo.model.EMP;
import calcite.demo.repository.EMPRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Matías
 */
@RestController
@RequestMapping("emps")
public class EMPController {
    
    @Autowired
    private EMPRepository empRepository;
    
    @GetMapping
    public Iterable<EMP> index() {
        return this.empRepository.findAll();
    }
    
}
