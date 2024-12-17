package ma.xproce.controle.service;

import ma.xproce.controle.dao.entities.Student;
import ma.xproce.controle.dto.StudentDTO;

import java.util.List;

public interface StudentService {
    public List<StudentDTO> getStudentByDateNaissance(String date);
    public StudentDTO saveStudent(StudentDTO studentDTO);
}
