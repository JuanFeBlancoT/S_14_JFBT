package ui;

import model.MathApp;
import java.util.*;

public class Main{
	
	public static Scanner sc =new Scanner(System.in);
	
	public static void main (String[] args){
		
		//Atributes
		boolean menu=true;
		
		//MathApp
		MathApp math1=createMathApp();
		
		//Menu
		while(menu){
			System.out.println("\n********** MENU **********\n"+
		" 1. Aniadir nuevo conjunto\n"+
		" 2. Eliminar un conjunto\n"+
		" 3. Aniadir numero al conjunto\n"+
		" 4. Eliminar numero del conjunto\n"+
		" 5. Union de dos conjuntos\n"+
		" 6. Diferencia entre conjuntos\n"+
		" 7. Interseccion entre conjuntos\n"+
		" 8. Diferencia simetrica\n"+
		" 9. Mostrar un conjunto\n"+
		" 10. Mostrar todos los conjuntos\n"+
		" 11. Salir");
		
		
		int answer=sc.nextInt();sc.nextLine();
		
		switch(answer){
			case 1:
				createSet(math1);
			break;
			case 2:
				removeSet(math1);
			break;
			case 3:
				addElementToSet(math1);
			break;
			case 4:
				removeElementToSet(math1);
			break;
			case 5:
				union(math1);
			break;
			case 6:
				difference(math1);
			break;
			case 7:
				intersection(math1);
			break;
			case 8:
				symetricDifference(math1);
			break;
			case 9:
				showInfoSet(math1);
			break;
			case 10:
				showInfoSets(math1);
			break;
			case 11:
			
				menu=false;
			break;
		}
		}
		
		
	}
	
	public static MathApp createMathApp(){
		MathApp mathx=new MathApp();
		return mathx;
	}
	
	public static void createSet(MathApp mathx){
		
	System.out.print("Inserta el nombre del conjunto: ");
	String name=sc.nextLine();
	
	mathx.addSet(name);
	
	}
	
	public static void removeSet(MathApp mathx){
			
		System.out.print("Inserta el nombre del conjunto que quiere eliminar: ");
		String name=sc.nextLine();
		
		mathx.removeSet(name);
	
	}
	
	public static void addElementToSet(MathApp mathx){
		
		System.out.print("Inserta el nombre del conjunto al que quieres aniadir el numero: ");
		String name=sc.nextLine();
		boolean found=mathx.findSet(name);
		if(found){
			System.out.print("Inserta el nuevo numero del conjunto: ");
			int newNumber=sc.nextInt();sc.nextLine();
			mathx.addElementToSet(name, newNumber);
		}else{
			System.out.print("El conjunto no existe \n");
		}
	}
	
	public static void removeElementToSet(MathApp mathx){
		
		System.out.print("Inserta el nombre del conjunto al que quieres quitarle un numero: ");
		String name=sc.nextLine();
		boolean found=mathx.findSet(name);
		if(found){
			System.out.print("Inserta nuevo numero que deseas eliminar: ");
			int newNumber=sc.nextInt();sc.nextLine();
			mathx.removeElement(name, newNumber);
		}else{
			System.out.print("El conjunto no existe \n");
		}
	}
	
	public static void union(MathApp mathx){
		
		System.out.print("Inserta el conjunto al que quieres hacerle union: ");
		String name=sc.nextLine();
		boolean found1 = mathx.findSet(name);
		if(found1){
			System.out.print("Inserta el conjunto con el que lo vas a unir: ");
			String name2 = sc.nextLine();
			boolean found2=mathx.findSet(name2);
			if(found2){
				System.out.print("Inserta el nombre del nuevo conjunto que va a surgir: ");
				String newName = sc.nextLine();
				mathx.union(name, name2, newName);
			}else{
				System.out.print("Imposible realizar operacion. Este conjunto no existe \n");
			}
		}else{
			System.out.print("Imposible realizar operacion. Este conjunto no existe \n");
		}
	}//end intersection
	
	public static void difference(MathApp mathx){
		
		System.out.print("Inserta el conjunto al que quieres hacerle diferencia: ");
		String name=sc.nextLine();
		boolean found1 = mathx.findSet(name);
		if(found1){
			System.out.print("Inserta el conjunto con el que lo vas a diferenciar: ");
			String name2 = sc.nextLine();
			boolean found2=mathx.findSet(name2);
			if(found2){
				System.out.print("Inserta el nombre del nuevo conjunto que va a surgir: ");
				String newName = sc.nextLine();
				mathx.difference(name, name2, newName);
			}else{
				System.out.print("Imposible realizar operacion. Este conjunto no existe \n");
			}
		}else{
			System.out.print("Imposible realizar operacion. Este conjunto no existe \n");
		}
	}
	
	public static void intersection(MathApp mathx){
		
		System.out.print("Inserta el conjunto al que quieres hacerle interseccion: ");
		String name=sc.nextLine();
		boolean found1 = mathx.findSet(name);
		if(found1){
			System.out.print("Inserta el conjunto con el que lo vas a interceptar: ");
			String name2 = sc.nextLine();
			boolean found2=mathx.findSet(name2);
			if(found2){
				System.out.print("Inserta el nombre del nuevo conjunto que va a surgir: ");
				String newName = sc.nextLine();
				mathx.intersection(name, name2, newName);
			}else{
				System.out.print("Imposible realizar operacion. Este conjunto no existe \n");
			}
		}else{
			System.out.print("Imposible realizar operacion. Este conjunto no existe \n");
		}
	}//end intersection
	
	public static void symetricDifference(MathApp mathx){
		
		System.out.print("Inserta el conjunto al que quieres hacerle simetria simetrica: ");
		String name=sc.nextLine();
		boolean found1 = mathx.findSet(name);
		if(found1){
			System.out.print("Inserta el conjunto con el que lo vas a hacer: ");
			String name2 = sc.nextLine();
			boolean found2=mathx.findSet(name2);
			if(found2){
				System.out.print("Inserta el nombre del nuevo conjunto que va a surgir: ");
				String newName = sc.nextLine();
				mathx.symetricDifference(name, name2, newName);
			}else{
				System.out.print("Imposible realizar operacion. Este conjunto no existe \n");
			}
		}else{
			System.out.print("Imposible realizar operacion. Este conjunto no existe \n");
		}
	}//end intersection
	
	public static void showInfoSet(MathApp mathx){
		
		System.out.print("Inserta el conjunto al que quieres ver: ");
		String name=sc.nextLine();
		boolean found1 = mathx.findSet(name);
		if(found1){
			String messagex=mathx.showInfoSet(name);
			System.out.print(messagex);
		}
	}
	
	public static void showInfoSets(MathApp mathx){
		String messagex="";
		for(int i=0;i<mathx.getAmount();i++){
			messagex=mathx.showInfoSets(i);
			System.out.print(messagex);
		}
	}
}