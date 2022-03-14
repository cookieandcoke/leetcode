package com.github.cookieandcoke;

/**
 * 211. Design Add and Search Words Data Structure
 * https://leetcode.com/problems/design-add-and-search-words-data-structure/
 */
public class Q211 {
    class WordDictionary {
        TrieNode root;

        public WordDictionary() {
            root=new TrieNode();
        }

        public void addWord(String word) {
            word=word.toLowerCase();
            TrieNode node=root;
            for(int i=0; i<word.length(); i++) {
                char c=word.charAt(i);
                TrieNode sub=node.getOrDefault(c);
                sub.put(c, sub);
                node=sub;
            }
            node.end=true;
        }

        private boolean dfs(int start, TrieNode node, String word) {
            for(int i=start; i<word.length(); i++) {
                char c=word.charAt(i);
                if(c == '.') {
                    for(TrieNode sub: node.subs) {
                        if(sub!=null && dfs(i+1, sub, word)) {
                            return true;
                        }
                    }
                    return false;
                } else if(!node.contain(c)) {
                    return false;
                } else {
                    node=node.getOrDefault(c);
                }
            }
            return node.end;
        }

        public boolean search(String word) {
            return dfs(0, root, word.toLowerCase());
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
