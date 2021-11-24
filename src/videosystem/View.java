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
public class View {
    
    private User inspector;
    private Video movie;

    public View(User inspector, Video movie) {
        this.inspector = inspector;
        this.movie = movie;
        this.inspector.setTotWatched(this.inspector.getTotWatched() + 1);
        this.movie.setViews(this.movie.getViews() + 1);
    }
    
    
    
    public void avaliar(){
        this.movie.setAvaliation(5);
    }
    
    public void avaliar(int score){
        this.movie.setAvaliation(score);
    }
    
    public void avaliar(float porcentage){
        
        int tot = 0;
        
        if(porcentage <= 20){
            tot = 3;
        }else if(porcentage <= 50){
            tot = 5;
        }else if (porcentage <= 90){
            tot = 8;
        }else {
            tot = 10;
        }
        
        this.movie.setAvaliation(tot);
    }

    public User getInspector() {
        return inspector;
    }

    public void setInspector(User inspector) {
        this.inspector = inspector;
    }

    public Video getMovie() {
        return movie;
    }

    public void setMovie(Video movie) {
        this.movie = movie;
    }

    @Override
    public String toString() {
        return "View{" + "inspector=" + inspector + ", movie=" + movie + '}';
    }
    
    
}
