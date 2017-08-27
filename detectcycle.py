import os
from collections import defaultdict
class Detect:
    def __init__(self,V):
        self.graph=defaultdict(list)
        self.V=V
    def addEdge(self,u,v):
        self.graph[u].append(v)
    def isCycleUtils(self,v,visit,restack):
        visit[v]=True
        restack[v]=True
        for n in self.graph[v]:
            if visit[n]==False:
                if self.isCycleUtils(n,visit,restack)==True:
                   return True
            else:
                if restack[n]==True:
                    return True
    def isCycle(self):
        visit=[False]*self.V
        restack=[False]*self.V
        for nod in range(self.V):
            if visit[nod]==False:
                if self.isCycleUtils(nod,visit,restack)==True:
                    return True;
        return False
d=Detect(5)
d.addEdge(0,1)
d.addEdge(1,2)
d.addEdge(2,3)
d.addEdge(3,4)
if d.isCycle()==1:
    print "Cycle"
else:
    print "No Cycle"
