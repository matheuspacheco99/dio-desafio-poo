package br;


import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;
import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		Curso curso1 = new Curso();
		curso1.setTitulo("curso java");
		curso1.setDescricao("descrição curso java");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("curso js");
		curso2.setDescricao("descrição curso js");
		curso2.setCargaHoraria(4);
		
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("mentoria");
		mentoria.setDescricao("descrição mentoria java");
		mentoria.setData(LocalDate.now());
		//System.out.println(curso1);
		//System.out.println(curso2);
		//System.out.println(mentoria);
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp java developer");
		bootcamp.setDescricao("Descrição Bootcamp java developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		System.out.println("=======================================================================");

		Dev Matheus = new Dev();
		Matheus.setNome("Arthur");
		Matheus.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos inscritos Matheus:" + Matheus.getConteudosInscritos());
		Matheus.progredir();
		System.out.println("-");
		System.out.println("Conteúdos inscritos Matheus:" + Matheus.getConteudosInscritos());
		System.out.println("Conteúdos concluídos Matheus:" + Matheus.getConteudosConcluidos());
		System.out.println("XP: " + Matheus.calcularTotalXp());
		
		System.out.println("======================================================================");
		
		Dev Leonardo = new Dev();
		Leonardo.setNome("Leonardo");
		Leonardo.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos inscritos Leonardo:" + Leonardo.getConteudosInscritos());
		Leonardo.progredir();
		System.out.println("-");
		System.out.println("Conteúdos inscritos Leonardo:" + Leonardo.getConteudosInscritos());
		System.out.println("Conteúdos concluídos Leonardo:" + Leonardo.getConteudosConcluidos());
		System.out.println("XP: " + Leonardo.calcularTotalXp());
		
	}

}