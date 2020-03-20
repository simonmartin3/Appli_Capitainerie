/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import Interfaces.AUnIdentifiant;

/**
 *
 * @author Simon
 */
public class Marin extends Humain implements AUnIdentifiant
{
    private String fonction;

    public Marin(String n, String p, String d) {
        super(n, p, d);
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
}
