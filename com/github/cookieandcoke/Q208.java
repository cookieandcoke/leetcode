package com.github.cookieandcoke;

/**
 * 208. Implement Trie (Prefix Tree)
 * https://leetcode.com/problems/implement-trie-prefix-tree/
 */
public class Q208 {
    class Trie {
        TrieNode root;

        public Trie() {
            root= new TrieNode();
        }

        public void insert(String word) {
            word=word.toLowerCase();
            TrieNode node=root;
            for(int i=0; i<word.length(); i++) {
                char c=word.charAt(i);
                TrieNode sub=node.getOrDefault(c);
                node.put(c, sub);
                node=sub;
            }
            node.end=true;
        }

        public boolean search(String word) {
            TrieNode last=getLastNode(word);
            return last!=null && last.end;
        }

        private TrieNode getLastNode(String prefix) {
            prefix=prefix.toLowerCase();
            TrieNode node=root;
            for(int i=0; i<prefix.length(); i++) {
                if(!node.contain(prefix.charAt(i))) {
                    return null;
                }
                node=node.getOrDefault(prefix.charAt(i));
            }
            return node;
        }

        public boolean startsWith(String prefix) {
            return getLastNode(prefix) != null;
        }
    }

    class TrieNode {
        TrieNode[] subs=new TrieNode[26];
        boolean end;

        boolean contain(char c) {
            return subs[c -'a'] != null;
        }

        TrieNode getOrDefault(char c) {
            return subs[c -'a'] == null? new TrieNode() : subs[c -'a'];
        }
        void put(char c, TrieNode node) {
            subs[c -'a']=node;
        }
    }
}
