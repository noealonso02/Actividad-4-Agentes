/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Agentes;
import jade.core.Agent;
import jade.core.behaviours.Behaviour;

/**
 *
 * @author noe11
 */
public class Ejercicio1 extends Behaviour {
    
    //protected void setup(){
        
        //this.addBehaviour(new Behaviour(){
            public void action(){
                System.out.println("Hola Mundo de Agentes, yo soy el Agente --> ");
                
            }
            public boolean done(){
                
               return true;
            }
        //});
    //}
    public void setup(){
        Ejercicio1 eje1=new Ejercicio1();
        addBehaviour(eje1);
    }        

    private void addBehaviour(Ejercicio1 eje1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
