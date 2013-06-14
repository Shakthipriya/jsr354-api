/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javax.money;

/**
 *
 * @author Anatole
 */
//@FunctionalInterface
public interface Validation<T>{
    
    void validate(T item, ValidationResult result);
	
}
