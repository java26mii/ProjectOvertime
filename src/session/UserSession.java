/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

/**
 *
 * @author Sekar Ayu Safitri
 */
public class UserSession {

    public static String idUser;
    public static String username;
    public static String job;

    public UserSession() {
    }

    public UserSession(String idSession, String nameSession) {
        this.idUser = idSession;
        this.username = nameSession;
    }
    
    public UserSession(String idSession, String nameSession, String jobs) {
        this.idUser = idSession;
        this.username = nameSession;
        this.job = jobs;
    }

    public static String getJob() {
        return job;
    }

    public static void setJob(String job) {
        UserSession.job = job;
    }
    
    public static String getIdUser() {
        return idUser;
    }

    public static void setIdUser(String idUser) {
        UserSession.idUser = idUser;
    }

    public static String getUsername() {
        return username;
    }

    public static void setUsername(String username) {
        UserSession.username = username;
    }

}
