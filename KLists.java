import java.util.Arrays;

public class KLists {
    public double[] mergeKLists(double[][]outerarray){//function to put sorted values in to one list of doubles
        double [] solution = {};//make an array of doubles to store the final array
        int i =0;//setting i equal to 0
        while (i<outerarray.length) {//loop through the values in the outerarray
            solution = merge(solution, outerarray[i]);//call merge on the solution and the outerarray at i
            i++;//increment i
        }
        return solution;//returns the final array

    }
    public double[] merge(double[] l, double[] r){//merge function
        int j =0;//set int j to 0
        int left = 0;//set left index to 0
        int right= 0;//set right index to 0
        double[] solution = new double[l.length + r.length];//make a array to store the final sorted array

        while(left<l.length && right < r.length){//while loop to loop through the values while left and right index are less then right and left length
            if(l[left] <= r[right]){//if the left value is less then or equal to the right value
                solution[j] = l[left];//set solution at index j to equal the left value
                left++;//increment the left index value
            }
            else{//if right value is less then or equal to left value
                solution[j] = r[right];//set solution at index j to the right value
                right++;//increment the right index value
            }
            j++;//increment j
        }
        while(left< l.length){//while the left index is less than the left length
            solution[j] = l[left];//set solution at index j to the left value
            j++;//increment j
            left++;//increment left index value
        }
        while(right<r.length){//while the right index is less than the right length
            solution[j] = r[right];//set solution at index j to the right value
            j++;//increment j
            right++;//increment right index value
        }
        return solution;//return the solution with sorted array
    }

    public static void main(String[] args) {
        KLists k=new KLists();//making an object of the klist class

        double[][] outerarray1 ={{1.1,4,4, 5,5},{1.1, 3.3, 4.4}, {2.2, 6.6}};//setting the first outer array
        System.out.println("Arrays:");
        System.out.println(Arrays.deepToString(outerarray1));//print the first outer array
        System.out.println("Sorted array:");
        System.out.println(Arrays.toString(k.mergeKLists(outerarray1)));//calling the mergeklist function and printing the sorted list

        double[][] outerarray2 = {};//setting the second outer array
        System.out.println("Arrays:");
        System.out.println(Arrays.deepToString(outerarray2));//print the second outer array
        System.out.println("Sorted array:");
        System.out.println(Arrays.toString(k.mergeKLists(outerarray2)));//calling the mergeklist function and printing the sorted list

        double[][] outerarray3 = {{}};//setting the third outer array
        System.out.println("Arrays:");
        System.out.println(Arrays.deepToString(outerarray3));//print the third outer array
        System.out.println("Sorted array:");
        System.out.println(Arrays.toString(k.mergeKLists(outerarray3)));//calling the mergeklist function and printing the sorted list

        double[][] outerarray4= { {9.7, 17.1}, {15.8}, {12.7, 18.5, 21.27}};//setting the forth outer array
        System.out.println("Arrays:");
        System.out.println(Arrays.deepToString(outerarray4));//print the forth outer array
        System.out.println("Sorted array:");
        System.out.println(Arrays.toString(k.mergeKLists(outerarray4)));//calling the mergeklist function and printing the sorted list


    }
}
