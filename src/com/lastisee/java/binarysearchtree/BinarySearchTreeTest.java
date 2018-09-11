package com.lastisee.java.binarysearchtree;

public class BinarySearchTreeTest {
    public static void main(String[] args) {
        BinarySearchTree<Integer> tree = new BinarySearchTree<>();
        int[] nums = {5, 3, 6, 8, 4, 2};
        for (int num : nums) {
            tree.add(num);
        }
        tree.preOrder();
        System.out.println(tree);
    }
}
