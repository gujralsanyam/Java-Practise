//package ArrayDSAPractiseQuestion;
//import java.util.HashMap;
//import java.util.HashSet;
//import java.util.Set;
//
//public class Practise {
//
////    // TwoSum
//    class Solution{
//        public int[] twoSum(int [] nums, int target)
//        {
//            HashMap<Integer, Integer> map = new HashMap<>();
//       for(int i=0; i<nums.length; i++)
//       {
//           int diff = target - nums[i];
//           if(map.containsKey(diff))
//           {
//               return new int[](map.get(diff), i);
//           }
//           map.put(nums[i], i);
//       }
//       return null;
//        }
//    }
//
//    //  Best Time to buy and sell stock
//
//    class solution {
//        public int maxProfit(int [] prices)
//        {
//            int min = prices[0];
//            int profit =0;
//           for(int i=0; i<prices.length; i++)
//           {
//            if(prices[i] < min)
//            {
//                min = prices[i];
//            }
//            profit = Math.max(profit, prices[i]-min);
//          }
//          return profit;
//        }
//    }
//}
//// Contains Duplicate
//
//class Solution {
//    public boolean containsDuplicate(int[] nums)
//    {
//        //HashSet<Object> visited = new HashSet<>();
//        Set<Integer> visited = new HashSet<>();
//        for(int i=0; i<nums.length; i++)
//        {
//            if(visited.contains(nums[i])){
//                return true;
//            }
//            else{
//                visited.add(nums[i]);
//            }
//        }
//        return false;
//    }
//}
//
////// Contains Duplicate-2
//
//class Solution {
//    public boolean containsNearbyDuplicate(int[] nums, int k) {
//        Set<Integer> set = new HashSet<>();
//        for (int i = 0; i < nums.length; i++) {
//            if (set.contains(nums[i]))
//                return true;
//            set.add(nums[i]);
//            if (set.size() > k)
//                set.remove(nums[i - k]);
//        }
//        return false;
//    }
//}
//
////  Product Array Except Self
//
//class Solution{
//    public int[] productExceptSelf(int [] nums)
//    {
//        int [] result = new int[nums.length];
//        Array.fill(result,1);
//        int pre=1 , post=1;
//        for(int i=0; i<nums.length; i++)
//        {
//            result[i]=pre;
//            pre = nums[i]*pre;
//        }
//        for(int i = nums.length-1; i>=0; i--)
//        {
//            result[i] = result[i]*post;
//            post = post * nums[i];
//        }
//        return result;
//    }
//}
//
//
////// Maximum Subarray
//
//class Solution {
//    public int maxSubArray(int[] nums)
//    {
//        int currsum=0;
//        int maxsum = nums[0];
//
//        for(int i=0; i<nums.length; i++)
//        {
//            if(currsum < 0)
//            {
//                currsum =0;
//            }
//            currsum = nums[i]+currsum;
//            maxsum = Math.max(currsum,maxsum);
//        }
//        return maxsum;
//    }
//}
//
//
////// Maximum Product SubArray
//
//class Solution {
//    public  int maxProduct(int[] nums)
//    {
//        if(nums.length == 0)
//        {
//            return 0;
//        }
//        int min = nums[0];
//        int max= nums[0];
//        int result = max;
//
//        for(int i=1; i<nums.length; i++)
//        {
//            int cur = nums[i];
//            int temp = Math.max(cur, Math.min(max*cur, min*cur));
//             min = Math.min(cur, Math.min(min*cur, max*cur));
//             max = temp;
//             result = Math.max(result,max);
//        }
//        return result;
//    }
//}
//
////// Minimum in Rotated Sorted Array
//
//class Solution{
//    public:
//    // Function to find the minimum element in a rotated sorted array.
//   int findMin(vector<int>&nums)
//    {
//        int size = nums.size();
//        if(nums[0] <= nums[size-1]){
//            return nums[0];
//        }
//        int left = 0;
//        int right = nums.size-1;
//
//        while(left < right)
//        {
//            int mid = (left+ right)/2;
//
//            if(nums[0] <= nums[mid]) {
//                left = mid-1;
//            }
//            else{
//                right = mid+1;
//            }
//        }
//        return nums[left];
//    }
//};
////
////// Search in Rotated Sorted Array
//
//class Solution {
//    public int search(int [] nums, int target)
//    {
//        int left=0;
//        int right = nums.size()-1;
//
//        while(left <= right)
//        {
//            int mid = (left + right)/2;
//             if(nums[mid] == target)
//          {
//           return mid;
//          }
//           if(nums[left] <= nums[mid])
//           {
//               if(target < nums[left] || target > nums[mid])
//               {
//                   left = mid+1;
//               }
//           }
//           else {
//               right = mid-1;
//           }
//           else
//            {
//                if(target > nums[right] || target < nums[mid])
//                {
//                    right = mid-1;
//                }
//                else {
//                    left = mid+1;
//                }
//            }
//           return -1;
//        }
//    }
//}
//
//////  Two Sum :-> Input Array is Sorted
//class Solution {
//    public int[] twoSum(int[] numbers, int target)
//    {
//        int left=0;
//        int right = numbers.length-1;
//        while(left < right)
//        {
//         if(numbers[left] + numbers[right] > target)
//         {
//             right = right-1;
//         }
//         else if(numbers[left] + numbers[right] < target)
//         {
//            left = left+1;
//         }
//         else {
//             return new int[]{left+1, right+1};
//         }
//        }
//        return null;
//    }
//}
//
//
////// 3 Sum Problem
//
//class Solution {
//    public List<List<Integer>> threeSum(int[] nums) {
//
//        Arrays.sort(nums);
//        List<List<Integer>> result = new ArrayList<>();
//
//        for (int i = 0; i < nums.length && nums[i] <= 0; i++) {
//            if (i == 0 || nums[i] != nums[i - 1]) {
//                twoSum2(nums, i, result);
//            }
//        }
//        return result;
//    }
//
//    void twoSum2(int[] nums, int i, List<List<Integer>> result) {
//        int left = i + 1;
//        int right = nums.length - 1;
//        while (left < right) {
//            int sum = nums[i] + nums[left] + nums[right];
//
//            if (sum < 0) {
//                left++;
//            } else if (sum > 0) {
//                right--;
//            } else {
//                result.add(Arrays.asList(nums[i], nums[left++], nums[right--]));
//                while (left < right && nums[left] == nums[left - 1]) {
//                    ++left;
//                }
//            }
//        }
//    }
//}
//
//// Merge Sorted Array
//
//class Solution {
//    public void merge(int[] nums1, int m, int[] nums2, int n)
//    {
//        int midx= m-1;
//        int nidx= n-1;
//        int right = m+n-1;
//
//        while(nidx >=0)
//        {
//            if(midx >=0 && nums1[midx] >nums2[nidx])
//            {
//                nums1[right] = nums1[midx];
//                midx--;
//            }
//            else{
//                nums1[right] = nums2[nidx];
//                nidx--;
//            }
//            right--;
//        }
//
//    }
//}
//
//
//// Container with mostWater
//
//class Solution {
//    public int maxArea(int[] height)
//    {
//        int maxArea=0;
//        int left=0;
//        int right = height.length-1;
//
//        while(left<right)
//        {
//            maxArea = Math.max(maxArea,(right-left)*Math.min(height[left], height[right]));
//            if(height[left] < height[right])
//            {
//                left++;
//            }
//            else{
//                right--;
//            }
//        }
//        return maxArea;
//    }
//}
//
//
//// Next Permutations
//
//class Solution{
//
//    public void nextPermutation(int[] nums){
//        int i = nums.length-1;
//
//        while(i>=0 && nums[i+1] <= nums[i]){
//            i--;
//        }
//
//        if(i >=0){
//            int j = nums.length-1;
//            while(nums[j] <= nums[i]){
//                j--;
//            }
//            swap(nums, i,j);
//        }
//        reverse(nums, i+1);
//    }
//
//    public void swap(int[] nums, int i, int j)
//    {
//        int temp = nums[i];
//        nums[i]=nums[j];
//        nums[j]=temp;
//    }
//
//    public void reverse(int[] nums, int i)
//    {
//        int j=nums.length-1;
//        while(i<j)
//        {
//            swap(nums, j, i);
//            i++;
//            j--;
//        }
//    }
//}
//
////  Removed Duplicates from sorted array
//
//class Solution{
//    public int removeDuplicates(int[] nums)
//    {
//        int insertIndex=1;
//        for(int i=1; i < nums.length; i++)
//        {
//            if(nums[i]!=nums[i-1]) {
//                nums[insertIndex] = nums[i];
//                insertIndex++;
//            }
//        }
//        return insertIndex;
//    }
//}
//
//// Find First And Last Position of Element in Sorted Array
//class Solution {
//    public int[] searchRange(int[] nums, int target) {
//        int[] result = {-1, -1};
//        int left = binarySearch(nums, target, true);
//        int right = binarySearch(nums, target, false);
//        result[0] = left;
//        result[1] = right;
//        return result;
//    }
//
//    private int binarySearch(int[] nums, int target, boolean isSearchingLeft) {
//        int left = 0;
//        int right = nums.length - 1;
//        int idx = -1;
//
//        while (left <= right) {
//            int mid = left + (right - left) / 2;
//
//            if (nums[mid] > target) {
//                right = mid - 1;
//            } else if (nums[mid] < target) {
//                left = mid + 1;
//            } else {
//                idx = mid;
//                if (isSearchingLeft) {
//                    right = mid - 1;
//                } else {
//                    left = mid + 1;
//                }
//            }
//        }
//        return idx;
//    }
//}
//
//// Trapping Rainwater
//
//class Solution {
//    public int trap(int[] height) {
//        int left = 0, right = height.length - 1;
//        int leftMax = height[0], rightMax = height[height.length - 1];
//        int water = 0;
//        while (left < right) {
//            if (leftMax < rightMax) {
//                left++;
//                if (leftMax < height[left]) {
//                    leftMax = height[left];
//                } else {
//                    water += leftMax - height[left];
//                }
//            } else {
//                right--;
//                if (rightMax < height[right]) {
//                    rightMax = height[right];
//                } else {
//                    right--;
//                    if (rightMax < height[right]) {
//                        rightMax = height[right];
//                    } else {
//                        water += rightMax - height[right];
//                    }
//                }
//            }
//        }
//        return water;
//    }
//}
//
//
//
//
