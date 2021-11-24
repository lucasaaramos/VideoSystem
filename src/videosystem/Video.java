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
public class Video implements VideoActionInterface{
    
    private String title;
    private int avaliation;
    private int views;
    private int likes;
    private boolean running;

    public Video(String title) {
        this.title = title;
        this.avaliation = 1;
        this.views = 0;
        this.likes = 0;
        this.running = false;
    }
    
    

    @Override
    public void play() {
        
        System.out.println("You are watching the video " + this.title);
        this.setRunning(true);
        this.setViews(getViews() + 1);
        
    }

    @Override
    public void pause() {
        System.out.println("Video paused!");
        this.setRunning(false);
    }

    @Override
    public void like() {
        this.likes++;
    }

    
    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getAvaliation() {
        return avaliation;
    }

    public void setAvaliation(int avaliation) {
        int newAvaliation;
        newAvaliation = (this.avaliation + avaliation)/this.views;
                
        this.avaliation = newAvaliation;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public boolean getRunning() {
        return running;
    }

    public void setRunning(boolean running) {
        this.running = running;
    }

    @Override
    public String toString() {
        return "Video{" + "title=" + title + ", avaliation=" + avaliation + ", views=" + views + ", likes=" + likes + ", running=" + running + '}';
    }
    
    
    
}
