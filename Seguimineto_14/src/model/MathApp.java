package model;
import java.util.*;

public class MathApp{
	//Atrubutes
	private int amount;
	//Relatoion
	private ArrayList <IntegerSet> sets;
	
	public MathApp(){
		
		sets=new ArrayList <IntegerSet>();
		amount=0;
	}
	
	public void addSet(String name){
		
		boolean found=findSet(name);
		if(!found){
			IntegerSet ix= new IntegerSet(name);
			sets.add(ix);
			amount++;
		}
	}//end addSet
	
	public boolean findSet(String name){
		
		boolean found=false;
		for(int i=0;i<sets.size() && !found;i++){
			if(sets.get(i).getName().equals(name)){
				found=true;
			}
		}
		return found;
	}//end findSet
	
	public void removeSet(String name){
		
		boolean stop=false;
		for(int i=0;i<sets.size() && !stop;i++){
			if(sets.get(i).getName().equals(name)){
				stop=true;
				sets.remove(i);
			}
		}
		amount--;
		
	}//end removeSet
	
	public void addElementToSet(String name, int newNumber){
		
		boolean stop=false;
		for(int i=0;i<sets.size() && !stop;i++){
			if(sets.get(i).getName().equals(name)){
				stop=true;	
				sets.get(i).addElement(newNumber);
				
			}
		}
	}//end addElementToSet
	
	public void removeElement(String name, int newNumber){
		boolean stop=false;
		for(int i=0;i<sets.size() && !stop;i++){
			if(sets.get(i).getName().equals(name)){
				stop=true;	
				sets.get(i).removeElement(newNumber);
				
			}
		}
	}//end removeElementToSet
	
	public void union(String name, String name2, String newName){
		
		boolean found=false;
		boolean found2=false;
		
		for(int i=0;i<sets.size() && !found;i++){
			if(sets.get(i).getName().equals(name)){
				
				for(int j=0;j<sets.size() && !found2;j++){
					if(sets.get(j).getName().equals(name2)){
						found=true;
						found2=true;
						
						IntegerSet newIntegerSet=sets.get(i).union(sets.get(j), newName);
						sets.add(newIntegerSet);
						amount++;
					}
				}
				
			}
		}
		
	}//end intersection
	
	public void difference(String name, String name2, String newName){
		
		boolean found=false;
		boolean found2=false;
		
		for(int i=0;i<sets.size() && !found;i++){
			if(sets.get(i).getName().equals(name)){
				
				for(int j=0;j<sets.size() && !found2;j++){
					if(sets.get(j).getName().equals(name2)){
						found=true;
						found2=true;
						
						IntegerSet newIntegerSet=sets.get(i).difference(sets.get(j), newName);
						sets.add(newIntegerSet);
						amount++;
					}
				}
				
			}
		}
		
	}//end difference
	
	public void intersection(String name, String name2, String newName){
		
		boolean found=false;
		boolean found2=false;
		
		for(int i=0;i<sets.size() && !found;i++){
			if(sets.get(i).getName().equals(name)){
				
				for(int j=0;j<sets.size() && !found2;j++){
					if(sets.get(j).getName().equals(name2)){
						found=true;
						found2=true;
						
						IntegerSet newIntegerSet=sets.get(i).intersection(sets.get(j), newName);
						sets.add(newIntegerSet);
						amount++;
					}
				}
				
			}
		}
		
	}//end intersection
	
	public void symetricDifference(String name, String name2, String newName){
		
		boolean found=false;
		boolean found2=false;
		
		for(int i=0;i<sets.size() && !found;i++){
			if(sets.get(i).getName().equals(name)){
				
				for(int j=0;j<sets.size() && !found2;j++){
					if(sets.get(j).getName().equals(name2)){
						found=true;
						found2=true;
						
						IntegerSet newIntegerSet=sets.get(i).symetricDifference(sets.get(j), newName);
						sets.add(newIntegerSet);
						amount++;
					}
				}
				
			}
		}
		
	}//end intersection
	
	public String showInfoSet(String name){
		
		String messagex="";
		
		boolean found=false;
		for(int i=0;i<sets.size() && !found;i++){
			if(sets.get(i).getName().equals(name)){
				messagex=sets.get(i).showContents();
			}
		}
		return messagex;
	}
	
	public int getAmount(){
		return amount;
	}
	
	public String showInfoSets(int index){
		String messagex="";
		messagex=sets.get(index).showContents();
		return messagex;
	}
}