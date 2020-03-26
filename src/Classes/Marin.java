/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import Interfaces.AUnIdentifiant;
import Exception.*;

/**
 *
 * @author Simon
 */
public class Marin extends Humain implements AUnIdentifiant
{
    private String fonction;
    
    public Marin()
    {
        
    }
    
    public Marin(String n, String p, String d, String f)throws SailorWithoutIdentificationException
    {
        super(n, p, d);
        if(n.equals("") || p.equals(""))throw new SailorWithoutIdentificationException("Le nom et le prénom du marin/passager sont obligatoires.");
        fonction = f;
    }
    
    public void setFonction(String f)
    {
        fonction = f;
    }
    
    public String getFonction()
    {
        return fonction;
    }
    
    public String getIdentifiant()
    {
        return super.nom+super.prenom+super.date;
    }
    
    public void Affiche()
    {
        System.out.println(getFonction() + " : " + getNom() + " " + getPrenom());
    }
}
