package interviewPrograms;

public class ArrayExample2 {
	
	// when 2 array elements were added then sum should be equal to 20
	
	public static void main(String [] args) {
	
	int a[]= {9, 11, 4, 12, 5, 3, 7, 1, 10, 19};
	int b[]= {1, 6, 11, 17, 16, 12, 19, 10};
	
	for(int i=0, j=0;i<a.length & j<b.length;) {
		if((a[i]+b[j])==20) {
			System.out.println("("+a[i]+","+b[j]+")");
		}
		j++;
		if(j==b.length) {
			i++;
			j=0;
			
		}
	}
	
}
	

}
