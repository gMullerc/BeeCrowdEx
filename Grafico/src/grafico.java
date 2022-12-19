
public class grafico {
	public static void main(String[] args) {
		for(int linha = 0; linha <= 0; linha ++) {
			for(int coluna = 0; coluna < 12; coluna++) {
				if(coluna == 0 && linha == 0) {
					System.out.print("A");
				}else if(coluna == 1 && linha == 0) {
					System.out.print("|");
				}else if(coluna == 2 && linha == 0 || coluna == 3 && linha == 0 || coluna == 4 && linha == 0 || coluna == 5 && linha == 0 ) {
					System.out.print("O");
				}
			}
		}System.out.println();
		for(int linha = 0; linha <= 0; linha ++) {
			for(int coluna = 0; coluna < 12; coluna++) {
				if(coluna == 0 && linha == 0) {
					System.out.print("B");
				}else if(coluna == 1 && linha == 0) {
					System.out.print("|");
				}else if(coluna == 2 && linha == 0 || coluna == 3 && linha == 0 || coluna == 4 && linha == 0 || coluna == 5 && linha == 0 ||
						coluna == 6 && linha == 0 || coluna == 7 && linha == 0 || coluna == 8 && linha == 0 ||
						coluna == 9 && linha == 0) {
					System.out.print("O");
				}
			}
		}System.out.println();
		for(int linha = 0; linha <= 0; linha ++) {
			for(int coluna = 0; coluna < 12; coluna++) {
				if(coluna == 0 && linha == 0) {
					System.out.print("C");
				}else if(coluna == 1 && linha == 0) {
					System.out.print("|");
				}else if(coluna == 2 && linha == 0 || coluna == 3 && linha == 0 || coluna == 4 && linha == 0) {
					System.out.print("O");
				}
			}
		}System.out.println();
		for(int linha = 0; linha <= 0; linha ++) {
			for(int coluna = 0; coluna < 12; coluna++) {
				if(coluna == 0 && linha == 0) {
					System.out.print("D");
				}else if(coluna == 1 && linha == 0) {
					System.out.print("|");
				}else if(coluna == 2 && linha == 0) {
					System.out.print("O");
				}
			}
		}System.out.println();
		for(int linha = 0; linha <= 0; linha ++) {
			for(int coluna = 0; coluna < 12; coluna++) {
				if(coluna == 0 && linha == 0) {
					System.out.print("E");
				}else if(coluna == 1 && linha == 0) {
					System.out.print("|");
				}else if(coluna == 2 && linha == 0 || coluna == 3 && linha == 0 || coluna == 4 && linha == 0 || coluna == 5 && linha == 0 ||
						coluna == 6 && linha == 0 || coluna == 7 && linha == 0 || coluna == 8 && linha == 0 ||
						coluna == 9 && linha == 0 || coluna == 10 && linha == 0) {
					System.out.print("O");
				}
			}
		}System.out.println();
	}
}
