public class Exercise001_RotateArray {
    public void solution1(int[] num, int k){
        if (k > num.length ){
            k = k % num.length;
        }

        //create an array auxiliary
        int [] rotate = new int[num.length];

        for (int i = 0; i < k; i++){
            rotate[i] = num[num.length - k + i];
        }

        int l = 0;
        for (int j = k; j < num.length; j++){
            rotate[j] = num[l];
            l++;
        }

        System.arraycopy(rotate,0,num,0, num.length);

        for (int f = 0; f < num.length; f++){
            System.out.print(num[f] + ", ");
        }

    }

    public void solution2(int[] array, int order){
        if (order < 0 || order > array.length){
            throw new IllegalArgumentException("Ilegal argument");
        }

        for (int i = 0; i < order; i++){
            for (int j = array.length - 1; j > 0; j--){
                int temporal = array[j];
                array[j] = array[j - 1];
                array[j - 1] = temporal;
            }
        }
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + ", ");
        }
    }

    public static void main(String[] args){
        //Solution #1
        Exercise001_RotateArray rotateArray = new Exercise001_RotateArray();
        int[] array = {1,2,3,4,5,6,7,8,9};
        rotateArray.solution1(array, 2);

        //Solution #2
        System.out.println("");
        rotateArray.solution2(array, 3);
    }
}
