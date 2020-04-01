/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.ArrayList;

/**
 *
 * @author Simon
 */
public class Equipage 
{
    private Marin capitainerie;
    private Marin second;
    private ArrayList<Marin> equipage = new ArrayList<>();
    private boolean aUnEquipage;

    public Equipage()
    {
        aUnEquipage = false;
    }    
    
    public Equipage(Marin c, Marin s, ArrayList <Marin> m)
    {
        capitainerie = c;
        second = s;
        equipage = m;
    }
    
    public void setCapitainerie(Marin c)
    {
        capitainerie = c;
    }
    
    public Marin getCapitainerie()
    {
        return capitainerie;
    }
    
    public void setSecond(Marin s)
    {
        second = s;
    }
    
    public Marin getSecond()
    {
        return second;
    }
    
    public void setEquipage(ArrayList <Marin> m)
    {
        equipage = m;
    }
    
    public ArrayList<Marin> getEquipage()
    {
        return equipage;
    }
    
    public void Affiche()
    {
        System.err.println("Capitaine : " + getCapitainerie().getNom() + " " + getCapitainerie().getPrenom());
        System.err.println("Second : " + getSecond().getNom() + " " + getSecond().getPrenom());
        for(int i = 0; i < getEquipage().size(); i++)
            System.err.println(getEquipage().get(i).getFonction() + " : " + getEquipage().get(i).getNom() + " " + getEquipage().get(i).getPrenom());
        
    }
    
    public void setAUnEquipage(boolean tmp)
    {
        aUnEquipage = tmp;
    }
    
    public boolean getAUnEquipage()
    {
        return aUnEquipage;
    }

}
