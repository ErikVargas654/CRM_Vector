package Models;

import java.util.Date;
import java.util.UUID;

public class Cliente {
    
    private UUID id_cliente;
    private String nome_cliente;
    private Date dt_nasc;
    private String cpf;
    private String email;  
    private String senha;
    private String logradouro;
    private Integer numero_casa;
    private String cidade;
    private String estado;

    public Cliente(UUID id_cliente, String nome_cliente, Date dt_nasc, String cpf, String email, String senha, String logradouro, Integer numero_casa, String cidade, String estado) {
        this.id_cliente = UUID.randomUUID();
        this.nome_cliente = nome_cliente;
        this.dt_nasc = dt_nasc;
        this.cpf = cpf;
        this.email = email;
        this.senha = senha;
        this.logradouro = logradouro;
        this.numero_casa = numero_casa;
        this.cidade = cidade;
        this.estado = estado;
    }

    public UUID getId_cliente() {
        return id_cliente;
    }
    
}
