public class CaCalcFatorial2 {
	
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
		double resultado=0,total=0,valor;
		
		System.out.print("Informe um valor");
		valor=Integer.parseInt(System.console().readLine());
		
		
		for(int cont=0;cont<15;cont++){
				
		resultado=(double)(Math.pow(valor, cont))/fatorial(cont);	

		
		total+=resultado;		
		
		}
	
	System.out.printf("O resultado é %.2f .",total);
	}
}