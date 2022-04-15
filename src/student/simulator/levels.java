/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package student.simulator;

/**
 *
 * @author Sledgehammer
 */
public class levels {
    private static levels single_instance = null;
    int happiness = 50;
    int grades = 85;
    
    public void setHappiness(int changer){
        if (((happiness + changer) < 100)){
        happiness+=changer;
        } else{
            happiness = 100;
        }
    }
    public int retrieveHappiness(){
        return happiness;
    }
    public void setGrades(int changer){
        if (((grades + changer) < 100)){
        grades+=changer;
        } else{
            grades = 100;
        }
    }
    public int retrieveGrades(){
        return grades;
    }
    public static levels getInstance(){
        if (single_instance == null)
            single_instance = new levels();
        
        return single_instance;
    }
}
