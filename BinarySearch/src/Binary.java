
public class Binary {
	public static int[] sortedArray = new int[] {2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30};
	static int mid;
    public static void main(String[] args) {
        System.out.println(String.format("%s is present at index: %s",
                30, binarySearch(sortedArray, 2, 0, sortedArray.length - 1)));

    }

    public static int binarySearch(int[] sortedArray, int number, int min, int max) {
        if (min > max) {
            return -1;
        }
        while (min<=max){
         mid = (min + max )/ 2;
        if (sortedArray[mid] == number) {
            return mid;
        }
        if (sortedArray[mid] >number){
        	max=mid-1;
        }
        else
        {
        min=mid+1;	
        }
        
        }
        return -1;
    }


}
