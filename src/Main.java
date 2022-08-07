import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1= new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);
        Curso curso2= new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria ");
        mentoria.setData(LocalDate.now());



        //System.out.println(curso1);
        //System.out.println(curso2);
        //System.out.println(mentoria);


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Boocamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devPatricia  = new Dev();
        devPatricia.setNome("Patricia");
        devPatricia.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos:" + devPatricia.getConteudosInscritos() );
        devPatricia.progredir();
        devPatricia.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos:" + devPatricia.getConteudosInscritos() );
        System.out.println("Conteudos Concluidos:" + devPatricia.getConteudosConcluidos() );
        System.out.println("XP:" +devPatricia.calcularTotalXP());

        System.out.println("-----------");

        Dev devJoao  = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos:" + devJoao.getConteudosInscritos() );
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteudos Concluidos:" + devJoao.getConteudosInscritos() );
        System.out.println("Conteudos Concluidos:" + devJoao.getConteudosConcluidos() );
        System.out.println("XP:" +devJoao.calcularTotalXP());
    }
}
