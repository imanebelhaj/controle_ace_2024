package ma.xproce.controle.dao.repositories;

import ma.xproce.controle.dao.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {
    List<Student> findByDateNaissance(String date);
}
