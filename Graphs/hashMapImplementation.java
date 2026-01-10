package hashMapCodes;
import java.util.*;

public class hashMapImplementation {
    static class MyHashMap<K,V>{
        public static final int DEFAULT_CAPACITY=4;
        public static final float LOAD_FACTOR=0.75f;
        private class Node{
            K key;
            V value;
            Node(K key,V value){
                this.key=key;
                this.value=value;
            }
        }
        private int n;//the number of entries in map
        private LinkedList<Node> [] buckets;
        private void initBuckets(int N){ // N capacity/size of buckets
            buckets=new LinkedList[N];
            for(int i=0;i<buckets.length;i++){
                buckets[i]=new LinkedList<>();
            }

        }
        private int HashFunction(K key){
            int hc=key.hashCode();
            return (Math.abs(hc))% buckets.length;
        }

        // traverse the ll and look for a node with key,if found it returns its index
        // else returns -1
        private int searchInBucket(LinkedList<Node> ll, K key){
            for(int i=0;i<ll.size();i++){
                if(ll.get(i).key==key){
                    return i;
                }
            }
            return -1;
        }

        public MyHashMap(){

        }

//        public int size(){    //return the number of entries in map
//
//        }
        public void put(K key,V value){ // insert and update
            int bi=HashFunction(key);
            LinkedList<Node> curBuck=buckets[bi];
            int ei=searchInBucket(curBuck, key);
            if(ei==-1){
                Node node = new Node(key,value);
                curBuck.add(node);
                n++;
            }
            else{  //update case
                Node currNode=curBuck.get(ei);
                currNode.value=value;
            }
        }
        public V get(K key){
            int bi=HashFunction(key);
            LinkedList<Node> currBucket=buckets[bi];
            int ei=searchInBucket(currBucket,key);

            if(ei!=-1){
                Node curNode=currBucket.get(ei);
                return curNode.value;
            }
            return null;
        }

        public V remove(K key){
            int bi=HashFunction(key);
            LinkedList<Node> currBucket=buckets[bi];
            int ei=searchInBucket(currBucket,key);

            if(ei!=-1){
                Node curNode=currBucket.get(ei);
                V val=curNode.value;
                currBucket.remove(ei);
                return val;
            }
            return null;
        }




    }
}
