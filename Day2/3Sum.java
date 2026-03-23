import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> threeSum(int[] a) {
        List<List<Integer>> result = new ArrayList<>();
        int n = a.length;
        Arrays.sort(a);
        
        for (int i = 0; i < n; i++) {
            if (i == 0 || a[i] != a[i - 1]) {
                int j = i + 1, k = n - 1;
                int tar = -a[i]; // target is 0, so tar = 0 - a[i]
                
                while (j < k) {
                    if (a[j] + a[k] == tar) {
                        result.add(Arrays.asList(a[i], a[j], a[k]));
                        while (j < k && a[j] == a[j + 1]) j++;
                        while (j < k && a[k] == a[k - 1]) k--;
                        j++;
                        k--;
                    } else if (a[j] + a[k] < tar) {
                        j++;
                    } else {
                        k--;
                    }
                }
            }
        }
        return result;
    }
}
