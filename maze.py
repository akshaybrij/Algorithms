import os
import sys
class Maze:
    def __init__(self):
        pass
    def compute(self,arr):
        n=len(l)
        i=0
        j=0
        if arr[i][j]==arr[n-1][n-1]:
            return True;
        else:
            return False;
        if arr[i+1][j]!=0:
            i=i+1
        elif arr[i][j+1]==1:
            j=j+1
        elif arr[i+1][j+1]==1:
            j=j+1
            i=i+1
        else:
            pass
m=Maze()
l=[[1, 0, 0, 0],[1, 1, 0, 1],[0, 1, 0, 0],[1, 1, 1, 1]]
print(m.compute(l))
