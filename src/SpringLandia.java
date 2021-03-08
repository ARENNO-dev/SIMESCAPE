import java.text.DecimalFormat;
import java.util.Scanner;

/* 
 * AUTOR: Alex Reno
 * VERSAO: 0
 * Atividade realizada no módulo de Lógica de Programação da imersão Java Xpert
 * 
 */

public class SpringLandia {
	
	public static final int QTDENIGMAS = 1;
	public static final int QTDCHARADAS = 3;
	public static final int QTDMAGICA = 1;
	

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		String init, nome;
		
		DecimalFormat dec = new DecimalFormat("##,##,##");
		
		String[] enigmas = {"Qual é o próximo número da sequência 0, 0, 1, 3, 2, 6, 3, 9, 4, 12, 5, ?","",""};
		int rstEnigmas[] = new int[3];
		int[] respEnigmas = {15,0,0};
		
		int pwdEnigmas=0, pwdEM=0;
		
		String[] charadas = {"O que é, o que é? Feito para andar e não anda.","O que é, o que é? Você tira a minha pele. Eu não choro. Você, sim.","O que é, o que é? Quanto mais você tira, maior eu fico."};
		String rstCharadas[] = new String[3];
		String[] respCharadas = {"rua","cebola","buraco"};
		
		int pwdCH=0, pwdCharadas=0;
		
		int qtdeAcertos=0,qtdeErros=0;
		
		double magica=0;
		
		boolean ganhou=false;
		
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
		System.out.println("O objetivo desse jogo é resolver os engimas matematicos, charadas ou mágica de acordo com caminho escolhido pelo jogador.");
		System.out.println("Se todas as etapas forem concluidas com sucesso será liberada a recompensa para o personagem.");
		System.out.println("");
		
		/* Inicio do jogo */
		System.out.println("Vamos começar (Digite LETSGO para começar ou SAIR encerrar o jogo)?");
		init = leitor.next();
		System.out.println("");
		
		/* Dados cadastrais iniciais */
		System.out.println("Antes de começar, preciso te conhecer melhor. Por isso me fale o seu 1º nome:");
		nome = leitor.next();
		
