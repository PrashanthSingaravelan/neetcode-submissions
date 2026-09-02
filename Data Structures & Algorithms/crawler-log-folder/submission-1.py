class Solution:
    def minOperations(self, logs: List[str]) -> int:
        stack = []

        for element in logs:
            if element == "../":
                if stack:
                    stack.pop()
            else:
                if element != "./":
                    stack.append(element)

        return len(stack)