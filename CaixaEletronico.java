public class CaixaEletronico{
	
	public static void main(String[] args) {
		
	int valor,valortot=6600,lim=0,op=0,valor50=5000,valor10=1000,valor5=500,valor1=100;
	int cont1=100,aux1=0,cont5=100,aux5=0,cont10=100,aux10=0,cont50=100,aux50=0,resto=0,quantidade=0;

	aux50=cont50;
	aux10=cont10;
	aux5=cont5;
	aux1=cont1;
			
	System.out.println(cont50);
			
			
	System.out.print("Informe o valor que deseja sacar:");
	valor=Integer.parseInt(System.console().readLine());
			
		if (valor<=valortot){
			
			if (valor<=1000){
			
				if(valor>=50 && cont50>0 && valor<=valor50){
				
				quantidade=valor/50;
				cont50=cont50-quantidade;
				resto=valor%50;
				valor50-=valor;
					
			    if(resto>=10){
				quantidade=resto/10;
				cont10=cont10-quantidade;
				resto=resto%10;	
			    }

			    if( resto>=5 && resto<10){
				quantidade=resto/5;
				cont5=cont5-quantidade;
				resto=resto%5;
			    }
			
			    if(resto>=1 && resto<5){
				quantidade=resto/1;
				cont1=cont1-quantidade;
				resto=resto%1;				
				}	
				
			System.out.printf("Foram retirados %d bits foram dados:\n %d notas de B$50,00.\n %d notas de B$10,00.\n %d notas de B$5,00. \n %d notas de  B$1,00.\n",valor,(aux50-cont50),(aux10-cont10),(aux5-cont5),(aux1-cont1)); 
			valortot-=valor;
			
				}else if (valor>=10 && cont10>0 && valor<=valor10){
				
				quantidade=valor/10;
				cont10=cont10-quantidade;
				resto=valor%10;
				valor10-=valor;
				
					if(resto>=5 && resto<10){
				
					quantidade=resto/5;
					cont5=cont5-quantidade;
					resto=resto%5;	
					}
			
					if(resto>=1 && resto<5){
					quantidade=resto/1;
					cont1=cont1-quantidade;
					resto=resto%1;
					}	
			
				System.out.printf("Foram retirados %d bits foram dados:\n %d notas de B$50,00.\n %d notas de B$10,00.\n %d notas de B$5,00. \n %d notas de  B$1,00.\n",valor,(aux50-cont50),(aux10-cont10),(aux5-cont5),(aux1-cont1)); 
				valortot-=valor;
	
				}else if(valor>=5 && cont5>0 && valor<=valor5){	
				
				quantidade=valor/5;
				cont5=cont5-quantidade;
				resto=valor%5;
				valor5-=valor;
				
					if(resto>=1 && resto<5){
					quantidade=resto/1;
					cont1=cont1-quantidade;
					resto=resto%1;
					}	
				
				System.out.printf("Foram retirados %d bits foram dados:\n %d notas de B$50,00.\n %d notas de B$10,00.\n %d notas de B$5,00. \n %d notas de  B$1,00.\n",valor,(aux50-cont50),(aux10-cont10),(aux5-cont5),(aux1-cont1)); 
				valortot-=valor;
			
				}else if(valor>=1 && cont1>0 &&  valor<=valor1){
				
				quantidade=valor/1;
				cont1=cont1-quantidade;
				resto=valor%1;	
				valor1-=valor;
				System.out.printf("Foram retirados %d bits foram dados:\n %d notas de B$50,00.\n %d notas de B$10,00.\n %d notas de B$5,00. \n %d notas de  B$1,00.\n",valor,(aux50-cont50),(aux10-cont10),(aux5-cont5),(aux1-cont1)); 
				valortot-=valor;
			
				}else System.out.printf("Caixa incapaz de calcular valor solicitado, informe valores que adequem a cedulas disponiveis:\n %d notas de B$50,00.\n %d notas de B$10,00.\n %d notas de B$5,00. \n %d notas de  B$1,00.\n",cont50,cont10,cont5,cont1);
			
			}else System.out.println("Não pode ser sacado valores acima de 1000.");
			
		}else System.out.println("Valor indisponivel em caixa.");	
	}
}

