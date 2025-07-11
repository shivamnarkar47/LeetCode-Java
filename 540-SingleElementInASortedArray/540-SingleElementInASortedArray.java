// Last updated: 12/07/2025, 01:45:16
class Solution {
    public int singleNonDuplicate(int[] arr) {
        int n = arr.length;
        if (n == 1)
            return arr[0];
        if (arr[0] != arr[1])
            return arr[0];
        if (arr[n - 1] != arr[n - 2])
            return arr[n-1];
        int low = 1;
        int high = n - 2;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] != arr[mid - 1] && arr[mid] != arr[mid + 1]) {
                return arr[mid];
            } else if ((mid % 2 == 1 && arr[mid] != arr[mid - 1]) || (mid % 2 == 0 && arr[mid] != arr[mid + 1]) ) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }

        }

        return -1;

    }
}