1.
a) Draw the graph.
b) List all of the du-paths with respect to x. (Note: Include all-du-paths, even those that are subpaths of some other du-path).
c) Determine which du-paths each test path tours. Write them in a table with test paths
in the first column and the du-paths they cover in the second column. For this part of the exercise, you should consider both direct touring and sidetrips.
d) List a minimal test set that satisfies all defs coverage with respect to x. (Direct tours only.) Use the given test paths.
e) List a minimal test set that satisfies all uses coverage with respect to x. (Direct tours only.) Use the given test paths.
f) List a minimal test set that satisfies all-du-paths coverage with respect to x. (Direct tours only.) Use the given test paths.

Answer:
b) x has 5 du-paths, as enumerated below:
i  |[1, 2, 8]

ii |[1, 2, 3, 5, 6]

iii|[4, 3, 5, 6]

iv |[4, 3, 5, 7, 2, 8]

v  |[4, 3, 5, 6, 7, 2, 8]

c) The numbers in the table below correspond to the du-paths in the previous table. The
table indicates whether each test path tours each du-path with or without a sidetrip.
   |direct   |w/ sidetrip
   
t1 |i        |

t2 |         |i

t3 |ii       |i

t4 |iv	    |

t5 |iii, v   |

t6 |         |iii, iv, v

d) Either t1 or t3 can be used to directly tour a path that satisfies all-defs for the def at node 0, and either t4 or t5 can be used to
directly tour a path that satisfies all-defs for the def at node 3.
Possible answers: {t1, t4} or {t1, t5} or {t3, t4} or {t3, t5}

e)  {t1, t3, t5}

f ) {t1, t3, t4, t5}
