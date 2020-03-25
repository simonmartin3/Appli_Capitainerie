/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;
import Interfaces.*;

/**
 *
 * @author Simon
 */
public class Bateau extends MoyenDeTransportSurEau implements AUnIdentifiant
{
    private String nom;
    private String portAttache;
    private int tonnage;
    private int longueur;
    private String pavillon;
    private String emplacement;
    
    public Bateau(String fe, int nh, boolean s)
    {
        super(fe, nh, s);
    }
    
    public Bateau(String n, String pa, int t, int l, String p, String e, String fe, int nh, boolean s)
    {
        super(fe, nh, s);
        nom = n;
        portAttache = pa;
        tonnage = t;
        longueur = l;
        pavillon = p;
        emplacement = e;
    }
    
    public String getIdentifiant()
    {
        return nom+portAttache;
    }
    
    public void affiche()
    {
        super.affiche();
        System.out.println("+++ dont le nom est " + nom);
    }
    
    public void setNom(String n)
    {
        nom = n;
    }
    
    public String getNom()
    {
        return nom;
    }
    
    public void setPortAttache(String pa)
    {
        portAttache = pa;
    }
    
    public String getPortAttache()
    {
        return portAttache;
    }
    
    public void setTonnage(int t)
    {
        tonnage = t;
    }
    
    public int getTonnage()
    {
        return tonnage;
    }
    
    public void setLongueur(int l)
    {
        longueur = l;
    }
    
    public int getLongueur()
    {
        return longueur;
    }
    
    public void setPavillon(String p)
    {
        pavillon = p;
    }
    
    public String getPavillon()
    {
        return pavillon;
    }
    
    public void setEmplacement(String e)
    {
        emplacement = e;
    }
    
    public String getEmplacement()
    {
        return emplacement;
    }
}
