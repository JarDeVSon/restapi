package com.agenda.restapi.models;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ContatoTest {

    Contato contato;
    
    @BeforeEach
    void beforeClass() {
        contato = new Contato
        ("jose", 
        "85 99876-5432",
         "email@email.com", 
         "https://avatar");
    }

    @Test
    void testGetEmail() {
        String email = contato.getEmail();
        assertEquals("email@email.com", email);
    }

    @Test
    void testGetNome() {
        String nome = contato.getNome();
        assertEquals("jose", nome);
    }

    @Test
    void testGetTelefone() {
        String telefone = contato.getTelefone();
        assertEquals("85 99876-5432", telefone);

    }

    @Test
    void testGetUrlAvatar() {
        String urlAvatar = contato.getUrlAvatar();
        assertEquals("https://avatar", urlAvatar);

    }

    @Test
    void testSetEmail() {
        contato.setEmail("emailasmas@asnasn");
        assertEquals("emailasmas@asnasn", contato.getEmail());
    }

    @Test
    void testSetNome() {
        contato.setNome("emanuel");
        assertEquals("emanuel", contato.getNome());
    }

    @Test
    void testSetTelefone() {
        contato.setTelefone("11 91234-5678");
        assertEquals("11 91234-5678", contato.getTelefone());
    }

    @Test
    void testSetUrlAvatar() {
        contato.setUrlAvatar("https://urlavatar.com.br");
        assertEquals("https://urlavatar.com.br", contato.getUrlAvatar());
    }

}
