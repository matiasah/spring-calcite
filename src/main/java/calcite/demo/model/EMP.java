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
@Table(name = "emps", schema = "test")
public class EMP implements Serializable {
    
    @Id
    @Column(name = "empNo")
    private Integer id;
    
    @Column(name = "empName")
    private String name;
    
    @Column(name = "deptNo")
    private Integer deptId;
    
}
