import com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Java");
        curso1.setDescricao("curso1 em Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Javascript");
        curso2.setDescricao("curso1 em Javascript");
        curso2.setCargaHoraria(16);

        System.out.println(curso1);
        System.out.println(curso2);

        // mentoria
        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria em Java");
        mentoria.setDescricao("mentoria em Java na DIO");
        mentoria.setData(LocalDate.now());

        System.out.println(mentoria);

        //Bootcamp
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Santander");
        bootcamp.setDescricao("Dev Fullstack");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev alexandre = new Dev();
        alexandre.setNome("Alexandre");
        alexandre.increverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos " + alexandre.getConteudosIncritos());
        alexandre.progredir();
        System.out.println("Conteúdos concluidos " + alexandre.getConteudosConcluidos());
        System.out.println("XP: " + alexandre.calcularXP());

        Dev janaina = new Dev();
        janaina.setNome("Janaína");
        janaina.increverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos " + janaina.getConteudosIncritos());
        janaina.progredir();
        System.out.println("Conteúdos concluidos " + janaina.getConteudosConcluidos());
        System.out.println("XP: " + janaina.calcularXP());

    }

}
