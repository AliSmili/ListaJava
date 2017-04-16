
public class QuickSort {

		public static void main(String[] args) {
		int array [] = {5,7,2,1,9,0,-4};
		
		 QuickSort(array,0,array.length-1);
		
		for(int i = 0 ; i < array.length ; i++){
			System.out.println(array[i] + ",");
		}
		
		}
		public static void QuickSort(int[] array, int p, int r)
		{
        if(p<r)
        {
            int q=partition(array,p,r);
            QuickSort(array,p,q);
            QuickSort(array,q+1,r);
        }
		}

		private static int partition(int[] array, int p, int r) {

        int x = array[p];
        int i = p-1 ;
        int j = r+1 ;

        while (true) {
            i++;
            while ( i< r && array[i] < x)
                i++;
            j--;
            while (j>p && array[j] > x)
                j--;

            if (i < j)
                swap(array, i, j);
            else
                return j;
        }
    }

		private static void swap(int[] array, int i, int j) {
			
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
