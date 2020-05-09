/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.io.Serializable;

/**
 *
 * @author Simon
 */
public class Humain implements Serializable
{
    protected String nom;
    protected String prenom;
    protected String date;
    
    public Humain()
    {
        
    }   
    
    public Humain(String n, String p, String d)
    {
        nom = n;
        prenom = p;
        date = d;
    }
    
    public void setNom(String n)
    {
        nom = n;
    }
    
    public String getNom()
    {
        return nom;
    }
    
    public void setPrenom(String p)
    {
        prenom = p;
    }
    
    public String getPrenom()
    {
        return prenom;
    }
    
    public void setDate(String d)
    {
        date = d;
    }
    
    public String getDate()
    {
        return date;
    }
}
