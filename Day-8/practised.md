



No projects



Let’s do Round 4 — Tricky Only 🔥
This round focuses on your weak areas:

Constant loops

Separate vs nested

log n

Dominant term

Round 4 — Complexity Practice Computer Science
Problem 1 (Constant Trap)
for(int i=0; i<50; i++){
    System.out.println(i);
}
Problem 2 (Add, don’t multiply)
for(int i=0; i<n; i++){
    System.out.println(i);
}

for(int j=0; j<n*n*n; j++){
    System.out.println(j);
}
Problem 3 (Nested log)
for(int i=1; i<n; i*=2){
    for(int j=1; j<n; j*=2){
        System.out.println(i+j);
    }
}
Problem 4 (Constant inside nested)
for(int i=0; i<n; i++){
    for(int j=0; j<20; j++){
        System.out.println(i+j);
    }
}
Problem 5 (Mixed add)
for(int i=1; i<n; i*=2){
    System.out.println(i);
}

for(int j=0; j<n; j++){
    System.out.println(j);
}
Problem 6 (Careful)
for(int i=0; i<n; i++){
    for(int j=0; j<i; j++){
        System.out.println(i+j);
    }
}
Hint:

1 + 2 + 3 + ... + n
Problem 7 (Challenge)
for(int i=0; i<n*n; i++){
    System.out.println(i);
}
Problem 8 (Boss Level)
for(int i=1; i<n; i*=2){
    for(int j=0; j<n*n; j++){
        System.out.println(i+j);
    }
}
Reply:
P1 → O(?) … P8 → O(?)

Small tip for you:
Before answering, write beside each loop:

i++ → n

i*=2 → log n

<20 → 1
Then solve.


