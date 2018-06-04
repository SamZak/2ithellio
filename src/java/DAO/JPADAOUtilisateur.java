/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.Collection;
import metier.Utilisateur;

/**
 *
 * @author Samib
 */
public class JPADAOUtilisateur extends JPADAO<Utilisateur> implements DAOUtilisateurInterface {
    private static JPADAOUtilisateur instance;
    
    @Override
    public Collection<Utilisateur> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public static JPADAOUtilisateur getInstance()
    {
        if (instance == null)
        {
            instance = new JPADAOUtilisateur();
        }
        return instance;
    }
}
