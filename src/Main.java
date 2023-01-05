import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java Básico");
        curso1.setDescricao("Aqui você aprenderá o básico para programar em Java!");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Git e GitHub");
        curso2.setDescricao("Aqui você aprenderá a utilizar o Git e o GitHub!");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java, Git e GitHub");
        mentoria.setDescricao("Aqui vamos sanar as dúvidas a respeito dos cursos!");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("BootCamp Java Developer");
        bootcamp.setDescricao("Com esse BootCamp você terá o pontapé inicial para se tornar um Java Developer!");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev dev1 = new Dev();
        dev1.setNome("Jenifer");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("Inscrição realizada! Conteúdos Inscritos de " + dev1.getNome() + ":" + dev1.getConteudosInscritos());
        dev1.progredir();
        dev1.progredir();
        dev1.progredir();
        System.out.println("-");
        System.out.println("Progressão Concluída! Conteúdos Inscritos de " + dev1.getNome() + ":" + dev1.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos de " + dev1.getNome() + ":" + dev1.getConteudosConcluidos());
        System.out.println("XP:" + dev1.calcularTotalXp());

        System.out.println("-------");

        Dev dev2 = new Dev();
        dev2.setNome("Cristiano");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Inscrição realizada! Conteúdos Inscritos de " + dev2.getNome() + ":" + dev2.getConteudosInscritos());
        dev2.progredir();
        dev2.progredir();
        System.out.println("-");
        System.out.println("Progressão Concluída! Conteúdos Inscritos de " + dev2.getNome() + ":" + dev2.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos de " + dev2.getNome() + ":" + dev2.getConteudosConcluidos());
        System.out.println("XP:" + dev2.calcularTotalXp());
        
        System.out.println("-------");

        Dev dev3 = new Dev();
        dev3.setNome("Samuel");
        dev3.inscreverBootcamp(bootcamp);
        System.out.println("Inscrição realizada! Conteúdos Inscritos de " + dev3.getNome() + ":" + dev3.getConteudosInscritos());
        dev3.progredir();
        System.out.println("-");
        System.out.println("Progressão Concluída! Conteúdos Inscritos de " + dev3.getNome() + ":" + dev3.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos de " + dev3.getNome() + ":" + dev3.getConteudosConcluidos());
        System.out.println("XP:" + dev3.calcularTotalXp());

    }

}