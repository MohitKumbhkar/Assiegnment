public class Ineuron {

	 public static void main(String[] args) {
       int n=10;
		 for(int i=0; i<n; i++) {	  
				  
		  for(int k=0; k<n;k++) {
			  if(i==0 || k==(n-1)/2 || i==n-1) 
			  {
				  
				 System.out.print("*");
			  }
			  else 
			  {
				 System.out.print(" ") ;
			  }
		  }
		  
		  System.out.print("  ");
		  
		  for(int k=0; k<n;k++) {
			  if(k==0 ||  k==n-1 || i==k) 
			  {
				  
				 System.out.print("*");
			  }
			  else 
			  {
				 System.out.print(" ") ;
			  }
		  }
		  
            System.out.print("  ");
		  
		  for(int k=0; k<n;k++) {
			  if(k==0 || i==0 || i==(n-1)/2 || i==n-1) 
			  {
				  
				 System.out.print("*");
			  }
			  else 
			  {
				 System.out.print(" ") ;
			  }
		  }
		  
           System.out.print("  ");
		  
		  for(int k=0; k<n;k++) {
			  if(k==0 && i!=n-1|| k==n-1 && i!=n-1 || i==n-1 && k!=n-1 && k!=0)
			  {
				  
				 System.out.print("*");
			  }
			  else 
			  {
				 System.out.print(" ") ;
			  }
		  }
		  
		  System.out.print("  ");
		  
		  for(int k=0; k<n;k++) {
			  if(i==0 || k==0 || i==(n-1)/2 || k==n-1 && i<=(n-1)/2 || i-k==(n-1)/2)
			  {
				  
				 System.out.print("*");
			  }
			  else 
			  {
				 System.out.print(" ") ;
			  }
		  }
		  
		  
            System.out.print("  ");
		  
		  for(int k=0; k<n;k++) {
			  if(i==0 && k!=0 && k!=n-1 || k==n-1 && i!=0 && i!=n-1 || k==0 && i!=0 && i!=n-1 || i==n-1 && k!=0 && k!=n-1 )
			  {
				  
				 System.out.print("*");
			  }
			  else 
			  {
				 System.out.print(" ") ;
			  }
		  } 
		  
              System.out.print("  ");
		  
		  for(int k=0; k<n;k++) {
			  if(k==n-1 || k==0 || i==k)
			  {
				  
				 System.out.print("*");
			  }
			  else 
			  {
				 System.out.print(" ") ;
			  }
		  }
		  	  
	     System.out.println();

		 }
		
	}

}
