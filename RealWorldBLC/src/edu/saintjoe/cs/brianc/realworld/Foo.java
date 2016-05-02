package edu.saintjoe.cs.brianc.realworld;

public class Foo {
	private String name;
	private int height;
	private int weight;
	//created three data members for general information at the doctor, above 
	//foo is essentially a number of patients that a doctor sees
		// constructor below
	public Foo(String newName, int newHeight, int newWeight) {
			name = newName;
			height = newHeight;
			weight = newWeight;
		}
//The following is the accessors and mutators for this class FOO FOO stuff
		public void setName (String newName) {
			name = newName;
		}
		public String getName() {
			return name;
		}
		public void setHeight (int newHeight) {
			height = newHeight;
		}
		public int getHeight() {
			return height;
		}
		public void setWeight (int newWeight) {
			weight = newWeight;
		}
		public int getWeight() {
			return weight;
		}
		public String toString() {
			return ("Foo:" + name + "Height:" + height + "Weight:" + weight);
		}			
	}

