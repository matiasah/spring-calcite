/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcite.demo.schemas;

import calcite.demo.dto.EMPDTO;

/**
 *
 * @author Matías
 */
public class EMPSchema {
    
    public EMPDTO[] emps;
    
    public EMPSchema() {
        this.emps = new EMPDTO[] {
            new EMPDTO(110, "Fred", 30),
            new EMPDTO(120, "Eric", 20),
            new EMPDTO(130, "John", 40),
            new EMPDTO(140, "Wilma", 20),
            new EMPDTO(150, "Alice", 40)
        };
    }
    
    public static EMPSchema getInstance() {
        return new EMPSchema();
    }
    
}
