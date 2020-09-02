public class CalcFatorial {
	
	static int fatorial (int num){
		
		int fatorial=1;
		
	if(num>0){
		for(int cont=1;cont<=num;cont++){
			fatorial*=cont;	
		}
	} else return fatorial=1;

		return fatorial;
	}
	
	
	
	
	public static void main(String[] args) {
		double resultado=0,total=0;
		
		for(int cont=0;cont<20;cont++){
				
		resultado=(double)(100-cont)/fatorial(cont);	
		
		total+=resultado;		
		
		}
	
	System.out.printf("O resultado é %.2f .",total);
	System.out.printf("O resultado é %.2f .",total); \\github
	}
}