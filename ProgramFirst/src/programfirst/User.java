/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programfirst;

import java.util.ArrayList;

/**
 *
 * @author val12
 */
public class User {
    private String name;
    private String email;
    private boolean newsHTML;
    private boolean newsJavaScript;
    private boolean newsPHP;
   
    private static ArrayList<User> users = new ArrayList();
    
    public User(String name, String email, boolean newsHTML,  boolean newsJavaScript,  boolean newsPHP) throws UserException
    {
    if (name.length() == 0) throw new UserException(UserException.NO_NAME);
    if (email.length() == 0) throw new UserException(UserException.NO_EMAIL);
    this.name = name;
    this.email = email;
    this.newsHTML = newsHTML;
    this.newsJavaScript = newsJavaScript;
    this.newsPHP = newsPHP;
        }
    public static void add(User user){
    users.add(user);}
    
    public static void printAllUser(){
    users.forEach((t) -> System.out.println(t));}
    
    
    public String toString(){
    return "Пользователь: " + name + " E-mail: " + email +" Новости HTML: " + newsHTML + " Новости JavaScript: " + newsJavaScript + " Новости PHP: " + newsPHP;}
    
}
