package basicSelectionSort;

import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;

public class testSelectionSort
{
@Test
public void test()
{
//testPositive();
//testNegative();
//testMixed();
testDuplicates();
}

    public testSelectionSort()
    {
    }

    public void testPositive()
    {
     SelectionSort temp = new SelectionSort();

        int[] arr = new int[5];
        arr[0] = 9;
        arr[1] = 23;
        arr[2] = 100;
        arr[3] = 66;
        arr[4] = 77;

        int[] Sortedarr = new int[5];
        Sortedarr[0] = 9;
        Sortedarr[1] = 23;
        Sortedarr[2] = 66;
        Sortedarr[3] = 77;
        Sortedarr[4] = 100;

        arr = temp.basicSelectionSort(arr);
        assertArrayEquals(Sortedarr,temp.basicSelectionSort(arr));

       /** add tests to check for this unit test **/
    }

   public void testNegative()
    {
     SelectionSort temp = new SelectionSort();

        int[] arr = new int[5];
        arr[0] = -10;
        arr[1] = -60;
        arr[2] = -56;
        arr[3] = -62;
        arr[4] = -5;

        int[] Sortedarr = new int[5];
        Sortedarr[0] = -62;
        Sortedarr[1] = -60;
        Sortedarr[2] = -56;
        Sortedarr[3] = -10;
        Sortedarr[4] = -5;

        arr = temp.basicSelectionSort(arr);
        assertArrayEquals(Sortedarr,temp.basicSelectionSort(arr));
        /** Test data contains negative values only **/
    }

    public void testMixed()
        {
     SelectionSort temp = new SelectionSort();

        int[] arr = new int[5];
        arr[0] = 5;
        arr[1] = -6;
        arr[2] = -7;
        arr[3] = 20;
        arr[4] = 23;

       int[] Sortedarr = new int[5];
        Sortedarr[0] = -7;
        Sortedarr[1] = -6;
        Sortedarr[2] = 5;
        Sortedarr[3] = 20;
        Sortedarr[4] = 23;

       arr = temp.basicSelectionSort(arr);
        assertArrayEquals(Sortedarr,temp.basicSelectionSort(arr));
       /** Test data contains with both positive, negative and zeros **/
    }


   public void testDuplicates()
   {
    SelectionSort temp = new SelectionSort();

        int[] arr = new int[5];
        arr[0] = 5;
        arr[1] = 32;
        arr[2] = 32;
        arr[3] = -5;
        arr[4] = -5;

        int[] Sortedarr = new int[5];
        Sortedarr[0] = -5;
        Sortedarr[1] = -5;
        Sortedarr[2] = 5;
        Sortedarr[3] = 32;
        Sortedarr[4] = 32;

        arr = temp.basicSelectionSort(arr);
        assertArrayEquals(Sortedarr,temp.basicSelectionSort(arr));
        /** Test data contains duplicates **/
    }

}
