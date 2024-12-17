package ma.xproce.controle;

import ma.xproce.controle.dto.StudentDTO;
import ma.xproce.controle.service.StudentService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class ControleApplication {

    public static void main(String[] args) {
        SpringApplication.run(ControleApplication.class, args);
    }

    @Bean
    CommandLineRunner start(StudentService studentService){
        return args -> {
            studentService.saveStudent(
                    StudentDTO.builder().name("test1").email("test1@mailcom").dateNaissance("28-12-2002").build()
            );
            studentService.saveStudent(
                    StudentDTO.builder().name("test2").email("test2@mailcom").dateNaissance("28-12-2003").build()
            );
            studentService.saveStudent(
                    StudentDTO.builder().name("test3").email("test3@mailcom").dateNaissance("28-12-2004").build()
            );
            studentService.saveStudent(
                    StudentDTO.builder().name("test4").email("test4@mailcom").dateNaissance("28-12-2005").build()
            );

        };
    }
}

//                    List.of(
//                            StudentDTO.builder().name("test1").email("test1@mailcom").dateNaissance("20-12-2002").build(),
//                            StudentDTO.builder().name("test2").email("test2@mailcom").dateNaissance("20-12-2003").build(),
//                            StudentDTO.builder().name("test3").email("test3@mailcom").dateNaissance("20-12-2004").build(),
//                            StudentDTO.builder().name("test4").email("test4@mailcom").dateNaissance("20-12-2005").build()
//                            )
