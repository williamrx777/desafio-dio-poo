import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Curso curso = new Curso();
        Mentoria mentoria = new Mentoria();

        curso.setTitulo("curso java");
        curso.setDescricao("descrição curso java");
        curso.setCargaHoraria(8);


        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());


/*
        System.out.println(curso);
        System.out.println(mentoria);
        */
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(mentoria);
        System.out.println("----------");
        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteudo Inscritos João" + devJoao.getConteudoInscritos());
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteudo Concluidos João" + devJoao.getConteudosConcluidos());
        System.out.println("XP:" + devJoao.calcularTotalXp());

    }
    }
