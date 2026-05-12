class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        int n = nums.size();
        int firstIndex=-1, secondIndex;
        for(int i=0; i<n-1; i++) {
            for(int j=i+1; j<n; j++) {
                if(nums[i]+nums[j] == target) {
                    firstIndex = i;
                    secondIndex = j;
                    break;
                }
            }
            if(firstIndex!=-1) {
                break;
            }
        }
        vector<int> ret;
        ret.push_back(firstIndex);
        ret.push_back(secondIndex);

        return ret;
    }
};