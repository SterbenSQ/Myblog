package com.sterbensq.myblog.test;

import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class LRUCache {
    //查找使用
    Map<Integer,Integer> cache=new ConcurrentHashMap<>();
    //做队列使用
    LinkedList list=new LinkedList();
    //存储长度;
    int length;
    //初始化
    public LRUCache(int num){
        this.length=num;
    }

    public void put(int key,int value){
        if(cache.get(key)!=null){
            cache.put(key,value);
            //数据提前
            list.remove(key);
            list.addFirst(key);
        }else if(length==list.size()){
            cache.put(key,value);
            list.addFirst(key);
            //删除队尾
            cache.remove(list.getLast());
            list.removeLast();
        }else{
            cache.put(key,value);
            list.addFirst(key);
        }
    }
    public int get(int key){
        Integer result=cache.get(key);
        if(result==null){
            return -1;
        }else {
            //数据提前
            list.remove(new Integer(key));
            list.addFirst(key);
        }
        return result;
    }
}
