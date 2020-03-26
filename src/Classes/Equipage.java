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
    private ArrayList<Marin> equipage;

    public Equipage()
    {
//        capitainerie.setNom("Non défini");
//        capitainerie.setPrenom("Non défini");
//        capitainerie.setDate("Non défini");
//        
//        second.setNom("Non défini");
//        second.setPrenom("Non défini");
//        second.setDate("Non défini");
        capitainerie = null;
        second = null;

        equipage = null;
    }    
    
    public Equipage(Marin c, Marin s, ArrayList <Marin> m)
    {
        capitainerie.setNom(c.getNom());
        capitainerie.setPrenom(c.getPrenom());
        capitainerie.setDate(c.getDate());
        second.setNom(s.getNom());
        second.setPrenom(s.getPrenom());
        second.setDate(s.getDate());
        equipage = m;
    }
    
    public void setCapitainerie(Marin c)
    {
        capitainerie.setNom(c.getNom());
        capitainerie.setPrenom(c.getPrenom());
        capitainerie.setDate(c.getDate());
    }
    
    public void setCapitainerie(String n, String p, String d)
    {
        capitainerie.setNom(n);
        capitainerie.setPrenom(p);
        capitainerie.setDate(d);
    }
    
    public Marin getCapitainerie()
    {
        return capitainerie;
    }
    
    public void setSecond(Marin s)
    {
        second.setNom(s.getNom());
        second.setPrenom(s.getPrenom());
        second.setDate(s.getDate());
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

}
