package hello;

import java.io.BufferedInputStream;
import java.io.InputStream;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

public class playermusic {
    private static playermusic single_instance = null;
    private Player player; // The player instance
    private String playingrightnow = ""; // Track the currently playing song
    private Thread playerThread; // The thread that plays music

    // Singleton pattern to ensure only one instance exists
    public static playermusic getInstance() {
        if (single_instance == null)
            single_instance = new playermusic();
        return single_instance;
    }

    // Stop the currently playing music
    public void Stop() {
        if (player != null) {
            player.close(); // Stop the player
            player = null; // Reset the player to null
        }
        if (playerThread != null && playerThread.isAlive()) {
            playerThread.interrupt(); // Stop the thread if it's running
        }
    }

    // Play a new song
    public void Play(String path) {
        Stop(); // Stop any currently playing track

        try {
            // Load the MP3 file from the classpath
            InputStream is = getClass().getResourceAsStream(path);
            if (is == null) {
                System.err.println("File not found: " + path);
                return;
            }

            // Initialize the player with the MP3 file
            BufferedInputStream BIS = new BufferedInputStream(is);
            player = new Player(BIS);

            // Create a new thread to play the song
            playerThread = new Thread(() -> {
                try {
                    player.play();
                } catch (JavaLayerException ex) {
                    ex.printStackTrace();
                }
            });
            playerThread.start();

            playingrightnow = path; // Track the currently playing song
        } catch (JavaLayerException | RuntimeException e) {
            e.printStackTrace();
        }
    }

    // Get the name of the currently playing song
    public String getPlayingNow() {
        return playingrightnow;
    }
}
