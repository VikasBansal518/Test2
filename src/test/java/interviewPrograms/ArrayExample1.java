package interviewPrograms;

public class ArrayExample1 {
	
	// when 2 array elements were added then sum should be equal to 20
	
	public static void main(String [] args) {
	
	int a[]= {9, 11, 4, 12, 5, 3};
	int b[]= {1, 6, 11, 17, 16, 12};
	
	System.out.println(a.length);
	
	System.out.println(b.length);
	
	for(int i=0;i<a.length;i++) {
		for(int j=0;j<b.length;j++) {
			if((a[i]+b[j])==20)
				System.out.println("("+a[i]+","+b[j]+")");
		}
	}
	
}
	

}
