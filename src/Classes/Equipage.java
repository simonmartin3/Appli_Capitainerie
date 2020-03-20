/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author Simon
 */
public class Equipage 
{
    private String capitainerie;
    private String second;
    private Marin equipage;
    
    public Equipage(String c, String s, Marin m)
    {
        capitainerie = c;
        second = s;
        equipage = m;
    }
    
    public void setCapitainerie(String c)
    {
        capitainerie = c;
    }
    
    public String getCapitainerie()
    {
        return capitainerie;
    }
    
    public void setSecond(String s)
    {
        second = s;
    }
    
    public String getSecond()
    {
        return second;
    }
    
    public void setEquipage(Marin m)
    {
        equipage = m;
    }
    
    public Marin getEquipage()
    {
        return equipage;
    }

}
