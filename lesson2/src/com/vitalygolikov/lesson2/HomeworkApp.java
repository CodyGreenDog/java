package com.vitalygolikov.lesson2;

public class HomeworkApp {

    public static void main(String[] args)
    {
        //Exercise 1
        System.out.println("Exercise 1\nInvert binary array");

        int[] binArray = {0, 1, 1, 1, 0, 0, 1, 1, 0, 1, 0, 0, 0, 1};

        printArray(binArray);
        invertBinArray(binArray);
        printArray(binArray);
        System.out.println();

        //Exercise 2
        System.out.println("Exercise 2\nFill an array with multiple of three");
        int[] emptyArray = new int[8];
        fillArrayMulThree(emptyArray);
        printArray(emptyArray);
        System.out.println();

        //Exercise 3
        int[] randomArray = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("Exercise 3\nDouble elements which less than 6");
        printArray(randomArray);
        doubleArrElementsLess6(randomArray);
        printArray(randomArray);
        System.out.println();

        //Exercise 4
        System.out.println("Exercise 4\nFill diagonal elements with 1");
        int[][] twoDimArray = new int[5][5];
        fillDiagElementsWith1(twoDimArray);
        print2dArray( twoDimArray );
        System.out.println();

        //Exercise 5
        System.out.println("Exercise 5**\nPrint min and max in 1d array");
        System.out.println("Array");
        printArray(randomArray);
        System.out.println("Sorted array");
        printMinMax(randomArray);
        printArray(randomArray);
        System.out.println();


        //Exercise 6
        System.out.println("Exercise 6**\nSum of left part equals sum of right part");
        int[] arrReflect = {1, 2, 3, 4, 4, 3, 2, 1};
        printArray(arrReflect);
        boolean isSumEquals = isSumLeftEqRight(arrReflect);
        System.out.println("Result is " + isSumEquals);

        int[] arrSeq = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        printArray(arrSeq);
        isSumEquals = isSumLeftEqRight(arrSeq);
        System.out.println("Result is " + isSumEquals);

        int[] arr0 = {2, 2, 2, 2, 2, 10};
        printArray(arr0);
        isSumEquals = isSumLeftEqRight(arr0);
        System.out.println("Result is " + isSumEquals);

        int[] arr1 = {10, 2, 2, 2, 2, 2};
        printArray(arr1);
        isSumEquals = isSumLeftEqRight(arr1);
        System.out.println("Result is " + isSumEquals + "\n");

        //Exercise 7
        System.out.println("Exercise 7****\nShift array");
        printArray(randomArray);

        System.out.println("Step = 1");
        shiftArray(randomArray, 1);
        printArray(randomArray);

        System.out.println("Step = 2");
        shiftArray(randomArray, 2);
        printArray(randomArray);

        System.out.println("Step = -1");
        shiftArray(randomArray, -1);
        printArray(randomArray);

        System.out.println("Step = -2");
        shiftArray(randomArray, -2);
        printArray(randomArray);

    }

    //Exercise 1
    //=============================================================
    static void invertBinArray(int[] arr)
    {
        int size = arr.length;
        for(int i = 0; i < size; i++)
        {
            arr[i] = arr[i] == 0 ? 1 : 0;
        }
    }

    //Exercise 2
    //============================================================
    static void fillArrayMulThree(int[] arr)
    {
        int size = arr.length;
        for(int i = 0; i < size; i++)
        {
            arr[i] = i*3;
        }
    }

    //Exercise 3
    //=============================================================
    static void doubleArrElementsLess6(int[] arr)
    {
        int size = arr.length;
        for(int i = 0; i < size; i++)
        {
            if(arr[i] < 6)
            {
                arr[i] *= 2;
            }
        }
    }

    //Exercise 4
    //===================================================================
    static void fillDiagElementsWith1(int[][] arr)
    {
        int j_size = arr.length;

        for(int j = 0; j < j_size; j++)
        {
            int i_size = arr[j].length;
            arr[j][j] = arr[j][ i_size - 1 - j ] = 1;
        }

    }


    //Exercise 5
    //===================================================================
    static void kernelSort(int[] arr, int start, int size)
    {
        for(int u = start + 1; u < size; u++)
        {
            if( arr[start] > arr[u] )
            {
                int tmp = arr[start];
                arr[start] = arr[u];
                arr[u] = tmp;
            }
        }

    }

    static void sort(int[] arr, int size)
    {

        for(int i = 0; i < size - 1; i++)
        {
            kernelSort(arr, i, size);
        }
    }

    static void printMinMax(int[] arr)
    {
        int size = arr.length;
        sort(arr, size);
        System.out.println( "Min = " + arr[0] + ", max = " + arr[size - 1] );
    }

    //Exercise 6
    //========================================================================
    static int calculateSum(int[] arr, int start, int end)
    {
        int sum = 0;
        for(int i = start; i < end; i++ )
        {
            sum += arr[i];
        }
        return sum;
    }

    static boolean isSumEquals(int[] arr, int start, int size)
    {
        int sumLeft = calculateSum(arr, 0, start);
        int sumRight = calculateSum(arr, start, size);
        return sumLeft == sumRight;
    }
    static boolean isSumLeftEqRight(int[] arr)
    {
        boolean flagEquals = false;
        int size = arr.length;
        for(int i = 0; i < size; i++)
        {
            flagEquals = isSumEquals(arr, i + 1, size);
            if(flagEquals)
            {
                break;
            }
        }

        return flagEquals;
    }

    //Exercise 7
    static void singleShift(int[] arr, boolean isDirect, int size)
    {
        int tmp = arr[size - 1];
        int start = size - 2;
        int end = -1;
        int step = 1;
        int idx = 0;

        if(!isDirect)
        {
            tmp = arr[0];
            start = 1;
            end = size;
            step = -1;
            idx = size - 1;
        }

        for(int i = start; i != end; i -= step )
        {
            arr[i + step] = arr[i];
        }
        arr[idx] = tmp;
    }

    static void shiftArray(int[] arr, int steps)
    {
        int size = arr.length;
        boolean isDirect = steps > 0;
        if(steps < 0){ steps *= -1;}

        for(int i = 0; i < steps; i++)
        {
            singleShift(arr, isDirect, size);
        }
    }

    //Utills
    //========================================================================
    static void printArray(int[] arr)
    {
        int size = arr.length;
        for(int i = 0; i < size; i++ )
        {
            System.out.print( arr[i] + " " );
        }
        System.out.println( );
    }

    static void print2dArray(int[][] arr)
    {
        int j_size = arr.length;
        for(int j = 0; j < j_size; j++)
        {
            printArray( arr[j] );
        }
    }

}
