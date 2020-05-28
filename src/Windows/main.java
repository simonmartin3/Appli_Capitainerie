package Windows;

import Classes.Persistance;
import static Classes.Persistance.*;
import java.io.File;
import java.io.IOException;
import java.util.Properties;


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
        
        // Chargement du fichier properties des config
        Properties propertiesConfig = Persistance.LoadProperties(getPathConfig());
             
        //Le fichier properties des logins n'existe pas, on le crée
        if(propertiesConfig.isEmpty())        
        { 
            propertiesConfig.setProperty("loginPath", System.getProperty("user.dir") + System.getProperty("file.separator") + "src" + System.getProperty("file.separator") + "Config" + System.getProperty("file.separator") + "login.properties"); 
            propertiesConfig.setProperty("bateauPath",System.getProperty("user.dir") + System.getProperty("file.separator") + "src" + System.getProperty("file.separator") + "Config" + System.getProperty("file.separator") + "bateaux.dat");
            propertiesConfig.setProperty("logPath",System.getProperty("user.dir") + System.getProperty("file.separator") + "src" + System.getProperty("file.separator") + "Config" + System.getProperty("file.separator") + "log.txt");
            propertiesConfig.setProperty("portServer","50000");
           
            //On ajoute les properties
            Persistance.SaveProperties(propertiesConfig,getPathConfig());
        }
        
        
        // On vérifie si le fichier bateaux existe sinon on le crée
        if(!new File(Persistance.getPath("bateauPath")).exists())
	{
            new File(Persistance.getPath("bateauPath")).createNewFile();
            System.out.println ("Création du fichier bateaux.bat");
        }else
	{
            System.out.println ("Le fichier bateaux.bat existe déjà");
	}
        
        // On vérifie si le fichier des logs existe sinon on le crée
        if(!new File(Persistance.getPath("logPath")).exists())
	{
            new File(Persistance.getPath("logPath")).createNewFile();
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
