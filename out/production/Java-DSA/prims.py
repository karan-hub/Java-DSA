import heapq
def prims(graph , start):
    visited=  set()
    total_cost=  0
    MST=  []
    min_heap =[(0 , start , None)]
    
    while min_heap:
        weight  , current  , parent =  heapq.heappop(min_heap)
        
        if current in visited:
            continue
        total_cost += weight
        visited.add(current)
        if parent is not None:
            MST.append((parent  , current , weight))
        
        for negh , wt  in graph[current]:
            if negh not in  visited:
                heapq.heappush(min_heap ,(wt , negh , current))
        
    for u ,v ,w  in MST:
        print(f"{u}-{v}: {w}")
    print(total_cost)
    

graph = {
    'A': [('B', 1), ('C', 3)],
    'B': [('A', 1), ('C', 1), ('D', 6)],
    'C': [('A', 3), ('B', 1), ('D', 2)],
    'D': [('B', 6), ('C', 2)],
}

prims(graph , 'A')
        
    