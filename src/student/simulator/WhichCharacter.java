/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package student.simulator;


/**
 *
 * @author Sledgehammer
 */
public class WhichCharacter {
        
    private static WhichCharacter single_instance = null;
    public String namegiven = "Finn";
    public int thechosenone = 0;
    public void Play(int chosen){
        thechosenone = chosen;
    
    }
    
    public void sendName(String nameentered){
        namegiven = nameentered;
    }
    
    public int retrieve(){
        return thechosenone;
    }
    
    public String retrievename(){
        return namegiven;
    }
    
    public static WhichCharacter getInstance(){
        if (single_instance == null)
            single_instance = new WhichCharacter();
        
        return single_instance;
        }
    }

