package cz.czechitas.java2webapps.ukol5.controller;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.time.format.DateTimeFormatter;

public class RegistraceForm {
    @NotBlank
    private String jmeno;
    @NotBlank
    private String prijmeni;
    @NotEmpty
    private DateTimeFormatter datumNarozeni;
    @NotNull
    private Pohlavi pohlavi;
    @NotNull
    private Sport sport;
    @NotNull
    private Turnus turnus;
    @Email
    private String email;
    private Integer telefon;
}
