import java.util.Scanner;

/* 
 * AUTOR: Alex Reno
 * VERSAO: 0
 * Atividade realizada no m�dulo de L�gica de Programa��o da imers�o Java Xpert
 * 
 */

public class SpringLandia {
	
	public static final int QTDENIGMAS = 3;
	public static final int QTDCHARADAS = 3;
	public static final int QTDMAGICA = 1;
	

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		String init, nome;
		int engimas, charadas, magica;

		/* Logo inicial */        
		System.out.println(" ad88888ba   88  88b           d88  88888888888   ad88888ba     ,ad8888ba,          db         88888888ba   88888888888");  
		System.out.println("d8\"     \"8b  88  888b         d888  88           d8\"     \"8b   d8\"'    `\"8b        d88b        88      \"8b  88");           
		System.out.println("Y8,          88  88`8b       d8'88  88           Y8,          d8'                 d8'`8b       88      ,8P  88");           
		System.out.println("`Y8aaaaa,    88  88 `8b     d8' 88  88aaaaa      `Y8aaaaa,    88                 d8'  `8b      88aaaaaa8P'  88aaaaa");      
		System.out.println("  `\"\"\"\"\"8b,  88  88  `8b   d8'  88  88\"\"\"\"\"        `\"\"\"\"\"8b,  88                d8YaaaaY8b     88\"\"\"\"\"\"'    88\"\"\"\"\"");      
		System.out.println("        `8b  88  88   `8b d8'   88  88                   `8b  Y8,              d8\"\"\"\"\"\"\"\"8b    88           88");           
		System.out.println("Y8a     a8P  88  88    `888'    88  88           Y8a     a8P   Y8a.    .a8P   d8'        `8b   88           88");           
		System.out.println(" \"Y88888P\"   88  88     `8'     88  88888888888   \"Y88888P\"     `\"Y8888Y\"'   d8'          `8b  88           88888888888");  
		
		/* Mensagens inicias sobre desenvolvedor e objetivo */
		System.out.println("");
		System.out.println("Um jogo baseado em \"Os Simpsons\" desenvolvido por AReno.");
		System.out.println("O objetivo desse jogo � resolver os engimas matematicos, charadas ou m�gica de acordo com caminho escolhido pelo jogador.");
		System.out.println("Se todas as etapas forem concluidas com sucesso ser� liberada a recompensa para o personagem.");
		System.out.println("");
		
		/* Inicio do jogo */
		System.out.println("Vamos come�ar (Digite LETSGO para come�ar ou SAIR encerrar o jogo)?");
		init = leitor.next();
		System.out.println("");
		
		while(!init.equalsIgnoreCase("sair")) {
			/* Dados cadastrais iniciais */
			System.out.println("Antes de come�ar, preciso te conhecer melhor. Por isso me fale o seu 1� nome:");
			nome = leitor.next();
			
			System.out.println("");
			System.out.println("Ol�, " + nome + " voc� est� pronto para ganhar este game? =)");
			System.out.println("Bom " + nome + " nesse jogo voc� ir� controlar as a��es do personagem HOMERITO!");
			System.out.println("Boa sorte " + nome + "! Te encontro no final da hist�ria, hum, se voc� conseguir chegar l�...");
			
			System.out.println("");
			System.out.println("Ah, antes de continuar, voc� pode digitar SAIR nas perguntas para desistir do jogo, tudo bem? Podemos continuar (digite SIM ou NAO)?");
			init = leitor.next();
			System.out.println("");
			
			if(init.equalsIgnoreCase("sim")) {			
				/* Introdu��o do dia do personagem */
				System.out.println("Bem vindo, " + nome + " a Springlandia. Homerito est� em mais um dia de trabalho na Usina Nuclear, como sempre ele encontra-se em sua mesa de controle do refrigeramento do g�s t�xico..." );
				System.out.println("Escolha o que Homerito deve fazer nesse momento, trabalhar ou fugir?");
				init = leitor.next();
			}else {
				System.out.println("Eita, acho que voc� teve algum problema e desistiu =(. Obrigado por jogar SIMESCAPE!");
				init = "sair";
			}

			
						
			
		}
		
		
		/* Limpando a memoria */
		leitor.close();		
	}

}
