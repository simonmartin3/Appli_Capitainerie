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
public class Ponton extends Amarrage
{
    
    private ArrayList <MoyenDeTransportSurEau> List1 = new ArrayList<>();
    private ArrayList <MoyenDeTransportSurEau> List2 = new ArrayList<>();
    
    public Ponton(){}
    
    public Ponton(String i) 
    {
        super(i);
    }
    
    public ArrayList <MoyenDeTransportSurEau> getListe(int cote)
    {
        if(cote == 1)
            return List1;
        if(cote == 2)
            return List2;
        return null;
    }
    
}
