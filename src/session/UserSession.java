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
    private static String idUser;
    private static String username;
    private static String password;
    private static String job;

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

    public static String getPassword() {
        return password;
    }

    public static void setPassword(String password) {
        UserSession.password = password;
    }

    public static String getJob() {
        return job;
    }

    public static void setJob(String job) {
        UserSession.job = job;
    }
    
    
}
