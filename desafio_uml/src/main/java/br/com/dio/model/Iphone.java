package br.com.dio.model;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical
{
    private String numeroSerie;
    private String modelo;

    public Iphone(String numeroSerie, String modelo)
    {
        System.out.println("IPhone " + modelo);
        System.out.println("N/S: " + numeroSerie);
        this.numeroSerie = numeroSerie;
        this.modelo = modelo;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public void exibirPagina(String url)
    {
        System.out.println("Exibindo pagina " + url);
    }

    @Override
    public void adicionaNovaAba()
    {
        System.out.println("Criando nova aba");
    }

    @Override
    public void atualizaPagina()
    {
        System.out.println("Atualizando pagina");
    }

    @Override
    public void ligar(String numero)
    {
        System.out.println("Ligando pro número " + numero);
    }

    @Override
    public void atender()
    {
        System.out.println("Atendendo chamada");
    }

    @Override
    public void iniciarCorreioVoz()
    {
        System.out.println("Iniciando correio de voz");
    }

    @Override
    public void tocar()
    {
        System.out.println("Tocando musica");
    }

    @Override
    public void pausar()
    {
        System.out.println("Musica pausada");
    }

    @Override
    public void selecionaMusica(String nome)
    {
        System.out.println("Musica " + nome + " selecionada");
    }
}
