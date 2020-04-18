/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import Exception.ShipWithoutIdentificationException;

/**
 *
 * @author Simon
 */
public class BateauPeche extends Bateau
{
    private String type;

    public BateauPeche()
    {
        
    }
    
    public BateauPeche(String n, String pa, int t, int l, String p, String e, Equipage equi, String ty, String fe, int nh, boolean s) throws ShipWithoutIdentificationException 
    {
        super(n, pa, t, l, p, e, equi, fe, nh, s);
        type = "Peche";
    }
    
    public void affiche()
    {
        super.affiche();
        System.out.println("+++ Bateau de pêche : " + type);
    }
    
    public void setType(String t)
    {
        type = t;
    }
    
    public String getType()
    {
        return type;
    }
    
    public String display()
    {
        return getNom() + " -- " + type + " -- " + getPavillon() + " --> " + getEmplacement();
    }
}
