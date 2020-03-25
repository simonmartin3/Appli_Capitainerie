/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.awt.List;
import java.util.ArrayList;

/**
 *
 * @author Simon
 */
public class Quai extends Amarrage
{
    private ArrayList <MoyenDeTransportSurEau> List = new ArrayList<>(); //faire une array List
    
    public Quai(){}
    
    public Quai(String i, int c) 
    {
        super(i, c);
    }
    
    public ArrayList <MoyenDeTransportSurEau> getListe()
    {
        return List;
    }
    
}
