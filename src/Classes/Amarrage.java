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
    private static int CAPACITE = 20;
    private String id;
    
    public Amarrage(String i, int c)
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
}
