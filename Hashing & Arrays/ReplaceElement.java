class Solution {
    public int[] replaceElements(int[] arr) {
        int length=arr.length, temp, k=0, i=length-1;
        temp=arr[length-1];
        arr[length-1] = -1;
        for(; i>0; i--){
            if(temp>arr[i]){
                k=arr[i-1];
                arr[i-1]=temp;
                temp=k;
            }else{
                temp=arr[i-1];
                arr[i-1]=arr[i]; 
            }
        }
        return arr;
    }
}