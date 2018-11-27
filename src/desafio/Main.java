package desafio;
import java.util.*;

public class Main {
	static int hpInimigo;
	static Scanner sc = new Scanner(System.in);
	static int t = 0;
	static Character character;
	static Random r = new Random();
	public static void main(String[] args) {
	
		System.out.println("Bem vindo ao jogo");
		System.out.println("Que tipo de pergonagem deseja criar?");
		System.out.println("1 para King");
		System.out.println("2 para Queen");
		System.out.println("3 para Knight");
		System.out.println("4 para Troll");
	
		int i = sc.nextInt();
		switch(i) {
		case 1:
			criarKing();
			break;
		case 2: 
			criarQueen();
			break;
		case 3:
			criarKnight();
			break;
		case 4: 
			criarTroll();
			break;
		}
	}
	
	public static void criarKing() {
		  character = new King();
		  System.out.println("Voce criou o personagem "+ character.getNome());
		selecArma(0);
	}
	
	public static void criarQueen() {
		  character = new Queen();
		  System.out.println("Voce criou o personagem "+ character.getNome());
		selecArma(0);
	}
	
	public static void criarKnight() {
		  character = new Knight();
		  System.out.println("Voce criou o personagem "+ character.getNome());
		selecArma(0);
	}
	
	public static void criarTroll() {
		  character = new Troll();
		  System.out.println("Voce criou o personagem "+ character.getNome());
		selecArma(0);
	}
	
	
	public static void selecArma(int a) {
		System.out.println("Selecione sua arma:");
		System.out.println("1 para Arco e flecha");
		System.out.println("2 para Espada");
		System.out.println("3 para Faca");
		System.out.println("4 para Machado");
		
		int i = sc.nextInt();
		switch(i) {
		case 1:
			character.setWeapon(new BowAndArrowBehaviour());
			break;
		case 2:
			character.setWeapon(new SwordBehaviour());
			break;
		case 3:
			character.setWeapon(new KnifeBehaviour());
			break;
		case 4:
			character.setWeapon(new AxeBehaviour());
			break;
		}
		if(a ==0) {
		continueGame();
		}else if(a ==1) {
			continuarAtaque();
		}
	}
	
	public static void continueGame() {
		
		hpInimigo = r.nextInt(50) + 50;
		System.out.println("Um inimigo com "+ hpInimigo + " de vida apareceu, digite 0 para atacar (Caso queira trocar de arma, digite 9)");
		int i = sc.nextInt();
		if(i == 0) {
			character.fight();
			int dano = r.nextInt(hpInimigo  +1);
			System.out.println("Seu dano foi de " + dano);
			if(dano == 0) {
				System.out.println("O inimigo desviou");
				continuarAtaque();
			}
			else if(dano < hpInimigo) {
				hpInimigo = hpInimigo - dano;
			}else if(dano >= hpInimigo) {
				System.out.println("Dano crítico");
				hpInimigo = 0;
			}
			continuarAtaque();
		}else if(i == 9){
			selecArma(0);
		}else {
			continueGame();
		}
			
		
		
	}
	
	public static void continuarAtaque() {
		if(hpInimigo > 0) {
		System.out.println("O inimigo ainda possui " + hpInimigo + " hp");
		System.out.println("Digite 0 para atacar (Caso queira trocar de arma, digite 9)");
		int i = sc.nextInt();
		if(i == 0) {
			character.fight();
			int dano = r.nextInt(hpInimigo +1);
			System.out.println("Seu dano foi de " + dano);
			if(dano == 0) {
				System.out.println("O inimigo desviou");
				continuarAtaque();
			}
			else if(dano < hpInimigo) {
				hpInimigo = hpInimigo - dano;
			}else if(dano >= hpInimigo) {
				System.out.println("Dano crítico");
				hpInimigo = 0;
				continuarAtaque();
			}
			continuarAtaque();
		
		}else if(i == 9){
			selecArma(1);
		}
		}else{
			System.out.println("O inimigo morreu");
			System.out.println("Digite 0 para continuar ou 1 para terminar");
			int c = sc.nextInt();
		
			if(c == 0) {
				continueGame();
			}else if(c == 1) {
				System.out.println("O jogo acabou");
			}
		}
	}
	
}
	
	
	
