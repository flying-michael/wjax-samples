/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
package de.michaeltittel.wjax.samples.business;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author mtittel
 */
@XmlRootElement
@XmlAccessorType()
@Entity
public class Vehicle {

    @Id
    @GeneratedValue
    @XmlTransient
    private long Id;
    
    
    private String name;
    
    public Vehicle(String ampera) {
        
    }

    public Vehicle() {
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Vehicle{" + "Id=" + Id + ", name=" + name + '}';
    }
     
}
