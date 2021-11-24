/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videosystem;

/**
 *
 * @author lucas
 */
public class VideoSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Video v[] = new Video[3];
        v[0] = new Video("Java Course");
        v[1] = new Video("Python Course");
        v[2] = new Video("PHP course");
        
        User g[] = new User[2];
        g[0] = new User ("Lucas", 22, "M", "luc");
        g[1] = new User ("Bianca", 25, "F", "bii");
        
        View view [] = new View[5];
        view[0] = new View(g[0], v[2]); // lucas assite video 2
        view[0].avaliar();
        System.out.println(view[0].toString()); 
        
        view[1] = new View(g[0], v[1]); // lucas assite video 1
        view[0].avaliar(87.0f);
        System.out.println(view[0].toString());

//        System.out.println("VIDEO \n ------------------------");
//        System.out.println(v[0].toString());
//        System.out.println(v[1].toString());
//        System.out.println(v[2].toString());
//        
//        System.out.println("\nUSER \n ------------------------");
//        System.out.println(g[0].toString());
//        System.out.println(g[1].toString());
        
        
    }
    
}
