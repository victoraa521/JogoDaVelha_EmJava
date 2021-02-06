package quest05;
import java.util.Scanner;
public class EscreveMatriz {
	private char abc[]= {'A','B', 'C'};
	private char velha[][] = new char[3][3];
	private void printaMatriz() {
		for(int lin=0;lin<velha.length; lin++) {
			if(lin==0) {
				System.out.print(" \n    1  2  3");
				System.out.print(" \n    |  |  |");
			}
			System.out.println("\n");
			System.out.print(abc[lin]+" | ");
			for(int col=0; col<velha.length;col++) {
				System.out.print(velha[lin][col]+"  ");
			}
		}
		
	}
	public void velha(){
		EixoX         x     = new EixoX();
		EixoY         y     = new EixoY();
		Diagonal      d     = new Diagonal();
		Empate        e     = new Empate();
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("Olá, seja bem-vindo! ");
		for(int linha1=0; linha1<velha.length;linha1++) {
			for(int coluna1=0;coluna1 <velha.length+1;coluna1++) {
			if(linha1 ==0 && coluna1==0) {
				for(int linha=0;linha<velha.length; linha++) {
					for(int coluna=0; coluna<velha.length;coluna++) {
						velha[linha][coluna]='.';
						
					}
				}
				
			}
			printaMatriz();
			System.out.println("\n");
			for(int linha=0;linha<velha.length; linha++) {
				for(int coluna=0; coluna<velha.length;coluna++) {
					if(coluna1%2==0 ) {
						System.out.println("\nJogador 1:\n");
						System.out.print("[X]-Digite a posição: [A/ B/ C]: ");
						char n  = input.nextLine().toUpperCase().charAt(0);
						System.out.print("[X]-Digite o número: [1/ 2/ 3]: ");
						int num = Integer.parseInt(input.nextLine());
						if(num>3) {
							System.out.println("\nDigite uma posição válida!\n");
							coluna --;
							continue;
						}else if(n == 'A') {
							if(velha[0][num-1]!='.') {
								System.out.println("\nEste campo ja está preenchido\n");
								coluna --;
								continue;
							}else {
								velha[0][num-1]='X';
							}
						}else if(n == 'B') {
							if(velha[1][num-1]!='.') {
								System.out.println("\nEste campo ja está preenchido\n");
								coluna --;
								continue;
							}else {
								velha[1][num-1]='X';
							}
							
						}else if(n == 'C') {
							if(velha[2][num-1]!='.') {
								System.out.println("\nEste campo ja está preenchido\n");
								coluna --;
								continue;
							}else {
								velha[2][num-1]='X';
							}
							
						}else {
							System.out.println("\nDigite uma posição válida! \n");
							coluna--;
							continue;
						}
						
						boolean yy = y.verificarY(velha);
						boolean xx = x.verificaX(velha);
						boolean dd = d.verificaD(velha);
						boolean ee = e.verificaEmpate(velha);
						if(yy==true||xx==true||dd==true) {
							printaMatriz();
							
							System.out.println("\n\njogador um ganhou!\n\n");
							coluna=100;
							linha=100;
							linha1=100;
							coluna1=100;
							continue;
						}else if(ee==true) {
							printaMatriz();
							System.out.println("\nEmpate");
							coluna=100;
							linha=100;
							linha1=100;
							coluna1=100;
							continue;
						}
						coluna =100;
						linha=100;
					}else {
						System.out.println("\nJogador 2:\n");
						System.out.print("[O]-Digite a posição: [A/ B/ C]: ");
						char n  = input.nextLine().toUpperCase().charAt(0);
						System.out.print("[O]-Digite o número: [1/ 2/ 3]: ");
						int num = Integer.parseInt(input.nextLine());
						if(num>3) {
							System.out.println("\nDigite uma posição válida!\n");
							coluna --;
							continue;
						}else if(n == 'A') {
							if(velha[0][num-1]!='.') {
								System.out.println("\nEste campo ja está preenchido\n");
								coluna --;
								continue;
							}else {
								velha[0][num-1]='O';
							}
						}else if(n == 'B') {
							if(velha[1][num-1]!='.') {
								System.out.println("\n\nEste campo ja está preenchido\n\n");
								coluna --;
								continue;
							}else {
								velha[1][num-1]='O';
							}
							
						}else if(n == 'C') {
							if(velha[2][num-1]!='.') {
								System.out.println("\nEste campo ja está preenchido\n");
								coluna --;
								continue;
							}else {
								velha[2][num-1]='O';
							}
							
						}else {
							System.out.println("\nDigite uma posição válida! \n");
							coluna--;
							continue;
						}
						boolean yy = y.verificarY(velha);
						boolean xx = x.verificaX(velha);
						boolean dd = d.verificaD(velha);
						if(yy==true||xx==true||dd==true) {
							printaMatriz();
							System.out.println("\n\njogador dois ganhou!\n\n");
							coluna=100;
							linha=100;
							linha1=100;
							coluna1=100;
							continue;
						}
						coluna =100;
						linha=100;
					}
					
				}
			}
			}
		}
	
	}

}
