1.
b) List all the call sites.

Answer:
The call sites are:

i. Line 62, Watch::constructor() → Time:constructor()

ii. Line 63, Watch::constructor() → Time:constructor()

iii. Line 64, Watch::constructor() → Time:constructor()

iv. Line 69, Watch::toString() → Time:toString()

v. Line 70, Watch::toString() → Time:toString()

vi. Line 70, Watch::toString() → Time:toString()

vii. Line 82, Watch::doTransition() → Time:changeTime()

viii. Line 88, Watch::doTransition() → Time:changeTime()

ix. Line 94, Watch::doTransition() → Time:changeTime()

c) List all coupling du-pairs for each call site.

Answer:
i. Call sites i, ii, and iii are implicit within the constructor for Watch. Since Time
does not have a constructor defined, the default constructor is called (by Java’s rules, that means the default values are assigned to the instance variales, that is, hour and minute both get the value 0).

ii. Call sites iv, v, and vi are from Watch’s toString() method to Time’s toString method. The Time objects are passed in, and a string is returned. Time’s toString() method does not refer to the object explicitly, so we use “instance” for the variable name. The six du-pairs are:

A. (Watch::toString(), watch, 69) → (Time::toString(), instance, 55)

B. (Watch::toString(), stopwatch, 70) → (Time::toString(), instance, 55)

C. (Watch::toString(), alarm, 71) → (Time::toString(), instance, 55)

D. (Time::toString(), String, 55) → (Watch::toString(), String, 69)

E. (Time::toString(), String, 55) → (Watch::toString(), String, 70)

F. (Time::toString(), String, 55) → (Watch::toString(), String, 71)

iii. Call sites vii, viii, and ix are from Watch’s doTransition() to Time’s changeTime(). The parameter button is implicitly defined at line 74 (entrance to the method), and the Time objects are defined within changeTime(). The first three coupling du-pairs have the same line numbers for the last-defs and first-uses, so are annoted with the call site number. Because of the complex logic in changeTime(), it contains six last-defs of its instance variable (assignments to minute and hour), resulting in 18 coupling du-pairs for values returned to doTransition().

A. Call site vii: (Watch::doTransition(), button, 74) → (Time::changeTime(), 29)

B. Call site viii: (Watch::doTransition(), button, 74) → (Time::changeTime(), 29)

C. Call site vix: (Watch::doTransition(), button, 74) → (Time::changeTime(), 29)

D. (Time::changeTime(), instance, 31) → (Watch::doTransition(), watch, 82)

E. (Time::changeTime(), instance, 35) → (Watch::doTransition(), watch, 82)

F. (Time::changeTime(), instance, 37) → (Watch::doTransition(), watch, 82)

G. (Time::changeTime(), instance, 42) → (Watch::doTransition(), watch, 82)

H. (Time::changeTime(), instance, 46) → (Watch::doTransition(), watch, 82)

I. (Time::changeTime(), instance, 48) → (Watch::doTransition(), watch, 82)

J. (Time::changeTime(), instance, 31) → (Watch::doTransition(), stopwatch, 88)

K. (Time::changeTime(), instance, 35) → (Watch::doTransition(), stopwatch, 88)

L. (Time::changeTime(), instance, 37) → (Watch::doTransition(), stopwatch, 88)

M. (Time::changeTime(), instance, 42) → (Watch::doTransition(), stopwatch, 88)

N. (Time::changeTime(), instance, 46) → (Watch::doTransition(), stopwatch, 88)

O. (Time::changeTime(), instance, 48) → (Watch::doTransition(), stopwatch, 88)

P. (Time::changeTime(), instance, 31) → (Watch::doTransition(), alarm, 94)

Q. (Time::changeTime(), instance, 35) → (Watch::doTransition(), alarm, 94)

R. (Time::changeTime(), instance, 37) → (Watch::doTransition(), alarm, 94)

S. (Time::changeTime(), instance, 42) → (Watch::doTransition(), alarm, 94)

T. (Time::changeTime(), instance, 46) → (Watch::doTransition(), alarm, 94)

U. (Time::changeTime(), instance, 48) → (Watch::doTransition(), alarm, 94)

d) Create test data to satisfy All-Coupling-Use Coverage for Watch.

Answer:

i. t1: mode = TIME, button = UP

ii. t2: mode = TIME, button = UP, UP, ..., UP 60 times (we abbreviate this as UP60)

iii. t3: mode = TIME, button = UP1440

iv. t4: mode = TIME, button = DOWN

v. t5: mode = TIME, button = DOW N60

vi. t6: mode = TIME, button = DOW N1440

vii. t7: mode = STOPWATCH, button = UP

viii. t8: mode = STOPWATCH, button = UP60

ix. t9: mode = STOPWATCH, button = UP1440

x. t10: mode = STOPWATCH, button = DOWN

xi. t11: mode = STOPWATCH, button = DOWN60

xii. t12: mode = STOPWATCH, button = DOWN1440

xiii. t13: mode = ALARM, button = UP

xiv. t14: mode = ALARM, button = UP60

xv. t15: mode = ALARM, button = UP1440

xvi. t16: mode = ALARM, button = DOWN

xvii. t17: mode = ALARM, button = DOWN60

xviii. t18: mode = ALARM, button = DOWN1440

