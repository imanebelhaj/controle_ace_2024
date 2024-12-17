package ma.xproce.controle.service;

import ma.xproce.controle.dao.entities.Student;
import ma.xproce.controle.dao.repositories.StudentRepository;
import ma.xproce.controle.dto.StudentDTO;
import ma.xproce.controle.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentManager implements StudentService{
    @Autowired
    StudentRepository studentRepository;

    @Autowired
    StudentMapper studentMapper;

    @Override
    public List<StudentDTO> getStudentByDateNaissance(String date) {
        List<Student> students = studentRepository.findByDateNaissance(date);
        List<StudentDTO> studentDtos = new ArrayList<>();
        for(Student student : students){
            studentDtos.add(studentMapper.fromStudentToStudentDto(student));
        }
        return studentDtos;
    }

    @Override
    public StudentDTO saveStudent(StudentDTO studentDTO) {
        Student student=studentMapper.fromStudentDtoToStudent(studentDTO);
        student=studentRepository.save(student);
        studentDTO=studentMapper.fromStudentToStudentDto(student);
        return studentDTO;
    }
}
