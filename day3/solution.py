def get_priority(x: str) -> int:
    if x.islower():
        return ord(x) - ord('a') + 1
    else:
        return ord(x) - ord('A') + 27
    

f = open("day3/input.txt", encoding = "utf-8")
s = ""
n = 0
sums = 0

sums2 = 0

for line in f.readlines():
    n = len(line)
    
    mid: int = n//2
    
    comp1 = line[:mid]
    
    comp2 = line[mid:]
    
    same = set(comp1) & set(comp2)
    
    sums += get_priority(same.pop())
    
f.close()

f = open("day3/input.txt", encoding = "utf-8")
lines = f.read().strip().split("\n")

for i in range(0, len(lines), 3):
    same2 = set(lines[i]) & set(lines[i+1]) & set(lines[i+2])
    
    sums2 += get_priority(same2.pop())
        

print("The answer for part 1 is: " + str(sums))

print("The answer for part 2 is: " + str(sums2))

    
    
    
    
