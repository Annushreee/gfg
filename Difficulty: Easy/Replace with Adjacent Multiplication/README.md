<h2><a href="https://www.geeksforgeeks.org/problems/replace-with-adjacent-multiplication/1?page=1&category=Arrays&difficulty=Easy&sortBy=latest">Replace with Adjacent Multiplication</a></h2><h3>Difficulty Level : Difficulty: Easy</h3><hr><div class="problems_problem_content__Xm_eO" style="--text-color: var(--problem-text-color);"><p><span style="font-size: 14pt;">Given an array <strong>arr[]</strong>, replace every element with the product of itself and its adjacent elements. </span></p>
<ul>
<li><span style="font-size: 14pt;">For index i: arr[i] = arr[i-1] * arr[i] * arr[i+1] </span></li>
<li><span style="font-size: 14pt;">Assume the previous element of the first element and the next element of the last element as 1.</span></li>
</ul>
<p><strong>Examples :</strong></p>
<pre><span style="font-size: 14pt;"><strong>Input:</strong> arr[] = [2, 4, 5]
<strong>Output:</strong> [8, 40, 20]
<strong>Explanation:</strong>
For index i = 0, arr[0] = 1 * arr[0] * arr[1] = 1 * 2 * 4 = 8
For index i = 1, arr[1] = arr[0] * arr[1] * arr[2] = 2 * 4 * 5 = 40
For index i = 2, arr[2] = arr[1] * arr[2] * 1 = 4 * 5 * 1 = 20
Thus, the updated array becomes [8, 40, 20].</span></pre>
<pre><span style="font-size: 14pt;"><strong style="font-size: 14pt;">Input: </strong><span style="font-size: 14pt;">arr[] = [2, 5, 7, 8, 3]</span><strong style="font-size: 14pt;"><br>Output: </strong><span style="font-size: 14pt;">[10, 70, 280, 168, 24]</span><strong style="font-size: 14pt;"><br>Explanation:<br></strong><span style="font-size: 18.6667px;">For index i = 0, arr[0] = 1 * arr[0] * arr[1] = 1 * 2 * 5 = 10
For index i = 1, arr[1] = arr[0] * arr[1] * arr[2] = 2 * 5 * 7 = 70
For index i = 2, arr[2] = arr[1] * arr[2] * arr[3] = 5 * 7 * 8 = 280
For index i = 3, arr[3] = arr[2] * arr[3] * arr[4] = 7 * 8 * 3 = 168
For index i = 4, arr[4] = arr[3] * arr[4] * 1 = 8 * 3 * 1 = 24<br>Thus, the updated array becomes [10, 70, 280, 168, 24].<br></span></span></pre>
<p><span style="font-size: 14pt;"><strong>Constraints:<br></strong>1 ≤ arr[i] ≤ 10<sup>3</sup><br>1 ≤ arr.size() ≤ 10<sup>5</sup></span></p></div><br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Arrays</code>&nbsp;