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
package br.edu.ifpe.model.classes;

import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

/**
 *
 * @author Luciano Júnior <lucianocljr7@gmail.com>
 */
@Entity
public class Pagamento {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "tipoPagamento", length = 30, nullable = false)
    private String tipoPagamento;
    
    @Column(name = "valorTotalPagamento", length = 6, nullable = false)
    private double valorTotalPagamento;

    @Column(name = "valorPagamento", length = 6, nullable = false)
    private double valorPagamento;

    @OneToOne
    @JoinColumn(name = "cod_cliente")
    private Cliente cliente;

    @OneToOne
    @JoinColumn(name = "cod_frete")
    private Frete frete;

    public Pagamento() {
    }

    public Pagamento(int id, String tipoPagamento, double valorPagamento,
            Cliente cliente, Frete frete) {
        this.id = id;
        this.tipoPagamento = tipoPagamento;
        this.valorPagamento = valorPagamento;
        this.cliente = cliente;
        this.frete = frete;
    }

    public int getId() {
        return id;
    }

    public String getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(String tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    public double getValorTotalPagamento() {
        return valorTotalPagamento;
    }

    public void setValorTotalPagamento(double valorTotalPagamento) {
        this.valorTotalPagamento = valorTotalPagamento;
    }

    public Cliente getCliente() {
        return cliente;
    }
<<<<<<< HEAD
    
    public Pagamento(String tipoPagamento, double valorTotalPagamento) {
        this.tipoPagamento = tipoPagamento;
        this.valorTotalPagamento = valorTotalPagamento;


    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Frete getFrete() {
        return frete;
    }

    public void setFrete(Frete frete) {
        this.frete = frete;

    }

    @Override
    public String toString() {

        return "Pagamento{" + "codPagamento=" + codPagamento + ", tipoPagamento=" + tipoPagamento + ", valorTotalPagamento=" + valorTotalPagamento + '}';

        return "Pagamento{" + "tipoPagamento=" + tipoPagamento
                + ", valorPagamento=" + valorPagamento + ", cliente="
                + cliente + ", frete=" + frete + '}';

    }

    @Override
    public int hashCode() {

        int hash = 5;
        hash = 67 * hash + this.codPagamento;
        hash = 67 * hash + Objects.hashCode(this.tipoPagamento);
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.valorTotalPagamento) ^ (Double.doubleToLongBits(this.valorTotalPagamento) >>> 32));
        return hash;

        final int PRIMO = 7;
        int resultado = 1;
        resultado += (resultado * PRIMO) + id;
        resultado += (resultado * PRIMO) + tipoPagamento.hashCode();
        resultado += (resultado * PRIMO) + (int) valorPagamento;
        resultado += (resultado * PRIMO) + cliente.hashCode();
        return (resultado * PRIMO) + frete.hashCode();

    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Pagamento))
            return false;

         if (!((Pagamento) obj).tipoPagamento.equals(this.tipoPagamento))
            return false;

        }
        if (Double.doubleToLongBits(this.valorTotalPagamento) != Double.doubleToLongBits(other.valorTotalPagamento)) {

         
         if (((Pagamento) obj).valorPagamento != this.valorPagamento)

            return false;

         if (!((Pagamento) obj).cliente.equals(this.cliente))
            return false;

        return ((Pagamento) obj).frete.equals(this.frete);
    }

}
