package ma.fst.studentapi.dto;

import jakarta.validation.constraints.*;

public record StudentRequestDTO(

        @NotBlank(message = "Veuillez saisir votre prénom")
        String firstName,

        @NotBlank(message = "Veuillez saisir votre nom")
        String lastName,

        @NotBlank(message = "Veuillez saisir votre emmail")
        @Email(message = "Format d'email invalide")
        String email,

        @NotBlank(message = "Veuillez saisir votre filière")
        String major,

        @NotNull(message = "Veuillez saisir votre âge")
        @Min(value = 17, message = "L'âge minimal est 17")
        @Max(value = 100, message = "L'âge maximal est 100")
        Integer age
) {
}
