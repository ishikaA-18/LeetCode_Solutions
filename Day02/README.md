# 🧠 DSA Practice — Day 2

---

## Problems Solved

### 1. 3Sum — LeetCode #15
- **Difficulty:** Medium
- **Topic:** Two Pointers + Sorting
- **Approach:** Sort the array, fix one element with an outer loop, then use two pointers (left & right) to find the remaining two elements that sum to zero. Skip duplicates to avoid repeated triplets.
- **Time Complexity:** O(n²)
- **Space Complexity:** O(1)

---

### 2. Two Sum II — LeetCode #167
- **Difficulty:** Medium
- **Topic:** Two Pointers
- **Approach:** Since the array is already sorted, use two pointers — one at the start (`i`) and one at the end (`j`). If sum equals target, return the 1-indexed positions. If sum is too big, move `j` left. If sum is too small, move `i` right.
- **Time Complexity:** O(n)
- **Space Complexity:** O(1)

---

## 💡 Key Learnings
- Sorting unlocks the two pointer technique for array problems
- Two pointers avoid the need for nested loops — brings O(n²) down to O(n)
- Always think: *if sum is too big → shrink from right, too small → grow from left*

---

## 🔗 Resources
- [Scaler Topics — DSA Problem Solving for Interviews using Java](https://scaler.com/topics/course/dsa-problem-solving-for-interviews-using-java/)
