// Last updated: 04/07/2025, 02:19:24
func isPalindrome(x int) bool {
    if x < 0 {
        return false
    }
    reversed := 0
    temp := x
    for temp > 0{
        digit := temp % 10
        reversed = reversed *10+digit
        temp = temp / 10
    }

    return (reversed==x)
}