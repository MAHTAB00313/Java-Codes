import java.util.*;

public class HashImple {

     static class HashMap<K, V> {

        private LinkedList<Node> bucket[]; //N
        private int n; // Node
        private int N; // Bucket


        private class Node {
            K key;
            V value;

            Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        @SuppressWarnings("unchecked")
        public HashMap() {
                this.N = 4;
                this.bucket = new LinkedList[4];

                for(int i=0; i<4;i++) {
                    this.bucket[i] = new LinkedList<>();
                }
            }

            private int bucketFun(K key){
                int bi = key.hashCode();
                return Math.abs(bi)%N;
            }

            private int seaechInLL(K key, int bi) {
                LinkedList<Node> ll = bucket[bi];
                for(int i=0;i<ll.size();i++) {
                    if(ll.get(i).key == key) {
                        return i;
                    }
                }
                return -1;
            }

            @SuppressWarnings("unchecked")
            private void rehash() {
                LinkedList<Node> oldBucket[] = bucket;
                bucket = new LinkedList[N*2];

                for(int i=0;i<bucket.length;i++) {
                    bucket[i] = new LinkedList<>();
                }

                for(int i=0;i<oldBucket.length;i++) {
                    LinkedList<Node> ll = oldBucket[i];

                    for(int j=0;j<ll.size();j++) {
                        Node node = ll.get(j);
                        put(node.key,node.value);
                    }
                   
                }
            }

        
        public void put(K key, V value) {
            int bi = bucketFun(key);
            int  di = seaechInLL(key, bi);

            if(di == -1) {
                bucket[bi].add(new Node(key, value));
                n++;
            } else {
                Node node = bucket[bi].get(di);
                node.value = value;
            }
            

            double lambda =  (double)n/N;

            if(lambda > 2.0) {
                rehash();
            }
            
        }

        public V get(K key) {
            int bi = bucketFun(key);
            int di = seaechInLL(key, bi);

            if(di == -1) {
                return null;
            } else {
                Node node = bucket[bi].get(di);
                return node.value;
            }
        }

        public boolean contains(K key) {
            int bi = bucketFun(key);
            int di = seaechInLL(key, bi);

            if(di == -1) {
                return false;
            } else {
                return true;
            }
        }

        
        public V remove(K key) {
            int bi = bucketFun(key);
            int di = seaechInLL(key, bi);

            if(di == -1) {
                return null;
            } else {
                Node node = bucket[bi].remove(di);
                n--;
                return node.value;
            }
        }

        public ArrayList<K> keyset() {
            ArrayList<K> keys = new ArrayList<>();

            for(int i=0;i<bucket.length;i++) {
                LinkedList<Node> ll = bucket[i];

                for(int j=0;j<ll.size();j++) {
                    Node node = ll.get(j);
                    keys.add(node.key);
                }
            }
            return keys;
        }


        public boolean isEmpty() {
            return n==0;
        }

    }






     public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();

        map.put("India", 1);
        map.put("Ameriva", 2);
        map.put("South", 3);

        System.out.println(map.keyset());
        map.put("ss", 8);
        
        System.out.println(map.keyset());
        
     }

}