package org.madunala.streams;

import lombok.*;

import java.time.LocalDate;

/**
 * @author nareshmadunala
 */

@Data
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@EqualsAndHashCode
public class Employee {

    private String name ;
    private Integer age;
    private LocalDate dateOfJoining;
    private String department;
    private Character gender;

}
