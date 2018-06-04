/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Samib
 */
@Entity
@Table(name = "partie")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Partie.findAll", query = "SELECT p FROM Partie p"),
    @NamedQuery(name = "Partie.findById", query = "SELECT p FROM Partie p WHERE p.id = :id"),
    @NamedQuery(name = "Partie.findByIdEndUser", query = "SELECT p FROM Partie p WHERE p.idEndUser = :idEndUser"),
    @NamedQuery(name = "Partie.findByTermine", query = "SELECT p FROM Partie p WHERE p.termine = :termine"),
    @NamedQuery(name = "Partie.findByTourJoueur", query = "SELECT p FROM Partie p WHERE p.tourJoueur = :tourJoueur"),
    @NamedQuery(name = "Partie.findByScoreJ1", query = "SELECT p FROM Partie p WHERE p.scoreJ1 = :scoreJ1"),
    @NamedQuery(name = "Partie.findByScoreJ2", query = "SELECT p FROM Partie p WHERE p.scoreJ2 = :scoreJ2")})
public class Partie implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 255)
    @Column(name = "id_end_user")
    private String idEndUser;
    @Column(name = "termine")
    private Boolean termine;
    @Column(name = "tour_joueur")
    private Integer tourJoueur;
    @Column(name = "score_j1")
    private Integer scoreJ1;
    @Column(name = "score_j2")
    private Integer scoreJ2;
    @Lob
    @Size(max = 65535)
    @Column(name = "etat_grille")
    private String etatGrille;

    public Partie() {
    }

    public Partie(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIdEndUser() {
        return idEndUser;
    }

    public void setIdEndUser(String idEndUser) {
        this.idEndUser = idEndUser;
    }

    public Boolean getTermine() {
        return termine;
    }

    public void setTermine(Boolean termine) {
        this.termine = termine;
    }

    public Integer getTourJoueur() {
        return tourJoueur;
    }

    public void setTourJoueur(Integer tourJoueur) {
        this.tourJoueur = tourJoueur;
    }

    public Integer getScoreJ1() {
        return scoreJ1;
    }

    public void setScoreJ1(Integer scoreJ1) {
        this.scoreJ1 = scoreJ1;
    }

    public Integer getScoreJ2() {
        return scoreJ2;
    }

    public void setScoreJ2(Integer scoreJ2) {
        this.scoreJ2 = scoreJ2;
    }

    public String getEtatGrille() {
        return etatGrille;
    }

    public void setEtatGrille(String etatGrille) {
        this.etatGrille = etatGrille;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Partie)) {
            return false;
        }
        Partie other = (Partie) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "metier.Partie[ id=" + id + " ]";
    }
    
}
