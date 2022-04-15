/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hello;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

/**
 *
 * @author Sledgehammer
 */
public class playermusic {
        FileInputStream FIS;
    BufferedInputStream BIS;
        
    private static playermusic single_instance = null;
    public Player player;
    public String playingrightnow = "";
    
    
    public void Stop(){
        if(player!=null){
            player.close();
        }
    }
    public void Play(String path){
        try {
            FIS= new FileInputStream(path);
            BIS= new BufferedInputStream(FIS);
            
            player = new Player(BIS);
        }
        catch (FileNotFoundException | JavaLayerException ex){
            
        }
        
        new Thread(){
            @Override
            public void run(){
                try {
                    player.play();
                } catch (JavaLayerException ex) {
                }
            }
        }.start();
        playingrightnow = path;
    }
    public String getPlayingNow(){
        return playingrightnow;
    }
    public static playermusic getInstance(){
        if (single_instance == null)
            single_instance = new playermusic();
        
        return single_instance;
        }
    }

