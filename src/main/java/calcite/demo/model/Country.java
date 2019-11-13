/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcite.demo.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author Matías
 */
@Data
@Entity
@Table(name = "countries", schema = "test2")
public class Country implements Serializable {
    
    @Id
    @Column(name = "numericCode")
    private String id;
    
    @Column(name = "name")
    private String name;
    
    @Column(name = "region")
    private String region;
    
    @Column(name = "capital")
    private String capital;
    
}
