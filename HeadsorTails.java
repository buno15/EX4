import java.io.*;
import java.util.*;

public class HeadsorTails{
    public static void main(String args[]) throws IOException{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

	int round[]=new int[3];
	
	round[0]=(int)(Math.random()*2);
	round[1]=(int)(Math.random()*2);
	round[2]=(int)(Math.random()*2);

	System.out.println("Tossing a coin...");

	int head=0;
	int tail=0;
	for(int i=0;i<3;i++){
	    if(round[i]==0){
		head++;
		System.out.println("Round "+(i+1)+": Heads");
	    }else{
		tail++;
		System.out.println("Round "+(i+1)+": Tails");		
	    }
	}

	System.out.println("Heads: "+head+", Tails: "+tail);
	
	if(head>tail){
		System.out.println("You won");
	}else{
		System.out.println("You lost");
	}
    }
}
