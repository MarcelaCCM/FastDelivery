/*MIT License

Copyright (c) 2020 Lucas Mendes,Marcela Cardoso,Luciano Jr.

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.*/
package br.edu.ifpe.controller;

import br.edu.ifpe.model.classes.Pedido;
import br.edu.ifpe.model.negocio.PedidoNegocio;
import java.util.List;

/**
 *
 * @author Luciano
 */
public class PedidoController {
    
    PedidoNegocio pedidoModel = new PedidoNegocio();
    
    public void inserirPedidoAction (Pedido pagamento){
        pedidoModel.inserirPedido(pagamento);
    }

    public void alterarPedidoAction (Pedido pagamento){
        pedidoModel.alterarPedido(pagamento);
    }
    
    public Pedido recuperarPedidoAction(int codigo){
        return pedidoModel.recuperarPedido(codigo);
    }
    
    public void deletarPedidoAction (Pedido pedido){
        pedidoModel.deletarPedido(pedido);
    }
    
    public List<Pedido> listarTodosPedidoAction(){
        return pedidoModel.listarTodosPedidos();
    }

//    public void inserirFreteAction (Frete frete){
//        freteModel.inserirFrete(frete);
//    }
//
//    public void alterarFreteAction (Frete frete){
//        freteModel.alterarFrete(frete);
//    }
//    
//    public Frete recuperarFreteAction(int codigo){
//        return freteModel.recuperarFrete(codigo);
//    }
//    
//    public void deletarFreteAction (Frete frete){
//        freteModel.deletarFrete(frete);
//    }
//    
//    public List<Frete> listarTodosFretesAction(){
//        return freteModel.listarTodosFretes();
//    }

    
}
