/* 
 * Arraycopy.java
 * @author mebs
 * @version 1.0
 */


public class Arraycopy {
    
    public static void main(String[] args) {
        int[] arrA = new int[3];
        arrA[0]=13;
        arrA[1]=21;
        arrA[2]=34;

        int[] arrB = arrA;
        arrA[0]=55;

        // the value arrA and arrB is the same because when they are printed the
        // value is updated.
        System.out.println(arrA[0]);
        System.out.println(arrB[0]);//55

        int[] arrC = new int[] {0,1,1,2,3,5,8};
        int[] arrD = new int[7];
        System.arraycopy(arrC,0, arrD, 0, 7);
        arrC[1]=3;
        
        System.out.println(arrC[0]);
        System.out.println(arrD[1]); //1
        // The array is copied and then modified, the changes does not apply to
        // previous copies.
        
    
    }

}
