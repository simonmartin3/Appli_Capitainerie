/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import Interfaces.AUnIdentifiant;
import java.io.Serializable;

/**
 *
 * @author Simon
 */
public class Amarrage implements AUnIdentifiant
{
    private static int CAPACITE = 10;
    private static int LONGUEUR = 15;
    private String id;
    
    public Amarrage()
    {
        
    }
    
    public Amarrage(String i)
    {
        id = i;
    }
    
    public void setId(String i)
    {
        id = i;
    }
    
    public String getIdentifiant()
    {
        return id;
    }
    
    public int getCapacite()
    {
        return CAPACITE;
    }
    
    public int getLongueur()
    {
        return LONGUEUR;
    }
}
