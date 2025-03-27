package fr.m2i.docker_with_database.repository;

import fr.m2i.docker_with_database.entity.Patisserie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatisserieRepository extends JpaRepository<Patisserie, Integer> {

}
