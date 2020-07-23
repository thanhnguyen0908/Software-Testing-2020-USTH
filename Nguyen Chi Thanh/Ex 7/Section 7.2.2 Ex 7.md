7. Answer questions a–d for the graph defined by the following sets:
• N = {1, 2, 3}
• N0 = {1}
• Nf = {3}
• E = {(1, 2), (1, 3), (2, 1), (2, 3), (3, 1)}
Also consider the following (candidate) paths:
• p1 = [1, 2, 3, 1]
• p2 = [1, 3, 1, 2, 3]
• p3 = [1, 2, 3, 1, 2, 1, 3]
• p4 = [2, 3, 1, 3]
• p5 = [1, 2, 3, 2, 3]

a) Which of the listed paths are test paths? For any path that is not a test path, explain
why not.

Answer: p2 and p3 are test paths. p1 does not terminate at a final node. p4 does not
start at an initial node. p5 includes an edge that does not exist in the graph (3, 2).

b) List the eight test requirements for Edge-Pair Coverage (only the length two subpaths).

Answer: The edge pairs are:
{ [1, 2, 1], [1, 2, 3], [1, 3, 1], [2, 1, 2], [2, 1, 3], [2, 3, 1], [3, 1, 2], [3, 1, 3] }

c) Does the set of test paths from part (a) above satisfy Edge-Pair Coverage? If not, state
what is missing.

Answer: No. Neither p2 nor p3 tours either of the following edge-pairs:
{ [2, 1, 2], [3, 1, 3] }
As discussed in (part a), the remaining candidate paths are not test paths.

d) Consider the prime path [3, 1, 3] and path p3. Does p3 tour the prime path directly?
With a sidetrip?

Answer: p3 does not directly tour the prime path. However, p3 does tour the prime path
with the sidetrip [1, 2, 1].
