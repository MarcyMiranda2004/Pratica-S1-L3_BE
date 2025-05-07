package Ess3;

import java.time.LocalDate;

public class Cliente {
    private String codice;
    private String nome;
    private String cognome;
    private String email;
    private LocalDate dataIscrizione;

    public Cliente(String codice, String nome, String cognome, String email, LocalDate dataIscrizione) {
        this.codice = codice;
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
        this.dataIscrizione = dataIscrizione;
    }

    public String getNomeCompleto() {
        return nome + " " + cognome;
    }

    @Override
    public String toString() {
        return "Cliente: " + getNomeCompleto() + " (" + codice + "), Email: " + email + ", Iscritto il: " + dataIscrizione;
    }
}

