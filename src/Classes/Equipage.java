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
        capitainerie = new Marin();
        second = new Marin();
        equipage = new ArrayList<>();
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

}
