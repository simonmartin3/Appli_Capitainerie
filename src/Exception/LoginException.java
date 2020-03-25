/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exception;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Simon
 */
public class LoginException extends Exception
{
    private ImageIcon img = new ImageIcon("images/Erreur.jpg");
    private String message;
    
    public LoginException(String tmp)
    {
        message = tmp;
    }
    
    public void Affiche()
    {
        JOptionPane.showMessageDialog(null,message, "Erreur", JOptionPane.ERROR_MESSAGE, img);
    }
}
