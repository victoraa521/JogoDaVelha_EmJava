package quest05;

public class Diagonal {
	public boolean verificaD(char jogo[][]) {
		if(jogo[0][0] !='.'&& jogo[0][0] == jogo[1][1] && jogo[1][1] == jogo[2][2]) {
			return true;
		}else if(jogo[0][2] !='.'&&jogo[0][2]==jogo[1][1]&& jogo[1][1]==jogo[2][0]) {
			return true;
		}else {
			return false;
		}
		
	}

}
