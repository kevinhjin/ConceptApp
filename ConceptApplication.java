/**
 * Your implementation of various applications of course concepts.
 *
 * @author YOUR NAME HERE
 * @userid YOUR USER ID HERE(i.e. gburdell3)
 * @GTID YOUR GT ID HERE (i.e. 900000000)
 * @version 1.0
 */
public class ConceptApplication {

    /**
     * For this method, find the total number of pairs in a given array that
     * sum up to the given k value. Individual entries in the array cannot be
     * used for more than one pair and negative values may be present. You do
     * not have to worry about integer underflow or overflow.
     *
     * This solution should run in O(n) time and use O(n) extra space.
     * Only make one pass through the array when solving this problem.
     *
     * @param arr the array to find pairs within
     * @param k the desired sum of pairs to find
     * @return the number of pairs present in arr that sum up to k
     */
    public static int countAllPairs(int[] arr, int k) {

    }

    /**
     * Reverse the order of nodes contained in the given LinkedList. Given a
     * list of nodes a->b->c, the returned list from this method should be
     * c->b->a. The reverse of a singular or null node is simply the node
     * itself.
     *
     * Implement this method in O(n) time and O(1) space, not including the
     * recursive stack if utilized. Only make one pass through the list when
     * solving this problem.
     *
     * @param head the head reference for the LinkedList to reverse
     * @param <T> data type
     * @return a reverse of the passed in LinkedList
     */
    public static <T> LinkedListNode<T> reverse(LinkedListNode<T> head) {

    }

    /**
     * Given a Binary Tree, determine whether it is symmetric about the root.
     * For this assignment, symmetry is defined as a mirroring of the nodes to
     * the left and right of the root with regards to shape and data. A singular
     * or null node is symmetric. For example, the following tree is considered
     * to be symmetric.
     *
     *                          a
     *                        /   \
     *                       b     b
     *                     /  \  /  \
     *                    c   d d    c
     *
     * Your implementation should run in O(n) time and use O(1) extra space, not
     * including the recursive stack if utilized. Only make one traversal
     * through the tree when solving this problem.
     *
     * Do not modify the given tree.
     *
     * @param root the root of the tree to check
     * @param <T> data type
     * @return true if the tree is symmetric, false otherwise
     */
    public static <T> boolean isSymmetric(BinaryNode<T> root) {

    }

    /**
     * In this problem, you are given an array of comparable objects. You are
     * told to return a list of the k largest objects in ascending order.
     *
     * If k is not positive, return an empty array
     * If k > array length, return all contents of the array in ascending order.
     * The array you are given will never be null.
     *
     * This solution should run in average and worst case O(n log k) time and
     * use just O(k) space. Only make one pass through the array when solving
     * this problem.
     *
     * @param arr the input array of Comparable objects
     * @param k the number of elements to return
     * @param <T> a comparable object
     * @return an array of the k largest elements in arr in ascending order
     */
    public static <T extends Comparable<? super T>> T[]
                                                findKLargest(T[] arr, int k) {

    }


    /**
     * In this problem you are given a string of characters. You must act
     * somewhat like a parser and determine if this string is valid based
     * on the brackets (parenthesis (), square brackets [], curly braces {}).
     *
     * It will return true if for every open bracket: (, [, {, there is a
     * corresponding closed bracket: ), ], }, and no two pairs of brackets
     * partially overlap.
     *
     * [()] is valid, but [(]) is not as the contents of the parenthesis
     * partially overlap with the contents of the square brackets.
     *
     * A string without brackets is also a valid string. You will never be
     * given a null string as input.
     *
     * This should run in O(n) time with O(n) extra space. Only make one pass
     * through the string when solving this problem.
     *
     * @param str input of characters that needs to be parsed
     * @return whether or not the string has a valid combination of brackets:
     *  {}, (), []
     */
    public static boolean matchingBrackets(String str) {

    }
}
