public class MaxMultiCo{
	
	static double mmc(double a,double b){
			
		double cont=1,cont1=2,cont2=2;
		
	    while (a != 1 || b != 1){
			
			if(a%cont1==0 && b%cont2==0){
				cont*=cont1;	
				a=a/cont1;
				b=b/cont2;
			}else if(a%cont1==0 && b%cont2!=0){
				cont*=cont1;
				a=a/cont1;	
			}else if (a%cont1!=0 && b%cont2==0){
				cont*=cont2;
				b=b/cont2;
			}else if (a==1 && b%cont2!=0){
				cont2++;
			}else if (b==1 && a%cont1!=0){	
				cont1++;
			}else if (a%cont1!=0 && b%cont2!=0){
				cont1++;
				cont2++;
			}else{
				System.out.println("Não entrou no if");
		break;
			}	
		
	    }
	        return(cont);
	}

		
	public static void main(String[] args) {
		
		 double a,b,c,d,e,f;
		
		 System.out.print("Informe o numerador da primeira fração:");
		 a=Double.parseDouble(System.console().readLine());
		
		 System.out.print("Informe o denominador da primeira fração:");
		 b=Double.parseDouble(System.console().readLine());
		
		 System.out.print("Informe o numerador da segunda fração:");
		 c=Double.parseDouble(System.console().readLine());
		
		 System.out.print("Informe o denominador da segunda fração:");
		 d=Double.parseDouble(System.console().readLine());
		
		 f=mmc(b,d);
		 e=(f/b)*a+(f/d)*c;
		
		 System.out.printf("%.0f/%.0f + %.0f/%.0f = %.0f/%.0f",a,b,c,d,e,f);
	
	
	
	}	
}

