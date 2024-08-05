package Models;

import Interface.CalculoGeometrico;

public class Calculator implements CalculoGeometrico {
    private int altura;
    private int largura;

    public Calculator(int altura, int largura) {
        this.altura = altura;
        this.largura = largura;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getLargura() {
        return largura;
    }

    public void setLargura(int largura) {
        this.largura = largura;
    }

    @Override
    public int calcularArea() {
        return altura * largura;
    }

    @Override
    public int calcularPerimetro() {
         return 2*(altura + largura);
    }
}
