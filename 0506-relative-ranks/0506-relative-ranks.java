
class Solution {
    static int binarysearch(int arr[],int left,int right,int target){
        int mid=(left+right)/2;
        if(arr[mid]==target) return mid;
        else if(arr[mid]>target) return binarysearch(arr,left,mid-1,target);
        else  return binarysearch(arr,mid+1,right,target);
    }
    public String[] findRelativeRanks(int[] score) {
        int[] temp=new int[score.length];
        for(int i=0;i<score.length;i++){
            temp[i]=score[i];
        }
        Arrays.sort(temp);
        String arr[]=new String[score.length];
        for(int i=0;i<score.length;i++){
            int temp1;
            temp1=(score.length-binarysearch(temp,0,score.length-1,score[i]));
            if(temp1>3) arr[i]=""+temp1;
            else if(temp1==1) arr[i]="Gold Medal";
            else if(temp1==2) arr[i]="Silver Medal";
            else arr[i]="Bronze Medal";
        }
        return arr;

    }
}