package com.stringProg;

import java.util.LinkedHashSet;

public class OrderOfOccuranceOfEachNumberInArray {

	public static void main(String[] args) {
		int count =0;
		//int dupCount=0;
		
		int a[]= {4,1,1,2,0,0,2,2,4,4,4,9,5};
		
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
		for (int i = 0; i < a.length; i++) {
			set.add(a[i]);
			}
		
		for(int n : set){
			for(int i=0;i<a.length;i++) {
				if ( n==a[i]) {
					System.out.println("Order Of Occurance of " +n+ " is at "+(i+1)+ " Position ");
					break;
				}
									
			}
		}
	}
}

			
//			if (count==1){
//				System.out.println("Count of "+n+" = "+count); 	}
//			     dupCount++;		  
                  //count=0;


//			
//		}
//		System.out.println("Count of duplicate elements "+dupCount); 
//		}
//	}
//
//	}
//
//}
