package AdvanceDSA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//Definition for an interval.
class Interval {
    int start;
    int end;
    Interval() { start = 0; end = 0; }
    Interval(int s, int e) { start = s; end = e; }
}

public class Overlaping {    
    public static void main(String[] args) {        
        int[][] in={{1, 3}, {2, 5}, {6, 8}, {7, 10}, {11, 13}, {14, 16}, {16, 19}, {20, 25}};
        ArrayList<Interval> input = new ArrayList<>();
        // Convert arrays to Lists and add to ArrayList
        for (int[] array : in) {
            input.add(new Interval(array[0], array[1]));
        }
        ArrayList<Interval> out=mergeOverlap(input);
        for(Interval i:out)
            System.out.print("("+i.start+","+i.end+")"); 
        System.out.println();
        out=insertInterval(input,new Interval(12,15));
        for(Interval i:out)
            System.out.print("("+i.start+","+i.end+")"); 
        System.out.println();
    }
    public static ArrayList<Interval> mergeOverlap(ArrayList<Interval> intervals) {
        Collections.sort(intervals,new Comparator<Interval>(){
            public int compare(Interval i,Interval j)
            {
                return Integer.compare(i.start,j.start);
            }
        });
        int start=intervals.get(0).start;
        int end=intervals.get(0).end;
        for(int i=1;i<intervals.size();i++)
        {
            if(intervals.get(i).start<=end)
            {
                start=Math.min(start, intervals.get(i).start);
                end=Math.max(end, intervals.get(i).end);
                intervals.set(i,new Interval(start,end));
                intervals.remove(i-1);
                i--;
            }
            else
            {
                start=intervals.get(i).start;
                end=intervals.get(i).end;
            }
        }
        return intervals;
    }
    public static ArrayList<Interval> insertInterval(ArrayList<Interval> intervals, Interval newInterval) {
        ArrayList<Interval> ans=new ArrayList();        
        for(int i=0;i<intervals.size();i++)
        {
            if(newInterval.start>intervals.get(i).end){
                ans.add(intervals.get(i));
            }
            else if(newInterval.end<intervals.get(i).start)
            {
                ans.add(newInterval);
                while(i<intervals.size())
                {
                    ans.add(intervals.get(i));
                    i++;
                }
                return ans;
            }
            else
            {
                newInterval.start=Math.min(intervals.get(i).start,newInterval.start);
                newInterval.end=Math.max(intervals.get(i).end,newInterval.end);
            }
        }
        ans.add(newInterval);
        return ans;
    }    
    public double add(int a,int b)
    { return 10;}
    public String add(int a,int b)
    {return 20;}
}
