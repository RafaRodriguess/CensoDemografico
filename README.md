# Censo Demografico
## Algoritmo e Fluxograma!

## Algoritmo
Início
	
	      int i = 0, genero, idade = 0;
		int contF = 0, contM = 0, contO = 0;
		double altura, alturacontF = 0, idadecontM = 0, idadecontF = 0, idadecontO = 0;
		double percent = 0;
		
	     Enquanto i <= 999 faça
		  i++
		  escreva (''Selecione seu genero: 0 - Feminino\n1 - Masculino\n2 - outros\n)
	        leia (genero)
		 	 Enquanto (verdade)
			   SE genero < 0 ou genero > 2 FAÇA
			     escreva (''Opção inválida)	
			     escreva (''Selecione seu genero: 0 - Feminino\n1 - Masculino\n2 - outros\n)	
			     continue
			    FIMSE
	        	   break
			 Fim Enquanto
		 escreva (''sua idade:)
	         leia (idade)
		  SE idade >= 18 e idade <=35 faça
			 percent++
		  FIMSE
  
		 Case (genero)
		    0:  Início
			    idadecontF += idade
			    alturacontF += altura
			    contF++
		   	 Fim
		    1:  Início 			
			    idadecontM += idade
			    contM++
		 	  Fim
	            2:  Início
			    idadecontO += idade
			    contO++
		  	  Fim
		 Fim case

	     Fim Enquanto
	
	     escreva (''Média idade grupos: %.1f'',(idadecontF + idadecontM + idadecontO) / (contF + contM + contO))
	     escreva (''Média altura mulheres: %.2f'',(alturacontF / contF))
	     escreva (''Média idade homens: %.1f'', (idadecontM / contM))
	     escreva (''Quantidade de pessoas do genero outros: %d'', contO)
	     escreva (''Percentual pessoas entre 18 e 35 anos: %d'',(percent / 1000) * 100))

Fim

## Fluxograma
![Censo](https://user-images.githubusercontent.com/104536317/167663971-1aa58afc-353c-4ad0-8881-5441ebabbe24.png)

