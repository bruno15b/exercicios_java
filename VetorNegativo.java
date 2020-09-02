public class VetorNegativo{
	
		static void vetorzero(int v[]){
			for(int cont=0;cont<v.length;cont++){
			
			if(v[cont]<0){
				v[cont]=0;
			}
			
			}
		}	
	
	
		public static void main(String[] args) {
			
		int[] vetor= new int[10];
		
		for(int cont=0;cont<10;cont++){
			
			System.out.printf("Digite o valor posição %d :",cont+1);
			vetor[cont]=Integer.parseInt(System.console().readLine());
		}
		
		vetorzero(vetor);
		
		for(int cont=0;cont<10;cont++){
			System.out.printf(" %d",vetor[cont]);
		}
		
	}
}

