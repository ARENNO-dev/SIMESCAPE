import java.util.Scanner;

/* 
 * AUTOR: Alex Reno
 * VERSAO: 0
 * Atividade realizada no módulo de Lógica de Programação da imersão Java Xpert
 * 
 */

public class SpringLandia {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		String msgs;
		
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
		System.out.println("O objetivo desse jogo é resolver os engimas matematicos, charadas ou mágica de acordo com caminho seguido pelo jogador.");
		System.out.println("Se todas as etapas forem concluidas com sucesso será liberada a recompensa para o personagem.");
		System.out.println("");
		
		/* Inicio do jogo */
		System.out.println("Vamos começar (Digite LETSGO para começar ou SAIR para encerrar o jogo)?");
		msgs = leitor.next();
		
		if(msgs.equalsIgnoreCase("LETSGO")) {
			
		}else {
			System.out.println("Obrigado por jogar SIMESCAPE!");
		}
		
		leitor.close();		
	}

}
