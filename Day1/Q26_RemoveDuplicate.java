public class Q26_RemoveDuplicate{
    public int removeDuplicates(int[] arr) {
        int n = arr.length;
        int index = 0;
        for(int i = 1;i<n;i++){
            if(arr[i]!=arr[index]){
                arr[index+1] = arr[i];
                index++;
            }
        }
        return index+1;
    }
}