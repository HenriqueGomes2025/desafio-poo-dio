import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2= new Curso();
        curso2.setTitulo("Curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descriçao mentoria java");
        mentoria.setData(LocalDate.now());


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp java Developer");
        bootcamp.setDescricao("Descrição Bootcamp java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);


        System.out.println(devCamila.getNome() + ", Conteudo Inscrtos: ");
        for (Conteudo conteudo:devCamila.getConteudosInscritos()){
            System.out.println(conteudo);
        }

        devCamila.progredir();
        devCamila.progredir();


        System.out.println("___________________________________");
        System.out.println(devCamila.getNome() + ", Conteudo Concluidos: ");
        for (Conteudo conteudo: devCamila.getConteudosConcluidos()){
            System.out.println(conteudo);
        }

        System.out.println();
        System.out.println("XP:" + devCamila.calcularTotalXp());

        System.out.println();
        System.out.println("************************************");
        System.out.println();

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);


        System.out.println(devJoao.getNome() + ", Conteudo Inscrtos: ");
        for (Conteudo conteudo:devJoao.getConteudosInscritos()){
            System.out.println(conteudo);
        }

        devJoao.progredir();
        devJoao.progredir();


        System.out.println("___________________________________");
        System.out.println(devJoao.getNome() + ", Conteudo Concluidos: ");
        for (Conteudo conteudo: devJoao.getConteudosConcluidos()){
            System.out.println(conteudo);
        }

        System.out.println();
        System.out.println("XP:" + devJoao.calcularTotalXp());
    }
}
