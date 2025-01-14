package org.gestion_patient.entityDto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AppUserDto {

    private int idAppUser;
    private String password;
    private String nomRole;
    private String nomVille;
    private String codePostal;
    private String numAdeli;
    private String nomAppUser;
    private String prenomAppUser;
    private String email;
    private String tel;

    @JsonProperty("isActive")
    private boolean isActive;


}
