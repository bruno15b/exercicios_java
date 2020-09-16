public class CaixaEletronico{
	
	public static void main(String[] args) {
		
	int valor,valortot=6600,op=0,valorsac=0;
	int cont1=100,aux1=0,cont5=100,aux5=0,cont10=100,aux10=0,cont50=100,aux50=0;

		while(op!=4){
			
		System.out.print("\n----------------------Menu Principal----------------------");
		System.out.print("\n	1-Sacar Dinheiro");
		System.out.print("\n	2-Saldo Disponível");
		System.out.print("\n	3-Cédulas Disponíveis");
		System.out.print("\n	4-Sair do Sistema\n");
		op=Integer.parseInt(System.console().readLine());
		System.out.print("\n----------------------------------------------------------\n");

		switch (op){	
			
			case 1 :
			
			System.out.print("Informe o valor que deseja sacar:");
			valor=Integer.parseInt(System.console().readLine());
						
				if (valor<=valortot){	
				
					if (valor<=1000){
						
						valorsac=valor;	
						valortot-=valorsac;
					
						if(valor>=50 ){
							
						aux50 = Math.min(valor / 50, cont50); 
						valor -= aux50 * 50; 
						cont50=cont50-aux50;
						
						}
						
						if(valor>=10){	
						
						aux10 = Math.min(valor / 10, cont10); 
						valor -= aux10 * 10; 
						cont10=cont10-aux10;
						
						}
						
						if( valor>=5){
							
						aux5 = Math.min(valor / 5, cont5); 
						valor -= aux5 * 5; 
						cont5=cont5-aux5;
						
						}
						
					aux1=valor;
					cont1=cont1-aux1;		
					
					System.out.printf("Foram retirados %d bits foram dados:\n %d notas de B$50,00.\n %d notas de B$10,00.\n %d notas de B$5,00. \n %d notas de  B$1,00.\n",valorsac,aux50,aux10,aux5,aux1); 
						
					aux1=0;
					aux5=0;
					aux10=0;
					aux50=0;

						
					}else System.out.println("Não pode ser sacado valores acima de 1000.");
							
				}else System.out.println("Valor indisponível em caixa.");	
					
			break;
			
			case 2 : System.out.printf("O valor disponível é de %d reais.",valortot);break;		 
			
			case 3 : System.out.printf("Notas disponíveis:\n %d notas de B$50,00.\n %d notas de B$10,00.\n %d notas de B$5,00. \n %d notas de  B$1,00.\n",cont50,cont10,cont5,cont1);break;
			
			case 4 : System.out.print("Saindo do Sistema");break;
			
			default : System.out.print("Opção inválida!");break;
			
			}
		}
	}
}

