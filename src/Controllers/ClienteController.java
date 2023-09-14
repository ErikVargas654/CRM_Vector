package Controllers;

import Models.Cliente;
import java.util.Date;
import java.util.UUID;

public class ClienteController {
    
    public Cliente criarCliente(String nome, Date dt_nasc, String cpf, String email, String senha, String logradouro, Integer numero_casa, String cidade, String estado) {
        Cliente cliente = null;
        cliente = new Cliente(nome, dt_nasc, cpf, email, senha, logradouro, numero_casa, cidade, estado);
        return cliente;
    }
    
}
