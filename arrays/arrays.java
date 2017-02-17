/*
 * Operations with arrays
 * @author maesk
 */

public class arrays {
    
    public static void main(Strings[] args){
        double[] 
    }

    public static double [] invert (double [] arr){
		double [] res = new double [arr.length];
		for (int ii=0; ii<arr.length; ii++){
			res[ii]=arr[arr.length-1-ii];
		}
		return res;
	}
	public static double [] totallyRandomArray (){
		int elements = (int) (Math.random()*1000+1);
		int upper = (int) (Math.random()*1000+1);
		int lower = (int) (Math.random()*1000+1);
		//We reuse the previous method
		return randomArray(elements, upper, lower);
	}
}

