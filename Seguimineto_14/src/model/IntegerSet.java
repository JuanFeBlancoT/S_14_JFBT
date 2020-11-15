package model;
import java.util.*;

public class IntegerSet{
	//Atributes
	private String name;
	private int cardinality;
	private ArrayList <Integer> elements;
	
	public IntegerSet(String name){
		this.name=name;
		cardinality=0;
		elements=new ArrayList <Integer>();
	}
	
	public String getName(){
		return name;
	}
	
	public int getCardinality(){
		return cardinality;
	}
	
	public boolean findElement(int newNumber){
		boolean found = false;
		for(int i=0;i<elements.size() && !found;i++){
			if(elements.get(i)==newNumber){
							
				found=true;				
			}
		}
		return found;
	}
	public ArrayList <Integer> getElements(){
		return elements;
	}
	
	public void addElement(int element){
		
		
		boolean found=findElement(element);
		if(!found){
			elements.add(element);
			cardinality++;
		}
		
		
	}
	
	public void  removeElement(int element){
		
		
		boolean found=findElement(element);
		boolean stop = false;
		if(found){
			for(int i=0;i<elements.size() && !stop;i++){
				stop = true;
				elements.remove(i);	
				cardinality--;
			}
		}
			//elements.remove(element);
		
		
	}//end removeElement
	
	public IntegerSet union(IntegerSet set, String newName){
		
		IntegerSet newSet = new IntegerSet(newName);
		
		boolean stop = false;
		for(int i=0;i<elements.size();i++){
			
			newSet.elements.add(elements.get(i));
		}
		
		for(int j=0;j<set.elements.size();j++){
			for(int y=0;y<elements.size() && !stop;y++){
				
				if(set.elements.get(j)==newSet.elements.get(y)){
					stop=true;
				}
				if(stop==false){
					newSet.elements.add(set.elements.get(j));
				}
			}
		}
		newSet.setCardinality(newSet.elements.size());
		return newSet;
		
	}//end union
	
	public void setCardinality(int cardinality){
		this.cardinality=cardinality;
	}
	
	public IntegerSet difference(IntegerSet set, String newName){
		
		
		boolean stop=false;
		IntegerSet newSet = new IntegerSet(newName);
		
		for(int i=0;i<elements.size();i++){
			for(int j=0;j<set.elements.size() && !stop;j++){
				if(elements.get(i)==set.elements.get(j)){
					stop=true;
				}
				if(stop==false){
					newSet.elements.add(elements.get(i));
				}
			}
			stop=false;
		}

		newSet.setCardinality(newSet.elements.size());
		return newSet;
	}//end difference
	
	public IntegerSet intersection(IntegerSet set, String newName){
		
		IntegerSet newSet = new IntegerSet(newName);
		
		boolean stop2 = false;
		for(int i=0;i<elements.size();i++){
			for(int j=0;j<set.elements.size() && !stop2;j++){
			
				if(elements.get(i)==set.elements.get(j)){
					stop2=true;
					newSet.elements.add(elements.get(i));
				}
			}
			stop2=false;
		}
		newSet.setCardinality(newSet.elements.size());
		return newSet;
	}//end union
	
	public IntegerSet symetricDifference(IntegerSet set, String newName){
		
		IntegerSet newSet = new IntegerSet(newName);
		
		boolean stop2 = false;
		for(int i=0;i<elements.size();i++){
			for(int j=0;j<set.elements.size() && !stop2;j++){
				
				if(elements.get(i)==set.elements.get(j)){
					stop2=true;
				}
			}
			if(stop2==false){
				newSet.elements.add(elements.get(i));
			}
			stop2=false;
		}
		
		boolean stop = false;
		for(int i2=0;i2<set.elements.size();i2++){
			for(int j2=0;j2<elements.size() && !stop;j2++){
								
				if(set.elements.get(i2)==elements.get(j2)){
					stop=true;
				}
			}
			if(stop==false){
				newSet.elements.add(set.elements.get(i2));
			}
			stop2=false;
		}
		
		

		newSet.setCardinality(newSet.elements.size());
		return newSet;
	}//end symetricDifference
	
	public String showContents(){
		String message="Name:"+getName()+". ";
		for(int i=0;i<elements.size();i++){
			message+=elements.get(i)+", ";
		}
		message+="\n";
		return message;
	}
	
}