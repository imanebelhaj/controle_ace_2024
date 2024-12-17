package ma.xproce.controle.web;

import ma.xproce.controle.dto.StudentDTO;
import ma.xproce.controle.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class StudentGraphQLController {
    @Autowired
    StudentService studentService;

    @QueryMapping
    public List<StudentDTO> getStudentByDateNaissance(@Argument String date){
        return studentService.getStudentByDateNaissance(date);
    }
    @MutationMapping
    public StudentDTO saveStudent(StudentDTO studentDTO){
        return studentService.saveStudent(studentDTO);
    }


}
