
import java.util.*;

public class ArrayPrint {
	

	public static void minToFront(ArrayList<Integer> list) {
	       int minIndex = 0;
	       for(int i=1; i<list.size(); i++){

	           if(list.get(minIndex) > list.get(i))

	               minIndex = i;

	       }

	       int min = list.get(minIndex);
	       list.remove(minIndex);
	       list.add(0, min);

	}
	
	public static void filterRange(ArrayList<Integer> array, int min, int max) {

	    for (int i = 0; i < array.size(); i++) {
	        int num = array.get(i);
	        if (num <= max && num >= min) {
	            array.remove(i);
	            i--;
	        }
	    }
	    
	}
	
	public static ArrayList<Integer> intersect(ArrayList<Integer> list1, ArrayList<Integer> list2) {

        ArrayList<Integer> res = new ArrayList();

        for (int var : list1) {

            if(list2.contains(var))

                res.add(var);

        }

        return res;

    }

	   public static void main(String[] args) {

	      

	       ArrayList<Integer> list = new ArrayList<>();
	       list.add(2);

	       list.add(8);

	       list.add(10);

	       list.add(4);

	       list.add(6);

	       list.add(1);

	       list.add(7);

	    
	       System.out.println(list);
	       minToFront(list);
	       System.out.println(list);
	       
	       filterRange(list, 5, 7);
	       System.out.println(list);
	       
	       
	       ArrayList<Integer> L1 = new ArrayList<Integer>();
	       
	       L1.add(1);
	       L1.add(40);
	       L1.add(80);
	       L1.add(90);
	       L1.add(11);
	       L1.add(15);
	       L1.add(17);
	       L1.add(28);
	       L1.add(41);
	       L1.add(59);
	       
	       ArrayList<Integer> L2 = new ArrayList<Integer>();
	       
	       L2.add(4);
	       L2.add(1);
	       L2.add(12);
	       L2.add(11);
	       L2.add(10);
	       L2.add(2);
	       L2.add(3);
	       L2.add(8);
	       L2.add(7);
	       L2.add(9);
	       L2.add(5);
	       
	       System.out.println(intersect(L1, L2)) ;
	       

	   }

	
	    			
	    		}
	       

	        
	    

