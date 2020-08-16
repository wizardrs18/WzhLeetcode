from typing import List


class RearrangeTheArray:
    def shuffle(self, nums: List[int], n: int):
        list1 = nums[:n]
        list2 = nums[n:]
        list3 = []
        i = 0
        for i in range(0, n):
            list3.append(list1[i])
            list3.append(list2[i])
        return list3
