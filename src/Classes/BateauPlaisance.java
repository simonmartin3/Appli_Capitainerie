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
public class BateauPlaisance extends Bateau
{
    private String type;

    public BateauPlaisance(String n, String pa, int t, int l, String p, String e,String ty, String fe, int nh, boolean s) {
        super(n, pa, t, l, p, e, fe, nh, s);
        type = "Plaisance";
    }
    
    public void affiche()
    {
        super.affiche();
        System.out.println("+++ Bateau de plaisance avec le permis : " + type);
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
