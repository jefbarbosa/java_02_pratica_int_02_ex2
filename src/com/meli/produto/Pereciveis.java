package com.meli.produto;

public class Pereciveis extends Produto{
    private static double desconto1Dia = 0.75;
    private static double desconto2Dia = 0.6666;
    private static double desconto3Dia = 0.5;

    private int diasParaVencer;

    public Pereciveis(String nome, double preco, int diasParaVencer) {
        super(nome, preco);
        this.diasParaVencer = diasParaVencer;
    }

    public int getDiasParaVencer() {
        return diasParaVencer;
    }

    public void setDiasParaVencer(int diasParaVencer) {
        this.diasParaVencer = diasParaVencer;
    }

    @Override
    public double calcular(int quantidadeDeProdutos) {
        double desconto;
        switch (diasParaVencer) {
            case 1:
                desconto = desconto1Dia;
                break;
            case 2:
                desconto = desconto2Dia;
                break;
            case 3:
                desconto = desconto3Dia;
                break;
            default:
                desconto = 0.0;
                break;
        }
        return super.calcular(quantidadeDeProdutos) * (1.0 - desconto);
    }

    @Override
    public String toString() {
        return super.toString() + " Perecíveis{" +
                "diasParaVencer=" + diasParaVencer +
                '}';
    }
}
