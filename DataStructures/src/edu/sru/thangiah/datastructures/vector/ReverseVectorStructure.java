package edu.sru.thangiah.datastructures.vector;

public class ReverseVectorStructure {
	private final int MAXSIZE = 100;
	private int arrayVal[];
	private int count;
	
	ReverseVectorStructure()
	{
		arrayVal = new int[MAXSIZE];
		count = MAXSIZE-1;     
	}
	
	public boolean isEmpty() {
		if (count == (MAXSIZE-1)) {
			return true;
		}
		return false;
	}

	public boolean isFull() {
		if (count == -1) {
			return true;
		}
		return false;
	}

	public boolean add(int value) {
		if (!this.isFull()) {
			arrayVal[count] = value;
			count--;
			return true;
		}
		return false;
	}

	public boolean remove() {
		if (!this.isEmpty()) {
			count++;
			return true;
		}
		return false;
	}
	
	int setAtIndex(int i, int value) {
		if (i >= 0 && i < this.MAXSIZE) {
			if (this.isEmpty()) // vector is empty
			{
				if (i == this.count)
				{
					this.add(value);
					return i;
				}
				else 
				{
					return -1;
				}
			} 
			else if (this.isFull()) // vector is full
			{
				return -1;
			} 
			else // vector is neither empty nor full
			{
				//shift everything from i onwards to the left by one
				for (int j=count; j < i; j++)
				{
					arrayVal[j]=arrayVal[j+1];
				}
				arrayVal[i]=value;
				count--;
				return i;
			}
		} 
		else { //outside the bounds of the array
			return -1;
		}
	}
	
	int removeAtIndex(int i) {
		int returnVal;
		if (i >= 0 && i < this.MAXSIZE) {
			if (this.isEmpty()) // vector is empty
			{
					return -1;
			} 
			else if (this.count+1 == i) // last one added
			{
				count++;
				returnVal = arrayVal[i];
				return returnVal;
			} 
			else // vector is neither empty nor full
			{
				returnVal = arrayVal[i];
				// shift everything down from top to i
				for (int j = i; j > count; j--) {
					arrayVal[j] = arrayVal[j-1];
				}
				count++;
				return returnVal;
			}
		} else { // outside the bounds of the array
			return -1;
		}
	}
	public static void main(String args[])
	{
		
		ReverseVectorStructure reverseVect = new ReverseVectorStructure();
		reverseVect.setAtIndex(58,100);
		reverseVect.setAtIndex(99,100);
		reverseVect.add(10);
		reverseVect.add(15);
		reverseVect.add(23);
		reverseVect.add(56);
		reverseVect.setAtIndex(96,101);
		reverseVect.setAtIndex(99,101);
		reverseVect.removeAtIndex(96);
		
		
		
	}
}
