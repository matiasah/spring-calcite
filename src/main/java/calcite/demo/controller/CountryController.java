/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcite.demo.controller;

import calcite.demo.model.Country;
import calcite.demo.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Matías
 */
@RestController
@RequestMapping("countries")
public class CountryController {
    
    @Autowired
    private CountryRepository countryRepository;
    
    @GetMapping
    public Iterable<Country> index() {
        return this.countryRepository.findAll();
    }
    
}
