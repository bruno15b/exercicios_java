public class NumberPrimo {
	
		static void primo (int a,int b){
			
			int resto=1;
	for(int cont=a;cont<=b;cont++){
		int aux=1;
		
		if(cont>1){
		while(resto!=0){	
		aux++;	
		resto=cont%aux;
		}
		}
		
		
		resto=1;
			if(aux==cont || cont==1){
			System.out.println("--------------------------------------------------------------------------------------");
			System.out.printf("%d é um número primo!\n",cont);
			}		
	}
		
}
		
	
		public static void main(String[] args) {
		
		primo(1,100);	
		
		
		
	}
}

