package ma.xproce.controle.mapper;

import ma.xproce.controle.dao.entities.Student;
import ma.xproce.controle.dto.StudentDTO;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class StudentMapper {
    private final ModelMapper mapper = new ModelMapper();

    public Student fromStudentDtoToStudent(StudentDTO studentDTO){
        return mapper.map(studentDTO, Student.class);
    }

    public StudentDTO fromStudentToStudentDto(Student student){
        return mapper.map(student, StudentDTO.class);
    }
}

