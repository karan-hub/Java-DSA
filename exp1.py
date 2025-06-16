def  bfs( graph ,start):
    visited= []
    queue= [start]
    
    while queue:
        node = queue.pop(0)
        if node not in visited :
            visited.append(node)
            queue += graph[node]
    print(visited)
    
    
def DFS(graph , start , visited = None):
    if visited is None :
        visited = []
    if start  not in visited:
        visited.append(start)
        for negh in graph[start]:
            DFS(graph , negh , visited)
    return visited
        

graph = {
    'A': ['B', 'C'],
    'B': ['A', 'A'],
    'C': ['A', 'D'],
    'D': ['C', 'A']
}

bfs(graph , 'A')

result = DFS(graph , 'A')
print(result)
