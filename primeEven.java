public class week6_2_3 { 
    
        static int even=0;
        static int prime=0;
    
    public static void main(String[] args) 
    { 
        int n=10000;
        
 
        Runnable runnable1=()->{ 
 
            for (int i = 1; i <= n; i++) 
        { 
            if(i%2==0) 
            even++;            
        } 
            
               System.out.println("Even nos:"+ even);  
        }; 
        
        
        Runnable runnable2=()->{ 
          
           for (int i = 1; i <= n; i++) 
        { 
             int count=0;
    	       for(int j=1;j<=i;j++)
    	        {
            	    if(i%j==0)
            	    {
            	        count++;        
            	    }
	            }
	    if(count==2)
	       prime++;        
        } 
            
             System.out.println("Prime nos:"+prime);
        }; 
        
        
            new Thread(runnable1).start(); 
            new Thread(runnable2).start(); 
        
    } }