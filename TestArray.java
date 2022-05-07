package pkg1;

public class TestArray {

	public static void main(String[] args) {
		double[] myList = {1.9,2.5,3.4,3.5};
		double total = 0;
	for(int j=0;j<myList.length;j++)
	{

		total += myList[j];
	}
	
	System.out.println("total is:" + total);
	double max = myList[0];
	for(int i=0;i<myList.length;i++) 
	{
		if(myList[i]>max) max = myList[i];

    }
	System.out.println("max is:"+max);
}
	}
