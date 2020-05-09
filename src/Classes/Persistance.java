/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.io.*;
import java.util.*;

/**
 *
 * @author Simon
 */
public class Persistance {
    
    public static String getPathLogin()
    {
        String nomFichier = System.getProperty("user.dir") + System.getProperty("file.separator") + "src" + System.getProperty("file.separator") + "Config" + System.getProperty("file.separator") + "login.properties";
        return nomFichier;
    }
    
    // Charger le fichier properties (login)
    public static Properties LoadProperties (String filePath) throws IOException
    {
        Properties prop = new Properties();
        try
        {
            prop.load(new FileInputStream(filePath));
        }
        catch (FileNotFoundException e){System.err.println("Fichier properties non trouvé !");}
        catch (IOException e) {System.err.println("Error chargement properties :" + e.getMessage());}
        finally {return prop;}
    }
    
    // Sauvegarder les propeties dans le fichier
    public static void SaveProperties(Properties prop, String filePath) throws IOException
    {
        try
        {
            FileOutputStream fos = new FileOutputStream(filePath);
            prop.store(fos,"Fichier properties");
            fos.close();
            System.out.println("Fichier properties sauvergarder.");
            
        }
        catch (FileNotFoundException e){System.err.println("Fichier properties non trouvé !");}
        catch (IOException e) {System.err.println("Error chargement properties :" + e.getMessage());}
    }
    
    public static void display(Properties p)
    {
        Iterator it = p.keySet().iterator();
        
        while(it.hasNext())
        {
            String name = it.next().toString();
            String value = p.getProperty(name);
            System.out.println(name + " = " + value);
        }
    }
}
