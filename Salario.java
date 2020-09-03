public class Salario{
	
	public static void main(String[] args) {
		
	int opcao=0,meses;
	double sal,novosal=0;
		
		while (opcao!=4){
			System.out.print("Menu de opções:\n");
			System.out.print("\n");
			System.out.print("1. Novo salário\n");
			System.out.print("2. Férias\n");
			System.out.print("3. Décimo terceiro\n");
			System.out.print("4. Sair\n");
			opcao=Integer.parseInt(System.console().readLine());
		
			switch(opcao){
					
				case 1 :
			
				System.out.print("Informe o salário do funcionário:\n");
				sal=Double.parseDouble(System.console().readLine());
			
					if(sal<=1000){
					novosal=sal+sal*15/100;	
					}else if(sal>1000 && sal<=3000){
					novosal=sal+sal*10/100;	
					}else if(sal>3000){	
					novosal=sal+sal*5/100;	
					}
						
				System.out.printf("O novo salário do funcionário é de %.2f reais.",novosal);	
						
				break;
				
				case 2 :
			
				System.out.print("Informe o salário do funcionário:\n");
				sal=Double.parseDouble(System.console().readLine());
			
				novosal=sal+sal/3;
			
				System.out.printf("O salário que o funcionário ira receber nas férias é de %.2f reais.\n",novosal);	
			
				break;
					
				case 3 :
			
				System.out.print("Informe o salário do funcionário:\n");
				sal=Double.parseDouble(System.console().readLine());
					
				System.out.print("Informe o número de meses que o funcionário trabalha na empresa:\n");
				meses=Integer.parseInt(System.console().readLine());
			
					if (meses<12 && meses>0){
					novosal=sal*meses/12;
					System.out.printf("O décimo terceiro salário do funcionário é de %.2f reais.\n",novosal);
					}else if (meses>=12){
					novosal=sal;
					System.out.printf("O décimo terceiro salário do funcionário é de %.2f reais.\n",novosal);
					}else{
					System.out.print("Meses inválidos.\n");
					}	
			
				break;
					
				case 4 :System.out.print("Programa fechado.!");break;
					
				default:System.out.print("Opção invalida.\n");break;
		
			}
		}
	}
}

	

