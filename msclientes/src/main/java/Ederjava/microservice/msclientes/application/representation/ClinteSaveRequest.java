package Ederjava.microservice.msclientes.application.representation;

import Ederjava.microservice.msclientes.domain.Cliente;
import lombok.Data;

@Data
public class ClinteSaveRequest {
    private String cpf;
    private String nome;
    private Integer idade;

    public Cliente toModel(){
        return new Cliente(cpf, nome, idade);
    }
}
