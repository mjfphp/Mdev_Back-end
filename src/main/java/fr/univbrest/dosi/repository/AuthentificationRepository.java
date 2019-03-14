package fr.univbrest.dosi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.univbrest.dosi.bean.Authentification;


@Repository
public interface AuthentificationRepository extends JpaRepository<Authentification,Integer>{

}