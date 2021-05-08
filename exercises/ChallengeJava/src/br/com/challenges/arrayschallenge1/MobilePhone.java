package br.com.challenges.arrayschallenge1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MobilePhone {

    private List<Contact> contacts;

    public MobilePhone() {
        contacts = new ArrayList<>();
    }

    public void adicionarContato(Contact contact) {
        if (verificaContatoExiste(contact)) {
            System.out.println("Contato " + contact.getName() + " já existe!");
        } else {
            contacts.add(contact);
            System.out.println("Contato " + contact.getName() + " Adicionado com sucesso!");
        }
    }

    public boolean verificaContatoExiste(Contact contact) {
        return contacts.stream().anyMatch(c -> c == contact);
    }

    public Contact obterContatoPorNome(String nome) {
        try {
            return contacts
                    .parallelStream()
                    .filter(c -> c.getName().equalsIgnoreCase(nome))
                    .findFirst()
                    .orElseThrow(() -> new Exception("Contato nao encontrado"));

        } catch (Exception e) {
            System.out.println("Contato não encontrado erro: " + e.getMessage());
            return null;
        }
    }

    public boolean removerContatoPorNome(String nome) {
        System.out.println("Remover contato " + nome);
        return contacts.removeIf(c -> c.getName().equalsIgnoreCase(nome));
    }


}
