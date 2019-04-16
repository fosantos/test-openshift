package pt.openshift.test;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class Name {

    private String nome;
    private String apelido;
    private int birthYear;
}