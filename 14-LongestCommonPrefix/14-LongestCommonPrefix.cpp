// Last updated: 04/07/2025, 02:19:19
class Solution {
public:
    string longestCommonPrefix(vector<string>& strs) {
        if (strs.empty()) {
            return "";
        }
    
        // Check if any string is empty
        for (const auto& s : strs) {
            if (s.empty()) {
                return "";
            }
        }
    
        // Find the minimum length of the strings
        auto minLenIt = std::min_element(strs.begin(), strs.end(),
            [](const std::string& a, const std::string& b) {
                return a.size() < b.size();
            });
        size_t minLen = minLenIt->size();
    
        std::string prefix = "";
    
        for (size_t i = 0; i < minLen; ++i) {
            char currentChar = strs[0][i];
            bool allSame = true;
    
            for (const auto& s : strs) {
                if (s[i] != currentChar) {
                    allSame = false;
                    break;
                }
            }
    
            if (allSame) {
                prefix += currentChar;
            } else {
                break;
            }
        }
    
        return prefix;
    }
};