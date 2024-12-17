package ma.xproce.controle.dto;

import lombok.*;
import org.springframework.graphql.data.method.annotation.Argument;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class StudentDTO {
    String name;
    String email;
    String dateNaissance;
}
