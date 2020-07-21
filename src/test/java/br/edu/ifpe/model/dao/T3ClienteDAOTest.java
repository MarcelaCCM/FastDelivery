///*MIT License
//
//Copyright (c) 2020 Lucas Mendes,Marcela Cardoso,Luciano Jr.
//
//Permission is hereby granted, free of charge, to any person obtaining a copy
//of this software and associated documentation files (the "Software"), to deal
//in the Software without restriction, including without limitation the rights
//to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
//copies of the Software, and to permit persons to whom the Software is
//furnished to do so, subject to the following conditions:
//
//The above copyright notice and this permission notice shall be included in all
//copies or substantial portions of the Software.
//
//THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
//IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
//FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
//AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
//LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
//OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
//SOFTWARE.*/
package br.edu.ifpe.model.dao;

import br.edu.ifpe.model.classes.Cliente;
import br.edu.ifpe.model.classes.Endereco;
import java.time.LocalDate;
import java.util.List;
import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;

/**
 *
 * @author Lucas Mendes <lucas.mendes147@live.com>
 */
public class T3ClienteDAOTest {
    
    private static Cliente cliente;
    private static Cliente cli;
    private static Endereco endereco;
    private static Endereco end;

    @BeforeClass
    public static void deveInserirClientes() {
        endereco = new Endereco("estado", "cidade", "cep", "bairro",
                "logradouro", 0, "complemento");
        EnderecoDAO.getInstance().inserir(endereco);
        
        end = new Endereco("estado", "cidade", "cep", "bairro",
                "logradouro", 0, "complemento");
        EnderecoDAO.getInstance().inserir(end);
               
        cliente = new Cliente("nomeCliente", "senhaCliente", "cpfCliente", 
                LocalDate.now(), "telefoneCliente", "emailCliente", endereco);
        ClienteDAO.getInstance().inserir(cliente);
        
        cli = new Cliente("nome1", "senha1", "cpf1", 
                LocalDate.now(), "telefone1", "email1e", end);    
        ClienteDAO.getInstance().inserir(cli);
    }

    @Test
    public void deveRecuperarCliente() {
        List<Cliente> clientes = ClienteDAO.getInstance().listarTodos();
        assertEquals("deveRecuperarCliente", cliente,
                clientes.get(clientes.size() - 2));
    }

    @Test
    public void deveAlterarClliente() {
        cliente.setNomeCliente("nomeAlterado");
        cliente.setEmailCliente("emailAlterado");
        cliente.setSenhaCliente("senhaAlterada");
        
        ClienteDAO.getInstance().alterar(cliente);
        List<Cliente> clientes = ClienteDAO.getInstance().listarTodos();
        assertEquals("deveAlterarCliente", cliente,
                clientes.get(clientes.size() - 1));
    }

    @Test
    public void deveRecuperarTodosClientes() {
        List<Cliente> clientes = ClienteDAO.getInstance().listarTodos();

        assertTrue(clientes.contains(cli));
        assertTrue(clientes.contains(cliente));
    }

    @AfterClass()
    public static void deveDeletarCliente() {
        ClienteDAO.getInstance().deletar(cliente);
        ClienteDAO.getInstance().deletar(cli);
        EnderecoDAO.getInstance().deletar(endereco);
        EnderecoDAO.getInstance().deletar(end);
    }
    
}
