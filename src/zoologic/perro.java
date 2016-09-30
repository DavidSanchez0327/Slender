/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoologic;

/**
 *
 * @author Slender18xX
 */
public class perro extends canino implements mascota,Poderes {
    
    @Override
    public void comer (){
        System.out.println("El perro esta comiendo");
    }
    
    public void amigable(){
        System.out.println("El perro esta siendo amigable");
        
    }    
    
    @Override
     public void deambular(){
        System.out.println("El perro esta deambulando");
    }

    @Override
    public void invicible() {
        System.out.println("El perro es invicible");
    }
    
  
   
    
    
}
