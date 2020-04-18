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
public class Quai extends Amarrage
{
    private ArrayList <MoyenDeTransportSurEau> List = new ArrayList<>();
    
    public Quai()
    {
    
    }
    
    public Quai(String i) 
    {
        super(i);
    }
    
    public ArrayList <MoyenDeTransportSurEau> getListe()
    {
        return List;
    } 
}
