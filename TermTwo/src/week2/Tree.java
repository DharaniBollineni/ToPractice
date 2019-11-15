package week2;

import java.util.ArrayList;

public class Tree {
	private ArrayList<Tree> children = new ArrayList<>();
	private String treeName = "Tree";
	public Tree(String t) {
		this.treeName=t;
	}	
	
	public void addChild(Tree t) {
		children.add(t);
		
	}
	
	public ArrayList<Tree> getChildren() {
		return children;
	}
	
	public String toString() 
	{
		return treeName;
	}
}
