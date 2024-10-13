class Pair implements Comparable<Pair>{
    int index, occ;

    public Pair(){}

    public Pair(int index, int occ){
        setIndex(index);
        setOcc(occ);
    }

    public void setIndex(int idx){
        index = idx;
    }
    public void setOcc(int occ){
        this.occ = occ;
    }
    public int getIndex(){
        return index;
    }
    public int getOcc(){
        return occ;
    }

    @Override
    public int compareTo(Pair other){
        if(other.occ != this.occ){
            return Integer.compare(other.occ, this.occ);
        }
        return Integer.compare(other.index, this.index);
    }
}

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] count = new int[20001]; int[] res = new int[k]; int offset = 10000;
        Pair p = new Pair(); String name="";
        
        PriorityQueue<Pair> pq = new PriorityQueue<>();

        for(int i=0; i<nums.length; i++){
            count[nums[i]+offset]++;
        }

        for(int i=0; i<count.length; i++){
            if(count[i]!=0){
                p = new Pair(i-offset, count[i]);
                pq.offer(p);
            }
        }

        for(int i=0; i<k; i++){
            res[i] = pq.poll().getIndex();
        }

        return res;
    }
}