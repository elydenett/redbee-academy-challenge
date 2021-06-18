package ejercicio;


import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

public class Test {
	
	public int SumTwoNumbers(int num_1, int num_2) {
		return num_1 + num_2;
	}
	
	public int SumArrayNumbers(List<Integer> list) {
		int result = 0;
		
		if(list.size() > 0) {
			for (Integer valor : list) {
				result = result + valor;
			}
		}
		
		return result;
	}
	
	public int CompareNumbers(int num_1, int num_2, int num_3) {
		int result = 0;
		if(num_1 > num_2) {
			if(num_1 > num_3){
				result = num_1;
			} else if(num_3 > num_2) {
				result = num_3;
			} else {
				result = num_2;
			} 
		} else {
			result = num_2;
		}
		
		return result;
	}
	
	public List<Integer> CompareArrayNumbers(List<Integer> list_1, List<Integer> list_2 ){
		List<Integer> resultIntegers = new ArrayList<>();
		resultIntegers.add(Collections.max(list_1));
		resultIntegers.add(Collections.max(list_2));
		return resultIntegers;
	}
  
}


