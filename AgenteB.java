/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agentes;
import jade.core.Agent;
import jade.core.behaviours.Behaviour;
/**
 *
 * @author noe11
 */
public class AgenteB extends Agent{
    int c=1;
    
    protected void setup(){
        
        this.addBehaviour(new Behaviour(){
            public void action(){
                System.out.println("Hola Mundo de Agentes, yo soy el Agente --> " +
                    getAID().getName());
                System.out.println(c);
                c++;
            }
            public boolean done(){
                
               return c > 100;
            }
        });
    }             
}
