package Windows;

import Classes.Persistance;
import java.io.File;
import java.io.IOException;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Simon
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
        // On vérifie si le fichier bateaux existe sinon on le crée
        if(!new File(Persistance.getPathBateau()).exists())
	{
            new File(Persistance.getPathBateau()).createNewFile();
            System.out.println ("Création du fichier bateaux.bat");
        }else
	{
            System.out.println ("Le fichier bateaux.bat existe déjà");
	}
        
        // On vérifie si le fichier des logs existe sinon on le crée
        if(!new File(Persistance.getPathLog()).exists())
	{
            new File(Persistance.getPathLog()).createNewFile();
            System.out.println ("Création du fichier log.txt");
        }else
	{
            System.out.println ("Le fichier log.txt existe déjà");
	}
        
        LoginWindow LW;
        LW = new LoginWindow();
        LW.setVisible(true);
    }
    
}
