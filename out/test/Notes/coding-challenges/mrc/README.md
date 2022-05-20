# Coding Challenge

## Most Reccurring Integer

Given a string `s`, return the most recurring integer. If multiple integers have the same recurring count, return the
first most recurring integer.

<br>

**Note**: recurring vs reoccurring.

While they are very close in meaning, they are not the same. Something that is recurring happens over and over again,
possibly at regular intervals. In contrast, something that is reoccurring is simply happening again but not always
repeatedly.

**Example 1:**

<pre>
<b>Input:</b> s = "11222111"
<b>Output:</b> 2
<b>Explanation:</b> both '2' and '1' have a recurring count of 3, but '2' is the first most reccurring integer.
</pre>

**Example 2:**

<pre>
<b>Input:</b> s = "1223334444"
<b>Output:</b> 4
<b>Explanation:</b> 4 have the most recurring count (4).
</pre>

<br>

**Constraint**:

- `1 <= s.charAt(i) <= 9`

<br>

**MANDATORY**: Algorithm must be O(n).

