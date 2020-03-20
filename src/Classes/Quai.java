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
    private MoyenDeTransportSurEau[] List;
    
    public Quai(String i, int c) 
    {
        super(i, c);
    }
    
    public MoyenDeTransportSurEau[] getListe()
    {
        return List;
    }
    
}
