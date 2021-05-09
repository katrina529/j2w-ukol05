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

    public String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public String getPrijmeni() {
        return prijmeni;
    }

    public void setPrijmeni(String prijmeni) {
        this.prijmeni = prijmeni;
    }

    public DateTimeFormatter getDatumNarozeni() {
        return datumNarozeni;
    }

    public void setDatumNarozeni(DateTimeFormatter datumNarozeni) {
        this.datumNarozeni = datumNarozeni;
    }

    public Pohlavi getPohlavi() {
        return pohlavi;
    }

    public void setPohlavi(Pohlavi pohlavi) {
        this.pohlavi = pohlavi;
    }

    public Sport getSport() {
        return sport;
    }

    public void setSport(Sport sport) {
        this.sport = sport;
    }

    public Turnus getTurnus() {
        return turnus;
    }

    public void setTurnus(Turnus turnus) {
        this.turnus = turnus;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getTelefon() {
        return telefon;
    }

    public void setTelefon(Integer telefon) {
        this.telefon = telefon;
    }
}
