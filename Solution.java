package codility.array.cyclicrotation;

public class Solution {
	
	public int[] solution(int[] A, int K) {
		if(A == null || A.length ==0){
			return A;
		}
		int index=0;
		int length = A.length;
		if(A.length < K){
			K %=length;
		}
		if(K == 0){
			return A;
		}
		int[] shiftedArray = new int[length];
		for(int i=length-K; i<length; i++ ){
			shiftedArray[index++] = A[i];
		}
		for(int i = 0; i<length-K; i++){
			shiftedArray[index++] = A[i];
		}
        return shiftedArray;
    }
}
