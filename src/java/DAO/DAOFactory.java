/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

/**
 *
 * @author Samib
 */
public class DAOFactory {
    public JPADAOUtilisateur getDAOUtilisateur()
    {
        return JPADAOUtilisateur.getInstance();
    }
    
    public JPADAOPartie getDAOPartie()
    {
        return JPADAOPartie.getInstance();
    }
}
