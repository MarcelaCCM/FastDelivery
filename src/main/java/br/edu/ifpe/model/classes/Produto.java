?/*MIT License

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

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author Luciano J�nior <lucianocljr7@gmail.com>
 */
@SuppressWarnings("serial")
@Entity
public class Produto implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(name = "nomeProduto", length = 60, nullable = false)
    private String nomeProduto;
    
    @Column (name = "valorProduto", nullable = false)
    private double valorProduto;
    
    @Column(name = "quantProduto", length = 6, nullable = false)
    private Integer quantProduto;

    @ManyToOne(cascade = CascadeType.ALL)
    private ItemPedido itemPedido;
    public Produto(){
        
    }
    
    public Produto(String nomeProduto, double valorProduto, int quantProduto) {
        this.nomeProduto = nomeProduto;
        this.valorProduto = valorProduto;
        this.quantProduto = quantProduto;
    }

    public int getId() {
        return id;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }
    public double getValorProduto() {
        return valorProduto;
    }
    
    public void setValorProduto(double valorProduto) {
        this.valorProduto = valorProduto;
    }
    
    public int getQuantProduto() {
        return quantProduto;
    }

    public void setQuantProduto(Integer quantProduto) {
        this.quantProduto = quantProduto;
    }

    @Override
    public String toString() {
        return "Produto{" + "codProduto=" + codProduto + ", nomeProduto=" + nomeProduto + ", valorProduto=" + valorProduto + ", quantProduto=" + quantProduto + '}';
    }

    @Override
    public int hashCode() {
        final int PRIMO = 11;
        int resultado = 1;
        resultado += (resultado * PRIMO) + id;
        resultado += (resultado * PRIMO) + nomeProduto.hashCode();
        return (resultado * PRIMO) + quantProduto;
    }
}

