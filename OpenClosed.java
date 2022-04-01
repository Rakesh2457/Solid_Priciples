/**
 *SOLID Principles -
 * SOLID is an acronym for the five object-oriented design
 *
 * S - Single Responsibilty Priciple - A class should have one and only reason to change
 * O - Open Closed Principle         - Objects or Entities open for extension and closed for modification
 * L -
 * I -
 * D -
 */


/**
class ArrayUtil {
    public static void sort(int a[]){
        for (int i = 0 ; i < a.length ;i++){
            for (int j = i+1; j< a.length ; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp ;
                }
            }
        }
    }
}


public class OpenClosed {
    public static void main(String args[]){
        int arr[] = {1,5,4,2,3};
        ArrayUtil.sort(arr);
        System.out.println("Values in the array are ");
        for (int ele : arr){
            System.out.println(ele);
        }
    }
}

 */


interface  ValueComparator{
    /**
     * return +ve if value1 > value2
     * return -ve if value1 < value2
     * return 0   if value1 = value2
     */
    int compare(int value1, int value2);
}

class AscComparator implements ValueComparator{
    public int compare( int value1 , int value2){
        return value1 - value2;
    }
}


class DescComparator implements ValueComparator{
    public int compare( int value1 , int value2){
        return value2 - value1;
    }
}
class ArrayUtil {
    public static void sort(int a[] , ValueComparator comparator){
        for (int i = 0 ; i < a.length ;i++){
            for (int j = i+1; j< a.length ; j++) {
                if (comparator.compare(a[i] , a[j]) >0) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp ;
                }
            }
        }
    }
}


public class OpenClosed {
    public static void main(String args[]){
        int arr[] = {1,5,4,2,3};
        ArrayUtil.sort(arr , new DescComparator());
        System.out.println("Values in the array are ");
        for (int ele : arr){
            System.out.println(ele);
        }
    }
}