		while(!init.equalsIgnoreCase("sair")) {
			ganhou = false;
			System.out.println("");
			System.out.println("Olá, " + nome + " você está pronto para ganhar este game? =)");
			System.out.println("Bom " + nome + " nesse jogo você irá controlar as ações do personagem HOMERITO!");
			System.out.println("Boa sorte " + nome + "! Te encontro no final da história, hum, se você conseguir chegar lá...");
			
			System.out.println("");
			System.out.println("Para você ter uma melhor experiência com o jogo, tente jogar com o CONSOLE maximizado...");
			System.out.println("Ah, antes de continuar, você pode digitar SAIR nas perguntas para desistir do jogo, tudo bem? Podemos continuar (digite SIM ou NAO)?");
			init = leitor.next();
			System.out.println("");
			
			/* Homerito ASCII art */
			System.out.println("                                 __");
			System.out.println("                       _ ,___,-'\",-=-.");
			System.out.println("           __,-- _ _,-'_)_  (\"\"`'-._\\ `.");
			System.out.println("        _,'  __ |,' ,-' __)  ,-     /. |");
			System.out.println("      ,'_,--'   |     -'  _)/         `\\");
			System.out.println("    ,','      ,'       ,-'_,`           :");
			System.out.println("    ,'     ,-'       ,(,-(              :");
			System.out.println("         ,'       ,-' ,    _            ;");
			System.out.println("        /        ,-._/`---'            /");
			System.out.println("       /        (____)(----. )       ,'");
			System.out.println("      /         (      `.__,     /\\ /,");
			System.out.println("     :           ;-.___         /__\\/|");
			System.out.println("     |         ,'      `--.      -,\\ |");
			System.out.println("     :        /            \\    .__/");
			System.out.println("      \\      (__            \\    |_");
			System.out.println("       \\       ,`-, *       /   _|,\\");
			System.out.println("        \\    ,'   `-.     ,'_,-'    \\");
			System.out.println("       (_\\,-'    ,'\\\")--,'-'       __\\");
			System.out.println("        \\       /  // ,'|      ,--'  `-.");
			System.out.println("         `-.    `-/ \'  |   _,'         `.");
			System.out.println("            `-._ /      `--'/             \\");
			System.out.println("               ,'           |              \\");
			System.out.println("              /             |               \\");
			System.out.println("           ,-'              |               /");
			System.out.println("          /                 |             -'");
			
			if(init.equalsIgnoreCase("sim")) {			
				/* Introdução do dia do personagem */
				System.out.println("Bem vindo, " + nome + " a Springlandia. Homerito está em mais um dia de trabalho na Usina Nuclear, como sempre ele encontra-se em sua mesa de controle do refrigeramento do gás tóxico..." );
				System.out.println("Escolha o que Homerito deve fazer nesse momento, TRABALHAR ou FUGIR?");
				init = leitor.next();
				
				if(init.equalsIgnoreCase("trabalhar")) {
					System.out.println("");
					System.out.println("Ao passar um tempo Homerito, começou a cochilar em sua cadeira. Para piorar com os pés em cima da mesa de controle...");
					System.out.println("Ao fazer um movimento brusco, disparou um alarme. Homerito acorda desesperado e sem saber o que fazer, olha para mesa e encontra dois botões...");
					System.out.println("Qual botão Homerito deve escolher: AZUL ou VERMELHO?");
					init = leitor.next();
					
					System.out.println("");
					switch(init.toUpperCase()) {
						case "AZUL":
							
							System.out.println("Ao apertar o botão azul, no visor na mesa de controle, esta sendo apresentada a mensagem:");
							
							/* Bender IA SIMESCAPE */
							System.out.println("             ________________________________________________");
							System.out.println("            /                                                \\");
							System.out.println("           |    _________________________________________     |");
							System.out.println("           |   |                                         |    |");
							System.out.println("           |   |  Olá eu sou a IA chamada de Bender...   |    |");
							System.out.println("           |   |  Pelo que estou analisando vc fez m...  |    |");
							System.out.println("           |   |  Bem isso não é novidade (¬_¬)          |    |");
							System.out.println("           |   |                                         |    |");
							System.out.println("           |   |  Ai Ai, bom, vou te ajudar...           |    |");
							System.out.println("           |   |                                         |    |");
							System.out.println("           |   |  Para cosnseguirmos sair dessa,         |    |");
							System.out.println("           |   |  tenta acertar minha proposta abaixo... |    |");
							System.out.println("           |   |                                         |    |");
							System.out.println("           |   |  Resolva " + QTDENIGMAS + " enigma(s) matemático...      |    |");
							System.out.println("           |   |                                         |    |");
							System.out.println("           |   |  Boa sorte " + nome + "!                        |    |");
							System.out.println("           |   |_________________________________________|    |");
							System.out.println("           |                                                  |");
							System.out.println("            \\_________________________________________________/");
							System.out.println("                   \\___________________________________/");
							System.out.println("");
							
							for(int i=0;i<QTDENIGMAS;i++) {
								System.out.println(enigmas[i]);
								rstEnigmas[i]=leitor.nextInt();
							}
							
							System.out.println("");
														
							for(int i=0;i<QTDENIGMAS;i++) {
								if(respEnigmas[i]==rstEnigmas[i]) {
									qtdeAcertos++;
									pwdEM+=respEnigmas[i];
								}else {
									qtdeErros++;
								}
							}
							
							if(qtdeAcertos == QTDENIGMAS) {
								System.out.println("Caracas, você acertou todos os enigmas matemáticos... Parabéns =)");
								System.out.println("Depois de pensar tanto, Homerito, se cansou e quer alucidamente ir para o bar...");
								System.out.println("Mas para isso, ele precisa informar a senha da sala, por sorte, ele anotou uma dica de senha embaixo do teclado...");
								System.out.println("Deseja verificar esta dica? (Digite SIM ou NAO)");
								init = leitor.next();
								
								if(init.equalsIgnoreCase("sim")) {
									System.out.println("");
									System.out.println("Junte o(s) resultado(s) do(s) " + QTDENIGMAS + " enigma(s) para escapar do trabalho!");
									System.out.println("Ufa, agora que você sabe o resultado, por favor, some o(s) resultado(s) e em seguida digite o número: ");
									pwdEnigmas = leitor.nextInt();
									
									if(pwdEnigmas==pwdEM) {
										System.out.println("");
										System.out.println("Parabéns você acertou!!! Você conseguiu finalizar o SIMESCASE... Agora Homerito pode desfrutar da recompensa...");
										init = "sair";
										ganhou=true;
									}else {
										System.out.println("Eita algo não esta certo com a sua conta");
										init = "sair";
									}								
																		
								}else {
									System.out.println("Que pena que voce desistiu, estavámos quase escapando... :(");
									init = "sair";
								}
									
							}else {
								System.out.println("Eita, você não acertou todos os enigmas. Seu resultado foi " + qtdeAcertos + " acerto(s) e " + qtdeErros + " erro(s)");
								System.out.println("Infelizmente o gás tóxico se espalhou por toda Springlandia =(... GAME__OVER");
								init = "sair";
							}
								
							break;
						case "VERMELHO":
							System.out.println("Doh!  Não sei o que você fez mas parece que a situação piorou =(... No visor da mesa de controle esta apresentando a mensagem: ");
							
							/* Bender IA SIMESCAPE */
							System.out.println("             ________________________________________________");
							System.out.println("            /                                                \\");
							System.out.println("           |    _________________________________________     |");
							System.out.println("           |   |                                         |    |");
							System.out.println("           |   |  Olá eu sou a IA chamada de Bender...   |    |");
							System.out.println("           |   |  Pelo que estou analisando vc fez m...  |    |");
							System.out.println("           |   |  Bem isso não é novidade (¬_¬)          |    |");
							System.out.println("           |   |                                         |    |");
							System.out.println("           |   |  Ai Ai, bom, vou te ajudar...           |    |");
							System.out.println("           |   |                                         |    |");
							System.out.println("           |   |  Para cosnseguirmos sair dessa,         |    |");
							System.out.println("           |   |  tenta acertar minha proposta abaixo... |    |");
							System.out.println("           |   |                                         |    |");
							System.out.println("           |   |  Resolva " + QTDCHARADAS + " charada(s)...                |    |");
							System.out.println("           |   |                                         |    |");
							System.out.println("           |   |  Boa sorte " + nome + "!                        |    |");
							System.out.println("           |   |_________________________________________|    |");
							System.out.println("           |                                                  |");
							System.out.println("            \\_________________________________________________/");
							System.out.println("                   \\___________________________________/");
							System.out.println("");
							
							qtdeAcertos=0;
							qtdeErros=0;
							
							for(int i=0;i<QTDCHARADAS;i++) {
								System.out.println(charadas[i]);
								rstCharadas[i]=leitor.next();
							}
																					
							for(int i=0;i<QTDCHARADAS;i++) {
								if(rstCharadas[i].equalsIgnoreCase(respCharadas[i])) {
									qtdeAcertos++;
								}else {
									qtdeErros++;
								}
							}
														
							pwdCH = 19915;
							
							System.out.println("");
							
							if(qtdeAcertos == QTDCHARADAS) {
								System.out.println("Caracas, você acertou todas as charadas... Parabéns =)");
								System.out.println("Depois de pensar tanto, Homerito, se cansou e quer alucidamente ir para o bar...");
								System.out.println("Mas para isso, ele precisa informar a senha da sala, por sorte, ele anotou uma dica de senha embaixo do teclado...");
								System.out.println("Deseja verificar esta dica? (Digite SIM ou NAO)");
								init = leitor.next();
								
								if(init.equalsIgnoreCase("sim")) {
									System.out.println("");
									System.out.println("Transforme essas palavras em hexadecimal, separe os 4 primeiros digitos de cada uma e some tudo no final:");
									pwdCharadas = leitor.nextInt();
									
									if(pwdCharadas==pwdCH) {
										System.out.println("Parabéns você acertou!!! Você conseguiu finalizar o SIMESCASE... Agora Homerito pode desfrutar da recompensa...");
										init = "sair";
										ganhou = true;
									}else {
										System.out.println("Eita algo não esta certo com a sua conta");
										init = "sair";
									}								
																		
								}else {
									System.out.println("Que pena que voce desistiu, estavámos quase escapando... :(");
									init = "sair";
								}
									
							}else {
								System.out.println("Eita, você não acertou todos os enigmas. Seu resultado foi " + qtdeAcertos + " acerto(s) e " + qtdeErros + " erro(s)");
								System.out.println("Infelizmente o gás tóxico se espalhou por toda Springlandia =(... GAME__OVER");
								init = "sair";
							}
							
							break;
						default:
							System.out.println("Poxa, você não digitiu um texto válido para continuar =(");
							init = "sair";
							break;
					}
					
				}else if(init.equalsIgnoreCase("fugir")) {
					/* Bender IA SIMESCAPE */
					System.out.println("             ________________________________________________");
					System.out.println("            /                                                \\");
					System.out.println("           |    _________________________________________     |");
					System.out.println("           |   |                                         |    |");
					System.out.println("           |   |  Olá eu sou a IA chamada de Bender...   |    |");
					System.out.println("           |   |  Então vc não quer trabalhar, certo?... |    |");
					System.out.println("           |   |  Bem isso não é novidade (¬_¬)          |    |");
					System.out.println("           |   |                                         |    |");
					System.out.println("           |   |  Como eu adoro mágica, para vc sair,    |    |");
					System.out.println("           |   |  se eu conseguir adivinhar sua data de  |    |");
					System.out.println("           |   |  nascimento, vou permitir vc ir...      |    |");
					System.out.println("           |   |  tenta acertar minha proposta abaixo... |    |");
					System.out.println("           |   |                                         |    |");
					System.out.println("           |   |  Vamos lá, responda as perguntas...     |    |");
					System.out.println("           |   |                                         |    |");
					System.out.println("           |   |  Boa sorte " + nome + "!                        |    |");
					System.out.println("           |   |_________________________________________|    |");
					System.out.println("           |                                                  |");
					System.out.println("            \\_________________________________________________/");
					System.out.println("                   \\___________________________________/");
					System.out.println("");
					
					System.out.println("Bom, acho que é melhor você abrir uma calculadora para ir mais rapido...");
					System.out.println("");
					
					System.out.println("Pense no número do dia e mês do seu aniversário... (Ex: Se eu nasci em 08/JAN, vou pensar em 81). Posso continuar (Sim ou Não)?");
					init = leitor.next();
					
					if(init.equalsIgnoreCase("sim")) {
						System.out.println("Agora dobre esse número. Com este resultado, some 5. Por enquanto está facil né? Continamos (Sim ou Não)?");
						init = leitor.next();
						
						if(init.equalsIgnoreCase("sim")) {
							System.out.println("Multiplique o valor por 50. Com o novo valor, some os 2 ultimos número do ano de seu nascimento.  Continamos (Sim ou Não)?");
							init = leitor.next();
							
							if(init.equalsIgnoreCase("sim")) {								
								System.out.println("Me informe esse número que você obteve após todos estes cálculo. Preciso consulta o tarô para adivinhar sua data de nasicmento, só lembrando que só vou aceitar números...");
								magica = leitor.nextDouble();
								
								magica -= 250;
								
								System.out.println("Bom pelo que eu vi aqui no tarô, este valor " + dec.format(magica) + " te lembra algo (tipo sua data de nascimento)? (Sim ou não) ");
								init = leitor.next();
								
								if(init.equalsIgnoreCase("sim")) {
									System.out.println("Sabia que iria acertar =)... Bom " + nome + " vou te liberar da sala. Homerito vai aproveitar a recompensa!!!");
									ganhou = true;
									init = "sair";
								}else {
									System.out.println("Não é possível que não acertei, você deve ter feito a conta errada =|... Por esse motivo, você vai continuar na sala e recomeçar o jogo!");
									init = "voltar";
								}
								
							}else {
								System.out.println("Infelizmente não vou deixar você sair, pois não adivinhei sua data de nascimento...");
								init  = "sair";
							}
							
						}else {
							System.out.println("Infelizmente não vou deixar você sair, pois não adivinhei sua data de nascimento...");
							init  = "sair";
						}						
						
					}else {
						System.out.println("Infelizmente não vou deixar você sair, pois não adivinhei sua data de nascimento...");
						init  = "sair";
					}			
					
				}else {
					System.out.println("Poxa, você não digitiu um texto válido para continuar =(");
					init = "sair";
				}
				
			}else {
				System.out.println("Eita, acho que você teve algum problema e desistiu =(. Obrigado por jogar SIMESCAPE!");
				init = "sair";
			}
	
		}
		
