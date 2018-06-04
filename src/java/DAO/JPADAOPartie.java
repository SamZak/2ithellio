/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.Collection;
import metier.Partie;

/**
 *
 * @author Samib
 */
public class JPADAOPartie extends JPADAO<Partie> implements DAOPartieInterface {
    private static JPADAOPartie instance;
    
    @Override
    public Collection<Partie> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public static JPADAOPartie getInstance()
    {
        if (instance == null)
        {
            instance = new JPADAOPartie();
        }
        return instance;
    }
}
