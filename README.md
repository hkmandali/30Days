# 30Days
Some of the common questions asked during Internships
<br>
// priority queue <br>

PriorityQueue<ListNode> pq = new PriorityQueue<>(new Comparator< ListNode >() { <br>
            @Override <br>
            public int compare(ListNode a,ListNode b)<br>
            {<br>
                if(a.val < b.val)<br>
                {<br>
                    return -1;<br>
                }<br>
                else if(a.val > b.val)<br>
                    return 1;<br>
                else<br>
                    return 0;<br>
            }<br>
        });<br>