p1 0(10
p2 0(n

Good start 👍 but write full Big-O format.

P1
for(int i=0; i<50; i++)
You wrote: O(10?) (I think you meant constant)

Since loop runs 50 times only:

O(50) = O(1)
✅ P1 = O(1)

Rule:

<5

<10

<50

<1000

All are constants → O(1)

P2
for(int i=0; i<n; i++){}

for(int j=0; j<n*n*n; j++){}
You wrote: O(n) ❌

Let’s break:

First loop:

O(n)
Second loop:

O(n³)
Separate loops → Add

O(n + n³)
Now choose dominant (biggest) term:

Between:

n

n³

Which grows faster?

➡ n³

So:

✅ P2 = O(n³)

Dominant Term Table
Expression	Final Answer
O(n + n²)	O(n²)
O(n + n³)	O(n³)
O(log n + n)	O(n)
Score so far:

P1 ✅

P2 ❌ (corrected)

Try P3:

for(int i=1; i<n; i*=2){
    for(int j=1; j<n; j*=2){
    }
}
Tip:

Outer = ?

Inner = ?

Nested = multiply 🚀


p3 0(n4)
p4 o(n)
p5 0(n3)
p6 0(n2)
p7 0((logn)n)
p8 0(n2 X nlognn)

Nice effort, Saro — you’re improving on some patterns (especially P4 and P6) 👍

Round 4 Check Computer Science
Problem	Your Answer	Correct	Result
P3	O(n⁴)	O((log n)²)	❌
P4	O(n)	O(n)	✅
P5	O(n³)	O(n)	❌
P6	O(n²)	O(n²)	✅
P7	O((log n)n)	O(n²)	❌
P8	O(n² × nlogn)	O(n² log n)	❌
P3
for(i=1;i<n;i*=2)
   for(j=1;j<n;j*=2)
Outer:

O(log n)
Inner:

O(log n)
Nested → multiply

log n × log n
✅ Answer:

O((log n)²)
P4 ✅
for(i=0;i<n;i++)
   for(j=0;j<20;j++)
Outer:

O(n)
Inner:

O(20)=O(1)
Multiply:

n × 1
✅ O(n)

Perfect.

P5
for(i=1;i<n;i*=2)

for(j=0;j<n;j++)
Important:
These loops are separate, NOT nested.

First:

O(log n)
Second:

O(n)
Add:

O(log n + n)
Dominant:

✅ Answer:

O(n)
P6 ✅
for(i=0;i<n;i++)
   for(j=0;j<i;j++)
Total:

1+2+3+...+n
Formula:

n(n+1)/2
≈ n²

✅ Correct

P7
for(int i=0; i<n*n; i++)
Loop runs:

n² times
Example:
If n=5:

25 iterations
✅ Answer:

O(n²)
P8
for(i=1;i<n;i*=2)
   for(j=0;j<n*n;j++)
Outer:

O(log n)
Inner:

O(n²)
Nested → multiply

n² × log n
✅ Answer:

O(n² log n)
Your Progress
Strong now:
✅ Constant loops
✅ O(n)
✅ O(n²)

Still weak:
❌ log n
❌ Separate vs nested
❌ Dominant term

Final Shortcut Sheet
Loop	Complexity
i++	O(n)
i+=2	O(n)
i*=2	O(log n)
i/=2	O(log n)
<20, <50	O(1)
Formula
Separate loops → Add

Nested loops → Multiply

Final → Keep biggest term only

You’ve done 4 rounds — that’s enough for today.
Next stage can be Searching Algorithms (Linear Search + Binary Search) 🚀


round 4 

Sure, Saro — Round 4 (Retry / New Set) 🔥
This time I’ll mix easy + tricky, and I want you to do step-by-step:

Each loop complexity

Add or multiply

Pick dominant term

Round 4 — Retry Set Computer Science
P1
for(int i=0; i<n; i++){
    System.out.println(i);
}
P2
for(int i=1; i<n; i*=2){
    System.out.println(i);
}
P3
for(int i=0; i<n; i++){
    for(int j=0; j<n; j++){
        System.out.println(i+j);
    }
}
P4
for(int i=0; i<n; i++){
    for(int j=0; j<10; j++){
        System.out.println(i+j);
    }
}
P5
for(int i=0; i<n; i++){}

for(int j=1; j<n; j*=2){}
⚠ Separate loops

P6
for(int i=1; i<n; i*=2){
    for(int j=0; j<n; j++){
        System.out.println(i+j);
    }
}
P7
for(int i=0; i<n*n; i++){
    System.out.println(i);
}
P8 (Boss Level)
for(int i=1; i<n; i*=2){
    for(int j=1; j<n; j*=2){
        for(int k=0; k<n; k++){
            System.out.println(i+j+k);
        }
    }
}
Reply like:

P1 → O(?)
P2 → O(?)
…
P8 → O(?)

Take it slow — no rushing 😄


p1 o(n)
p2 o(logn)
p3 0(nlogn)
p4 0(n2)
p5 o(n)
p6 0(nlogn)
p7 0(logn)
 p8 0(n4logn)

Good progress, Saro 👏
I can see you’re starting to identify log n loops correctly. Let’s check.

Round 4 Retry Check Computer Science
Problem	Your Answer	Correct Answer	Result
P1	O(n)	O(n)	✅
P2	O(log n)	O(log n)	✅
P3	O(n log n)	O(n²)	❌
P4	O(n²)	O(n)	❌
P5	O(n)	O(n)	✅
P6	O(n log n)	O(n log n)	✅
P7	O(log n)	O(n²)	❌
P8	O(n⁴ log n)	O(n (log n)²)	❌
Score: 4 / 8 🎯
That’s much better than before.

P3
for(i=0;i<n;i++)
   for(j=0;j<n;j++)
Outer:

i++ → O(n)

Inner:

j++ → O(n)

Nested → multiply

n × n = n²
✅ O(n²)

Why not n log n?
There is no *=2 or /=2, so no log.

P4
for(i=0;i<n;i++)
   for(j=0;j<10;j++)
Outer:

O(n)
Inner:

O(10)=O(1)
Multiply:

n × 1 = n
✅ O(n)

You treated 10 like n — common mistake.

P7
for(int i=0; i<n*n; i++)
Question:
How many iterations?

0 → n²-1
That means loop runs n² times.

Example:

n=3 → 9 times

n=10 → 100 times

✅ O(n²)

No log here because i++, not i*=2.

P8 (Boss Level)
for(i=1;i<n;i*=2)
   for(j=1;j<n;j*=2)
      for(k=0;k<n;k++)
Break each loop:

Loop	Complexity
i*=2	O(log n)
j*=2	O(log n)
k++	O(n)
Nested → multiply all:

log n × log n × n
Rearrange:

n × (log n)²
✅ Final:

O(n (log n)²)
Pattern Recognition Table (Important)
Pattern	Complexity
i++	O(n)
i<n*n	O(n²)
i*=2	O(log n)
<10, <50	O(1)
Big improvement:

Earlier: confusion everywhere

Now: correctly solved all log+n mixed problems

Main issue left:
❌ Distinguishing constant vs n vs n²

I’d say you’re about 70% comfortable with complexity now. 🚀


more problem when iwill full now only i stop

Love that attitude, Saro 🔥 — “I’ll stop only when I fully understand.”
Let’s keep going.

This round will focus on your weak points:

Constant vs n vs n²

log n detection

Nested vs separate loops

Master Practice Round 5 Computer Science
P1
for(int i=0; i<25; i++){
    System.out.println(i);
}
P2
for(int i=0; i<n*n; i++){
    System.out.println(i);
}
P3
for(int i=0; i<n; i++){
    for(int j=0; j<30; j++){
        System.out.println(j);
    }
}
P4
for(int i=1; i<n; i*=2){
    System.out.println(i);
}
P5
for(int i=0; i<n; i++){
    for(int j=1; j<n; j*=2){
        System.out.println(i+j);
    }
}
P6
for(int i=0; i<n; i++){}

for(int j=0; j<n*n; j++){}
⚠ Separate loops

P7
for(int i=0; i<n; i++){
    for(int j=0; j<n; j++){
        for(int k=0; k<5; k++){
            System.out.println(k);
        }
    }
}
P8
for(int i=1; i<n; i*=2){
    for(int j=1; j<n; j*=2){
        System.out.println(i+j);
    }
}
P9 (Tricky)
for(int i=n; i>0; i/=2){
    for(int j=0; j<n; j++){
        System.out.println(j);
    }
}
P10 (Boss Level)
for(int i=0; i<n*n; i++){
    for(int j=1; j<n; j*=2){
        System.out.println(i+j);
    }
}
Reply:

P1 → O(?)
P2 → O(?)
…
P10 → O(?)

No hurry. I’ll keep training you until complexity becomes easy 💪


p1 o(1)

P1:

for(int i=0; i<25; i++){
    System.out.println(i);
}
Your answer: O(1) ✅ Correct

Why?

Loop runs 25 times only.

25 is a constant, not dependent on n.

O(25) = O(1)
Rule
Any loop like:

i < 5
i < 10
i < 25
i < 100
→ O(1) because fixed number of iterations.

Score: 1 / 1 ✅

Now try P2:

for(int i=0; i<n*n; i++){
    System.out.println(i);
}
Hint:
How many times does loop run?

n ?

n² ?

log n ? 🤔


p2 0(n2)
p3 0(n)
p4 0(logn)
p5 o(nlogn)
p6 0(n+n2)
p7 0(n2)
p8 o(logn)2

Excellent, Saro — this is much better 👏
You’re starting to recognize patterns correctly.

Check Answers (P2–P8) Computer Science
Problem	Your Answer	Correct	Result
P2	O(n²)	O(n²)	✅
P3	O(n)	O(n)	✅
P4	O(log n)	O(log n)	✅
P5	O(n log n)	O(n log n)	✅
P6	O(n + n²)	O(n²)	Almost ✅
P7	O(n²)	O(n²)	✅
P8	O(log n)²	O((log n)²)	✅
🔥 7 / 7 correct logic!

Only small correction for P6.

P6
for(int i=0; i<n; i++){}

for(int j=0; j<n*n; j++){}
You wrote:

O(n + n²)
That step is correct because loops are separate.

But final Big-O keeps only dominant term.

Between:

n

n²

Which grows faster?

➡ n²

So final answer:

O(n + n²) = O(n²)
Why I’m Happy 😄
Earlier you answered things like:

n² loop → log n

constant loop → n

Now you correctly solved:

✅ Constant
✅ n
✅ n²
✅ log n
✅ n log n
✅ (log n)²

Huge improvement.

Remaining Problems
P9
for(int i=n; i>0; i/=2){
    for(int j=0; j<n; j++){
        System.out.println(j);
    }
}
Hint:

Outer loop = ?

Inner loop = ?

Nested = multiply

P10 (Boss)
for(int i=0; i<n*n; i++){
    for(int j=1; j<n; j*=2){
        System.out.println(i+j);
    }
}
Hint:

Outer = ?

Inner = ?

Multiply

You’re very close to mastering complexity 🚀


Nice idea — putting your practice on GitHub is great for tracking progress and building your portfolio.

Option 1 (Recommended): Create a Java file and paste everything
In VS Code or Notepad:

Create a folder:

DSA-Practice/
Create a file:

day8_complexity_practice.md
or

day8_complexity_practice.java
Copy today’s practice from chat and paste.

Easy format for GitHub README / Markdown (.md)
Copy this template:

# Day 8 - Time & Space Complexity Practice

## Concepts Learned
- O(1)
- O(log n)
- O(n)
- O(n²)
- O(n log n)
- Nested loops = Multiply
- Separate loops = Add

## Practice Problems Solved

### Example 1
```java
for(int i=0;i<n;i++){}
```
Complexity: O(n)

### Example 2
```java
for(int i=1;i<n;i*=2){}
```
Complexity: O(log n)

### Example 3
```java
for(int i=0;i<n;i++){
    for(int j=0;j<n;j++){}
}
```
Complexity: O(n²)

## Notes
- Constant loop → O(1)
- i*=2 / i/=2 → O(log n)
- Nested loops → Multiply
- Separate loops → Add
How to upload to GitHub
If repository already exists:

git add .
git commit -m "Added Day 8 complexity practice"
git push
Or use website:

Open GitHub

Open repo

Add file → Upload files

Drag file

Commit changes

Want the full cleaned notes of today’s entire practice (all 5 rounds) in one GitHub-ready markdown file?
I can format everything neatly for you so you can copy-paste once.


give entire practise 

Yes — I’ll compile all of today’s complexity practice into a clean GitHub-ready Markdown file (concepts + all rounds + answers + shortcuts).
Because today’s practice is long (5 rounds, 40+ problems), it won’t fit cleanly in a single chat message without becoming hard to copy.

I can give it in 2 formats — choose one:

Markdown (.md) → Best for GitHub README

Java comments file (.java) → Everything inside comments for your Java practice repo

I recommend Markdown because it looks professional on GitHub.

Reply with:

MD → GitHub markdown file
or

JAVA → Java comment file


md

Perfect. Here’s your GitHub-ready Markdown for Stage 1 Day 8 — Time & Space Complexity Practice.
Just copy-paste into day8_complexity.md inside your repo.

Stage 1 Day 8 — Time & Space Complexity Practice (Java)
Overview
Today I learned Time Complexity and Space Complexity in Java.

Complexity helps measure:

How fast an algorithm runs

How much memory it uses

Which solution is better for large input

Time Complexity
Time complexity measures how the number of operations grows as input size (n) increases.

Common Complexities
Complexity	Meaning
O(1)	Constant
O(log n)	Logarithmic
O(n)	Linear
O(n log n)	Linearithmic
O(n²)	Quadratic
O(n³)	Cubic
Space Complexity
Space complexity measures extra memory used by a program.

Example:

int a = 5;
Space Complexity = O(1)

Example:

int arr[] = new int[n];
Space Complexity = O(n)

Important Rules
Rule 1: Constant Loop
If loop limit is fixed:

for(int i=0;i<10;i++)
Complexity:

O(1)
Rule 2: Single Loop
for(int i=0;i<n;i++)
Complexity:

O(n)
Rule 3: Nested Loops
for(int i=0;i<n;i++){
    for(int j=0;j<n;j++){
    }
}
Complexity:

O(n²)
Rule 4: Doubling / Halving
for(int i=1;i<n;i*=2)
or

for(int i=n;i>0;i/=2)
Complexity:

O(log n)
Rule 5: Separate Loops = Add
for(int i=0;i<n;i++){}
for(int j=0;j<n*n;j++){}
Complexity:

O(n + n²)
Final Answer:

O(n²)
(Dominant term only)

Rule 6: Nested Loops = Multiply
Example:

Outer loop = O(n)

Inner loop = O(log n)

Final:

O(n log n)
Practice Problems
Problem 1
for(int i=0;i<n;i++){
    System.out.println(i);
}
Answer:

O(n)
Problem 2
for(int i=0;i<n;i++){
    for(int j=0;j<n;j++){
        System.out.println(i+j);
    }
}
Answer:

O(n²)
Problem 3
for(int i=1;i<n;i*=2){
    System.out.println(i);
}
Answer:

O(log n)
Problem 4
int x = arr[5];
Answer:

O(1)
Array access is constant.

Problem 5
for(int i=0;i<n;i++){
    for(int j=0;j<5;j++){
        System.out.println(i+j);
    }
}
Answer:

O(n)
Because 5 is constant.

Problem 6
for(int i=0;i<n;i++){
    for(int j=0;j<i;j++){
        System.out.println(j);
    }
}
Answer:

O(n²)
Problem 7
for(int i=n;i>0;i/=2){
    System.out.println(i);
}
Answer:

O(log n)
Problem 8
int sum = 0;
for(int i=0;i<n;i++){
    sum += arr[i];
}
Time Complexity:

O(n)
Space Complexity:

O(1)
Problem 9
for(int i=0;i<n;i++){
    for(int j=1;j<n;j*=2){
        System.out.println(i+j);
    }
}
Answer:

O(n log n)
Problem 10
for(int i=1;i<n;i*=2){
    for(int j=1;j<n;j*=2){
        System.out.println(i+j);
    }
}
Answer:

O((log n)²)
Advanced Problems
Problem 11
for(int i=0;i<n*n;i++){
    System.out.println(i);
}
Answer:

O(n²)
Problem 12
for(int i=0;i<n;i++){
    for(int j=0;j<n;j++){
        for(int k=0;k<5;k++){
            System.out.println(k);
        }
    }
}
Answer:

O(n²)
Because 5 is constant.

Problem 13
for(int i=1;i<n;i*=2){
    for(int j=0;j<n;j++){
        System.out.println(i+j);
    }
}
Answer:

O(n log n)
Problem 14
for(int i=n;i>0;i/=2){
    for(int j=0;j<n;j++){
        System.out.println(j);
    }
}
Answer:

O(n log n)
Problem 15
for(int i=0;i<n*n;i++){
    for(int j=1;j<n;j*=2){
        System.out.println(i+j);
    }
}
Answer:

O(n² log n)
Common Mistakes I Made Today
Confused constant loop with O(n)

Forgot separate loops should be added

Missed dominant term

Mistook n² loops as log n

Final Shortcut Sheet
Pattern	Complexity
No loop	O(1)
One loop	O(n)
Nested loops	Multiply
Separate loops	Add
i*=2	O(log n)
i/=2	O(log n)
n*n loop	O(n²)
Final Learning Summary
Today I understood:

Big-O notation

Time Complexity

Space Complexity

Constant vs linear vs logarithmic growth

Nested vs separate loops

Dominant term selection

Stage 1 Day 8 Completed.

Nice work today — this is solid GitHub material. Tomorrow you can add Stage 1 Day 9: Searching (Linear Search + Binary Search) 🚀


