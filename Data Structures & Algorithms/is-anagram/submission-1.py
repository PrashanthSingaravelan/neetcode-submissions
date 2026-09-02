class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        charCount = {}

        for characters in s:
            charCount[characters] = charCount.get(characters, 0) + 1
        
        for characters in t:
            charCount[characters] = charCount.get(characters, 0) - 1

        if all(values == 0 for values in charCount.values()):
            return True
        else:
            return False
        