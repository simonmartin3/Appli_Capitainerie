/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import Interfaces.AvecHumain;
import java.io.Serializable;

/**
 *
 * @author Simon
 */
public class MoyenDeTransport implements AvecHumain
{
    protected String formeEnergie;
    protected int nombreHumains;
    
    public MoyenDeTransport()
    {
        formeEnergie = "Non défini";
        nombreHumains = 0;
    }
    
    public MoyenDeTransport(String fe, int nh)
    {
        formeEnergie = fe;
        nombreHumains = nh;
    }
    
    public void setFormeEnergie(String fe)
    {
        formeEnergie = fe;
    }
    
    public String getFormeEnergie()
    {
        return formeEnergie;
    }
    
    public void setNombreHumains(int nh)
    {
        nombreHumains = nh;
    }
    
    public int getNombreHumains()
    {
        return nombreHumains;
    }
    
    public void affiche()
    {
        System.out.println("Moyen de transport");
    }
}
