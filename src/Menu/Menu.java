package Menu;

import java.util.Scanner;

import AbstractFactory.PrincipalAbsFactory;
import Visitor.PrincipalVisitor;

public class Menu {
	
	private Scanner leitura;
	
	public Menu() {
		leitura = new Scanner(System.in);
		controle();
	}
	
    public  void menu(){
        System.out.println("\n>>>DESIGN PATTERNS<<<");        
        System.out.println("1 - Abstract Factory");
        System.out.println("2 - Bridge");
        System.out.println("3 - Chain of Responsibility");
        System.out.println("4 - Composite");
        System.out.println("5 - Facade");
        System.out.println("6 - Flyweight");
        System.out.println("7 - Mediator");
        System.out.println("8 - Memento");
        System.out.println("9 - Prototype");
        System.out.println("10 - Proxy");
        System.out.println("11 - State");
        System.out.println("12 - Visitor");
        System.out.println("0 - Sair");
    }
  
    public void controle(){
        int opcao; 
        menu();
        System.out.println("\nINFORME SUA OP��O: ");
        opcao = leitura.nextInt();
        while(opcao != 0){
        	switch(opcao){
        		case 1: 
        				PrincipalAbsFactory.main(null);
        				break;
                
        		case 2:
             
        				break;
                
        		case 3:
      
        				break;
                
        		case 4:
     
        				break;
        		case 5: 
                	
    					break;
            
        		case 6:
         
    					break;
            
        		case 7:
  
    					break;
            
        		case 8:
 
    					break;
            
        		case 9:
            
    					break;
        
        		case 10:
        			 
						break;
        
        		case 11:
        
						break;		
    					
        		case 12:
        				//printar a explica��o do design e como o exemplo explica o projeto
        				PrincipalVisitor.main(null);
        				break;
            
        		default:
        				System.out.println("Op��o inv�lida!");
            }
        	menu();
        	System.out.println("\nINFORME SUA OP��O: ");
            opcao = leitura.nextInt();
            
        }
    }        
 
    public static void main(String[] args) {
        Menu menu = new Menu();
    }
}