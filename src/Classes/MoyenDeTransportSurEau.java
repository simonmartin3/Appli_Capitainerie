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
public class MoyenDeTransportSurEau extends MoyenDeTransport
{
    private boolean submersible;

    public MoyenDeTransportSurEau() {
        submersible = false;
    }
    
    public MoyenDeTransportSurEau(String fe, int nh, boolean s) {
        super(fe, nh);
        submersible = s;
    }
    
    public void affiche()
    {
        super.affiche();
        System.out.println("+++ Moyen de transport sur eau submersible ? " + submersible);
    }
    
    public void setSubmersible(boolean x)
    {
        submersible = x;
    }
    
    public boolean getSubmersible()
    {
        return submersible;
    }
}
