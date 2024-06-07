
package projetointegrador;
import java.text.DecimalFormat;
import java.util.Scanner;

public class ProjetoIntegrador {
   

    public static void main(String[] args)           
    {
        
        Scanner ler = new Scanner(System.in);
        int sairPrograma =0, sairPeca =0;
        
        
        int opcao, sessaoEscolhida, sessaoEscolhida1 =0, pecaEscolhida,pecaEscolhida1 = 0 , areaEscolhida, frisaEscolhida, camaroteEscolhido, poltrona;
       
        long CPF;
        
        
       // String plateiaA[][] = new String[5][5]; 
        String[][] plateiaA = {{"00","01","02","03","04"},{"10","11","12","13","14"},{"20","21","22","23","24"},{"30","31","32","33","34"},{"40","41","42","43","44"}};
            int qtdIngressoPlateiaA = 0, valorIngressoPlateiaA = 40 ;
       
        
        int plateiaB[][] = new int[10][10];
            int qtdIngressoPlateiaB = 0, valorIngressoPlateiaB = 60 ;
        int frisas[][] = new int[6][5]; //cada linha representa uma frisa e as colunas sua posição;
            int qtdIngressoFrisa = 0, valorIngressoFrisa = 120 ;
        int camarotes[][] = new int [5][10]; //cada linha representa um camarote e as colunas sua posição;
            int qtdIngressoCamarote = 0, valorIngressoCamarote = 80 ;
        int balcaoNobre[][] = new int [5][10];  //cada linha representa um balcao e as colunas sua posição;
            int qtdIngressoBalcao = 0, valorIngressoBalcao = 250 ;
        
        
        
        while(sairPrograma == 0)
        {
            System.out.println("Bem vindo ao Teatro ABC, por favor escolha uma opção: ");
            
            
            
            
            
            
            System.out.println("1 - Comprar Ingressos");
            System.out.println("2 - Imprimir Ingressos");
            System.out.println("3 - Estatistica de vendas");
            System.out.println("0 - Sair do programa");
            System.out.print("Opção: ");
            opcao = ler.nextInt();
            
            
            
            int validacao =0;

            switch(opcao)
            {
                case 1:
                    while (validacao == 0)
                    {
                        
                    
                    
                    int dig1, dig2, dig3, dig4, dig5, dig6, dig7, dig8, dig9, dig10, dig11;
                    int Verificador01, RestoVerificador01, DigVerificador01;
                    int Verificador02, RestoVerificador02, DigVerificador02;



                    System.out.println("Digite o CPF:");
                    CPF = ler.nextLong();

                    //Usamos CASTING refere-se à conversão de um valor de um tipo de dado para outro.
                    dig1 = (int) (CPF / 10000000000L % 10);
                    dig2 = (int) (CPF / 1000000000 % 10);
                    dig3 = (int) (CPF / 100000000 % 10);
                    dig4 = (int) (CPF / 10000000 % 10);
                    dig5 = (int) (CPF / 1000000 % 10);
                    dig6 = (int) (CPF / 100000 % 10);
                    dig7 = (int) (CPF / 10000 % 10);
                    dig8 = (int) (CPF / 1000 % 10);
                    dig9 = (int) (CPF / 100 % 10);
                    dig10 = (int) (CPF / 10 % 10);
                    dig11 = (int) (CPF % 10);


                    //PRIMEIRO DÍGITO VERIFICADOR
                    //Consideramos como quociente apenas o valor inteiro.

                    Verificador01 = (dig1*10) + (dig2*9) + (dig3*8) + (dig4*7) + (dig5*6) + (dig6*5) + (dig7*4) + (dig8*3) + (dig9*2);

                    // Pegamos o resultado obtido e dividimos por 11.
                    // Se o resto da divisão for menor que 2, então o dígito é igual a 0 (Zero).
                    // Se o resto da divisão for maior ou igual a 2, então o dígito verificador é igual a 11 menos o resto da divisão (11 - resto).
                    RestoVerificador01 = Verificador01%11;

                    if (RestoVerificador01<2)
                    {
                        DigVerificador01 = 0;
                    }
                    else
                    {
                        DigVerificador01 = 11 - RestoVerificador01;
                    }


                    //SEGUNDO DÍGITO VERIFICADOR
                    //Para calcular o segundo dígito verificadr usaremos o primeiro dígito já calculado

                    Verificador02 = (dig1*11) + (dig2*10) + (dig3*9) + (dig4*8) + (dig5*7) + (dig6*6) + (dig7*5) + (dig8*4) + (dig9*3) + (DigVerificador01*2);

                    // Pegamos o resultado obtido e dividimos por 11.
                    // Se o resto da divisão for menor que 2, então o dígito é igual a 0 (Zero).
                    // Se o resto da divisão for maior ou igual a 2, então o dígito verificador é igual a 11 menos o resto da divisão (11 - resto).
                    RestoVerificador02 = Verificador02%11;

                    if (RestoVerificador02<2)
                    {
                        DigVerificador02 = 0;
                    }
                    else
                    {
                        DigVerificador02 = 11 - RestoVerificador02;
                    }


                    //VALIDAÇÃO
                    if (DigVerificador01 == dig10 && DigVerificador02 == dig11)
                    {
                        System.out.println("O NUMERO DE CPF É VÁLIDO!");
                        validacao ++;
                        System.out.print(dig1);
                    System.out.print(dig2);
                    System.out.print(dig3 + ".");
                    System.out.print(dig4);
                    System.out.print(dig5);
                    System.out.print(dig6 + ".");
                    System.out.print(dig7);
                    System.out.print(dig8);
                    System.out.print(dig9 + "-");
                    System.out.print(dig10);
                    System.out.println(dig11);
                    }

                    else
                    {
                        System.out.println("O NUMERO DE CPF É INVÁLIDO!");   
                    }
            
        
        
                    }

                  
                    System.out.println("Escolha a sessão: ");
                    System.out.println("1 - Manhã");
                    System.out.println("2 - Tarde");
                    System.out.println("3 - Noite");
                    System.out.println("4 - Finalizar compra");
                    System.out.println("0 - Voltar ao menu anterior");
                    System.out.print("Opção: ");
                    sessaoEscolhida = ler.nextInt();
                    
                    
                    
                    while (sessaoEscolhida1 == 0)
                    {    
                    switch(sessaoEscolhida)
                    {
                        case 1: //MANHÃ
                            System.out.println("Escolha uma peça: ");
                            System.out.println("1 - Primeira peça");
                            System.out.println("2 - Segunda peça");
                            System.out.println("3 - Terceira peça");
                            System.out.println("0 - Voltar ao menu anterior");
                            System.out.print("Opção: ");
                            pecaEscolhida = ler.nextInt();
                            
                            
                            while (pecaEscolhida1 == 00)
                            {
                            switch (pecaEscolhida)
                            {
                                case 1:  //PRIMEIRA PEÇA
                                    System.out.println("Escolha uma área: ");
                                    System.out.println("1 - Plateia A");
                                    System.out.println("2 - Plateia B");
                                    System.out.println("3 - Frisa");
                                    System.out.println("4 - Camarote");
                                    System.out.println("5 - Balcão Nobre");
                                    System.out.println("0 - Voltar ao menu anterior");
                                    System.out.print("Opção: ");
                                    areaEscolhida = ler.nextInt();

                                    switch (areaEscolhida)
                                    {
                                        case 1: //PLATEIA A
                                            
                                            int qtdIngressoCompra = 0;
                                           
                                                System.out.println("Digite a quantidade de ingressos: ");
                                                qtdIngressoCompra = ler.nextInt();
                                                
                                                for (int k = 0; k < 5; k++)
                                            {
                                                for (int j = 0; j < 5; j++)
                                                {
                                                    System.out.print(plateiaA[k][j]+" ");
                                                }
                                                System.out.println();
                                            }  

                                            System.out.println("Digite a posição desejada: ");
                                                
                                                
                                                for ( int i = 0; i < qtdIngressoCompra; i++)
                                                {

                                                poltrona = ler.nextInt();
                                                int linhaPA = poltrona/10;
                                                int colunaPA = poltrona%10;
                                                System.out.println("Posição escolhida: " + linhaPA +  " - "+ colunaPA);
                                                plateiaA[linhaPA][colunaPA] = "X "; //aqui eu quero substituir o valor da matriz por um "X" para representar que a poltrona ja foi selecionada
                                                qtdIngressoPlateiaA++;
                                                }

                                                for (int k = 0; k < 5; k++)
                                                {
                                                for (int j = 0; j < 5; j++)
                                                {
                                                    System.out.print(plateiaA[k][j]+" ");
                                                }
                                                System.out.println();
                                                }
                                                break;
                                                

                                        case 2: //PLATEIA B
                                            System.out.println("Escolha uma poltrona: ");
                                            for (int i = 0; i < 10; i++)
                                            {
                                                for (int j = 0; j < 10; j++)
                                                {
                                                    System.out.print(i);
                                                    System.out.print(j + " ");
                                                }
                                                System.out.println();
                                            }
                                            break;
                                        case 3: //FRISA cada linha da matriz corresponde a uma frisa
                                            System.out.println("Escolha uma frisa: ");
                                            System.out.println("1 - Frisa 1");
                                            System.out.println("2 - Frisa 2");
                                            System.out.println("3 - Frisa 3");
                                            System.out.println("4 - Frisa 4");
                                            System.out.println("5 - Frisa 5");
                                            System.out.println("6 - Frisa 6");
                                            System.out.print("Opção: ");
                                            frisaEscolhida = ler.nextInt();
                                            switch(frisaEscolhida)
                                            {
                                                case 1:
                                                    for (int i = 0; i < 1; i++)
                                                    {
                                                        for (int j = 0; j < 5; j++)
                                                        {
                                                            System.out.print(i);
                                                            System.out.print(j + " ");
                                                        }
                                                System.out.println();
                                            }
                                                    break;
                                                case 2:
                                                    for (int i = 1; i < 2; i++)
                                                    {
                                                        for (int j = 0; j < 5; j++)
                                                        {
                                                            System.out.print(i);
                                                            System.out.print(j + " ");
                                                        }
                                                System.out.println();
                                            }
                                                    break;
                                                case 3:
                                                    for (int i = 2; i < 3; i++)
                                                    {
                                                        for (int j = 0; j < 5; j++)
                                                        {
                                                            System.out.print(i);
                                                            System.out.print(j + " ");
                                                        }
                                                System.out.println();
                                            }
                                                    break;
                                                case 4:
                                                    for (int i = 3; i < 4; i++)
                                                    {
                                                        for (int j = 0; j < 5; j++)
                                                        {
                                                            System.out.print(i);
                                                            System.out.print(j + " ");
                                                        }
                                                System.out.println();
                                            }
                                                    break;
                                                case 5:
                                                    for (int i = 4; i < 5; i++)
                                                    {
                                                        for (int j = 0; j < 5; j++)
                                                        {
                                                            System.out.print(i);
                                                            System.out.print(j + " ");
                                                        }
                                                System.out.println();
                                            }
                                                    break;
                                                case 6:
                                                    for (int i = 5; i < 6; i++)
                                                    {
                                                        for (int j = 0; j < 5; j++)
                                                        {
                                                            System.out.print(i);
                                                            System.out.print(j + " ");
                                                        }
                                                System.out.println();
                                            }
                                                    break;
                                                default:
                                                    
                                            }
                                            
                                            break;
                                        case 4: //CAMAROTE
                                            System.out.println("Escolha um camarote: ");
                                            System.out.println("1 - camarote 1");
                                            System.out.println("2 - camarote 2");
                                            System.out.println("3 - camarote 3");
                                            System.out.println("4 - camarote 4");
                                            System.out.println("5 - camarote 5");
                                            System.out.print("Opção: ");
                                            camaroteEscolhido = ler.nextInt();
                                            switch(camaroteEscolhido)
                                            {
                                                case 1:
                                                    for (int i = 0; i < 1; i++)
                                                    {
                                                        for (int j = 0; j < 10; j++)
                                                        {
                                                            System.out.print(i);
                                                            System.out.print(j + " ");
                                                        }
                                                System.out.println();
                                            }
                                                    break;
                                                case 2:
                                                    for (int i = 1; i < 2; i++)
                                                    {
                                                        for (int j = 0; j < 10; j++)
                                                        {
                                                            System.out.print(i);
                                                            System.out.print(j + " ");
                                                        }
                                                System.out.println();
                                            }
                                                    break;
                                                case 3:
                                                    for (int i = 2; i < 3; i++)
                                                    {
                                                        for (int j = 0; j < 10; j++)
                                                        {
                                                            System.out.print(i);
                                                            System.out.print(j + " ");
                                                        }
                                                System.out.println();
                                            }
                                                    break;
                                                case 4:
                                                    for (int i = 3; i < 4; i++)
                                                    {
                                                        for (int j = 0; j < 10; j++)
                                                        {
                                                            System.out.print(i);
                                                            System.out.print(j + " ");
                                                        }
                                                System.out.println();
                                            }
                                                    break;
                                                case 5:
                                                    for (int i = 4; i < 5; i++)
                                                    {
                                                        for (int j = 0; j < 10; j++)
                                                        {
                                                            System.out.print(i);
                                                            System.out.print(j + " ");
                                                        }
                                                System.out.println();
                                            }
                                                    break;
                                                default:
                                                    
                                            }
                                            break;
                                        case 5: //BALCAO NOBRE
                                            System.out.println("Escolha uma poltrona: ");
                                            for (int i = 0; i < 5; i++)
                                            {
                                                for (int j = 0; j < 10; j++)
                                                {
                                                    System.out.print(i);
                                                    System.out.print(j + " ");
                                                }
                                                System.out.println();
                                            }
                                            break;
                                        case 0:
                                            sairPeca++;
                                            break;
                                        default:
                                            
                                    }
                                    
                                    
                                case 2: //SEGUNDA PEÇA
                                    System.out.println("Escolha uma área: ");
                                    System.out.println("1 - Plateia A");
                                    System.out.println("2 - Plateia B");
                                    System.out.println("3 - Frisa");
                                    System.out.println("4 - Camarote");
                                    System.out.println("5 - Balcão Nobre");
                                    System.out.println("0 - Voltar ao menu anterior");
                                    System.out.print("Opção: ");
                                    areaEscolhida = ler.nextInt();
                                    break;
                                case 3: //TERCEIRA PEÇA
                                    System.out.println("Escolha uma área: ");
                                    System.out.println("1 - Plateia A");
                                    System.out.println("2 - Plateia B");
                                    System.out.println("3 - Frisa");
                                    System.out.println("4 - Camarote");
                                    System.out.println("5 - Balcão Nobre");
                                    System.out.println("0 - Voltar ao menu anterior");
                                    System.out.print("Opção: ");
                                    areaEscolhida = ler.nextInt();
                                    break;
                                case 4:
                                    break;
                                case 5:
                                    break;
                                case 0:
                                    pecaEscolhida1 = pecaEscolhida1 +1;
                                    break;
                                default:
                                            System.out.println("Função invalida!");                             
                            }
                            }

                        case 2: //TARDE
                            System.out.println("Escolha uma peça: ");
                            System.out.println("1 - Primeira peça");
                            System.out.println("2 - Segunda peça: ");
                            System.out.println("3 - Terceira peça: ");
                            System.out.print("Opção: ");
                            pecaEscolhida = ler.nextInt();
                            break;
                        case 3: //NOITE
                            System.out.println("Escolha uma peça: ");
                            System.out.println("1 - Primeira peça");
                            System.out.println("2 - Segunda peça: ");
                            System.out.println("3 - Terceira peça: ");
                            System.out.print("Opção: ");
                            pecaEscolhida = ler.nextInt();
                            break;
                        case 4: //finalizar compra
                            
                            break;
                        case 0:
                            sessaoEscolhida++;
                        default: 
                            
                    }
                    break;
                    }
                    
                    
                    
                case 2:
                    break;
                case 3:
                    break;
                case 0:
                    sairPrograma++;
                    break;
                default:
                    
                    
            }
            }
                    
            
            
            
            
            
        
        
        
    }
    
}
