# 🧠 DSA Practice — Day 3

## 📅 Date: March 28, 2026

---

## Problems Solved

### 1. Add Digits — LeetCode #258
- **Difficulty:** Easy
- **Topic:** Math / Digital Root
- **Approach:** Repeatedly sum the digits of a number until a single digit remains.
- **Time Complexity:** O(1)
- **Space Complexity:** O(1)

---

### 2. Find Lucky Integer in an Array — LeetCode #1394
- **Difficulty:** Easy
- **Topic:** Arrays / Frequency Count
- **Approach:** Count frequency of each element, return the largest element whose 
  value equals its frequency. Return -1 if none found.
- **Time Complexity:** O(n)
- **Space Complexity:** O(n)

---

### 3. Form Smallest Number From Two Digits Array — LeetCode #2605
- **Difficulty:** Easy
- **Topic:** Arrays / Greedy
- **Approach:** Find common digits between the two arrays first — 
  if a common digit exists, the smallest one is the answer. 
  Otherwise, combine the smallest digit from each array.
- **Time Complexity:** O(n²)
- **Space Complexity:** O(1)

---

### 4. Perfect Number — LeetCode #507
- **Difficulty:** Easy
- **Topic:** Math
- **Approach (Brute force):** Iterate from 1 to n-1, sum all divisors, check if equal to n.
- **Approach (Optimised):** Iterate only up to √n, add both divisor and quotient 
  at once — significantly faster.
- **Time Complexity:** O(√n) for optimised
- **Space Complexity:** O(1)

---

## 💡 Key Learnings
- Always think if a brute force solution can be optimised — Perfect Number 
  shows how √n iteration beats full iteration
- For "smallest number" type problems, check for common elements first
- Frequency maps are powerful for problems where value = count

---
