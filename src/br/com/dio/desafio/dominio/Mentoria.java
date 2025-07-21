package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class Mentoria extends Conteudo{

    private LocalDate data;

    static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }

    public Mentoria() {
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "___________________________________\n" +
                "Mentoria: " + getTitulo() + '\n' +
                "Descricao" + getDescricao() + '\n' +
                "Data=" + formatter.format(data);
    }
}
