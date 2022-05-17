package DAY16;

import java.util.Arrays;
import java.util.Comparator;

public class EX14 {

	public static void main(String[] args) {
		Integer nums[] = {10, 2, 8, 1, 5};
		
		System.out.println("���� �� �迭 : ");
		for(int i = 0; i<nums.length; i++) {
			System.out.println(nums[i] + " ");
		}
        System.out.println();
        
        Arrays.sort(nums, new Comparator<Integer>() {
        	
        	@Override
        	public int compare(Integer o1, Integer o2) {
        		return o2 - o1;
        	}
        	
        });
        
        System.out.println("���� �� �迭 : ");
        for(int i = 0; i<nums.length; i++) {
			System.out.println(nums[i] + " ");
		}
        System.out.println();
	}

}

