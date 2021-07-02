import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;


public class RandomOptions {
		 
	 public static void main(String[] args)
	    {
	
	        List<Integer> list = new ArrayList<>();
	        list.add(5);
	        list.add(10);
	        list.add(15);
	        list.add(20);
	        list.add(25);

	        RandomOptions obj = new RandomOptions();
	        System.out.println(obj.getRandomElement(list));
	    }		
	
	    public int getRandomElement(List<Integer> list)
	    {
	        Random rand = new Random();
	        return list.get(rand.nextInt(list.size()));
	    }

	 
	
}

