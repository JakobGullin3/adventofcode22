def get_priority(x: str) -> int:
    if x.islower():
        return ord(x) - ord('a') + 1
    else:
        return ord(x) - ord('A') + 1
    

f = open("day3/input.txt")
s = ""
n = 0
sums = 0


lines = f.read().strip().split("\n")
    
for line in lines:
    mid: int = len(line)//2
        
    common = set(line[:mid]) & set(line[mid:])
    
    sums += get_priority(common.pop())

print(sums)
    
    
    
    
