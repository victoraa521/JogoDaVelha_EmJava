package quest05;

public class Empate {
	public boolean verificaEmpate(char jogo[][]) {
		byte cont=0;
		for(int i=0;i<jogo.length;i++) {
			for (int j =0; j<jogo.length;j++) {
				if(jogo[i][j] != '.') {
					cont++;
				}
			}
		}
		if(cont==9) {
			return true;
		}else {
			return false;
		}
	}

}
