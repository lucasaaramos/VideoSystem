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
public class User extends People {

    private String login;
    private int totWatched;

    public User(String name, int age, String sex, String login) {
        super(name, age, sex);
        this.login = login;
        this.totWatched = 0;
    }

    public void whatched1more() {
        this.totWatched++;
    }
    
    
    
    

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotWatched() {
        return totWatched;
    }

    public void setTotWatched(int totWatched) {
        this.totWatched = totWatched;
    }

    @Override
    public String toString() {
        return "User{" + super.toString() + "\n login=" + login + ", totWatched=" + totWatched + '}';
    }

    
    
}