		if(ganhou == true) {
			System.out.println("                       __ __");
			System.out.println("                      (,-^\\-\\_");
			System.out.println("                     ,'    \\ \\`-.");
			System.out.println("                    '            \\");
			System.out.println("                   |              :");
			System.out.println("                   |        _     |");
			System.out.println("                  ,|___   ,' `.   |");
			System.out.println("                  ,'   ` |     | /\\/\\");
			System.out.println("                  |     )\\   o // ;-.`                 __");
			System.out.println("                  `._o,'  ;---:_  __/ ____          ,-'  `--.");
			System.out.println("                   ,(,`--'      `. \\,'_ __`.     ,-'         `.");
			System.out.println("                ,-' (        _,'|---`(  \\ \\-\\   /              `.");
			System.out.println("            _,-|  |  \\    ,-',-'      \\_/_/_/--'._               \\");
			System.out.println("           ( \\  \\-'   `--^--'    '!..             `.              `");
			System.out.println("         ,' `-^-'  ..    .         '`!.             \\           _,-\\");
			System.out.println("       ,'          `!,   !.          `'    ,.....    \\      _,-'_,-`-,---.");
			System.out.println("      '|            `'   !.     ...           '``!,   \\   ,'   ,'   ,'    \\");
			System.out.println("     / :     .           !.   .,'''   ,.!'''           \\ /   ,'   ,'      /");
			System.out.println("    '   :  ,!'     ....  `'  `'     `''        .  ,.... \\   /    /       /");
			System.out.println("   '    ; ,!'   ,!'''''      ,-----.           `!  ''''  \\ '   ,'.     ,'");
			System.out.println("  /   ,'  `!              .-'       `--.       ,!         /  ,'   `. ,'");
			System.out.println(" :   ;         ..         |             `.___  `!     .,..\\ /       ;");
			System.out.println(" :   ;     ..!'''       ,'                   ``-.     `''  \\     _,'");
			System.out.println(":   ;     ,''           |     _______            `.         `---'  |");
			System.out.println(":   :         ...       |  ,-'    ,' `-._         |        ,.    | |");
			System.out.println(":    \\    ..!''''       |,'     ,'       :-.      |        `!..  | :");
			System.out.println(":     \\   `'             \\   ,-'         |  \\    ,'    ..    `!. | :");
			System.out.println(":      :      ,......     `.'            |   \\   |      ``.   `' ; ;");
			System.out.println(" :     | ,.       ''''      ._           |    \\ /        ;!;    / :");
			System.out.println(" :     :  !.                  `-._       | _.--'          ''   /  ;");
			System.out.println("  \\     \\ `!.    ,.!'    ,.....   `------^'        .,..       /  :");
			System.out.println("   \\     \\ `'   ,''       ''''``.                ,!''''      ;   ;");
			System.out.println("    \\     \\    `'                       .!'''                ; ,'");
			System.out.println("     \\     \\          ,.,'            ,!'                   / /");
			System.out.println("      `.    \\       ,!''    `''`...    '     '!...        ,' /");
			System.out.println("        \\    \\      '            ''     ....   `''   ,---' ,'");
			System.out.println("         `.   `.        ,...          .!''''      ,-'    ,'");
			System.out.println("           `-.  `--.    `''`'''     __;---.    ,-'    _,'");
			System.out.println("              `-.   `-._____,------'       `--'    _,'");
			System.out.println("                 `-._                         __,-'");
			System.out.println("                     `---.__            __,--'");
			System.out.println("                            `----------'");
			System.out.println("");
			
			System.out.println("Obrigado por jogar SIMESCAPE");
		}
				
		/* Limpando a memoria */
		leitor.close();		
	}

}
