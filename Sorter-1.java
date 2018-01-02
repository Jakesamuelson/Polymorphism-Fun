
public class Sorter {
	public Sorter(){}
	public static Employee [] sort(Employee[] a){
		char [] sorterHelp= new char[a.length];
		int k = 0;
		//filling the array sorterHelp with the chars of the first letters of each number
		for(Employee b: a){
			sorterHelp[k++] = b.getName().charAt(0);
		}
		k=0;
		int i,j;
		Employee temp;
		for (i = 0;  i < a.length - 1;  i++ ){
			
			for (j = i + 1;  j < a.length;  j++ ){
				//this if checks the next letters if the first letters are the same
				if(a[i].getName().charAt(k) == a[j].getName().charAt(k)){
					k++;
					if (a[i].getName().charAt(k) > a[j].getName().charAt(k)){
						temp = a [i];
						a [i] = a [j];   
						a [j] = temp;
					}
				}
				k=0;
				
				if (a[i].getName().charAt(k) > a[j].getName().charAt(k)){ // bubble sort
					temp = a [i];
					a [i] = a [j];   
					a [j] = temp;
				}
			}
		}
		
		
		return a;
	}
}