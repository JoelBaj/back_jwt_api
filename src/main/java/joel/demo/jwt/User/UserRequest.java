package joel.demo.jwt.User;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserRequest {
    int id;
    String username;
    String firstname;
    String lastname;
    String country;
}