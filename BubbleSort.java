package Day62_AlgorithmsAndBigONotation;

public class BubbleSort {

        static void BubbleSort(int arr[]) {

            int N = arr.length;

            for(int i = 0; i < N - 1; i ++)
                for(int j = 0; j < N - i - 1; j++)
                    if(arr[j] > arr[j +1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
            }

        public static void main(String[] args) {
            int arr[] = {10, 1, 9, 2, 8, 3, 7, 4, 6, 5};

            System.out.println("Not sorted: ");

            for(int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }


            System.out.println("Bubble Sorted: ");

                BubbleSort(arr);

            for(int z = 0; z < arr.length; z++) {
                System.out.println(arr[z]);
            }

        }
}

