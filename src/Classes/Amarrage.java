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
public class Amarrage implements AUnIdentifiant
{
    private int capacite;
    private String id;
    
    public Amarrage(String i, int c)
    {
        id = i;
        capacite = c;
    }
    
    public void setId(String i)
    {
        id = i;
    }
    
    public String getIdentifiant()
    {
        return id;
    }
    
    public void setCapacite(int c)
    {
        capacite = c;
    }
    
    public int getCapacite()
    {
        return capacite;
    }
}
