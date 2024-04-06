import java.util.ArrayList;
	import java.util.List;

public class OutOfMemoryExample {

	

	    public static void main(String[] args) {
	        List<Object> list = new ArrayList<>();
	        
	        try {
	            while (true) {
	                list.add(new Object());
	            }
	        } catch (OutOfMemoryError e) {
	            System.out.println("Caught OutOfMemoryError: " + e.getMessage());
	            System.out.println("Number of elements added before OutOfMemoryError: " + list.size());
	        }
	    }
	}

