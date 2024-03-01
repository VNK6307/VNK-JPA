package wind.laguna.daohibernate.models;

import lombok.*;

import java.io.Serializable;
import java.util.Objects;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class PersonsKey implements Serializable {
    private String name;
    private String surname;
    private int age;

}
