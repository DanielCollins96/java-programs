class InsertPosition {

    public static void main(String[] args){
        int[] vals = {0,2,3,5,6,43};

        InsertPosition ip = new InsertPosition();
        System.out.println(ip.searchInsert(vals, 3));
    }
    
    public int searchInsert(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++)
            if (target <= nums[i]) return i;
        return nums.length;

    }
}